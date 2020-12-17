package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallAftersale;
import org.apache.ibatis.jdbc.SQL;

public class LymallAftersaleSqlProvider {
    public String insertSelective(LymallAftersale record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_aftersale");
        
        if (record.getAftersaleSn() != null) {
            sql.VALUES("aftersale_sn", "#{aftersaleSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getAftersaleType() != null) {
            sql.VALUES("aftersale_type", "#{aftersaleType,jdbcType=SMALLINT}");
        }
        
        if (record.getAftersaleReason() != null) {
            sql.VALUES("aftersale_reason", "#{aftersaleReason,jdbcType=VARCHAR}");
        }
        
        if (record.getAftersaleAmount() != null) {
            sql.VALUES("aftersale_amount", "#{aftersaleAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAftersalePictures() != null) {
            sql.VALUES("aftersale_pictures", "#{aftersalePictures,jdbcType=VARCHAR}");
        }
        
        if (record.getAftersaleComment() != null) {
            sql.VALUES("aftersale_comment", "#{aftersaleComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAftersaleStatus() != null) {
            sql.VALUES("aftersale_status", "#{aftersaleStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getAftersaleHandleTime() != null) {
            sql.VALUES("aftersale_handle_time", "#{aftersaleHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAftersaleAddTime() != null) {
            sql.VALUES("aftersale_add_time", "#{aftersaleAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAftersaleUpdateTime() != null) {
            sql.VALUES("aftersale_update_time", "#{aftersaleUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAftersaleDeleted() != null) {
            sql.VALUES("aftersale_deleted", "#{aftersaleDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallAftersale record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_aftersale");
        
        if (record.getAftersaleSn() != null) {
            sql.SET("aftersale_sn = #{aftersaleSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getAftersaleType() != null) {
            sql.SET("aftersale_type = #{aftersaleType,jdbcType=SMALLINT}");
        }
        
        if (record.getAftersaleReason() != null) {
            sql.SET("aftersale_reason = #{aftersaleReason,jdbcType=VARCHAR}");
        }
        
        if (record.getAftersaleAmount() != null) {
            sql.SET("aftersale_amount = #{aftersaleAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAftersalePictures() != null) {
            sql.SET("aftersale_pictures = #{aftersalePictures,jdbcType=VARCHAR}");
        }
        
        if (record.getAftersaleComment() != null) {
            sql.SET("aftersale_comment = #{aftersaleComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAftersaleStatus() != null) {
            sql.SET("aftersale_status = #{aftersaleStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getAftersaleHandleTime() != null) {
            sql.SET("aftersale_handle_time = #{aftersaleHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAftersaleAddTime() != null) {
            sql.SET("aftersale_add_time = #{aftersaleAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAftersaleUpdateTime() != null) {
            sql.SET("aftersale_update_time = #{aftersaleUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAftersaleDeleted() != null) {
            sql.SET("aftersale_deleted = #{aftersaleDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("aftersale_id = #{aftersaleId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}