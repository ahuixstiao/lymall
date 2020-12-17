package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.*;
import com.ly.lymall.db.dto.LymallGrouponRulesDTO;
import com.ly.lymall.db.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 14:42
 * @Description: 首页 请求controller类
 */

@RestController
@RequestMapping("/wx")
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
     * 记录器
     */
    Logger logger= LoggerFactory.getLogger(getClass());


    @RequestMapping("/home/index")
    public Object indexPageInforMationQuery(Integer categoryPid, Integer currentPage,Integer limit){
        //http://localhost:8080/wx/home/index?categoryPid=0&currentPage=1&limit=2
        //查询商品总数
        int goodsCount=goodsService.selectByAllCount();
        //查询广告信息
        List<LymallAd> adList=adService.selectfindAllAd();
        //查询商品类别
        List<LymallCategory> categoryList=categoryService.selectfindByCategory(categoryPid);
        //查询优惠券信息
        List<LymallCoupon> couponList=couponService.selectFindAll(currentPage,limit);
        //查询全部团购商品
        List<LymallGrouponRulesDTO> grouponList=grouponRulesService.findAllGroupbuy(currentPage,limit);
        //查询品牌制造商直供商品
        List<LymallBrand> brandList=brandService.selectFindAll(currentPage,limit);
        //查询周一、周四新品商品信息
        List<LymallGoods> newProductList=goodsService.findAllnewProductList(currentPage,limit);
        //查询人气推荐商品信息
        List<LymallGoods> popularGoodsList=goodsService.findAllPopularGoods(currentPage,limit);


        if(goodsCount!=0 && adList.size()!=0 && categoryList.size()!=0 && couponList.size()!=0 && grouponList.size()!=0 && brandList.size()!=0){
            //使用Map集合封装返回
            Map<String,Object> map=new HashMap<>();
            //商品总数
            map.put("goodsCount",goodsCount);
            //广告信息
            map.put("banner",adList);
            //商品类别
            map.put("channel",categoryList);
            //优惠券
            map.put("coupon",ResponseUtil.okListPage(couponList));
            //团购规则
            map.put("groupons",ResponseUtil.okListPage(grouponList));
            //品牌制造商直供商品
            map.put("brands",ResponseUtil.okListPage(brandList));
            //查询新品商品信息
            map.put("newProduct",ResponseUtil.okListPage(newProductList));
            //查询人气推荐商品信息
            map.put("popularGoodsList",ResponseUtil.okListPage(popularGoodsList));

            return ResponseUtil.ok(map);
        }
        return ResponseUtil.fail();
    }
}
