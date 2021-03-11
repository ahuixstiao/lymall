package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallBrandMapper;
import com.ly.lymall.db.domian.LymallBrand;
import com.ly.lymall.db.service.LymallBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ahui
 * @Date: 2020/12/14/20:29
 * @Description: 品牌厂商商品信息 业务层实现类
 */
@Service
public class LymallBrandServiceImpl implements LymallBrandService {

    @Resource
    private LymallBrandMapper brandMapper;

    /**
     * 查询全部品牌厂商商品信息
     *
     * @return List<LymallBrand>
     */
    @Override
    public List<LymallBrand> selectFindAll(Integer currentPage, Integer limit) {

        PageHelper.startPage(currentPage, limit);

        return brandMapper.selectFindAll();
    }

    /**
     * 根据品牌id查询品牌信息
     *
     * @param brandId
     * @return LymallBrand
     */
    @Override
    public LymallBrand selectByBrandIdFindInfo(Integer brandId) {

        return brandMapper.selectByBrandIdFindInfo(brandId);
    }
}
