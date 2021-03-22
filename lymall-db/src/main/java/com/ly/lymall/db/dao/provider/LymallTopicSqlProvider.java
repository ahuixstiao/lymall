package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallTopic;
import org.apache.ibatis.jdbc.SQL;

public class LymallTopicSqlProvider {
    public String insertSelective(LymallTopic record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_topic");
        
        if (record.getTopicTitle() != null) {
            sql.VALUES("topic_title", "#{topicTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicSubtitle() != null) {
            sql.VALUES("topic_subtitle", "#{topicSubtitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicPrice() != null) {
            sql.VALUES("topic_price", "#{topicPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTopicReadCount() != null) {
            sql.VALUES("topic_read_count", "#{topicReadCount,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicPicUrl() != null) {
            sql.VALUES("topic_pic_url", "#{topicPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicSortOrder() != null) {
            sql.VALUES("topic_sort_order", "#{topicSortOrder,jdbcType=INTEGER}");
        }
        
        if (record.getTopicGoods() != null) {
            sql.VALUES("topic_goods", "#{topicGoods,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicAddTime() != null) {
            sql.VALUES("topic_add_time", "#{topicAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTopicUpdateTime() != null) {
            sql.VALUES("topic_update_time", "#{topicUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTopicDeleted() != null) {
            sql.VALUES("topic_deleted", "#{topicDeleted,jdbcType=BIT}");
        }
        
        if (record.getTopicContent() != null) {
            sql.VALUES("topic_content", "#{topicContent,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallTopic record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_topic");
        
        if (record.getTopicTitle() != null) {
            sql.SET("topic_title = #{topicTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicSubtitle() != null) {
            sql.SET("topic_subtitle = #{topicSubtitle,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicPrice() != null) {
            sql.SET("topic_price = #{topicPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTopicReadCount() != null) {
            sql.SET("topic_read_count = #{topicReadCount,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicPicUrl() != null) {
            sql.SET("topic_pic_url = #{topicPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicSortOrder() != null) {
            sql.SET("topic_sort_order = #{topicSortOrder,jdbcType=INTEGER}");
        }
        
        if (record.getTopicGoods() != null) {
            sql.SET("topic_goods = #{topicGoods,jdbcType=VARCHAR}");
        }
        
        if (record.getTopicAddTime() != null) {
            sql.SET("topic_add_time = #{topicAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTopicUpdateTime() != null) {
            sql.SET("topic_update_time = #{topicUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTopicDeleted() != null) {
            sql.SET("topic_deleted = #{topicDeleted,jdbcType=BIT}");
        }
        
        if (record.getTopicContent() != null) {
            sql.SET("topic_content = #{topicContent,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("topic_id = #{topicId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}