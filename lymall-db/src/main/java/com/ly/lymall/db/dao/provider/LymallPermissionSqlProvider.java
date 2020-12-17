package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallPermission;
import org.apache.ibatis.jdbc.SQL;

public class LymallPermissionSqlProvider {
    public String insertSelective(LymallPermission record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_permission");
        
        if (record.getRoleId() != null) {
            sql.VALUES("role_id", "#{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getPermission() != null) {
            sql.VALUES("permission", "#{permission,jdbcType=VARCHAR}");
        }
        
        if (record.getPermissionAddTime() != null) {
            sql.VALUES("permission_add_time", "#{permissionAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPermissionUpdateTime() != null) {
            sql.VALUES("permission_update_time", "#{permissionUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPermissionDeleted() != null) {
            sql.VALUES("permission_deleted", "#{permissionDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallPermission record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_permission");
        
        if (record.getRoleId() != null) {
            sql.SET("role_id = #{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getPermission() != null) {
            sql.SET("permission = #{permission,jdbcType=VARCHAR}");
        }
        
        if (record.getPermissionAddTime() != null) {
            sql.SET("permission_add_time = #{permissionAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPermissionUpdateTime() != null) {
            sql.SET("permission_update_time = #{permissionUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPermissionDeleted() != null) {
            sql.SET("permission_deleted = #{permissionDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("permission_id = #{permissionId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}