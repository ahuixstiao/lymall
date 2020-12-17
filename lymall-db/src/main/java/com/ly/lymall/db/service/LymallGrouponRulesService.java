package com.ly.lymall.db.service;

import com.ly.lymall.db.dto.LymallGrouponRulesDTO;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-14/ 15:04
 * @Description: 团购规则 业务层接口
 */
public interface LymallGrouponRulesService {

    /**
     * 查询全部团购商品
     * @return List<LymallGrouponRules>
     */
    List<LymallGrouponRulesDTO> findAllGroupbuy(Integer currentPage, Integer limit);
}
