package com.ly.lymall.db.service.imple;

import com.ly.lymall.db.dao.mapper.LymallCategoryMapper;
import com.ly.lymall.db.domian.LymallCategory;
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
}
