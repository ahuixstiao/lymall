package com.ly.lymall.vxapi;

import cn.hutool.system.SystemUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * VxApi主配置类
 * SpringBootApplication(scanBasePackages): 指定SpringBoot去扫描指定包与子包下的注解
 * MapperScan: 扫描Mapper注解 用全限定包名的方式指定要扫描的包
 * EnableCaching: 启用缓存
 * EnableTransactionManagement: 启用全局事务 由于启动类没有实现接口且该注解底层实现用的是动态代理，所以要设置proxyTargetClass = true
 *
 * @Author: ahui
 * @Date: 2020/11/12/9:11
 * @Description: 主配置类
 */
@SpringBootApplication(scanBasePackages = {"com.ly.lymall.db", "com.ly.lymall.core", "com.ly.lymall.vxapi"})
@MapperScan("com.ly.lymall.db.dao.mapper")
@EnableCaching
@EnableSwagger2
@EnableTransactionManagement(proxyTargetClass = true)
public class VxApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(VxApiApplication.class, args);
        Logger logger = LoggerFactory.getLogger(VxApiApplication.class);
        logger.info("------------------------------------------------------------------------------------------------项目启动成功------------------------------------------------------------------------------------------------");
        //打印运行时Java信息
        SystemUtil.getJavaRuntimeInfo();
        //运行时信息，包括内存总大小、已用大小、可用大小等
        SystemUtil.getRuntimeInfo();
    }
}
