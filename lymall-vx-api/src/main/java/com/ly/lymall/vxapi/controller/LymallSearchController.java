package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.dao.mapper.LymallSearchHistoryMapper;
import com.ly.lymall.db.domian.LymallKeyword;
import com.ly.lymall.db.domian.LymallUser;
import com.ly.lymall.db.service.LymallGoodsService;
import com.ly.lymall.db.service.LymallKeywordService;
import com.ly.lymall.db.service.LymallSearchHistoryService;
import jdk.nashorn.internal.objects.NativeNumber;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
     * 商品信息 业务层接口
     */
    @Resource
    private LymallGoodsService goodsService;

    /**
     * 用户点击搜索框时显示的数据 默认关键字 热门关键字 历史关键字
     * @param userInfo 通过前端返回的userId判断用户登陆的状态 来进行查询ll     * @param currentPage 当前页
     * @param limit 信息条数
     * @return Object 返回
     */
    @RequestMapping("search/index")
    public Object selectFindAllKeyWords(LymallUser userInfo, Integer currentPage, Integer limit){
        //保存默认关键字返回值
        List<LymallKeyword> lymallKeywordList=keywordService.selectAllHotOrDefaultKeywords("keyword_is_default",1,currentPage,limit);
        //将默认关键字 保存到实体类中
        LymallKeyword lymallKeyword=lymallKeywordList.get(0);

        //声明map接口 用来封装返回值
        Map<String,Object> result=new HashMap<>();

        //默认关键字
        result.put("defaultKeyword",lymallKeyword);
        //热门关键字
        result.put("hotKeyword",ResponseUtil.okListPage(keywordService.selectAllHotOrDefaultKeywords("keyword_is_hot",1,currentPage,limit)));
        //历史关键字
        result.put("historyKeyword",ResponseUtil.okListPage(searchHistoryService.selectByHistory(userInfo.getUserId(),currentPage,limit)));

        return result;
    }

    /**
     * 搜索商品信息并进行排序 且向历史关键字表插入用户搜索的关键字
     * @param keyword 关键字
     * @param orderCloumn // 根据什么排序
     * @param orderType //排序类型 升序或降序
     * @param categoryId //商品分类id
     * @return Object
     */
    @RequestMapping("search/result")
    public Object searchProducts(String keyword, String orderCloumn, String orderType,Integer categoryId){
        //声明map集合 封装返回值
        Map<String,Object> result=new HashMap<>();

        //通过用户输入的关键字与选中的商品类别进行模糊查询商品信息 并对商品进行排序
        result.put("goodsList",goodsService.searchProducts(keyword,orderCloumn,orderType,categoryId));

        return result;
    }

}
