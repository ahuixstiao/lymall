package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallCommentMapper;
import com.ly.lymall.db.domian.LymallComment;
import com.ly.lymall.db.dto.LymallUserCommentDTO;
import com.ly.lymall.db.service.LymallCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: 评价信息 业务层实现类
 * @DateTime: 2020/12/30 - 16:50
 **/
@Service
public class LymallCommentServiceImpl implements LymallCommentService {

    /**
     * 评价信息 mapper接口
     */
    @Resource
    private LymallCommentMapper commentMapper;

    /**
     * 根据userId、goodsId查询出对应的商品评论或专题评论
     *
     * @param userId
     * @param goodsId
     * @param commentType 评价类型 0商品评价 1专题评价
     * @return List<LymallComment>
     */
    @Override
    public List<LymallUserCommentDTO> selectByGoodsIdFindComment(Integer userId, Integer goodsId, Integer commentType, Integer currentPage, Integer limit) {

        PageHelper.startPage(currentPage, limit);

        return commentMapper.selectByGoodsIdFindComment(userId, goodsId, commentType);
    }
}
