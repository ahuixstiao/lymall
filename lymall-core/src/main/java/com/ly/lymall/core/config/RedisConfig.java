package com.ly.lymall.core.config;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Ahui
 * @Description: Redis配置类
 * @DateTime: 2021/2/20 - 09:53
 **/
@Configuration
public class RedisConfig extends CachingConfigurerSupport {


    /**
     * 通过重写该接口的方法，生成动态的keyGenerator
     *
     * @return 返回一个KeyGenerator对象
     */
    @Bean("keyGenerator")
    public static KeyGenerator getKeyGenerator() {
        /**
         * @param target 调用该方法的对象
         * @param method Cache注解的方法
         * @param params 参数列表
         * @return KeyGenerator
         */
        //lambda表达式
        //KeyGenerator keyGeneratorLambda=(target,method,params)->method.getName()+"("+ Arrays.asList(params)+")";

        KeyGenerator keyGeneratorLambda = ((target, method, params) -> method.getName());

        return keyGeneratorLambda;
    }


    /**
     * 重新配置RedisTemplate类的存储数据类型 减少不必要的代码
     *
     * @param factory
     * @return 返回一个配置好的RedisTemplate对象
     * @throws UnknownHostException
     */
    @Bean
    @SuppressWarnings("all")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) throws UnknownHostException {
        // 由于默认RedisTemplate类泛形约束使用的是Object,Object
        // 导致需要多次使用类型转换语句造成不必要的冗余所以重新配置该类
        // 该类是用于简化Redis数据访问代码的Helper类
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // 配置连接工厂
        template.setConnectionFactory(factory);

        // 该转换器可用于绑定到类型化的bean或未类型化的HashMap实例
        Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);

        // Json序列化配置
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        serializer.setObjectMapper(objectMapper);

        //String序列化
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();

        // key采用String的序列化方式
        template.setKeySerializer(stringRedisSerializer);
        // hashKey采用String的序列化方式
        template.setHashKeySerializer(stringRedisSerializer);
        // Value采用jackson的序列化方式
        template.setValueSerializer(serializer);
        // hashValue采用jackson的序列化方式
        template.setHashValueSerializer(serializer);

        // 设置序列化方式, 前面只是声明, 该方法才实际注入序列化方式
        template.afterPropertiesSet();

        return template;
    }

    /**
     * RedisTemplate的以字符串为中心的扩展。
     * 由于大多数针对Redis的操作都是基于String的，因此此类提供了一个专用类，
     * 该类可最大程度地减少其通用template配置，尤其是在序列化程序方面
     *
     * @param factory
     * @return StringRedisTemplate
     */
    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(factory);
        return stringRedisTemplate;
    }

    /**
     * 管理缓存
     *
     * @param redisConnectionFactory
     * @return CacheManager
     */
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        // 通过Spring提供的RedisCacheConfiguration类，构造一个自己的redis配置类，
        // 从该配置类中可以设置一些初始化的缓存命名空间，及对应的默认过期时间等属性，
        // 再利用RedisCacheManager中的builder.build()的方式生成cacheManager;

        // 生成一个默认配置，通过config对象即可对缓存进行自定义配置
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig();
        // 设置缓存的默认过期时间，也是使用Duration设置
        config = config.entryTtl(Duration.ofMinutes(1))
                // 不缓存空值
                .disableCachingNullValues();

        // 设置一个初始化的缓存空间set集合
        Set<String> cacheNames = new HashSet<>();
        cacheNames.add("my-redis-cache1");
        cacheNames.add("my-redis-cache2");

        // 对每个缓存空间应用不同的配置
        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
        configMap.put("my-redis-cache1", config);
        configMap.put("my-redis-cache2", config.entryTtl(Duration.ofMinutes(10)));
        // 使用自定义的缓存配置初始化一个cacheManager
        RedisCacheManager cacheManager = RedisCacheManager.builder(redisConnectionFactory)
                // 注意这两句的调用顺序，一定要先调用该方法设置初始化的缓存名，再初始化相关的配置
                .initialCacheNames(cacheNames)
                .withInitialCacheConfigurations(configMap)
                .build();
        return cacheManager;
    }
}
