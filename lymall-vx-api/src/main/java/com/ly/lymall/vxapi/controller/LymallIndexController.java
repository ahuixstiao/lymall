package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 14:42
 * @Description: 首页 表现层Controller类
 */

@RestController
@RequestMapping(path = "/wx/home")
public class LymallIndexController {
    @Resource
    private LymallGoodsService goodsService;
    @Resource
    private LymallAdService adService;
    @Resource
    private LymallCategoryService categoryService;
    @Resource
    private LymallCouponService couponService;
    @Resource
    private LymallGrouponRulesService grouponRulesService;
    @Resource
    private LymallBrandService brandService;
    @Resource
    private LymallTopicService topicService;
    /**
     * 主页查询
     * @param categoryPid
     * @param currentPage
     * @param limit
     * @return Object
     */
    @GetMapping(path = "/list")
    public Object indexPageInforMationQuery(Integer categoryPid, Integer currentPage, Integer limit) {
        int goodsCount = goodsService.selectByAllCount();
        Map<String, Object> result = new HashMap<>();
        //商品总数
        result.put("goodsCount", goodsCount);
        //广告信息
        result.put("banner", adService.selectfindAllAd());
        //商品类别
        result.put("channel", categoryService.selectByCategoryPidFindInfo(categoryPid));
        //优惠券
        result.put("coupon", ResponseUtil.okListPage(couponService.selectFindAllCoupon(currentPage, limit)));
        //团购规则
        result.put("groupons", ResponseUtil.okListPage(grouponRulesService.findAllGroupbuy(currentPage, limit)));
        //品牌制造商直供商品
        result.put("brands", ResponseUtil.okListPage(brandService.selectFindAll(currentPage, limit)));
        //新品发布
        result.put("newGoods", ResponseUtil.okListPage(goodsService.selectByHotOrNewGoodsFindInfo("goods_is_new", currentPage, limit)));
        //人气推荐
        result.put("hotGoods", ResponseUtil.okListPage(goodsService.selectByHotOrNewGoodsFindInfo("goods_is_hot", currentPage, limit)));
        //专题精选商品信息
        result.put("topics", ResponseUtil.okListPage(topicService.selectByfindAll(currentPage, limit)));
        //更多好物
        result.put("floorGoods", categoryService.selectfindByGoodsCategory(categoryPid, currentPage, limit));
        //返回
        return ResponseUtil.ok(result);
    }
}