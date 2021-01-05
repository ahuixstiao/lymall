package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallCategory;
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
@RequestMapping("/wx")
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

    @RequestMapping("catalog/index")
    public Object getCategoryIndexPage(Integer categoryId){
        //最终返回封装集合
        Map<String,Object> result=new HashMap<>();

        //商品父分类返回集合
        List<LymallCategory> categoryInfoList = categoryService.selectByCategoryPidFindCategoryInfo(0);

        //封装 商品总数
        result.put("goodsCount", goodsService.selectByAllCount());
        //分装 商品父分类
        result.put("categoryList",categoryInfoList);
        //获取返回的第一个父分类对象
        result.put("currentCategory",categoryInfoList.get(0));
        //获取父分类下的子分类


        result.put("",null);
        //返回
        return ResponseUtil.ok(result);
    }


}
