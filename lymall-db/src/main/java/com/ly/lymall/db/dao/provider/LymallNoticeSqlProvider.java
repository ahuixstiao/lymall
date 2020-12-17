package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallNotice;
import org.apache.ibatis.jdbc.SQL;

public class LymallNoticeSqlProvider {
    public String insertSelective(LymallNotice record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_notice");
        
        if (record.getNoticeTitle() != null) {
            sql.VALUES("notice_title", "#{noticeTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeContent() != null) {
            sql.VALUES("notice_content", "#{noticeContent,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeCreateAdminId() != null) {
            sql.VALUES("notice_create_admin_id", "#{noticeCreateAdminId,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeAddTime() != null) {
            sql.VALUES("notice_add_time", "#{noticeAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeUpdateTime() != null) {
            sql.VALUES("notice_update_time", "#{noticeUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeDeleted() != null) {
            sql.VALUES("notice_deleted", "#{noticeDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallNotice record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_notice");
        
        if (record.getNoticeTitle() != null) {
            sql.SET("notice_title = #{noticeTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeContent() != null) {
            sql.SET("notice_content = #{noticeContent,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeCreateAdminId() != null) {
            sql.SET("notice_create_admin_id = #{noticeCreateAdminId,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeAddTime() != null) {
            sql.SET("notice_add_time = #{noticeAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeUpdateTime() != null) {
            sql.SET("notice_update_time = #{noticeUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeDeleted() != null) {
            sql.SET("notice_deleted = #{noticeDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("notice_id = #{noticeId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}