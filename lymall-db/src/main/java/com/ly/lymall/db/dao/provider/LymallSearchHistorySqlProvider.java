package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallSearchHistory;
import org.apache.ibatis.jdbc.SQL;

public class LymallSearchHistorySqlProvider {
    public String insertSelective(LymallSearchHistory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_search_history");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSearchKeyword() != null) {
            sql.VALUES("search_keyword", "#{searchKeyword,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchFrom() != null) {
            sql.VALUES("search_from", "#{searchFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchHistoryAddTime() != null) {
            sql.VALUES("search_history_add_time", "#{searchHistoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryUpdateTime() != null) {
            sql.VALUES("search_history_update_time", "#{searchHistoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryDeleted() != null) {
            sql.VALUES("search_history_deleted", "#{searchHistoryDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallSearchHistory record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_search_history");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSearchKeyword() != null) {
            sql.SET("search_keyword = #{searchKeyword,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchFrom() != null) {
            sql.SET("search_from = #{searchFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchHistoryAddTime() != null) {
            sql.SET("search_history_add_time = #{searchHistoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryUpdateTime() != null) {
            sql.SET("search_history_update_time = #{searchHistoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryDeleted() != null) {
            sql.SET("search_history_deleted = #{searchHistoryDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("search_history_id = #{searchHistoryId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}