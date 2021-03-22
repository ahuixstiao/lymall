package com.ly.lymall.db.service;

import com.ly.lymall.db.domain.LymallTopic;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ahui
 * @Date: 2020/12/19/12:57
 * @Description: 专题精选 业务层接口
 */
public interface LymallTopicService {


    /**
     * 查询专题精选商品信息
     * @return List<LymallTopic>
     */
    List<LymallTopic> selectByfindAll(Integer currentPage,Integer limit);

}
