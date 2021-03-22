package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallAdmin;
import org.apache.ibatis.jdbc.SQL;

public class LymallAdminSqlProvider {
    public String insertSelective(LymallAdmin record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_admin");
        
        if (record.getAdminUsername() != null) {
            sql.VALUES("admin_username", "#{adminUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminPassword() != null) {
            sql.VALUES("admin_password", "#{adminPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminLastLoginIp() != null) {
            sql.VALUES("admin_last_login_ip", "#{adminLastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminLastLoginTime() != null) {
            sql.VALUES("admin_last_login_time", "#{adminLastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminAvatar() != null) {
            sql.VALUES("admin_avatar", "#{adminAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminAddTime() != null) {
            sql.VALUES("admin_add_time", "#{adminAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminUpdateTime() != null) {
            sql.VALUES("admin_update_time", "#{adminUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminDeleted() != null) {
            sql.VALUES("admin_deleted", "#{adminDeleted,jdbcType=BIT}");
        }
        
        if (record.getAdminRoleIds() != null) {
            sql.VALUES("admin_role_ids", "#{adminRoleIds,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallAdmin record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_admin");
        
        if (record.getAdminUsername() != null) {
            sql.SET("admin_username = #{adminUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminPassword() != null) {
            sql.SET("admin_password = #{adminPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminLastLoginIp() != null) {
            sql.SET("admin_last_login_ip = #{adminLastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminLastLoginTime() != null) {
            sql.SET("admin_last_login_time = #{adminLastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminAvatar() != null) {
            sql.SET("admin_avatar = #{adminAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminAddTime() != null) {
            sql.SET("admin_add_time = #{adminAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminUpdateTime() != null) {
            sql.SET("admin_update_time = #{adminUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminDeleted() != null) {
            sql.SET("admin_deleted = #{adminDeleted,jdbcType=BIT}");
        }
        
        if (record.getAdminRoleIds() != null) {
            sql.SET("admin_role_ids = #{adminRoleIds,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("admin_id = #{adminId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}