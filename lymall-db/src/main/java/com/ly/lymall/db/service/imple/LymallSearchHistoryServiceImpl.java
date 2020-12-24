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
 * @Description: 历史关键字 业务层实现类
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

        //分页
        PageHelper.startPage(currentPage,limit);

        //返回
        return searchHistoryMapper.selectByUserIdFindHistory(userId);
    }

    /**
     * 删除历史关键字
     * 若用户登录则按 userId与历史关键字进行删除
     * 若用户未登录则按 历史关键字删除
     *
     * @param userId
     * @return int
     */
    @Override
    public int deleteByHistoryKeyword(Integer userId) {

        return searchHistoryMapper.deleteByHistoryKeyword(userId);
    }


}
