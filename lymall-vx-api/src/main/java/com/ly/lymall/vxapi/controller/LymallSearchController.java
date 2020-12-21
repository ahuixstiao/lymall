package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.dao.mapper.LymallSearchHistoryMapper;
import com.ly.lymall.db.domian.LymallKeyword;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallKeywordService;
import com.ly.lymall.db.service.LymallSearchHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ahui
 * @Description: 搜索页面控制器
 * @DateTime: 2020/12/21 - 12:45 下午
 **/
@RestController
@RequestMapping("/wx")
public class LymallSearchController {

    /**
     * 关键字 业务层接口
     */
    @Resource
    private LymallKeywordService keywordService;

    /**
     * 历史关键字 业务层接口
     */
    @Resource
    private LymallSearchHistoryService searchHistoryService;

    /**
     *
     * @param userInfo 用户id
     * @param keywrod 用户输入的关键字
     * @param type 是否搜索默认关键字与热门关键字
     * @param currentPage 当前页
     * @param limit 信息条数
     * @return Object 返回
     */
    @RequestMapping("search/index")
    public Object selectFindAllKeyWords(LymallUser userInfo, String keywrod, Integer type, Integer currentPage, Integer limit){
        List<LymallKeyword> lymallKeywordList=keywordService.selectAllHotOrDefaultKeywords("keyword_is_default",1,currentPage,limit);
        LymallKeyword lymallKeyword=lymallKeywordList.get(0);
        //声明一个map接口封装 返回值
        Map<String,Object> map=new HashMap<>();

        //默认关键字
        map.put("defaultKeyword",lymallKeyword);
        //热门关键字
        map.put("hotKeyword",ResponseUtil.okListPage(keywordService.selectAllHotOrDefaultKeywords("keyword_is_hot",1,currentPage,limit)));
        //历史关键字
        map.put("historyKeyword",searchHistoryService.selectByHistory(userInfo.getUserId(),currentPage,limit));

        return map;
    }
}
