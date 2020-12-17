package com.ly.lymall.core.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ahui
 * @Date: 2020-12-02/ 15:22
 * @Description: OSS配置类
 */
@Configuration
public class OssConfig {
    /**
     * bucket 地域
     */
    @Value("${aliyun.ossconfig.endpoint}")
    private String endpoint;
    /**
     * AccessKeyID
     */
    @Value("${aliyun.ossconfig.accessKeyId}")
    private String accessKeyId;
    /**
     * AccessKeySecret
     */
    @Value("${aliyun.ossconfig.accessKeySecret}")
    private String accessKeySecret;

    /**
     * 该方法返回类型是OSS对象 return的对象可以是OSS的派生类
     * @return
     */
    @Bean
    public OSS getOss(){
        //返回OSS接口的派生类 OSSClientBuilder
        return new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }

}
