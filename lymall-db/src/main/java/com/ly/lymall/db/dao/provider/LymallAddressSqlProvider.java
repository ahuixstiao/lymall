package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallAddress;
import org.apache.ibatis.jdbc.SQL;

public class LymallAddressSqlProvider {
    public String insertSelective(LymallAddress record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_address");
        
        if (record.getAddressName() != null) {
            sql.VALUES("address_name", "#{addressName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getRegionProvinceId() != null) {
            sql.VALUES("region_province_id", "#{regionProvinceId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCityId() != null) {
            sql.VALUES("region_city_id", "#{regionCityId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCountyId() != null) {
            sql.VALUES("region_county_id", "#{regionCountyId,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressAddressDetail() != null) {
            sql.VALUES("address_address_detail", "#{addressAddressDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressAreaCode() != null) {
            sql.VALUES("address_area_code", "#{addressAreaCode,jdbcType=CHAR}");
        }
        
        if (record.getAddressPostalCode() != null) {
            sql.VALUES("address_postal_code", "#{addressPostalCode,jdbcType=CHAR}");
        }
        
        if (record.getAddressTel() != null) {
            sql.VALUES("address_tel", "#{addressTel,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressIsDefault() != null) {
            sql.VALUES("address_is_default", "#{addressIsDefault,jdbcType=BIT}");
        }
        
        if (record.getAddressAddTime() != null) {
            sql.VALUES("address_add_time", "#{addressAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAddressUpdateTime() != null) {
            sql.VALUES("address_update_time", "#{addressUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAddressDeleted() != null) {
            sql.VALUES("address_deleted", "#{addressDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallAddress record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_address");
        
        if (record.getAddressName() != null) {
            sql.SET("address_name = #{addressName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getRegionProvinceId() != null) {
            sql.SET("region_province_id = #{regionProvinceId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCityId() != null) {
            sql.SET("region_city_id = #{regionCityId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCountyId() != null) {
            sql.SET("region_county_id = #{regionCountyId,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressAddressDetail() != null) {
            sql.SET("address_address_detail = #{addressAddressDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressAreaCode() != null) {
            sql.SET("address_area_code = #{addressAreaCode,jdbcType=CHAR}");
        }
        
        if (record.getAddressPostalCode() != null) {
            sql.SET("address_postal_code = #{addressPostalCode,jdbcType=CHAR}");
        }
        
        if (record.getAddressTel() != null) {
            sql.SET("address_tel = #{addressTel,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressIsDefault() != null) {
            sql.SET("address_is_default = #{addressIsDefault,jdbcType=BIT}");
        }
        
        if (record.getAddressAddTime() != null) {
            sql.SET("address_add_time = #{addressAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAddressUpdateTime() != null) {
            sql.SET("address_update_time = #{addressUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAddressDeleted() != null) {
            sql.SET("address_deleted = #{addressDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("address_id = #{addressId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}