package com.ly.lymall.db.service;

import com.ly.lymall.db.domain.LymallGoods;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-11-19/ 8:56
 * @Description: 商品 业务层接口
 */
public interface LymallGoodsService {

    /**
     * 查询热门或新品商品信息
     * @param goodsProduct
     * @param currentPage 当前页
     * @param limit 页面条数
     * @return List<LymallGoods>
     */
    List<LymallGoods> selectByHotOrNewGoodsFindInfo(String goodsProduct, Integer currentPage, Integer limit);

    /**
     * 根据商品名称或关键字搜索商品并排序
     * @param keyword
     * @param orderColumn
     * @param orderType
     * @param categoryId
     * @return List<LymallGoods>
     */
    List<LymallGoods> searchProducts(String keyword, String orderColumn,String orderType,Integer categoryId);

    /**
     * 根据关键字搜索商品名称
     * @param keyword
     * @return List<LymallGoods>
     */
    List<LymallGoods> keywordSearchGoodsName(String keyword);

    /**
     * 根据goodsId查询商品信息
     * @param goodsId
     * @return LymallGoods
     */
    LymallGoods selectByGoodsIdfindGoods(Integer goodsId);

    /**
     * 根据brandId查询全部商品信息
     * @param brandId
     * @return 返回一个集合
     */
    List<LymallGoods> selectByBrandIdFindAllGoodsInfo(Integer brandId);

    /**
     * 根据CategoryId查询商品信息
     * @param categoryId
     * @return List<LymallGoods>
     */
    List<LymallGoods> selectByCategoryIdFindAllGoodsInfo(Integer categoryId);

    /**
     * 查询商品总条数
     * @return int
     */
    int selectByAllCount();
}
