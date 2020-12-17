package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallGoods;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-11-19/ 8:56
 * @Description: 商品 业务层接口
 */
public interface LymallGoodsService {

    /**
     * 查询新品商品信息
     * @param currentPage
     * @param limit
     * @return 返回List<LymallGoods>集合
     */
    List<LymallGoods> findAllnewProductList(Integer currentPage,Integer limit);

    /**
     * 查询人气推荐商品信息
     * @param currentPage
     * @param limit
     * @return List<LymallGoods>
     */
    List<LymallGoods> findAllPopularGoods(Integer currentPage,Integer limit);

    /**
     * 查询商品总条数
     * @return int
     */
    int selectByAllCount();
}
