package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.dao.mapper.LymallSearchHistoryMapper;
import com.ly.lymall.db.domian.LymallSearchHistory;
import com.ly.lymall.db.service.LymallSearchHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: 历史关键字 业务层实现类
 * @DateTime: 2020/12/21 - 12:34 下午
 **/
@Service
public class LymallSearchHistoryServiceImpl implements LymallSearchHistoryService {

    /**
     * 注入mapper接口
     */
    @Resource
    private LymallSearchHistoryMapper searchHistoryMapper;

    /**
     * 根据用户id来查询历史关键字 并分页
     *
     * @param userId
     * @param currentPage
     * @param limit
     * @return List<LymallSearchHistory>
     */
    @Override
    public List<LymallSearchHistory> selectByHistory(Integer userId, Integer currentPage, Integer limit) {
        //分页
        PageHelper.startPage(currentPage, limit);
        //返回
        return searchHistoryMapper.selectByUserIdFindHistory(userId);
    }

    /**
     * 查询用户的历史搜索关键字 用以判断：
     * 该userID下是否已存在输入的关键字，有则不执行插入 无则根据用户userID进行插入并设置添加的时间
     *
     * @param keyword 该参数 属于String类型 用于传入用户搜索的历史关键字
     * @param userId  该参数 属于int类型 用于传入用户的Id
     * @return 返回结果为int类型 表示受影响的条数
     */
    @Override
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
    public synchronized int createByHistoryKeyword(String keyword, Integer userId) {

        //查询用户数据库中的历史关键字
        List<LymallSearchHistory> searchHistoryList = searchHistoryMapper.selectByUserIdFindHistory(userId);
        //遍历返回的集合
        for (LymallSearchHistory lymallSearchHistory : searchHistoryList) {
            //判断是否新的历史关键字数据库中是否存在
            if (lymallSearchHistory.getSearchKeyword().equals(keyword)) {
                return 0;
            }
        }
        //不存在则执行添加操作
        return searchHistoryMapper.createHistoryKeyword(keyword, userId,LocalDateTime.now());
    }

    /**
     * 删除历史关键字
     * 若用户登录则按 userId与历史关键字进行删除
     * 若用户未登录则按 历史关键字删
     *
     * @param userId
     * @return int
     */
    @Override
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public synchronized int deleteByHistoryKeyword(Integer userId) {

        return searchHistoryMapper.deleteByHistoryKeyword(userId);
    }
}
