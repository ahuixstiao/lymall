package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallFootprint;
import org.apache.ibatis.jdbc.SQL;

public class LymallFootprintSqlProvider {
    public String insertSelective(LymallFootprint record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_footprint");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getFootprintAddTime() != null) {
            sql.VALUES("footprint_add_time", "#{footprintAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFootprintUpdateTime() != null) {
            sql.VALUES("footprint_update_time", "#{footprintUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFootprintDeleted() != null) {
            sql.VALUES("footprint_deleted", "#{footprintDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallFootprint record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_footprint");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getFootprintAddTime() != null) {
            sql.SET("footprint_add_time = #{footprintAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFootprintUpdateTime() != null) {
            sql.SET("footprint_update_time = #{footprintUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFootprintDeleted() != null) {
            sql.SET("footprint_deleted = #{footprintDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("footprint_id = #{footprintId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}