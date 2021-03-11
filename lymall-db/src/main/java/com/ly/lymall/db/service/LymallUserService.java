package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallUser;

import javax.servlet.http.HttpServletRequest;
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
     * 通过传递进来的实体参数查询相应的用户数据 目前支持 id username password
     *
     * @param lymallUser
     * @return LymallUser
     */
    LymallUser checkUserInfo(LymallUser lymallUser);

    /**
     * 登录校验
     *
     * @param userUsername 用户账号
     * @param userPassword 用户密码
     * @return LymallUser 返回一个当前用户的对象
     */
    LymallUser loginAuthentication(String userUsername, String userPassword);

    /**
     * 修改最后一次登录时间
     *
     * @param userLastLoginTime
     * @param userUsername
     * @return int
     */
    int updateLastLoginTime(LocalDateTime userLastLoginTime, String userUsername);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    int registerUserInfo(LymallUser user, HttpServletRequest request) throws IOException, InterruptedException;

    /**
     * 修改密码
     *
     * @param userPassword
     * @param userUsername
     * @return updateByrePassword
     */
    int updateByrePassword(String userPassword, String userUsername);

}
