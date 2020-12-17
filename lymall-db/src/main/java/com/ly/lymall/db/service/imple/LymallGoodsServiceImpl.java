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
@Service("lymallGoodsServiceImpl")
public class LymallGoodsServiceImpl implements LymallGoodsService {

    @Resource(name="lymallGoodsMapper")
    LymallGoodsMapper goodsMapper;

    /**
     * 查询新品商品信息
     * @param currentPage
     * @param limit
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> findAllnewProductList(Integer currentPage,Integer limit){

        //设置分页
        PageHelper.startPage(currentPage,limit);

        return goodsMapper.findAllnewProductList();
    }

    /**
     * 查询人气推荐商品信息
     *
     * @param currentPage
     * @param limit
     * @return List<LymallGoods>
     */
    @Override
    public List<LymallGoods> findAllPopularGoods(Integer currentPage, Integer limit) {

        PageHelper.startPage(currentPage,limit);

        return goodsMapper.findAllPopularGoods();
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
