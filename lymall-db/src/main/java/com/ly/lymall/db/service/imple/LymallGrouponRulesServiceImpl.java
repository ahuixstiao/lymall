package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.core.config.RedisConfig;
import com.ly.lymall.db.dao.mapper.LymallGrouponRulesMapper;
import com.ly.lymall.db.dto.LymallGrouponRulesDTO;
import com.ly.lymall.db.service.LymallGrouponRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-14/ 15:05
 * @Description: 团购规则 业务层实现类
 */
@Service
public class LymallGrouponRulesServiceImpl implements LymallGrouponRulesService {
    @Autowired
    private LymallGrouponRulesMapper grouponRulesMapper;
    /**
     * 查询全部团购商品
     * @return List<LymallGrouponRules>
     */
    @Override
    public List<LymallGrouponRulesDTO> findAllGroupbuy(Integer currentPage, Integer limit) {
        //设置页数与每一页显示的信息条数
        PageHelper.startPage(currentPage, limit);
        return grouponRulesMapper.findAllGroupbuy();
    }
}
