package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallKeyword;
import org.apache.ibatis.jdbc.SQL;

public class LymallKeywordSqlProvider {
    public String insertSelective(LymallKeyword record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_keyword");
        
        if (record.getKeyword() != null) {
            sql.VALUES("keyword", "#{keyword,jdbcType=VARCHAR}");
        }
        
        if (record.getKeywordUrl() != null) {
            sql.VALUES("keyword_url", "#{keywordUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getKeywordIsHot() != null) {
            sql.VALUES("keyword_is_hot", "#{keywordIsHot,jdbcType=BIT}");
        }
        
        if (record.getKeywordIsDefault() != null) {
            sql.VALUES("keyword_is_default", "#{keywordIsDefault,jdbcType=BIT}");
        }
        
        if (record.getKeywordSortOrder() != null) {
            sql.VALUES("keyword_sort_order", "#{keywordSortOrder,jdbcType=INTEGER}");
        }
        
        if (record.getKeywordAddTime() != null) {
            sql.VALUES("keyword_add_time", "#{keywordAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKeywordUpdateTime() != null) {
            sql.VALUES("keyword_update_time", "#{keywordUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKeywordDeleted() != null) {
            sql.VALUES("keyword_deleted", "#{keywordDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallKeyword record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_keyword");
        
        if (record.getKeyword() != null) {
            sql.SET("keyword = #{keyword,jdbcType=VARCHAR}");
        }
        
        if (record.getKeywordUrl() != null) {
            sql.SET("keyword_url = #{keywordUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getKeywordIsHot() != null) {
            sql.SET("keyword_is_hot = #{keywordIsHot,jdbcType=BIT}");
        }
        
        if (record.getKeywordIsDefault() != null) {
            sql.SET("keyword_is_default = #{keywordIsDefault,jdbcType=BIT}");
        }
        
        if (record.getKeywordSortOrder() != null) {
            sql.SET("keyword_sort_order = #{keywordSortOrder,jdbcType=INTEGER}");
        }
        
        if (record.getKeywordAddTime() != null) {
            sql.SET("keyword_add_time = #{keywordAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKeywordUpdateTime() != null) {
            sql.SET("keyword_update_time = #{keywordUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKeywordDeleted() != null) {
            sql.SET("keyword_deleted = #{keywordDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("keyword_id = #{keywordId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    public String selectAllisHotOrDefaultSelective(String type){
        SQL sql=new SQL();
        sql.SELECT("*");
        sql.FROM("lymall_keyword");
        sql.WHERE("keyword_is_hot=${"+type+"}");
        sql.OR();
        sql.WHERE("keyword_is_default=${"+type+"}");

        return sql.toString();
    }
}