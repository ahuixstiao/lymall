package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallUserService;
import com.ly.lymall.vxapi.utils.ExceptionCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @Author: ahui
 * @Description: 登录校验 表现层Controller类
 * @Date: 2020-11-18 - 14:23
 */
@RestController
@RequestMapping(path = "/wx")
public class LymallUserController {

    /**
     *  user业务的Service接口
     */
    @Resource
    private LymallUserService userService;

    /**
     * 定义一个全局类变量 来保存用户SessionID
     */
    private static String sessionId;

    /**
     * 记录器
     */
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * login请求处理 账号验证是否正确 设置Session会话 设置最后一次登录的时间
     *
     * @param userUsername 用户账号
     * @param userPassword 用户密码
     * @return Object
     */
    @RequestMapping(path = "/auth/login")
    public Object login(String userUsername, String userPassword, HttpServletRequest request) {

        //保存业务层返回的用户信息
        LymallUser lymallUserInfo = userService.loginAuthentication(userUsername, userPassword);

        //判断是否登录成功
        if (lymallUserInfo != null) {
            //日志打印出当前登录的用户
            logger.info("用户信息：" + lymallUserInfo.toString());
            //将用户的账号与UUID拼接作为session会话的ID
            sessionId = UUID.randomUUID().toString().replaceAll("-","") + lymallUserInfo.getUserUsername();
            //设置session会话
            request.getSession().setAttribute(sessionId, lymallUserInfo);
            //根据用户账号 修改最后一次登录时间
            userService.updateLastLoginTime(LocalDateTime.now(), userUsername);
            //成功
            return ResponseUtil.ok(lymallUserInfo);
        } else {
            //失败
            return ResponseUtil.fail(ExceptionCode.AUTH_INVALID_ACCOUNT, "账号或密码错误，请核对后重试");
        }
    }

    /**
     * 获取登录成功后颁发给客户端的Cookie  注意:无论请求成功还是失败都会颁发一个Cookie
     *
     * @param request
     * @return 返回 boolean
     */
    @RequestMapping(path = "/checkCookie")
    public boolean checkCookie(HttpServletRequest request) {

        //获取登录成功时生成的Session会话
        Object object = request.getSession().getAttribute(sessionId);

        //判断Session会话是否存在
        if (object != null) {
            return true;
        }
        return false;
    }

    /**
     * 用户注册
     *
     * @param user
     * @return Object
     */
    @RequestMapping(path = "/auth/register")
    public Object insertUserInfo(LymallUser user, HttpServletRequest request) throws IOException, InterruptedException {
        LymallUser lymallUser = new LymallUser();
        lymallUser.setUserUsername(user.getUserUsername());
        lymallUser.setUserMobile(user.getUserMobile());
        //验证账户是否已注册
        LymallUser checkUserName = userService.checkUserInfo(lymallUser);
        //验证手机号是否已注册
        LymallUser checkeMobile = userService.checkUserInfo(lymallUser);

        //判断用户名或手机号是否已存在
        if (checkUserName != null) {
            return ResponseUtil.fail(ExceptionCode.AUTH_NAME_REGISTERED, "用户已注册");
        } else if (checkeMobile != null) {
            return ResponseUtil.fail(ExceptionCode.AUTH_MOBILE_REGISTERED, "手机号已存在");
        }

        //执行业务层的插入方法
        int insertUserInfo = userService.registerUserInfo(user, request);
        //通过方法返回的受影响条数来判断是否注册成功
        if (insertUserInfo == 0) {
            //失败
            return ResponseUtil.fail(ExceptionCode.REGISTRATION_FAILED, "注册失败");
        }
        //成功
        return ResponseUtil.ok();
    }

    /**
     * 修改密码
     *
     * @param user
     * @return Object
     */
    @RequestMapping(path = "/auth/reset")
    public Object retrievePassword(@RequestBody LymallUser user) {
        LymallUser lymallUser = new LymallUser();
        lymallUser.setUserUsername(user.getUserUsername());
        lymallUser.setUserMobile(user.getUserMobile());
        //保存业务层实现类的返回值 该方法查询用户账号与手机号是否对应
        LymallUser checkUser = userService.checkUserInfo(lymallUser);
        if (checkUser == null) {
            return ResponseUtil.fail(ExceptionCode.ACCOUNT_DOES_NOT_EXIST, "用户名或手机号不正确");
        } else {
            userService.updateByrePassword(user.getUserPassword(), user.getUserUsername());
            return ResponseUtil.ok();
        }
    }
}
