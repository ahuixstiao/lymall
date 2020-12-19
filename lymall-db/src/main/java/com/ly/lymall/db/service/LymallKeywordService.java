package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallKeyword;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-18/ 15:34
 * @Description: 搜索框 业务层接口
 */
public interface LymallKeywordService {

    /**
     * 热门关键字或默认关键字
     * @param type
     * @return List<LymallKeyword>
     */
    List<LymallKeyword> selectAllHotOrDefault(String type);

}
