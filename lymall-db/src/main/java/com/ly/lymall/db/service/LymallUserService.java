package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * @Author: ahui
 * @Date: 2020-11-18/ 16:43
 * @Description: UserService接口
 */
public interface LymallUserService {

    /**
     * 账号验证是否存在
     * @param userUsername
     * @param userMobile
     * @return LymallUser
     */
    LymallUser checkUserNameOrUserMobile(String userUsername,String userMobile);

    /**
     * 登录校验
     * @param user
     * @return LymallUser
     */
    LymallUser login(LymallUser user);

    /**
     * 修改最后一次登录时间
     * @param userLastLoginTime
     * @param userUsername
     * @return int
     */
    int updateLastLoginTime(LocalDateTime userLastLoginTime, String userUsername);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int registerUserInfo(LymallUser user,String key,InputStream inputStream) throws IOException, InterruptedException;

    /**
     * 修改密码
     * @param userPassword
     * @param userUsername
     * @return updateByrePassword
     */
    int updateByrePassword(String userPassword,String userUsername);

}
