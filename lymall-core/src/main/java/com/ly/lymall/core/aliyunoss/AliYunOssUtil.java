package com.ly.lymall.core.aliyunoss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.internal.OSSHeaders;
import com.aliyun.oss.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.InputStream;

/**
 * @Author: ahui
 * @Date: 2020-11-30/ 15:38
 * @Description: 使用阿里云存储空间 进行图片上传
 */
@Component
public class AliYunOssUtil {
    /**
     * bucket 地域
     */
    @Value("${aliyun.ossconfig.endpoint}")
    private String endpoint;
    /**
     * Bucket空间的名称
     */
    @Value("${aliyun.ossconfig.bucketName}")
    private String bucketName;

    /**
     * 阿里云OSS（对象存储服务）的入口点接口
     */
    @Resource
    OSS ossClient;

    /**
     * 根据传入的newBucketName来创建一个Bucket，会优先判断该BucketName是否存在，若不存在则创建一个新的Bucket
     * @param newBucketName
     */
    public void ossClientDoesItExist(String newBucketName){

        //判断Bucket存储空间是否存在
        boolean exists=ossClient.doesBucketExist(newBucketName);

        //存在则return返回打断语句的执行
        if(exists){
            return;
        }

        //若空间不存在则创建
        //创建Bucket请求 传入newBucketName来生成对象 newBucketName全局唯一不可重复 但是可以创建多个不同name的Bucket
        CreateBucketRequest createBucketRequest=new CreateBucketRequest(newBucketName);
        // 如果创建存储空间时要指定存储类型以及数据容灾类型 请参考下方代码
        // 设置存储空间的存储类型为标准存储
        createBucketRequest.setStorageClass(StorageClass.Standard);
        // 默认情况下，数据容灾类型为本地冗余存储，即DataRedundancyType.LRS。 如果需要设置数据容灾类型为同城冗余存储，替换为DataRedundancyType.ZRS。
        createBucketRequest.setDataRedundancyType(DataRedundancyType.LRS);
        // 创建存储空间
        ossClient.createBucket(createBucketRequest);
        // 关闭oss客户端
        ossClient.shutdown();
    }

    /**
     * 上传文件到oss仓库
     * @param key
     * @param inputStream
     * @return 返回一个字符串的URL路径
     */
    public String ossPutObjectRequest(String key,InputStream inputStream){

        //判断Bucket存储空间是否存在
        boolean exists=ossClient.doesBucketExist(bucketName);

        //存在则return返回打断语句的执行
        if(exists!=true){
            return null;
        }

        //简单上传请求 传入的参数是 bucket空间名称，空间路径/文件全名/后缀(key：文件名)，文件流
        PutObjectRequest put=new PutObjectRequest(bucketName, key, inputStream);

        //ObjectMetadata 用于设置文件上传时的 文件元信息，描述文件信息、例如长度、存储等级、ACL权限范围、类型等
        ObjectMetadata metadata=new ObjectMetadata();
        //设置OSS存储等级: 标准
        metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
        //设置上传的文件ACL 范围权限 设置为 PublicRead 公共读
        metadata.setObjectAcl(CannedAccessControlList.PublicRead);
        //返回设置好的上传文件属性与参数 在上传同时设置文件
        put.setMetadata(metadata);

        //将对象(文件)上传到我的阿里云oss对象存储服务器
        ossClient.putObject(put);

        //将文件的URL拼接
        String url="https://"+bucketName+"."+endpoint.replace(endpoint,"oss-cn-hangzhou.aliyuncs.com")+"/"+key;

        //返回路径
        return url;
    }
}
