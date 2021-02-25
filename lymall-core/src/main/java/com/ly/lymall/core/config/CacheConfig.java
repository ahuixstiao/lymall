package com.ly.lymall.core.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Author: Ahui
 * @Description: cacheKey
 * @DateTime: 2021/2/20 - 15:24
 **/
@Configuration
public class CacheConfig {

    @Bean("keyGenerator")
    public KeyGenerator getKeyGenerator(){
        /**
         * 该方法作用是 动态的返回的一个CacheKey
         * @param target 调用该方法的对象
         * @param method Cache注解的方法
         * @param params 参数列表
         * @return KeyGenerator
         */
        //lambda表达式
        KeyGenerator keyGeneratorLambda=(target,method,params)->method.getName()+"("+ Arrays.asList(params)+")";

        return keyGeneratorLambda;
    }
}
