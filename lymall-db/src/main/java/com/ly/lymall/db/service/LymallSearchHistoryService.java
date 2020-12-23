package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallSearchHistory;

import java.util.List;

/**
 * @Author: Ahui
 * @Description: 历史关键字 业务层接口
 * @DateTime: 2020/12/21 - 12:33 下午
 **/
public interface LymallSearchHistoryService {

    /**
     * 根据用户id来查询历史关键字
     * @param userId
     * @param currentPage
     * @param limit
     * @return List<LymallSearchHistory>
     */
    List<LymallSearchHistory> selectByHistory(Integer userId,Integer currentPage,Integer limit);

    /**
     * 删除历史关键字
     * 若用户登录则按 userId与历史关键字进行删除
     * 若用户未登录则按 历史关键字删除
     * @param userId
     * @return int
     */
    int deleteByHistoryKeyword(Integer userId);
}
