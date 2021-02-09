package com.ly.lymall.core.config;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Ahui
 * @Description: TODO
 * @DateTime: 2021/1/18 - 12:50
 **/
@Configuration
public class TencentCosConfig {

    /**
     * 后期需要把这些属性抽离封装
     */
    @Value("${tencent.config.secretId}")
    private String secretId;
    @Value("${tencent.config.secretKey}")
    private String secretKey;
    @Value("${tencent.config.regionName}")
    private String regionName;

    public static final String COS_IMAGE = "image";

    /**
     * 该Bean用于创建COSlient
     * Primary 该注解作用：若存在多个相同返回类型的Bean时被@Primary注解的Bean将作为首选者，否则将抛出异常
     * Qualifier 该注解作用： 搭配@Autowired使用，当多个相同类型的Bean被注入时用该注解在Bean上给出别名
     * @return 返回一个COSClient对象
     */

    //@Qualifier(COS_IMAGE)
    //@Primary
    @Bean
    public COSClient getCosClient(){

        //获取账号密码 初始化COSCredentials
        COSCredentials cred=new BasicCOSCredentials(secretId,secretKey);
        //获取地域 客户端配置
        ClientConfig clientConfig = new ClientConfig(new Region(regionName));

        return new COSClient(cred,clientConfig);
    }
}
