package com.ly.lymall.db.service.imple;

import com.ly.lymall.db.dao.mapper.LymallAdMapper;
import com.ly.lymall.db.domian.LymallAd;
import com.ly.lymall.db.service.LymallAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:12
 * @Description: 广告 业务实现类
 */
@Service
public class LymallAdServiceImpl implements LymallAdService {

    @Resource
    private LymallAdMapper adMapper;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 查询全部广告信息
     * @return List<LymallAd>
     */
    @Override
    public List<LymallAd> selectfindAllAd() {

        //保存查询结果
        List<LymallAd> adList=adMapper.selectByAllAd();

        //保存到缓存中
        redisTemplate.opsForList().leftPush("selectfindAllAd",adList);

        return adList;
    }
}
