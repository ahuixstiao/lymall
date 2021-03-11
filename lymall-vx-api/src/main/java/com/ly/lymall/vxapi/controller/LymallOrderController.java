package com.ly.lymall.vxapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Ahui
 * @Description: 订单 表现层Controller类 接收订单业务请求
 * @DateTime: 2021/1/4 - 16:09
 **/
@RestController
public class LymallOrderController {

    @GetMapping(path = "")
    public Object orderInfoSubmit(@RequestBody Map<String,Object> param){

        return null;
    }
}
