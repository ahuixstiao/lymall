package com.ly.lymall.db.service;

import com.ly.lymall.db.domain.LymallBrand;

import java.util.List;

/**
 * 品牌厂商
 *
 * @Author: ahui
 * @Date: 2020/12/14/20:29
 * @Description: 品牌厂商商品信息 业务层接口
 */
public interface LymallBrandService {

    /**
     * 查询全部品牌厂商商品信息
     *
     * @return List<LymallBrand>
     */
    List<LymallBrand> selectFindAll(Integer currentPage, Integer limit);

    /**
     * 根据品牌id查询品牌信息
     *
     * @param brandId
     * @return LymallBrand
     */
    LymallBrand selectByBrandIdFindInfo(Integer brandId);

}
