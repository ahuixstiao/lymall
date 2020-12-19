package com.ly.lymall.db.service.imple;

import com.ly.lymall.db.dao.mapper.LymallKeywordMapper;
import com.ly.lymall.db.domian.LymallKeyword;
import com.ly.lymall.db.service.LymallKeywordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-18/ 15:34
 * @Description: 搜索框 业务层实现类
 */
@Service
public class LymallKeywordServiceImpl implements LymallKeywordService {

    @Resource
    private LymallKeywordMapper keywordMapper;

    /**
     * 查询关键字
     * @param type
     * @return List<LymallKeyword>
     */
    @Override
    public List<LymallKeyword> selectAllHotOrDefault(String type) {

        return keywordMapper.selectAllHotOrDefault(type);
    }
}
