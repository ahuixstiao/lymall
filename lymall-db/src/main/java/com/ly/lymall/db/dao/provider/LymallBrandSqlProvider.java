package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallBrand;
import org.apache.ibatis.jdbc.SQL;

public class LymallBrandSqlProvider {
    public String insertSelective(LymallBrand record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_brand");
        
        if (record.getBrandName() != null) {
            sql.VALUES("brand_name", "#{brandName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandDesc() != null) {
            sql.VALUES("brand_desc", "#{brandDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandPicUrl() != null) {
            sql.VALUES("brand_pic_url", "#{brandPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandSortOrder() != null) {
            sql.VALUES("brand_sort_order", "#{brandSortOrder,jdbcType=TINYINT}");
        }
        
        if (record.getBrandFloorPrice() != null) {
            sql.VALUES("brand_floor_price", "#{brandFloorPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getBrandAddTime() != null) {
            sql.VALUES("brand_add_time", "#{brandAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBrandUpdateTime() != null) {
            sql.VALUES("brand_update_time", "#{brandUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBrandDeleted() != null) {
            sql.VALUES("brand_deleted", "#{brandDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallBrand record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_brand");
        
        if (record.getBrandName() != null) {
            sql.SET("brand_name = #{brandName,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandDesc() != null) {
            sql.SET("brand_desc = #{brandDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandPicUrl() != null) {
            sql.SET("brand_pic_url = #{brandPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandSortOrder() != null) {
            sql.SET("brand_sort_order = #{brandSortOrder,jdbcType=TINYINT}");
        }
        
        if (record.getBrandFloorPrice() != null) {
            sql.SET("brand_floor_price = #{brandFloorPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getBrandAddTime() != null) {
            sql.SET("brand_add_time = #{brandAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBrandUpdateTime() != null) {
            sql.SET("brand_update_time = #{brandUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBrandDeleted() != null) {
            sql.SET("brand_deleted = #{brandDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("brand_id = #{brandId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}