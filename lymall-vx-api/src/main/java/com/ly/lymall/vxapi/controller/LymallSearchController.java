package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.dao.mapper.LymallSearchHistoryMapper;
import com.ly.lymall.db.domian.LymallKeyword;
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
     * @param userId 用户id
     * @param keywrod 用户输入的关键字
     * @param type 是否搜索默认关键字与热门关键字
     * @param currentPage 当前页
     * @param limit 信息条数
     * @return
     */
    @RequestMapping("")
    public Object selectFindAllKeyWords(Integer userId,String keywrod,Integer type,Integer currentPage,Integer limit){
        //保存 默认关键字与热门关键字返回值
        List<LymallKeyword> keywordList=keywordService.selectAllHotOrDefaultKeywords(type,currentPage,limit);
        //声明一个实体类保存默认关键字信息
        LymallKeyword defaultandhotKeyword=new LymallKeyword();
        //取出默认关键字保存到对象中
        if(keywordList.get(0).getKeywordIsDefault()){
            defaultandhotKeyword=keywordList.get(0);
        }

        //声明一个map接口封装 返回值
        Map<String,Object> map=new HashMap<>();

        //默认关键字
        map.put("defaultandhotKeyword",defaultandhotKeyword);
        //热门关键字
        map.put("hotKeyword",ResponseUtil.okListPage(keywordList));
        //历史关键字
        map.put("historyKeyword",searchHistoryService.selectByHistory(userId,currentPage,limit));

        return map;
    }
}
