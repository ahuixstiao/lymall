package com.ly.lymall.core.utils;

import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ahui
 * @Date: 2020-11-18/ 15:31
 * @Description: 处理返回结果
 */

public class ResponseUtil {

    /**
     * 请求成功 但不返回参数
     * @return Object
     */
    public static Object ok(){
        //实例Map接口
        Map<String,Object> result=new HashMap<>();
        result.put("errno",0);
        result.put("errmsg","成功");
        return result;
    }

    /**
     * 请求成功 并且返回数据
     * @param data
     * @return Object
     */
    public static Object ok(Object data){
        //实例Map接口
        Map<String,Object> result=new HashMap<>();
        result.put("errno",0);
        result.put("errmsg","成功");
        result.put("data",data);

        return result;
    }

    /**
     * 请求成功 分页并且返回数据
     * @param list
     * @return Object
     */
    public static Object okListPage(List list){
        //实例Map接口
        Map<String,Object> listResult=new HashMap<>();

        //list集合
        listResult.put("list",list);

        //判断list是否实例了Page
        if(list instanceof Page){
            //使用Page来强转接收到的list 并对其中的参数在page对象中进行分配
            Page page=(Page) list;
            //总条数
            listResult.put("total",page.getTotal());
            //总页数
            listResult.put("pages",page.getPages());
            //当前页面信息总条数
            listResult.put("limit",page.getPageSize());
        }
        return ok(listResult);
    }

    /**
     * 请求失败 返回失败信息 但不返回数据
     * @return Object
     */
    public static Object fail(){

        Map<String,Object> result=new HashMap<>();

        result.put("errorNum",1);
        result.put("errorMessage","失败");

        return result;
    }

    /**
     * 请求失败 返回错误码和错误信息
     * @param errorNum
     * @param errorMessage
     * @return Object
     */
    public static Object fail(int errorNum,String errorMessage){
        //实例Map接口
        Map<String,Object> result=new HashMap<>();
        //错误码
        result.put("errorNum",errorNum);
        //错误信息
        result.put("errorMessage",errorMessage);

        return result;
    }

    public static Object badArgument() {

        return fail(401, "参数不对");
    }
    public static Object badArgumentValue() {

        return fail(402, "参数值不对");
    }
    public static Object unlogin() {

        return fail(501, "请登录");
    }
    public static Object serious() {

        return fail(502, "系统内部错误");
    }
    public static Object unsupport() {

        return fail(503, "业务不支持");
    }
    public static Object updatedDateExpired() {

        return fail(504, "更新数据已经失效");
    }
    public static Object updatedDataFailed() {

        return fail(505, "更新数据失败");
    }
    public static Object unauthz() {

        return fail(506, "无操作权限");
    }

}
