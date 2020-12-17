package com.ly.lymall.vxapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * VxApi主配置类
 * SpringBootApplication(scanBasePackages={}): 指定SpringBoot去扫描哪个包与子包下的注解
 * MapperScan: 扫描持久层下的Mapper注解
 * EnableCaching: 启用缓存
 * @Author: ahui
 * @Date: 2020/11/12/9:11
 * @Description: 主配置类
 */
@SpringBootApplication(scanBasePackages={"com.ly.lymall.db","com.ly.lymall.core","com.ly.lymall.vxapi"})
@MapperScan("com.ly.lymall.db.dao.mapper")
@EnableCaching
public class VxApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(VxApiApplication.class,args);
    }
}
