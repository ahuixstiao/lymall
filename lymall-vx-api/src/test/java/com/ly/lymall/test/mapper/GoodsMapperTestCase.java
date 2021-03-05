package com.ly.lymall.test.mapper;

import com.ly.lymall.db.dao.mapper.LymallGoodsMapper;
import com.ly.lymall.vxapi.VxApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;


/**
 * @Author: Ahui
 * @Description: Goods测试类
 * @DateTime: 2021/2/24 - 18:42
 *
 * 该类主要作用是对Goods业务进行测试 @SpringBootTest注解需要加上(classes=主配置类.class)
 **/
@SpringBootTest(classes=VxApiApplication.class)
public class GoodsMapperTestCase {

    @Autowired
    private LymallGoodsMapper mapper;

    @Test
    void contextLoads() throws UnknownHostException {
        //获取计算机名称
        String windowsName = InetAddress.getLocalHost().getHostName();
        //获取IP地址
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println("当前时间："+ LocalDateTime.now() +" 计算机名称："+windowsName+" IP地址："+ip);
    }
}
