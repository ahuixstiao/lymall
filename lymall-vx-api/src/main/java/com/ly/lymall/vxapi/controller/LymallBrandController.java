package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.service.LymallBrandService;
import com.ly.lymall.db.service.LymallGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Ahui
 * @Description: 品牌商列表 表现层Controller类
 * @DateTime: 2021/1/4 - 15:35
 **/
@RestController
@RequestMapping(path = "/wx")
public class LymallBrandController {

    /**
     * Brand 业务层接口
     */
    @Resource
    private LymallBrandService brandService;
    /**
     * Goods 业务层接口
     */
    @Resource
    private LymallGoodsService goodsService;

    /**
     * 查询全部品牌商信息
     *
     * @return 返回的是一个List分页集合
     */
    @RequestMapping(path = "brand/list")
    public Object selectFindAllBrandInfo() {

        return ResponseUtil.okListPage(brandService.selectFindAll(1, 999999));
    }

    /**
     * 根据品牌商id 查询品牌商的详情信息
     *
     * @param brandId
     * @return 返回一个品牌商类对象
     */
    @RequestMapping(path = "brand/detail")
    public Object selectByBrandIdFindBrandDetail(Integer brandId) {

        return ResponseUtil.ok(brandService.selectByBrandIdFindInfo(brandId));
    }

    /**
     * 根据品牌id查询属于该品牌的商品信息
     *
     * @param brandId
     * @return 返回一个集合
     */
    @RequestMapping(path = "brand/goodslist")
    public Object selectByBrandIdFindAllGoodsInfo(Integer brandId) {

        return ResponseUtil.ok(goodsService.selectByBrandIdFindAllGoodsInfo(brandId));
    }
}
