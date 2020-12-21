package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallSearchHistoryMapper;
import com.ly.lymall.db.domian.LymallSearchHistory;
import com.ly.lymall.db.service.LymallSearchHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: TODO
 * @DateTime: 2020/12/21 - 12:34 下午
 **/
@Service
public class LymallSearchHistoryServiceImpl implements LymallSearchHistoryService {

    @Resource
    private LymallSearchHistoryMapper searchHistoryMapper;

    /**
     * 根据用户id来查询历史关键字 并分页
     * @param userId
     * @param currentPage
     * @param limit
     * @return List<LymallSearchHistory>
     */
    @Override
    public List<LymallSearchHistory> selectByHistory(Integer userId,Integer currentPage,Integer limit) {

        PageHelper.startPage(currentPage,limit);

        return searchHistoryMapper.selectByUserIdFindHistory(userId);
    }
}
