package com.ly.lymall.db.service.imple;

import com.ly.lymall.db.dao.mapper.LymallGoodsSpecificationMapper;
import com.ly.lymall.db.domian.LymallGoodsSpecification;
import com.ly.lymall.db.service.LymallGoodsSpecificationService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: 规格信息表 业务层实现类
 * @DateTime: 2020/12/30 - 15:50
 **/
@Service
public class LymallGoodsSpecificationServiceImpl implements LymallGoodsSpecificationService {

    /**
     * 规格信息表 mapper接口
     */
    @Resource
    private LymallGoodsSpecificationMapper goodsSpecificationMapper;

    /**
     * 根据goodsId查询出该商品的规格信息
     *
     * @param goodsId
     * @return List<LymallGoodsSpecification>
     */
    @Override
    public List<LymallGoodsSpecification> selectByGoodsIdFindSpecification(Integer goodsId) {

        return goodsSpecificationMapper.selectByGoodsIdFindSpecification(goodsId);
    }
}
