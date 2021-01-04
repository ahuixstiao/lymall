package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallGoodsSpecification;

import java.util.List;

/**
 * @Author: Ahui
 * @Description: 商品规格 业务层接口
 * @DateTime: 2020/12/30 - 15:49
 **/

public interface LymallGoodsSpecificationService {

    /**
     * 根据goodsId查询出该商品的规格信息
     * @param goodsId
     * @return List<LymallGoodsSpecification>
     */
    List<LymallGoodsSpecification> selectByGoodsIdFindSpecification(Integer goodsId);
}
