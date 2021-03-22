package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallGoodsMapper;
import com.ly.lymall.db.domain.LymallGoods;
import com.ly.lymall.db.service.LymallGoodsService;
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

    @Resource
    LymallGoodsMapper goodsMapper;

    /**
     * 查询热门或新品商品信息
     *
     * @param goodsProduct
     * @param currentPage  当前页
     * @param limit        显示的条数
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> selectByHotOrNewGoodsFindInfo(String goodsProduct, Integer currentPage, Integer limit) {

        //设置每页展示的信息条数
        PageHelper.startPage(currentPage, limit);

        return goodsMapper.selectByHotOrNewGoodsFindInfo(goodsProduct);
    }

    /**
     * 根据商品名称或关键字搜索商品并排序
     *
     * @param keyword
     * @param orderColumn
     * @param orderType
     * @param categoryId
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> searchProducts(String keyword, String orderColumn, String orderType, Integer categoryId) {

        return goodsMapper.selectBySearchProducts(keyword, orderColumn, orderType, categoryId);
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
    public LymallGoods selectByGoodsIdfindGoods(Integer goodsId) {


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