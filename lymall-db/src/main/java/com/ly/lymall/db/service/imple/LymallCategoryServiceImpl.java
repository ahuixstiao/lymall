package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.dao.mapper.LymallCategoryMapper;
import com.ly.lymall.db.domian.LymallCategory;
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
     * 根据categoryPid查询商品类别
     *
     * @param categoryPid
     * @return List<LymallCategory>
     */
    @Override
    public List<LymallCategory> selectByCategoryPidFindInfo(Integer categoryPid) {

        return categoryMapper.selectByCategoryPidFindInfo(categoryPid);
    }

    /**
     * 根据传入的categoryPid查询分类下的商品信息
     * @param categoryPid 分类的Pid
     * @param currentPage 当前页
     * @param limit 每一个页面信息条数
     * @return List<Map<String,Object>> 返回的是 泛形为的Map<String,Object>的List集合
     */
    @Override
    public List<Map<String, Object>> selectfindByGoodsCategory(Integer categoryPid, Integer currentPage, Integer limit) {
        //通过pid查询父分类信息
        List<LymallCategory> list = this.selectByCategoryPidFindInfo(categoryPid);

        //最终返回的结果集合
        List<Map<String, Object>> result = new ArrayList<>();

        //使用lambda表达式 遍历返回的父分类信息集合
        list.stream().forEach((category)->{
            //创建一个临时 map集合用来保存 商品父分类名称 与 商品信息
            Map<String, Object> map = new HashMap<>(16);
            //封装父分类的name
            map.put("name", category.getCategoryName());
            //对商品信息分页
            PageHelper.startPage(currentPage,limit);
            /**
             * 查询分类的商品信息并分页
             * selectByCategoryPidFindChildCategoryInfo(): 传入父分类的categoryId进行查询 出父分类的子分类下的商品信息
             */
            map.put("goodsList", ResponseUtil.okListPage(categoryMapper.selectByCategoryPidFindChildCategoryInfo(category.getCategoryId())));
            //保存map集合参数
            result.add(map);
        });
        //返回 参数
        return result;
    }

    /**
     * 根据Set中的categoryId查询分类
     *
     * @param setListCategoryId
     * @return List<LymallCategory>
     */
    @Override
    public List<LymallCategory> selectBySetListFindCategoryInfo(Set setListCategoryId) {

        return categoryMapper.selectBySetListFindCategoryInfo(setListCategoryId);
    }
}