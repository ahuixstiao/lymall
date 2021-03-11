package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallUserService;
import com.ly.lymall.vxapi.utils.ExceptionCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * @Author: ahui
 * @Description: 登录校验 表现层Controller类
 * @Date: 2020-11-18 - 14:23
 */
@RestController
@RequestMapping(path = "/wx")
public class LymallUserController {

    /**
     * Service接口依赖注入
     */
    @Resource
    private LymallUserService userService;

    /**
     * 定义一个全局变量 来保存用户SessionID
     */
    private String sessionId;

    /**
     * 记录器
     */
    Logger logger= LoggerFactory.getLogger(getClass());

    /**
     * login请求处理 账号验证是否正确 设置Session会话 设置最后一次登录的时间
     * @param user
     * @return Object
     */
    @RequestMapping(path = "/auth/login")
    public Object login(LymallUser user, HttpServletRequest request){
        LymallUser lymallUser=new LymallUser();
        lymallUser.setUserUsername(user.getUserUsername());

        //检查账号是否存在
        LymallUser checkUserName=userService.checkUserInfo(lymallUser);

        //验证账号密码是否正确
        LymallUser lymallUserInfo=userService.login(user);

        //判断账号是否存在
        if(checkUserName==null){
            return ResponseUtil.fail(ExceptionCode.ACCOUNT_DOES_NOT_EXIST,"账号不存在");
        }else{
            //判断查询的数据是否为空
            if(lymallUserInfo!=null){
                //将用户的账号作为session会话的id
                sessionId=lymallUserInfo.getUserUsername();
                //输出当前登录用户
                logger.info("当前登录用户："+sessionId);
                //设置session会话
                request.getSession().setAttribute(sessionId,lymallUserInfo);
                //根据账号 修改最后一次登录时间
                userService.updateLastLoginTime(LocalDateTime.now(),user.getUserUsername());
                //成功
                return ResponseUtil.ok(lymallUserInfo);
            }
        }
        //失败
        return ResponseUtil.fail(ExceptionCode.AUTH_INVALID_ACCOUNT,"账号或密码错误，请核对后重试");

        /**
         * 1、无状态的HTTP协议：
         *     协议是指计算机通信网络中两台计算机之间进行通信所必须共同遵守的规定或规则，超文本传输协议(HTTP)是一种通信协议，
         *     它允许将超文本标记语言(HTML)文档从Web服务器传送到客户端的浏览器。
         *     HTTP协议是无状态的协议。一旦数据交换完毕，客户端与服务器端的连接就会关闭，再次交换数据需要建立新的连接。
         *     这就意味着服务器无法从连接上跟踪会话。
         * 2.Session(会话):
         *     指用户登录网站后的一系列动作，比如浏览商品添加到购物车并购买
         *     会话（Session）跟踪是Web程序中常用的技术，用来跟踪用户的整个会话
         *     常用的会话跟踪技术是Cookie与Session。Cookie通过在客户端记录信息确定用户身份，Session通过在服务器端记录信息确定
         *     并且只要客户端发起请求无论登录失败或成功都会生成cookie
         * */
    }

    /**
     * 获取登录成功后颁发给客户端的Cookie  注意:无论请求成功还是失败都会颁发一个Cookie
     * @param request
     * @return 返回 boolean
     */
    @RequestMapping(path = "/checkCookie")
    public boolean checkCookie(HttpServletRequest request){

        //获取登录成功时生成的Session会话
        Object object=request.getSession().getAttribute(sessionId);

        //判断Session会话是否存在
        if(object!=null){
            return true;
        }
        return false;
    }

    /**
     * 用户注册
     * @param user
     * @return Object
     */
    @RequestMapping(path = "/auth/register")
    public Object insertUserInfo(LymallUser user, HttpServletRequest request) throws IOException, InterruptedException {
        LymallUser lymallUser=new LymallUser();
        lymallUser.setUserUsername(user.getUserUsername());
        lymallUser.setUserMobile(user.getUserMobile());
        //验证账户是否已注册
        LymallUser checkUserName=userService.checkUserInfo(lymallUser);
        //验证手机号是否已注册
        LymallUser checkeMobile=userService.checkUserInfo(lymallUser);

        //判断用户名或手机号是否已存在
        if(checkUserName!=null){
            return ResponseUtil.fail(ExceptionCode.AUTH_NAME_REGISTERED,"用户已注册");
        }else if(checkeMobile!=null){
            return ResponseUtil.fail(ExceptionCode.AUTH_MOBILE_REGISTERED,"手机号已存在");
        }

        //执行业务层的插入方法
        int insertUserInfo=userService.registerUserInfo(user,request);
        //通过方法返回的受影响条数来判断是否注册成功
        if(insertUserInfo==0){
            //失败
            return ResponseUtil.fail(ExceptionCode.REGISTRATION_FAILED,"注册失败");
        }
        //成功
        return ResponseUtil.ok();
    }

    /**
     * 修改密码
     * @param user
     * @return Object
     */
    @RequestMapping(path = "/auth/reset")
    public Object retrievePassword(@RequestBody LymallUser user){
        LymallUser lymallUser=new LymallUser();
        lymallUser.setUserUsername(user.getUserUsername());
        lymallUser.setUserMobile(user.getUserMobile());
        //保存业务层实现类的返回值 该方法查询用户账号与手机号是否对应
        LymallUser checkUser=userService.checkUserInfo(lymallUser);
        if(checkUser==null){
            return ResponseUtil.fail(ExceptionCode.ACCOUNT_DOES_NOT_EXIST,"用户名或手机号不正确");
        }else{
            userService.updateByrePassword(user.getUserPassword(),user.getUserUsername());
            return ResponseUtil.ok();
        }
    }
}
