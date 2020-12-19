package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallTopicMapper;
import com.ly.lymall.db.domian.LymallTopic;
import com.ly.lymall.db.service.LymallTopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ahui
 * @Date: 2020/12/19/12:57
 * @Description: 专题精选 业务层实现类
 */
@Service
public class LymallTopicServiceImpl implements LymallTopicService {

    @Resource
    private LymallTopicMapper topicMapper;

    /**
     * 查询专题精选商品信息
     * @return List<LymallTopic>
     */
    @Override
    public List<LymallTopic> selectByfindAll(Integer currentPage,Integer limit) {

        PageHelper.startPage(currentPage,limit);

        return topicMapper.selectByfindAll();
    }
}
