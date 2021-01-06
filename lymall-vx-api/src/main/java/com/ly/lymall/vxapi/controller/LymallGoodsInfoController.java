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
        List<LymallGoodsSpecification> goodsSpecificationListServiceImpl=goodsSpecificationService.selectByGoodsIdFindSpecification(goodsId);

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
        List<SpecificationResult> specificationResultList = new ArrayList<>();

        //遍历业务层返回的商品规格集合的长度
        outer: //outer 作用是continue跳出到哪一层循环的锚点，且外层使用continue outer 不可跳到内层
        for(int i=0;i<goodsSpecificationListServiceImpl.size();i++){

            //声明商品规格对象 来保存返回的商品规格集合中的单个对象数据
            LymallGoodsSpecification specification = goodsSpecificationListServiceImpl.get(i);

            //遍历并判断最终返回集合中是否已存在该规格名称
            for (int j=0;j<specificationResultList.size();j++) {
                //声明临时内部类对象 保存最终返回集合的参数
                SpecificationResult specificationResult = specificationResultList.get(j);

                //判断规格名称是否相同 若相同则进入保存规格参数
                if(specification.getGoodsSpecificationSpecification().equals(specificationResult.name)){

                    //将商品规格对象 保存到内部类集合
                    specificationResult.goodsSpecifications.add(specification);

                    //跳到最外层for循环重新开始循环
                    continue outer;
                }
            }

            //若以上遍历不存在规格名称，则属于新的规格名称 则另外新建一个规格集合保存到最终返回集合汇总
            List<LymallGoodsSpecification> specificationList = new ArrayList<>();
            //保存商品规格对象到集合中
            specificationList.add(specification);
            //将新的规格名称 与 规格信息保存到最终返回集合中
            specificationResultList.add(new SpecificationResult(specification.getGoodsSpecificationSpecification(),specificationList));
        }

        //封装商品信息
        map.put("goodsInfo",goodsService.selectByGoodIdfindGoods(goodsId));
        //封装商品参数信息
        map.put("goodsAttribute",goodsAttributeService.selectByGoodsIdFindGoodsAttributeInfo(goodsId));
        //封装商品评价信息
        map.put("comment",ResponseUtil.okListPage(commentService.selectByGoodsIdFindComment(userId,goodsId,0,1,5)));
        //封装规格信息
        map.put("specificationList",specificationResultList);

        //返回封装的参数
        return ResponseUtil.ok(map);
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
