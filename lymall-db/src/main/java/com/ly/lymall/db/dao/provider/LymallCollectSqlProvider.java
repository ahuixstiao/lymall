package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallCollect;
import org.apache.ibatis.jdbc.SQL;

public class LymallCollectSqlProvider {
    public String insertSelective(LymallCollect record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_collect");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectValueId() != null) {
            sql.VALUES("collect_value_id", "#{collectValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectType() != null) {
            sql.VALUES("collect_type", "#{collectType,jdbcType=TINYINT}");
        }
        
        if (record.getCollectAddTime() != null) {
            sql.VALUES("collect_add_time", "#{collectAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCollectUpdateTime() != null) {
            sql.VALUES("collect_update_time", "#{collectUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCollectDeleted() != null) {
            sql.VALUES("collect_deleted", "#{collectDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallCollect record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_collect");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectValueId() != null) {
            sql.SET("collect_value_id = #{collectValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectType() != null) {
            sql.SET("collect_type = #{collectType,jdbcType=TINYINT}");
        }
        
        if (record.getCollectAddTime() != null) {
            sql.SET("collect_add_time = #{collectAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCollectUpdateTime() != null) {
            sql.SET("collect_update_time = #{collectUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCollectDeleted() != null) {
            sql.SET("collect_deleted = #{collectDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("collect_id = #{collectId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}