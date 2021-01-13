package com.ly.lymall.db.service.imple;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallGoodsMapper;
import com.ly.lymall.db.domian.LymallGoods;
import com.ly.lymall.db.service.LymallGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-11-19/ 8:56
 * @Description: 实现类
 */
@Service
public class LymallGoodsServiceImpl implements LymallGoodsService {

    @Resource(name="lymallGoodsMapper")
    LymallGoodsMapper goodsMapper;

    /**
     * 查询热门或新品商品信息
     * @param productTypes 要查询的商品字段
     * @param currentPage 页数
     * @param limit 显示的条数
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> selectByHotOrNewGoodsFindInfo(String productTypes,Integer currentPage,Integer limit){

        PageHelper.startPage(currentPage,limit);

        return goodsMapper.selectByHotOrNewGoodsFindInfo(productTypes);
    }

    /**
     * 根据商品名称或关键字搜索商品并排序
     *
     * @param keyword
     * @param orderCloumn
     * @param orderType
     * @param categoryId
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> searchProducts(String keyword, String orderCloumn, String orderType,Integer categoryId) {

        return goodsMapper.selectBySearchProducts(keyword, orderCloumn, orderType,categoryId);
    }

    /**
     * 根据关键字搜索商品名称
     *
     * @param keyword
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> keywordSearchGoodsName(String keyword) {

        return goodsMapper.selectByKeywordSearchGoodsName(keyword);
    }

    /**
     * 根据goodsId查询商品信息
     *
     * @param goodsId
     * @return LymallGoods
     */
    @Override
    public LymallGoods selectByGoodIdfindGoods(Integer goodsId) {

        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    /**
     * 根据brandId查询全部商品信息
     *
     * @param brandId
     * @return 返回一个集合
     */
    @Override
    public List<LymallGoods> selectByBrandIdFindAllGoodsInfo(Integer brandId) {

        return goodsMapper.selectByBrandIdFindAllGoodsInfo(brandId);
    }

    /**
     * 根据CategoryId查询商品信息
     *
     * @param categoryId
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> selectByCategoryIdFindAllGoodsInfo(Integer categoryId) {

        return goodsMapper.selectByCategoryIdFindAllGoodsInfo(categoryId);
    }

    /**
     * 查询商品总条数
     *
     * @return int
     */
    @Override
    public int selectByAllCount() {

        return goodsMapper.selectByAllCount();
    }
}