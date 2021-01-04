package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallComment;
import com.ly.lymall.db.domian.LymallGoodsSpecification;
import com.ly.lymall.db.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
     * Goods 业务层接口
     */
    @Resource
    private LymallGoodsService goodsService;

    /**
     * GoodsAttribute 业务层接口
     */
    @Resource
    private LymallGoodsAttributeService goodsAttributeService;

    /**
     * Brand 业务层接口
     */
    @Resource
    private LymallBrandService brandService;

    /**
     * Specification 业务层接口
     */
    @Resource
    private LymallGoodsSpecificationService goodsSpecificationService;

    /**
     * Comment 业务层接口
     */
    @Resource
    private LymallCommentService commentService;

    /**
     * 根据goodsId 查询商品信息 与 商品参数信息
     * @param goodsId
     * @return Object
     */
    @RequestMapping("select/goods")
    public Object selectByGoodsIdFindGoodsInfo(Integer goodsId,Integer userId){
        //此Map用于封装返回值
        Map<String,Object> map=new HashMap<>();

        //查询出商品的规格
        List<LymallGoodsSpecification> goodsSpecificationList=goodsSpecificationService.selectByGoodsIdFindSpecification(goodsId);

        /**
         *  声明一个内部类 保存返回的规格参数
         */
        class SpecificationResult {
            String name;
            List<LymallGoodsSpecification> goodsSpecifications;

            public SpecificationResult(String name, List<LymallGoodsSpecification> goodsSpecifications) {
                super();
                this.name = name;
                this.goodsSpecifications = goodsSpecifications;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<LymallGoodsSpecification> getGoodsSpecifications() {
                return goodsSpecifications;
            }

            public void setGoodsSpecifications(List<LymallGoodsSpecification> goodsSpecifications) {
                this.goodsSpecifications = goodsSpecifications;
            }
        }

        //创建最终返回的集合泛形为内部类 用来保存返回值
        List<SpecificationResult> specificationResultList=new ArrayList<>();

        //遍历商品规格的长度
        outer:
        for(int i=0;i<goodsSpecificationList.size();i++){
            //声明一个商品规格对象 用来保存
            LymallGoodsSpecification goodsSpecification=goodsSpecificationList.get(i);
            //遍历商品规格集合
            for (int j=0;i<specificationResultList.size();i++) {
                //将最终集合中相应下标的集合保存到内部类中
                SpecificationResult specificationResult=specificationResultList.get(j);
                //判断规格名称是否相同 若相同则进入保存规格参数
                if(goodsSpecification.getGoodsSpecificationSpecification().equals(specificationResultList.get(i).name)){
                    //将内部类的
                    specificationResult.goodsSpecifications.add(goodsSpecification);
                    //跳到最外层for循环重新开始循环
                    continue outer;
                }
            }
            //遍历结束没有存入，则属于新的规格名称
            List<LymallGoodsSpecification> specificationList=new ArrayList<>();
            //保存商品规格对象到集合中
            specificationList.add(goodsSpecification);
            //将规格名称与规格信息保存到最终返回集合中
            specificationResultList.add(new SpecificationResult(goodsSpecification.getGoodsSpecificationSpecification(),specificationList));
        }

        //封装商品信息
        map.put("goodsInfo",ResponseUtil.ok(goodsService.selectByGoodIdfindGoods(goodsId)));
        //封装商品参数信息
        map.put("goodsAttribute",ResponseUtil.ok(goodsAttributeService.selectByGoodsIdFindGoodsAttributeInfo(goodsId)));
        //封装商品评价信息
        map.put("comment",ResponseUtil.okListPage(commentService.selectByGoodsIdFindComment(userId,goodsId,0,1,5)));
        //封装规格信息
        map.put("specificationList",ResponseUtil.ok(specificationResultList));

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
