package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.service.LymallBrandService;
import com.ly.lymall.db.service.LymallGoodsAttributeService;
import com.ly.lymall.db.service.LymallGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Ahui
 * @Description: 商品详情 表现层Controller类
 * @DateTime: 2020/12/29 - 13:06
 **/
@RestController
@RequestMapping("/wx")
public class LymallGoodsInfoController {

    /**
     * Goods业务层接口
     */
    @Resource
    private LymallGoodsService goodsService;

    /**
     * GoodsAttribute业务层接口
     */
    @Resource
    private LymallGoodsAttributeService goodsAttributeService;

    /**
     * Brand业务层接口
     */
    @Resource
    private LymallBrandService brandService;


    /**
     * 根据goodsId 查询商品信息 与 商品参数信息
     * @param goodsId
     * @return Object
     */
    @RequestMapping("select/goods")
    public Object selectByGoodsIdFindGoodsInfo(Integer goodsId){
        Map<String,Object> map=new HashMap<>();
        //查询商品信息
        map.put("goodsInfo",ResponseUtil.ok(goodsService.selectByGoodIdfindGoods(goodsId)));
        //查询商品参数信息
        map.put("goodsAttribute",ResponseUtil.ok(goodsAttributeService.selectByGoodsIdFindGoodsAttributeInfo(goodsId)));

        //返回封装的参数
        return map;
    }

    /**
     * 查询热门商品信息
     * @return Object
     */
    @RequestMapping("select/hotgoodsinfo")
    public Object selectByPopularProduct(Integer currentPage, Integer limit){

        return ResponseUtil.okListPage(goodsService.selectByHotOrNewGoodsFindInfo("goods_is_hot",currentPage,limit));
    }

    /**
     * 根据商品的brandId查询品牌商信息
     * @param brandId
     * @return Object
     */
    @RequestMapping("select/BrandInfo")
    public Object selectByBrandIdFindInfo(Integer brandId){

        return ResponseUtil.ok(brandService.selectByBrandIdFindInfo(brandId));
    }

}
