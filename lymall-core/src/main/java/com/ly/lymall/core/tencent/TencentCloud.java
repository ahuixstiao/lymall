package com.ly.lymall.core.tencent;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.*;
import com.qcloud.cos.transfer.TransferManager;
import com.qcloud.cos.transfer.Upload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Ahui
 * @Description: 腾讯对象云存储类
 * @DateTime: 2021/1/18 - 12:41
 **/
@Component
public class TencentCloud {

    @Value("${tencent.config.bucketName}")
    private String bucketName;
    @Value("${tencent.config.regionName}")
    private String regionName;
    /**
     * 默认按类型装配，如果我们想使用按名称装配，可以结合@Qualifier注解一起使用
     */
    @Resource
    private COSClient cosClient;

    /**
     * 记录器
     */
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 创建bucket 返回类型为Bucket
     *
     * @param newBucketName
     * @return 返回该对象 Bucket
     */
    public Bucket getBucketInstance(String newBucketName) {
        //判断bucket是否存在
        boolean instance = cosClient.doesBucketExist(bucketName);

        //存在使用return打断
        if (instance) {
            return null;
        }

        //设置bucket名称 生成该CreateBucketRequest对象
        CreateBucketRequest createBucketRequest = new CreateBucketRequest(newBucketName + "-1304796949");
        //设置bucket为私有读写
        createBucketRequest.setCannedAcl(CannedAccessControlList.Private);
        //使用Bucket保存返回
        Bucket bucket = cosClient.createBucket(createBucketRequest);
        //关闭 cosClient，并释放 HTTP 连接的后台管理线程
        cosClient.shutdown();

        return bucket;
    }

    /**
     * 上传图片
     *
     * @param key
     * @param inputStream
     * @return 返回上传文件的URL路径
     */
    public String putAvatar(String key, InputStream inputStream) throws InterruptedException, IOException {
        // 判断bucket是否存在
        boolean instance = cosClient.doesBucketExist(bucketName);
        // 判断bucket是否存在 不存在则创建
        if (!instance) {
            this.getBucketInstance(bucketName);
        }

        // 对象元数据
        ObjectMetadata objectMetadata = new ObjectMetadata();
        // 设置流长度 根据流的长度大小自动设置
        objectMetadata.setContentLength(inputStream.available());

        // 上传文件请求
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, inputStream, objectMetadata);
        // 设置存储类别为 标准存储
        putObjectRequest.setStorageClass(StorageClass.Standard);
        // 设置文件访问权限 公共读写
        putObjectRequest.setCannedAcl(CannedAccessControlList.PublicRead);


        // 用于管理Qcloud COS传输的高级实用程序。
        // TransferManager提供了一个简单的API，用于将内容上传到Qcloud COS，并广泛使用Qcloud COS分段上传，以提高吞吐量，性能和可靠性。
        // 在可能的情况下， TransferManager尝试使用多个线程一次上传多个部分。 当处理较大的内容大小和高带宽时，这可以显着提高吞吐量
        TransferManager transferManager = new TransferManager(cosClient);

        // 对小于分块上传阈值或未带 Content-Length 头部的流上传，高级接口会选择简单上传；
        // 对大于分块上传阈值但未带 Content-Length 头部的流上传，高级接口会选择分块上传；
        // 对数据类型是 File 类型的文件上传，高级接口会多线程并发同时上传多个分块。v
        // 上传对象 获取需要上传的文件
        Upload upload = transferManager.upload(putObjectRequest);
        // 保存返回值  等待传输结束（如果想同步的等待上传结束，则调用 waitForCompletion）
        UploadResult uploadResult = upload.waitForUploadResult();
        // 获取上传成功的图片ETag
        logger.info(uploadResult.getETag());
        // 将文件的URL拼接
        String url = "https://" + bucketName + ".cos." + regionName + ".myqcloud.com/" + key;
        // 关闭 cosClient，并释放 HTTP 连接的后台管理线程
        cosClient.shutdown();
        // 返回URL
        return url;
    }
}
