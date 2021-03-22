package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallComment;
import org.apache.ibatis.jdbc.SQL;

public class LymallCommentSqlProvider {
    public String insertSelective(LymallComment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_comment");
        
        if (record.getCommentValueId() != null) {
            sql.VALUES("comment_value_id", "#{commentValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCommentType() != null) {
            sql.VALUES("comment_type", "#{commentType,jdbcType=TINYINT}");
        }
        
        if (record.getCommentContent() != null) {
            sql.VALUES("comment_content", "#{commentContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentAdminContent() != null) {
            sql.VALUES("comment_admin_content", "#{commentAdminContent,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCommentHasPicture() != null) {
            sql.VALUES("comment_has_picture", "#{commentHasPicture,jdbcType=BIT}");
        }
        
        if (record.getCommentPicUrls() != null) {
            sql.VALUES("comment_pic_urls", "#{commentPicUrls,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentStar() != null) {
            sql.VALUES("comment_star", "#{commentStar,jdbcType=SMALLINT}");
        }
        
        if (record.getCommentAddTime() != null) {
            sql.VALUES("comment_add_time", "#{commentAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentUpdateTime() != null) {
            sql.VALUES("comment_update_time", "#{commentUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentDeleted() != null) {
            sql.VALUES("comment_deleted", "#{commentDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallComment record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_comment");
        
        if (record.getCommentValueId() != null) {
            sql.SET("comment_value_id = #{commentValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCommentType() != null) {
            sql.SET("comment_type = #{commentType,jdbcType=TINYINT}");
        }
        
        if (record.getCommentContent() != null) {
            sql.SET("comment_content = #{commentContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentAdminContent() != null) {
            sql.SET("comment_admin_content = #{commentAdminContent,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCommentHasPicture() != null) {
            sql.SET("comment_has_picture = #{commentHasPicture,jdbcType=BIT}");
        }
        
        if (record.getCommentPicUrls() != null) {
            sql.SET("comment_pic_urls = #{commentPicUrls,jdbcType=VARCHAR}");
        }
        
        if (record.getCommentStar() != null) {
            sql.SET("comment_star = #{commentStar,jdbcType=SMALLINT}");
        }
        
        if (record.getCommentAddTime() != null) {
            sql.SET("comment_add_time = #{commentAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentUpdateTime() != null) {
            sql.SET("comment_update_time = #{commentUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentDeleted() != null) {
            sql.SET("comment_deleted = #{commentDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("comment_id = #{commentId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * 根据userId、goodsId查询出对应的商品评论或专题评论与用户信息
     * @param userId
     * @param goodsId
     * @param commentType 评价类型 0商品评价 1专题评价
     * @return String
     */
    public String selectByGoodsIdFindCommentInfo(Integer userId,Integer goodsId, Integer commentType){
        SQL sql=new SQL();
        sql.SELECT("com.comment_id,com.comment_value_id,com.comment_type,com.comment_content,com.comment_admin_content,com.comment_pic_urls,com.comment_star,com.comment_add_time,com.comment_update_time,user.user_id,user.user_nickname,user.user_avatar")
                .FROM("lymall_comment com,lymall_user user")
                .WHERE("user.user_id=com.user_id and user.user_id="+userId+" and com.comment_value_id="+goodsId+" and com.comment_type="+commentType+" and com.comment_deleted=0");

        return sql.toString();
    }
}