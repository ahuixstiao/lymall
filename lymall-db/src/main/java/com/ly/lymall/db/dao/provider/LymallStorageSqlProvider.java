package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallStorage;
import org.apache.ibatis.jdbc.SQL;

public class LymallStorageSqlProvider {
    public String insertSelective(LymallStorage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_storage");
        
        if (record.getStorageKey() != null) {
            sql.VALUES("storage_key", "#{storageKey,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageName() != null) {
            sql.VALUES("storage_name", "#{storageName,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageType() != null) {
            sql.VALUES("storage_type", "#{storageType,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageSize() != null) {
            sql.VALUES("storage_size", "#{storageSize,jdbcType=INTEGER}");
        }
        
        if (record.getStorageUrl() != null) {
            sql.VALUES("storage_url", "#{storageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageAddTime() != null) {
            sql.VALUES("storage_add_time", "#{storageAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStorageUpdateTime() != null) {
            sql.VALUES("storage_update_time", "#{storageUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStorageDeleted() != null) {
            sql.VALUES("storage_deleted", "#{storageDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallStorage record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_storage");
        
        if (record.getStorageKey() != null) {
            sql.SET("storage_key = #{storageKey,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageName() != null) {
            sql.SET("storage_name = #{storageName,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageType() != null) {
            sql.SET("storage_type = #{storageType,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageSize() != null) {
            sql.SET("storage_size = #{storageSize,jdbcType=INTEGER}");
        }
        
        if (record.getStorageUrl() != null) {
            sql.SET("storage_url = #{storageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageAddTime() != null) {
            sql.SET("storage_add_time = #{storageAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStorageUpdateTime() != null) {
            sql.SET("storage_update_time = #{storageUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStorageDeleted() != null) {
            sql.SET("storage_deleted = #{storageDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("storage_id = #{storageId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}