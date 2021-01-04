package com.ly.lymall.db.service;

import com.ly.lymall.db.dto.LymallUserCommentDTO;

import java.util.List;

/**
 * @Author: Ahui
 * @Description: 评论信息 业务层接口
 * @DateTime: 2020/12/30 - 16:49
 **/
public interface LymallCommentService {

    /**
     * 根据userId、goodsId查询出对应的商品评论或专题评论
     * @param userId
     * @param goodsId
     * @param commentType 评价类型 0商品评价 1专题评价
     * @return List<LymallUserCommentDTO>
     */
    List<LymallUserCommentDTO> selectByGoodsIdFindComment(Integer userId, Integer goodsId, Integer commentType,Integer currentPage,Integer limit);
}
