package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallKeyword;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-18/ 15:34
 * @Description: 关键字 业务层接口
 */
public interface LymallKeywordService {

    /**
     * 热门关键字或默认关键字
     * @param keywordName
     * @param type
     * @param currentPage
     * @param limit
     * @return List<LymallKeyword>
     */
    List<LymallKeyword> selectAllHotOrDefaultKeywords(String keywordName,Integer type,Integer currentPage,Integer limit);

}
