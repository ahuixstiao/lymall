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
     * 根据字段来查询商品
     * @param productTypes 要查询的商品字段
     * @param currentPage 当前页
     * @param limit 页面条数
     * @return List<LymallGoods>
     */
    List<LymallGoods> selectfindAllGoods(String productTypes,Integer currentPage,Integer limit);

    /**
     * 根据商品名称或关键字搜索商品并排序
     * @param keyword
     * @param orderCloumn
     * @param orderType
     * @return List<LymallGoods>
     */
    List<LymallGoods> searchProducts(String keyword, String orderCloumn,String orderType);

    /**
     * 查询商品总条数
     * @return int
     */
    int selectByAllCount();
}
