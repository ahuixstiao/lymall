package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallCoupon;
import com.ly.lymall.db.domian.LymallCouponUser;
import com.ly.lymall.db.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 14:42
 * @Description: 首页 表现层Controller类
 */

@RestController
@RequestMapping(path = "/wx")
public class LymallIndexController {

    /**
     * 商品 业务层接口
     */
    @Resource
    private LymallGoodsService goodsService;

    /**
     * 广告 业务层接口
     */
    @Resource
    private LymallAdService adService;

    /**
     * 类别 业务层接口
     */
    @Resource
    private LymallCategoryService categoryService;

    /**
     * 优惠券 业务层接口
     */
    @Resource
    private LymallCouponService couponService;

    /**
     * 团购规则 业务层接口
     */
    @Resource
    private LymallGrouponRulesService grouponRulesService;

    /**
     * 品牌制造商直供 业务层接口
     */
    @Resource
    private LymallBrandService brandService;

    /**
     * 专题精选 业务层接口
     */
    @Resource
    private LymallTopicService topicService;

    /**
     * 主页查询
     * @param categoryPid
     * @param currentPage
     * @param limit
     * @return Object
     */
    @RequestMapping(path = "/home/index")
    public Object indexPageInforMationQuery(Integer categoryPid, Integer currentPage,Integer limit){
        //商品总数
        int goodsCount=goodsService.selectByAllCount();

        //使用Map集合封装返回
        Map<String,Object> result=new HashMap<>();

        //商品总数
        result.put("goodsCount",goodsCount);
        //广告信息
        result.put("banner",adService.selectfindAllAd());
        //商品类别
        result.put("channel",categoryService.selectByCategoryPidFindInfo(categoryPid));
        //优惠券
        result.put("coupon",ResponseUtil.okListPage(couponService.selectFindAllCoupon(currentPage,limit)));
        //团购规则
        result.put("groupons",ResponseUtil.okListPage(grouponRulesService.findAllGroupbuy(currentPage,limit)));
        //品牌制造商直供商品
        result.put("brands",ResponseUtil.okListPage(brandService.selectFindAll(currentPage,limit)));
        //新品发布
        result.put("newGoods",ResponseUtil.okListPage(goodsService.selectByHotOrNewGoodsFindInfo("goods_is_new",currentPage,limit)));
        //人气推荐
        result.put("hotGoods",ResponseUtil.okListPage(goodsService.selectByHotOrNewGoodsFindInfo("goods_is_hot",currentPage,limit)));
        //专题精选商品信息
        result.put("topics",ResponseUtil.okListPage(topicService.selectByfindAll(currentPage,limit)));
        //更多好物
        result.put("floorGoods",categoryService.selectfindByGoodsCategory(categoryPid,currentPage,limit));

        //返回
        return ResponseUtil.ok(result);
    }




}