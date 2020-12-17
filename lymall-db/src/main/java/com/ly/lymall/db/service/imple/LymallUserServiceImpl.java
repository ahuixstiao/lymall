package com.ly.lymall.db.service.imple;

import com.ly.lymall.core.aliyunoss.AliYunOssUtil;
import com.ly.lymall.db.dao.mapper.LymallUserMapper;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * @Author: ahui
 * @Date: 2020-11-18/ 16:44
 * @Description: 实现类
 */
@Service("lymallUserServiceImpl")
public class LymallUserServiceImpl implements LymallUserService {

    /**
     * Mapper接口依赖注入
     */
    @Resource
    private LymallUserMapper userMapper;

    /**
     * 将Aliyun封装类注入
     */
    @Resource
    private AliYunOssUtil aliYunOssUtil;

    /**
     * 账号验证是否存在
     * @param userUsername
     * @param userMobile
     * @return LymallUser
     */
    @Override
    public LymallUser checkUserNameOrUserMobile(String userUsername,String userMobile) {

        return userMapper.selectByUserNameOrUserMobile(userUsername,userMobile);
    }

    /**
     * 登录校验
     * @param user
     * @return Object
     */
    @Override
    public LymallUser login(LymallUser user) {

        return userMapper.selectByUserNameAndPassword(user);
    }

    /**
     * 修改最后一次登录时间
     *
     * @param userLastLoginTime
     * @param userUsername
     * @return int
     */
    @Override
    public int updateLastLoginTime(LocalDateTime userLastLoginTime, String userUsername) {

        return userMapper.updateByLastLoginTime(userLastLoginTime,userUsername);
    }

    /**
     * 用户注册
     * @param user
     * @return int
     */
    @Override
    public int registerUserInfo(LymallUser user, String key,InputStream inputStream) {
        //将Controller拼接好的key（文件名.后缀）与文件流传入该方法执行
        String url=aliYunOssUtil.ossPutObjectRequest(key,inputStream);
        //将阿里云的图片路径赋值到实体类中
        user.setUserAvatar(url);
        //执行插入操作
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
    public int updateByrePassword(String userPassword, String userUsername) {

        return userMapper.updateByrePassword(userPassword,userUsername);
    }
}
