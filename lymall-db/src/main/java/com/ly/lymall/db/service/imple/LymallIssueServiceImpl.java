package com.ly.lymall.db.service.imple;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallIssueMapper;
import com.ly.lymall.db.domian.LymallIssue;
import com.ly.lymall.db.service.LymallIssueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-04/ 14:56
 * @Description: Issue实现类
 */
@Service
public class LymallIssueServiceImpl implements LymallIssueService {

    @Resource
    private LymallIssueMapper issueMapper;

    /**
     * 查询常见问题
     *
     * @param currentPage
     * @param limitData
     * @return List<LymallIssue>
     */
    @Override
    public List<LymallIssue> getIssueByPage(Integer currentPage, Integer limitData) {

        PageHelper.startPage(currentPage,limitData);

        return issueMapper.selectAllIssue();
    }
}
