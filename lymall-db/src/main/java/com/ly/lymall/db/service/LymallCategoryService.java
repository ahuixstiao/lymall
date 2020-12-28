package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallCategory;
import com.ly.lymall.db.dto.LymallGoodsCategoryDTO;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:57
 * @Description: 商品类别 业务层接口
 */
public interface LymallCategoryService {

    /**
     * 根据pid查询商品类别
     * @param categoryPid
     * @return List<LymallCategory>
     */
    List<LymallCategory> selectfindByCategory(Integer categoryPid);

    /**
     * 根据传入的分类名称查询商品信息
     * @param currentPage
     * @param categoryPid
     * @param limit
     * @return String
     */
    Map<String,Object> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage, Integer limit);

    /**
     * 根据Set集合中的categoryId查询分类
     * @param setListCategoryId
     * @return List<LymallCategory>
     */
    List<LymallCategory> selectByCategoryIdFindCategoryInfo(Set setListCategoryId);

}
