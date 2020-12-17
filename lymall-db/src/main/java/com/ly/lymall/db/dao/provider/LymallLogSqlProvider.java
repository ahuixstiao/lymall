package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallLog;
import org.apache.ibatis.jdbc.SQL;

public class LymallLogSqlProvider {
    public String insertSelective(LymallLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_log");
        
        if (record.getLogAdmin() != null) {
            sql.VALUES("log_admin", "#{logAdmin,jdbcType=VARCHAR}");
        }
        
        if (record.getLogIp() != null) {
            sql.VALUES("log_ip", "#{logIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLogType() != null) {
            sql.VALUES("log_type", "#{logType,jdbcType=INTEGER}");
        }
        
        if (record.getLogAction() != null) {
            sql.VALUES("log_action", "#{logAction,jdbcType=VARCHAR}");
        }
        
        if (record.getLogStatus() != null) {
            sql.VALUES("log_status", "#{logStatus,jdbcType=BIT}");
        }
        
        if (record.getLogResult() != null) {
            sql.VALUES("log_result", "#{logResult,jdbcType=VARCHAR}");
        }
        
        if (record.getLogComment() != null) {
            sql.VALUES("log_comment", "#{logComment,jdbcType=VARCHAR}");
        }
        
        if (record.getLogAddTime() != null) {
            sql.VALUES("log_add_time", "#{logAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLogUpdateTime() != null) {
            sql.VALUES("log_update_time", "#{logUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLogDeleted() != null) {
            sql.VALUES("log_deleted", "#{logDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallLog record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_log");
        
        if (record.getLogAdmin() != null) {
            sql.SET("log_admin = #{logAdmin,jdbcType=VARCHAR}");
        }
        
        if (record.getLogIp() != null) {
            sql.SET("log_ip = #{logIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLogType() != null) {
            sql.SET("log_type = #{logType,jdbcType=INTEGER}");
        }
        
        if (record.getLogAction() != null) {
            sql.SET("log_action = #{logAction,jdbcType=VARCHAR}");
        }
        
        if (record.getLogStatus() != null) {
            sql.SET("log_status = #{logStatus,jdbcType=BIT}");
        }
        
        if (record.getLogResult() != null) {
            sql.SET("log_result = #{logResult,jdbcType=VARCHAR}");
        }
        
        if (record.getLogComment() != null) {
            sql.SET("log_comment = #{logComment,jdbcType=VARCHAR}");
        }
        
        if (record.getLogAddTime() != null) {
            sql.SET("log_add_time = #{logAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLogUpdateTime() != null) {
            sql.SET("log_update_time = #{logUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLogDeleted() != null) {
            sql.SET("log_deleted = #{logDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("log_id = #{logId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}