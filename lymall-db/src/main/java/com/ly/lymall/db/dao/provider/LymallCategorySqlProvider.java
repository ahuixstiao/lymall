package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallCategory;
import org.apache.ibatis.jdbc.SQL;

public class LymallCategorySqlProvider {
    public String insertSelective(LymallCategory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_category");
        
        if (record.getCategoryName() != null) {
            sql.VALUES("category_name", "#{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryKeywords() != null) {
            sql.VALUES("category_keywords", "#{categoryKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryDesc() != null) {
            sql.VALUES("category_desc", "#{categoryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPid() != null) {
            sql.VALUES("category_pid", "#{categoryPid,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIconUrl() != null) {
            sql.VALUES("category_icon_url", "#{categoryIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPicUrl() != null) {
            sql.VALUES("category_pic_url", "#{categoryPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryLevel() != null) {
            sql.VALUES("category_level", "#{categoryLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getCategorySortOrder() != null) {
            sql.VALUES("category_sort_order", "#{categorySortOrder,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryAddTime() != null) {
            sql.VALUES("category_add_time", "#{categoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryUpdateTime() != null) {
            sql.VALUES("category_update_time", "#{categoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryDeleted() != null) {
            sql.VALUES("category_deleted", "#{categoryDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallCategory record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_category");
        
        if (record.getCategoryName() != null) {
            sql.SET("category_name = #{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryKeywords() != null) {
            sql.SET("category_keywords = #{categoryKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryDesc() != null) {
            sql.SET("category_desc = #{categoryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPid() != null) {
            sql.SET("category_pid = #{categoryPid,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIconUrl() != null) {
            sql.SET("category_icon_url = #{categoryIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPicUrl() != null) {
            sql.SET("category_pic_url = #{categoryPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryLevel() != null) {
            sql.SET("category_level = #{categoryLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getCategorySortOrder() != null) {
            sql.SET("category_sort_order = #{categorySortOrder,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryAddTime() != null) {
            sql.SET("category_add_time = #{categoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryUpdateTime() != null) {
            sql.SET("category_update_time = #{categoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryDeleted() != null) {
            sql.SET("category_deleted = #{categoryDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("category_id = #{categoryId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

}