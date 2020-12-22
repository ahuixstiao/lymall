package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
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
     * 根据传入的分类名称 查询分类下的商品信息 并将分类名称与商品数据返回
     * @param currentPage
     * @param categoryPid
     * @param limit
     * @return String
     */
    @Override
    public List<LymallGoodsCategoryDTO> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage, Integer limit) {
        //执行查询父分类的方法
        List<LymallCategory> categorieNames = this.selectfindByCategory(categoryPid);
        //分页配置
        PageHelper.startPage(currentPage,limit);

        //声明一个返回对象保存 要返回的 分类名称与商品信息
        List<LymallGoodsCategoryDTO> list=null;

        //保存每个分类的返回参数
        Map<Integer,Object> map=null;

        //遍历分类方法返回的参数
        for(int i=0;i<=categorieNames.size();i++){
            for (LymallCategory category : categorieNames) {
                //保存 分类名称 String类型  与 分类的商品信息List<LymallGoodsCategoryDTO>  将这两个参数保存到同一个容器中

            }
        }
        //返回
        return null;
    }
}