package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallRegion;
import org.apache.ibatis.jdbc.SQL;

public class LymallRegionSqlProvider {
    public String insertSelective(LymallRegion record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_region");
        
        if (record.getRegionPid() != null) {
            sql.VALUES("region_pid", "#{regionPid,jdbcType=INTEGER}");
        }
        
        if (record.getRegionName() != null) {
            sql.VALUES("region_name", "#{regionName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionType() != null) {
            sql.VALUES("region_type", "#{regionType,jdbcType=TINYINT}");
        }
        
        if (record.getRegionCode() != null) {
            sql.VALUES("region_code", "#{regionCode,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallRegion record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_region");
        
        if (record.getRegionPid() != null) {
            sql.SET("region_pid = #{regionPid,jdbcType=INTEGER}");
        }
        
        if (record.getRegionName() != null) {
            sql.SET("region_name = #{regionName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionType() != null) {
            sql.SET("region_type = #{regionType,jdbcType=TINYINT}");
        }
        
        if (record.getRegionCode() != null) {
            sql.SET("region_code = #{regionCode,jdbcType=INTEGER}");
        }
        
        sql.WHERE("region_id = #{regionId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}