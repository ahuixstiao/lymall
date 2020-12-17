package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallRole;
import org.apache.ibatis.jdbc.SQL;

public class LymallRoleSqlProvider {
    public String insertSelective(LymallRole record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_role");
        
        if (record.getRoleName() != null) {
            sql.VALUES("role_name", "#{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleDesc() != null) {
            sql.VALUES("role_desc", "#{roleDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleEnabled() != null) {
            sql.VALUES("role_enabled", "#{roleEnabled,jdbcType=BIT}");
        }
        
        if (record.getRoleAddTime() != null) {
            sql.VALUES("role_add_time", "#{roleAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoleUpdateTime() != null) {
            sql.VALUES("role_update_time", "#{roleUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoleDeleted() != null) {
            sql.VALUES("role_deleted", "#{roleDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallRole record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_role");
        
        if (record.getRoleName() != null) {
            sql.SET("role_name = #{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleDesc() != null) {
            sql.SET("role_desc = #{roleDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleEnabled() != null) {
            sql.SET("role_enabled = #{roleEnabled,jdbcType=BIT}");
        }
        
        if (record.getRoleAddTime() != null) {
            sql.SET("role_add_time = #{roleAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoleUpdateTime() != null) {
            sql.SET("role_update_time = #{roleUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRoleDeleted() != null) {
            sql.SET("role_deleted = #{roleDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("role_id = #{roleId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}