package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallIssue;
import org.apache.ibatis.jdbc.SQL;

public class LymallIssueSqlProvider {
    public String insertSelective(LymallIssue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_issue");
        
        if (record.getIssueQuestion() != null) {
            sql.VALUES("issue_question", "#{issueQuestion,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueAnswer() != null) {
            sql.VALUES("issue_answer", "#{issueAnswer,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueAddTime() != null) {
            sql.VALUES("issue_add_time", "#{issueAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIssueUpdateTime() != null) {
            sql.VALUES("issue_update_time", "#{issueUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIssueDeleted() != null) {
            sql.VALUES("issue_deleted", "#{issueDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallIssue record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_issue");
        
        if (record.getIssueQuestion() != null) {
            sql.SET("issue_question = #{issueQuestion,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueAnswer() != null) {
            sql.SET("issue_answer = #{issueAnswer,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueAddTime() != null) {
            sql.SET("issue_add_time = #{issueAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIssueUpdateTime() != null) {
            sql.SET("issue_update_time = #{issueUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIssueDeleted() != null) {
            sql.SET("issue_deleted = #{issueDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("issue_id = #{issueId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}