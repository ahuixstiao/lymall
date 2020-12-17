package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallSystem;
import org.apache.ibatis.jdbc.SQL;

public class LymallSystemSqlProvider {
    public String insertSelective(LymallSystem record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_system");
        
        if (record.getSystemKeyName() != null) {
            sql.VALUES("system_key_name", "#{systemKeyName,jdbcType=VARCHAR}");
        }
        
        if (record.getSystemKeyValue() != null) {
            sql.VALUES("system_key_value", "#{systemKeyValue,jdbcType=VARCHAR}");
        }
        
        if (record.getSystemAddTime() != null) {
            sql.VALUES("system_add_time", "#{systemAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSystemUpdateTime() != null) {
            sql.VALUES("system_update_time", "#{systemUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSystemDeleted() != null) {
            sql.VALUES("system_deleted", "#{systemDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallSystem record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_system");
        
        if (record.getSystemKeyName() != null) {
            sql.SET("system_key_name = #{systemKeyName,jdbcType=VARCHAR}");
        }
        
        if (record.getSystemKeyValue() != null) {
            sql.SET("system_key_value = #{systemKeyValue,jdbcType=VARCHAR}");
        }
        
        if (record.getSystemAddTime() != null) {
            sql.SET("system_add_time = #{systemAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSystemUpdateTime() != null) {
            sql.SET("system_update_time = #{systemUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSystemDeleted() != null) {
            sql.SET("system_deleted = #{systemDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("system_id = #{systemId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}