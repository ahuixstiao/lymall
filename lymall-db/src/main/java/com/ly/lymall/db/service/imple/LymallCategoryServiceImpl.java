package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallCategoryMapper;
import com.ly.lymall.db.domian.LymallCategory;
import com.ly.lymall.db.dto.LymallGoodsCategoryDTO;
import com.ly.lymall.db.service.LymallCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
     * 根据传入的分类名称查询商品信息
     * @param currentPage
     * @param categoryPid
     * @param limit
     * @return String
     */
    @Override
    public List<LymallGoodsCategoryDTO> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage,Integer limit) {
        //执行查询父分类的方法
        List<LymallCategory> categories = this.selectfindByCategory(categoryPid);
        //分页配置
        PageHelper.startPage(currentPage,limit);
        List<LymallGoodsCategoryDTO> categoryDTOList=null;
        //遍历分类方法返回的参数
        for (LymallCategory category : categories) {
            if(category.getCategoryPid()==0) {
                //执行方法 并保存返回的参数
                categoryDTOList = categoryMapper.selectfindByGoodsCategory(category.getCategoryName());
            }
        }
        //返回
        return categoryDTOList;
    }
}