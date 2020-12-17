package com.ly.lymall.db.service.imple;

import com.ly.lymall.db.dao.mapper.LymallAdMapper;
import com.ly.lymall.db.domian.LymallAd;
import com.ly.lymall.db.service.LymallAdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    /**
     * 查询全部广告
     *
     * @return List<LymallAd>
     */
    @Override
    public List<LymallAd> selectfindAllAd() {

        return adMapper.selectByAllAd();
    }
}
