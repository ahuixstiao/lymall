package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domain.LymallCategory;
import com.ly.lymall.db.service.LymallCategoryService;
import com.ly.lymall.db.service.LymallGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ahui
 * @Description: 分类主页 表现层Controller类
 * @DateTime: 2021/1/5 - 09:28
 **/
@RestController
@RequestMapping(path = "/wx")
public class LymallCateController {
    /**
     * Goods 业务层接口
     */
    @Resource
    private LymallGoodsService goodsService;
    /**
     * Category 业务层接口
     */
    @Resource
    private LymallCategoryService categoryService;

    /**
     * 由于分类页面点击时需要加载数据 则先默认查出父分类并且查询第一个父分类的其子分类
     *
     * @return Object
     */
    @RequestMapping(path = "catalog/index")
    public Object getCategoryIndexPage() {
        //最终返回封装集合
        Map<String, Object> result = new HashMap<>(16);
        //商品父分类的返回集合
        List<LymallCategory> categoryInfoList = categoryService.selectByCategoryPidFindInfo(0);

        //封装 商品总数
        result.put("goodsCount", goodsService.selectByAllCount());
        //封装 所有商品父分类
        result.put("categoryList", categoryInfoList);
        //封装 当前商品父分类的第一个
        result.put("currentCategory", categoryInfoList.get(0));
        //根据父分类Pid获取它的的所有子分类
        result.put("currentSubCategoryList", categoryService.selectByCategoryPidFindInfo(categoryInfoList.get(0).getCategoryId()));

        //返回
        return ResponseUtil.ok(result);
    }

    /**
     * 根据pid查询出它的子分类
     *
     * @param categoryPid
     * @return Object
     */
    @RequestMapping(path = "catalog/currentCategory")
    public Object getCurrentCategory(Integer categoryPid) {

        return ResponseUtil.ok(categoryService.selectByCategoryPidFindInfo(categoryPid));
    }

    /**
     * 按照分类的id查询与其关联的商品信息
     *
     * @param categoryId
     * @return Object
     */
    @RequestMapping(path = "catalog/currentCategoryGoodsList")
    public Object getGoodsList(Integer categoryId) {

        return ResponseUtil.ok(goodsService.selectByCategoryIdFindAllGoodsInfo(categoryId));
    }

}
