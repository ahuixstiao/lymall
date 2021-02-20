package com.ly.lymall.core.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;

/**
 * @Author: Ahui
 * @Description: Redis配置类
 * @DateTime: 2021/2/20 - 09:53
 **/
@Configuration
public class RedisConfig {

    /**
     * 重新配置RedisTemplate类的存储数据类型 减少不必要的代码
     * @param factory
     * @return 返回一个配置好的RedisTemplate对象
     * @throws UnknownHostException
     */
    @Bean
    @SuppressWarnings("all")
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory)throws UnknownHostException {
        // 由于默认RedisTemplate类泛形约束使用的是Object,Object
        // 导致需要多次使用类型转换语句造成不必要的冗余所以重新配置该类
        // 该类是用于简化Redis数据访问代码的Helper类
        RedisTemplate<String, Object> template=new RedisTemplate<>();
        // 线程安全工厂
        template.setConnectionFactory(factory);
        // 该转换器可用于绑定到类型化的bean或未类型化的HashMap实例
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer=new Jackson2JsonRedisSerializer(Object.class);
        // Json序列化配置
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        //String序列化
        StringRedisSerializer stringRedisSerializer=new StringRedisSerializer();

        // key采用String的序列化方式
        template.setKeySerializer(stringRedisSerializer);
        // hashKey采用String的序列化方式
        template.setHashKeySerializer(stringRedisSerializer);
        // Value采用jackson的序列化方式
        template.setValueSerializer(jackson2JsonRedisSerializer);
        // hashValue采用jackson的序列化方式
        template.setHashValueSerializer(jackson2JsonRedisSerializer);

        template.afterPropertiesSet();

        return template;
    }

}
