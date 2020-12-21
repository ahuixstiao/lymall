package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallKeywordMapper;
import com.ly.lymall.db.domian.LymallKeyword;
import com.ly.lymall.db.service.LymallKeywordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-18/ 15:34
 * @Description: 关键字 业务层实现类
 */
@Service
public class LymallKeywordServiceImpl implements LymallKeywordService {

    @Resource
    private LymallKeywordMapper keywordMapper;

    /**
     * 查询默认关键字与热门关键字
     * @param type
     * @return List<LymallKeyword>
     */
    @Override
    public List<LymallKeyword> selectAllHotOrDefaultKeywords(String keywordName,Integer type,Integer currentPage,Integer limit) {

        //分页
        PageHelper.startPage(currentPage,limit);

        //返回
        return keywordMapper.selectAllHotOrDefault(keywordName,type);
    }
}
