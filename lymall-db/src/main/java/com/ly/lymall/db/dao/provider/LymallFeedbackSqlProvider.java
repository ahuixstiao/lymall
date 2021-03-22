package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallFeedback;
import org.apache.ibatis.jdbc.SQL;

public class LymallFeedbackSqlProvider {
    public String insertSelective(LymallFeedback record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_feedback");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserUsername() != null) {
            sql.VALUES("user_username", "#{userUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.VALUES("user_mobile", "#{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackType() != null) {
            sql.VALUES("feedback_type", "#{feedbackType,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackContent() != null) {
            sql.VALUES("feedback_content", "#{feedbackContent,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackStatus() != null) {
            sql.VALUES("feedback_status", "#{feedbackStatus,jdbcType=INTEGER}");
        }
        
        if (record.getFeedbackHasPicture() != null) {
            sql.VALUES("feedback_has_picture", "#{feedbackHasPicture,jdbcType=BIT}");
        }
        
        if (record.getFeedbackPicUrls() != null) {
            sql.VALUES("feedback_pic_urls", "#{feedbackPicUrls,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackAddTime() != null) {
            sql.VALUES("feedback_add_time", "#{feedbackAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFeedbackUpdateTime() != null) {
            sql.VALUES("feedback_update_time", "#{feedbackUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFeedbackDeleted() != null) {
            sql.VALUES("feedback_deleted", "#{feedbackDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallFeedback record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_feedback");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserUsername() != null) {
            sql.SET("user_username = #{userUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.SET("user_mobile = #{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackType() != null) {
            sql.SET("feedback_type = #{feedbackType,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackContent() != null) {
            sql.SET("feedback_content = #{feedbackContent,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackStatus() != null) {
            sql.SET("feedback_status = #{feedbackStatus,jdbcType=INTEGER}");
        }
        
        if (record.getFeedbackHasPicture() != null) {
            sql.SET("feedback_has_picture = #{feedbackHasPicture,jdbcType=BIT}");
        }
        
        if (record.getFeedbackPicUrls() != null) {
            sql.SET("feedback_pic_urls = #{feedbackPicUrls,jdbcType=VARCHAR}");
        }
        
        if (record.getFeedbackAddTime() != null) {
            sql.SET("feedback_add_time = #{feedbackAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFeedbackUpdateTime() != null) {
            sql.SET("feedback_update_time = #{feedbackUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFeedbackDeleted() != null) {
            sql.SET("feedback_deleted = #{feedbackDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("feedback_id = #{feedbackId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}