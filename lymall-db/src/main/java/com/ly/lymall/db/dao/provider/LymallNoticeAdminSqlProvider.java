package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallNoticeAdmin;
import org.apache.ibatis.jdbc.SQL;

public class LymallNoticeAdminSqlProvider {
    public String insertSelective(LymallNoticeAdmin record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_notice_admin");
        
        if (record.getNoticeId() != null) {
            sql.VALUES("notice_id", "#{noticeId,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeTitle() != null) {
            sql.VALUES("notice_title", "#{noticeTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeReceiveAdminId() != null) {
            sql.VALUES("notice_receive_admin_id", "#{noticeReceiveAdminId,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeAdminReadTime() != null) {
            sql.VALUES("notice_admin_read_time", "#{noticeAdminReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeAdminAddTime() != null) {
            sql.VALUES("notice_admin_add_time", "#{noticeAdminAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeAdminUpdateTime() != null) {
            sql.VALUES("notice_admin_update_time", "#{noticeAdminUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeAdminDeleted() != null) {
            sql.VALUES("notice_admin_deleted", "#{noticeAdminDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallNoticeAdmin record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_notice_admin");
        
        if (record.getNoticeId() != null) {
            sql.SET("notice_id = #{noticeId,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeTitle() != null) {
            sql.SET("notice_title = #{noticeTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeReceiveAdminId() != null) {
            sql.SET("notice_receive_admin_id = #{noticeReceiveAdminId,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeAdminReadTime() != null) {
            sql.SET("notice_admin_read_time = #{noticeAdminReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeAdminAddTime() != null) {
            sql.SET("notice_admin_add_time = #{noticeAdminAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeAdminUpdateTime() != null) {
            sql.SET("notice_admin_update_time = #{noticeAdminUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNoticeAdminDeleted() != null) {
            sql.SET("notice_admin_deleted = #{noticeAdminDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("notice_admin_id = #{noticeAdminId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}