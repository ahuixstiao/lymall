package com.ly.lymall.db.service.imple;

import com.ly.lymall.core.tencent.TencentCloud;
import com.ly.lymall.core.utils.MD5;
import com.ly.lymall.db.dao.mapper.LymallUserMapper;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * @Author: Ahui
 * @Date: 2020-11-18 - 16:44
 * @Description: 实现类
 */
@Service
public class LymallUserServiceImpl implements LymallUserService {

    /**
     * Mapper接口依赖注入
     */
    @Resource
    private LymallUserMapper userMapper;

    /**
     * TencentCloud注入
     */
    @Resource
    private TencentCloud tencentCloud;

    /**
     * redis
     */
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * bucket的文件路径
     */
    @Value("${tencent.config.bucketPath}")
    private String bucketPath;

    /**
     * 根据传递进来的实体参数查询相应的用户数据 目前支持 id username password
     *
     * @param lymallUser 传递一个user实体类来向数据库查询数据
     * @return LymallUser
     */
    @Override
    public LymallUser checkUserInfo(LymallUser lymallUser) {

        return userMapper.selectUserInfo(lymallUser);
    }

    /**
     * 登录校验
     * 验证用户名与密码是否正确
     * 当所有操作都是读操作时设置成只读事务，当事务被标识为只读事务时，
     * Spring可以对某些可以针对只读事务进行优化的资源就可以执行相应的优化措施，
     * 需要手动将readOnly设置成true。但是方法若是执行增删改会抛出异常
     *
     * @param userUsername 用户账号
     * @param userPassword 用户密码
     * @return LymallUser 返回一个当前用户的对象
     */
    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
    public LymallUser loginAuthentication(String userUsername, String userPassword) {
        //密码加密
        String md5Password = MD5.md5(userPassword);
        //保存结果
        LymallUser info = userMapper.loginAuthentication(userUsername, md5Password);
        //保存缓存
        redisTemplate.opsForValue().set("login", info);
        //传递到mapper查询
        return info;
    }

    /**
     * 修改最后一次登录时间
     *
     * @param userLastLoginTime
     * @param userUsername
     * @return int
     */
    @Override
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public synchronized int updateLastLoginTime(LocalDateTime userLastLoginTime, String userUsername) {

        return userMapper.updateByLastLoginTime(userLastLoginTime, userUsername);
    }

    /**
     * 用户注册
     * 将用户信息插入保存到数据库进行持久化
     * 将用户头像上传至腾讯云
     * 抛出IO或线程中断异常则进行回滚
     *
     * @param user 传入LymallUser实体类
     * @return int
     */
    @Override
    @Transactional(rollbackFor = {IOException.class, InterruptedException.class}, isolation = Isolation.READ_COMMITTED)
    public synchronized int registerUserInfo(LymallUser user, HttpServletRequest request) throws IOException, InterruptedException {
        //转为Spring文件解析器的request
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        //获取文件
        MultipartFile multipartFile = multipartHttpServletRequest.getFile("pohoURL");
        //将文件转成输入流
        InputStream inputStream = multipartFile.getInputStream();
        //拼接Bucket文件路径与用户名称 目的是将文件名改为用户名的方式进行区分保存
        String splicingBucketFilePathAndUsername = bucketPath + user.getUserUsername();
        //获取原文件全名并从.的位置分割文件名与后缀 采用双\\转义
        String[] fileName = multipartFile.getOriginalFilename().split("\\.");
        //获取文件的后缀名  length-1指 获取最后一个
        String sufix = fileName[fileName.length - 1];
        //拼接完整的文件名路径与文件名.后缀
        String key = splicingBucketFilePathAndUsername + "." + sufix;

        //将Controller拼接好的key（文件名.后缀）与文件流传入该方法执行
        String url = tencentCloud.putAvatar(key, inputStream);
        //将要上传至腾讯云的图片路径保存到user实体类
        user.setUserAvatar(url);
        //将用户密码加密
        user.setUserPassword(MD5.md5(user.getUserPassword()));
        //将账号信息插入缓存中
        redisTemplate.opsForValue().set(user.getUserId().toString(), user);
        //传入user实体类 执行持久层插入操作
        return userMapper.insert(user);
    }

    /**
     * 修改密码
     *
     * @param userPassword
     * @param userUsername
     * @return updateByrePassword
     */
    @Override
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public synchronized int updateByrePassword(String userPassword, String userUsername) {

        return userMapper.updateByrePassword(userPassword, userUsername);
    }
}
