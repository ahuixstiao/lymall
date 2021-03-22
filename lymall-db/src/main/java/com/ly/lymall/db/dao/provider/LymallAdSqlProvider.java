package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallAd;
import org.apache.ibatis.jdbc.SQL;

public class LymallAdSqlProvider {
    public String insertSelective(LymallAd record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_ad");
        
        if (record.getAdName() != null) {
            sql.VALUES("ad_name", "#{adName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdLink() != null) {
            sql.VALUES("ad_link", "#{adLink,jdbcType=VARCHAR}");
        }
        
        if (record.getAdUrl() != null) {
            sql.VALUES("ad_url", "#{adUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAdPosition() != null) {
            sql.VALUES("ad_position", "#{adPosition,jdbcType=TINYINT}");
        }
        
        if (record.getAdContent() != null) {
            sql.VALUES("ad_content", "#{adContent,jdbcType=VARCHAR}");
        }
        
        if (record.getAdStartTime() != null) {
            sql.VALUES("ad_start_time", "#{adStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdEndTime() != null) {
            sql.VALUES("ad_end_time", "#{adEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdEnabled() != null) {
            sql.VALUES("ad_enabled", "#{adEnabled,jdbcType=BIT}");
        }
        
        if (record.getAdAddTime() != null) {
            sql.VALUES("ad_add_time", "#{adAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdUpdateTime() != null) {
            sql.VALUES("ad_update_time", "#{adUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdDeleted() != null) {
            sql.VALUES("ad_deleted", "#{adDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallAd record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_ad");
        
        if (record.getAdName() != null) {
            sql.SET("ad_name = #{adName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdLink() != null) {
            sql.SET("ad_link = #{adLink,jdbcType=VARCHAR}");
        }
        
        if (record.getAdUrl() != null) {
            sql.SET("ad_url = #{adUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getAdPosition() != null) {
            sql.SET("ad_position = #{adPosition,jdbcType=TINYINT}");
        }
        
        if (record.getAdContent() != null) {
            sql.SET("ad_content = #{adContent,jdbcType=VARCHAR}");
        }
        
        if (record.getAdStartTime() != null) {
            sql.SET("ad_start_time = #{adStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdEndTime() != null) {
            sql.SET("ad_end_time = #{adEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdEnabled() != null) {
            sql.SET("ad_enabled = #{adEnabled,jdbcType=BIT}");
        }
        
        if (record.getAdAddTime() != null) {
            sql.SET("ad_add_time = #{adAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdUpdateTime() != null) {
            sql.SET("ad_update_time = #{adUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdDeleted() != null) {
            sql.SET("ad_deleted = #{adDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("ad_id = #{adId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}