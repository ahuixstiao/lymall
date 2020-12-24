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
     * 根据传入的分类Pid 查询分类下的商品信息 并将分类名称与商品数据返回
     * @param currentPage
     * @param categoryPid
     * @param limit
     * @return String
     */
    @Override
    public Map<String,Object> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage, Integer limit) {
        /**
         * 声明一个局部内部类
         */
        class GoodsCategoryResult{
            public String name;
            public List<LymallGoodsCategoryDTO> goodsList;

            //声明一个有参构造函数用来传入参数
            public GoodsCategoryResult(String name, List<LymallGoodsCategoryDTO> goodsList) {
                this.name = name;
                this.goodsList = goodsList;
            }
        }

        //根据前端传递过来的CategoryPid进行查询出 分类信息集合
        List<LymallCategory> categorieNamesList = this.selectfindByCategory(categoryPid);

        //声明一个集合保存Mpper返回参数
        List<LymallGoodsCategoryDTO> goodsCategoryDTOList=null;

        //遍历取出categorieNamesList的 categoryName 用来查询各个父分类下的商品信息
        for (LymallCategory categorieName : categorieNamesList) {
            //goodsCategoryDTOList=categoryMapper.selectFindByGoodsCategory(categorieName.getCategoryName());
        }

        //定义最终传递的List name 与 LymallGoodsCategoryDTO
        List<GoodsCategoryResult> goodsCategoryResultList=new ArrayList<>();

        //定位该for循环 用于在循环内continue时 重新循环时定位退出到哪个循环开始
        outer:
        for (int i=0;i<=categorieNamesList.size();i++){
            //遍历取出
            //LymallGoodsCategoryDTO goodsCategoryDTO=goodsCategoryDTOList.get(i);

        }

        //返回
        return null;
    }

    /**
     * 根据categoryId查询分类
     *
     * @param categoryId
     * @return List<LymallCategory>
     */
    @Override
    public List<LymallCategory> selectFindByCategoryId(Integer categoryId) {

        return categoryMapper.selectFindByCategoryId(categoryId);
    }
}