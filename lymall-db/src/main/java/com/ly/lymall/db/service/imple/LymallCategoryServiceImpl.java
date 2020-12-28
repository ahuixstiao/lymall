package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.dao.mapper.LymallCategoryMapper;
import com.ly.lymall.db.domian.LymallCategory;
import com.ly.lymall.db.dto.LymallGoodsCategoryDTO;
import com.ly.lymall.db.service.LymallCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:57
 * @Description: 商品类别 业务层实现类
 */
@Service
public class LymallCategoryServiceImpl implements LymallCategoryService {

    @Resource
    private LymallCategoryMapper categoryMapper;

    /**
     * 根据pid查询所有的商品类别
     *
     * @param categoryPid
     * @return List<LymallCategory>
     */
    @Override
    public List<LymallCategory> selectfindByCategory(Integer categoryPid) {

        return categoryMapper.selectfindByCategory(categoryPid);
    }

    /**
     * 根据前端传入的分类Pid 查询分类下的商品信息 并将分类名称与商品数据返回
     * @param currentPage
     * @param categoryPid
     * @param limit
     * @return String
     */
    @Override
    public Map<String,Object> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage, Integer limit) {

        //根据前端传递过来的CategoryPid进行查询出 分类信息集合
        List<LymallCategory> categorieNamesList = this.selectfindByCategory(categoryPid);

        //返回
        return null;
    }

    /**
     * 根据Set中的categoryId查询分类
     * @param setListCategoryId
     * @return List<LymallCategory>
     */
    @Override
    public List<LymallCategory> selectFindByCategoryId(Set setListCategoryId) {

        return categoryMapper.selectFindByCategoryId(setListCategoryId);
    }
}