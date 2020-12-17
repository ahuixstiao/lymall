package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallCoupon;
import org.apache.ibatis.jdbc.SQL;

public class LymallCouponSqlProvider {
    public String insertSelective(LymallCoupon record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_coupon");
        
        if (record.getCouponName() != null) {
            sql.VALUES("coupon_name", "#{couponName,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponDesc() != null) {
            sql.VALUES("coupon_desc", "#{couponDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponTag() != null) {
            sql.VALUES("coupon_tag", "#{couponTag,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponTotal() != null) {
            sql.VALUES("coupon_total", "#{couponTotal,jdbcType=INTEGER}");
        }
        
        if (record.getCouponDiscount() != null) {
            sql.VALUES("coupon_discount", "#{couponDiscount,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponMin() != null) {
            sql.VALUES("coupon_min", "#{couponMin,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponLimit() != null) {
            sql.VALUES("coupon_limit", "#{couponLimit,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponType() != null) {
            sql.VALUES("coupon_type", "#{couponType,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponStatus() != null) {
            sql.VALUES("coupon_status", "#{couponStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponGoodsType() != null) {
            sql.VALUES("coupon_goods_type", "#{couponGoodsType,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponGoodsValue() != null) {
            sql.VALUES("coupon_goods_value", "#{couponGoodsValue,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponCode() != null) {
            sql.VALUES("coupon_code", "#{couponCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponTimeType() != null) {
            sql.VALUES("coupon_time_type", "#{couponTimeType,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponDays() != null) {
            sql.VALUES("coupon_days", "#{couponDays,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponStartTime() != null) {
            sql.VALUES("coupon_start_time", "#{couponStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponEndTime() != null) {
            sql.VALUES("coupon_end_time", "#{couponEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponAddTime() != null) {
            sql.VALUES("coupon_add_time", "#{couponAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUpdateTime() != null) {
            sql.VALUES("coupon_update_time", "#{couponUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponDeleted() != null) {
            sql.VALUES("coupon_deleted", "#{couponDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallCoupon record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_coupon");
        
        if (record.getCouponName() != null) {
            sql.SET("coupon_name = #{couponName,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponDesc() != null) {
            sql.SET("coupon_desc = #{couponDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponTag() != null) {
            sql.SET("coupon_tag = #{couponTag,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponTotal() != null) {
            sql.SET("coupon_total = #{couponTotal,jdbcType=INTEGER}");
        }
        
        if (record.getCouponDiscount() != null) {
            sql.SET("coupon_discount = #{couponDiscount,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponMin() != null) {
            sql.SET("coupon_min = #{couponMin,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponLimit() != null) {
            sql.SET("coupon_limit = #{couponLimit,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponType() != null) {
            sql.SET("coupon_type = #{couponType,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponStatus() != null) {
            sql.SET("coupon_status = #{couponStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponGoodsType() != null) {
            sql.SET("coupon_goods_type = #{couponGoodsType,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponGoodsValue() != null) {
            sql.SET("coupon_goods_value = #{couponGoodsValue,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponCode() != null) {
            sql.SET("coupon_code = #{couponCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponTimeType() != null) {
            sql.SET("coupon_time_type = #{couponTimeType,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponDays() != null) {
            sql.SET("coupon_days = #{couponDays,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponStartTime() != null) {
            sql.SET("coupon_start_time = #{couponStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponEndTime() != null) {
            sql.SET("coupon_end_time = #{couponEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponAddTime() != null) {
            sql.SET("coupon_add_time = #{couponAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUpdateTime() != null) {
            sql.SET("coupon_update_time = #{couponUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponDeleted() != null) {
            sql.SET("coupon_deleted = #{couponDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("coupon_id = #{couponId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}