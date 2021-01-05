package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallCategory;

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
     * 根据categoryPid查询商品类别
     * @param categoryPid 分类的Pid
     * @return List<LymallCategory>
     */
    List<LymallCategory> selectByCategoryPidFindInfo(Integer categoryPid);

    /**
     * 根据传入的categoryPid查询分类下的商品信息
     * @param categoryPid 分类的Pid
     * @param currentPage 当前页
     * @param limit 每一个页面信息条数
     * @return List<Map<String,Object>> 返回的是 泛形为的Map<String,Object>的List集合
     */
    List<Map<String,Object>> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage, Integer limit);

    /**
     * 根据Set集合中的categoryId查询分类
     * @param setListCategoryId
     * @return List<LymallCategory>
     */
    List<LymallCategory> selectBySetListFindCategoryInfo(Set setListCategoryId);

}
