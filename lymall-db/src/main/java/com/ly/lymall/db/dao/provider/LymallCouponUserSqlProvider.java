package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallCouponUser;
import org.apache.ibatis.jdbc.SQL;

public class LymallCouponUserSqlProvider {
    public String insertSelective(LymallCouponUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_coupon_user");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.VALUES("coupon_id", "#{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponUserStatus() != null) {
            sql.VALUES("coupon_user_status", "#{couponUserStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponUserUsedTime() != null) {
            sql.VALUES("coupon_user_used_time", "#{couponUserUsedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserStartTime() != null) {
            sql.VALUES("coupon_user_start_time", "#{couponUserStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserEndTime() != null) {
            sql.VALUES("coupon_user_end_time", "#{couponUserEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponUserAddTime() != null) {
            sql.VALUES("coupon_user_add_time", "#{couponUserAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserUpdateTime() != null) {
            sql.VALUES("coupon_user_update_time", "#{couponUserUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserDeleted() != null) {
            sql.VALUES("coupon_user_deleted", "#{couponUserDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallCouponUser record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_coupon_user");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("coupon_id = #{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponUserStatus() != null) {
            sql.SET("coupon_user_status = #{couponUserStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getCouponUserUsedTime() != null) {
            sql.SET("coupon_user_used_time = #{couponUserUsedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserStartTime() != null) {
            sql.SET("coupon_user_start_time = #{couponUserStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserEndTime() != null) {
            sql.SET("coupon_user_end_time = #{couponUserEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponUserAddTime() != null) {
            sql.SET("coupon_user_add_time = #{couponUserAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserUpdateTime() != null) {
            sql.SET("coupon_user_update_time = #{couponUserUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponUserDeleted() != null) {
            sql.SET("coupon_user_deleted = #{couponUserDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("coupon_user_id = #{couponUserId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}