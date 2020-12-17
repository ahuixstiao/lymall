package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallComment;
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
}