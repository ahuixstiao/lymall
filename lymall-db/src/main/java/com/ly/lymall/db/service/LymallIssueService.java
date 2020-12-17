package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallIssue;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-04/ 14:54
 * @Description: Issue业务层接口
 */
public interface LymallIssueService {

    /**
     * 查询常见问题
     * @param currentPage
     * @param limitData
     * @return List<LymallIssue>
     */
    List<LymallIssue> getIssueByPage(Integer currentPage,Integer limitData);

}
