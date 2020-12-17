package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallOrder;
import org.apache.ibatis.jdbc.SQL;

public class LymallOrderSqlProvider {
    public String insertSelective(LymallOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_order");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSn() != null) {
            sql.VALUES("order_sn", "#{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.VALUES("order_status", "#{orderStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getAftersaleStatus() != null) {
            sql.VALUES("aftersale_status", "#{aftersaleStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderConsignee() != null) {
            sql.VALUES("order_consignee", "#{orderConsignee,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderMobile() != null) {
            sql.VALUES("order_mobile", "#{orderMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderAddress() != null) {
            sql.VALUES("order_address", "#{orderAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderMessage() != null) {
            sql.VALUES("order_message", "#{orderMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsPrice() != null) {
            sql.VALUES("goods_price", "#{goodsPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFreightPrice() != null) {
            sql.VALUES("freight_price", "#{freightPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponPrice() != null) {
            sql.VALUES("coupon_price", "#{couponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegralPrice() != null) {
            sql.VALUES("integral_price", "#{integralPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGrouponPrice() != null) {
            sql.VALUES("groupon_price", "#{grouponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderPrice() != null) {
            sql.VALUES("order_price", "#{orderPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderActualPrice() != null) {
            sql.VALUES("order_actual_price", "#{orderActualPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getPayId() != null) {
            sql.VALUES("pay_id", "#{payId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayTime() != null) {
            sql.VALUES("pay_time", "#{payTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShipSn() != null) {
            sql.VALUES("ship_sn", "#{shipSn,jdbcType=VARCHAR}");
        }
        
        if (record.getShipChannel() != null) {
            sql.VALUES("ship_channel", "#{shipChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getShipTime() != null) {
            sql.VALUES("ship_time", "#{shipTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundAmount() != null) {
            sql.VALUES("refund_amount", "#{refundAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRefundType() != null) {
            sql.VALUES("refund_type", "#{refundType,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundContent() != null) {
            sql.VALUES("refund_content", "#{refundContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundTime() != null) {
            sql.VALUES("refund_time", "#{refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getConfirmTime() != null) {
            sql.VALUES("confirm_time", "#{confirmTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderComments() != null) {
            sql.VALUES("order_comments", "#{orderComments,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderEndTime() != null) {
            sql.VALUES("order_end_time", "#{orderEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderAddTime() != null) {
            sql.VALUES("order_add_time", "#{orderAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderUpdateTime() != null) {
            sql.VALUES("order_update_time", "#{orderUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderDeleted() != null) {
            sql.VALUES("order_deleted", "#{orderDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_order");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.SET("order_status = #{orderStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getAftersaleStatus() != null) {
            sql.SET("aftersale_status = #{aftersaleStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderConsignee() != null) {
            sql.SET("order_consignee = #{orderConsignee,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderMobile() != null) {
            sql.SET("order_mobile = #{orderMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderAddress() != null) {
            sql.SET("order_address = #{orderAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderMessage() != null) {
            sql.SET("order_message = #{orderMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsPrice() != null) {
            sql.SET("goods_price = #{goodsPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFreightPrice() != null) {
            sql.SET("freight_price = #{freightPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponPrice() != null) {
            sql.SET("coupon_price = #{couponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegralPrice() != null) {
            sql.SET("integral_price = #{integralPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGrouponPrice() != null) {
            sql.SET("groupon_price = #{grouponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderPrice() != null) {
            sql.SET("order_price = #{orderPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderActualPrice() != null) {
            sql.SET("order_actual_price = #{orderActualPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getPayId() != null) {
            sql.SET("pay_id = #{payId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayTime() != null) {
            sql.SET("pay_time = #{payTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShipSn() != null) {
            sql.SET("ship_sn = #{shipSn,jdbcType=VARCHAR}");
        }
        
        if (record.getShipChannel() != null) {
            sql.SET("ship_channel = #{shipChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getShipTime() != null) {
            sql.SET("ship_time = #{shipTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefundAmount() != null) {
            sql.SET("refund_amount = #{refundAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRefundType() != null) {
            sql.SET("refund_type = #{refundType,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundContent() != null) {
            sql.SET("refund_content = #{refundContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundTime() != null) {
            sql.SET("refund_time = #{refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getConfirmTime() != null) {
            sql.SET("confirm_time = #{confirmTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderComments() != null) {
            sql.SET("order_comments = #{orderComments,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderEndTime() != null) {
            sql.SET("order_end_time = #{orderEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderAddTime() != null) {
            sql.SET("order_add_time = #{orderAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderUpdateTime() != null) {
            sql.SET("order_update_time = #{orderUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderDeleted() != null) {
            sql.SET("order_deleted = #{orderDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("order_id = #{orderId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}