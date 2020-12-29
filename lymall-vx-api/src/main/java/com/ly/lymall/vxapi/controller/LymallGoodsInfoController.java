package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallGoods;
import com.ly.lymall.db.service.LymallGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ahui
 * @Description: TODO
 * @DateTime: 2020/12/29 - 13:06
 **/
@RestController
@RequestMapping("/wx")
public class LymallGoodsInfoController {

    @Resource
    private LymallGoodsService goodsService;


    /**
     * 根据goodsId查询商品信息
     * @param goodsId
     * @return Object
     */
    @RequestMapping("select/goods")
    public Object selectByGoodsIdFindGoodsInfo(Integer goodsId){

        return ResponseUtil.ok(goodsService.selectByGoodIdfindGoods(goodsId));
    }

    /**
     * 查询热门商品信息
     * @return Object
     */
    @RequestMapping("select/hotgoodsinfo")
    public Object selectByPopularProduct(Integer currentPage, Integer limit){

        return ResponseUtil.okListPage(goodsService.selectByHotOrNewGoodsFindInfo("goods_is_hot",currentPage,limit));
    }

}
