package com.ly.lymall.db.service;

import com.ly.lymall.db.domain.LymallGoodsAttribute;

import java.util.List;

/**
 * @Author: Ahui
 * @Description: 商品参数 业务层接口
 * @DateTime: 2020/12/29 - 18:29
 **/
public interface LymallGoodsAttributeService {

    /**
     * 根据goodsId查询商品参数信息
     * @param goodsId
     * @return LymallGoodsAttribute
     */
    List<LymallGoodsAttribute> selectByGoodsIdFindGoodsAttributeInfo(Integer goodsId);

}
