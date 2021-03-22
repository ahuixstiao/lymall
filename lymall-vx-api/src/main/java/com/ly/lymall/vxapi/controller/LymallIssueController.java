package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domain.LymallIssue;
import com.ly.lymall.db.service.LymallIssueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-04/ 14:51
 * @Description: 常见问题 表现层Controller类
 */
@RestController
@RequestMapping(path = "/wx")
public class LymallIssueController {

    @Resource
    private LymallIssueService issueService;

    /**
     * 查询全部常见问题
     *
     * @param currentPage
     * @param limit
     * @return Object
     */
    @RequestMapping(path = "issue/list")
    public Object getIssueByPage(Integer currentPage, Integer limit) {

        List<LymallIssue> issueList = issueService.getIssueByPage(currentPage, limit);

        if (issueList.size()>0) {
            return ResponseUtil.okListPage(issueList);
        }
        return ResponseUtil.fail();
    }

}
