package com.ly.lymall.db.service.imple;

import com.ly.lymall.core.tencent.TencentCloud;
import com.ly.lymall.db.dao.mapper.LymallUserMapper;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallUserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * @Author: ahui
 * @Date: 2020-11-18 - 16:44
 * @Description: 实现类
 */
@Service
@CacheConfig(cacheNames = "user")
public class LymallUserServiceImpl implements LymallUserService {

    /**
     * Mapper接口依赖注入
     */
    @Resource
    private LymallUserMapper userMapper;

    /**
     * 将TencentCloud类注入
     */
    @Resource
    private TencentCloud tencentCloud;

    /**
     * 账号验证是否存在
     *
     * @param userUsername
     * @param userMobile
     * @return LymallUser
     */
    @Override
    @Cacheable(keyGenerator = "keyGenerator", condition = "#result!=null")
    public LymallUser checkUserNameOrUserMobile(String userUsername, String userMobile) {

        return userMapper.selectByUserNameOrUserMobile(userUsername, userMobile);
    }

    /**
     * 登录校验
     * 验证用户名与密码是否正确
     * 当所有操作都是读操作时设置成只读事务，当事务被标识为只读事务时，
     * Spring可以对某些可以针对只读事务进行优化的资源就可以执行相应的优化措施，
     * 需要手动将readOnly设置成true。但是方法若是执行增删改会抛出异常
     * @param user
     * @return Object
     */
    @Override
    @Transactional(readOnly=true,rollbackFor=Exception.class)
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
    @Transactional(rollbackFor = Exception.class)
    public int updateLastLoginTime(LocalDateTime userLastLoginTime, String userUsername) {

        return userMapper.updateByLastLoginTime(userLastLoginTime, userUsername);
    }

    /**
     * 该方法功能为：用户注册
     * 将用户信息插入保存到数据库进行持久化
     * 将用户头像上传至腾讯云
     * 抛出IO异常与进行回滚
     *
     * @param user 传入LymallUser实体类
     * @return int
     */
    @Override
    @Transactional(rollbackFor = {IOException.class, InterruptedException.class}, isolation = Isolation.READ_COMMITTED)
    public int registerUserInfo(LymallUser user, String key, InputStream inputStream) throws IOException, InterruptedException {
        //将Controller拼接好的key（文件名.后缀）与文件流传入该方法执行
        String url = tencentCloud.putAvatar(key, inputStream);
        //将要上传至腾讯云的图片路径保存到user实体类
        user.setUserAvatar(url);
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
    public int updateByrePassword(String userPassword, String userUsername) {

        return userMapper.updateByrePassword(userPassword, userUsername);
    }
}
