package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallOrderSqlProvider;
import com.ly.lymall.db.domain.LymallOrder;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallOrderMapper {
    @Delete({
        "delete from lymall_order",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer orderId);

    @Insert({
        "insert into lymall_order (user_id, order_sn, ",
        "order_status, aftersale_status, ",
        "order_consignee, order_mobile, ",
        "order_address, order_message, ",
        "goods_price, freight_price, ",
        "coupon_price, integral_price, ",
        "groupon_price, order_price, ",
        "order_actual_price, pay_id, ",
        "pay_time, ship_sn, ",
        "ship_channel, ship_time, ",
        "refund_amount, refund_type, ",
        "refund_content, refund_time, ",
        "confirm_time, order_comments, ",
        "order_end_time, order_add_time, ",
        "order_update_time, order_deleted)",
        "values (#{userId,jdbcType=INTEGER}, #{orderSn,jdbcType=VARCHAR}, ",
        "#{orderStatus,jdbcType=SMALLINT}, #{aftersaleStatus,jdbcType=SMALLINT}, ",
        "#{orderConsignee,jdbcType=VARCHAR}, #{orderMobile,jdbcType=VARCHAR}, ",
        "#{orderAddress,jdbcType=VARCHAR}, #{orderMessage,jdbcType=VARCHAR}, ",
        "#{goodsPrice,jdbcType=DECIMAL}, #{freightPrice,jdbcType=DECIMAL}, ",
        "#{couponPrice,jdbcType=DECIMAL}, #{integralPrice,jdbcType=DECIMAL}, ",
        "#{grouponPrice,jdbcType=DECIMAL}, #{orderPrice,jdbcType=DECIMAL}, ",
        "#{orderActualPrice,jdbcType=DECIMAL}, #{payId,jdbcType=VARCHAR}, ",
        "#{payTime,jdbcType=TIMESTAMP}, #{shipSn,jdbcType=VARCHAR}, ",
        "#{shipChannel,jdbcType=VARCHAR}, #{shipTime,jdbcType=TIMESTAMP}, ",
        "#{refundAmount,jdbcType=DECIMAL}, #{refundType,jdbcType=VARCHAR}, ",
        "#{refundContent,jdbcType=VARCHAR}, #{refundTime,jdbcType=TIMESTAMP}, ",
        "#{confirmTime,jdbcType=TIMESTAMP}, #{orderComments,jdbcType=SMALLINT}, ",
        "#{orderEndTime,jdbcType=TIMESTAMP}, #{orderAddTime,jdbcType=TIMESTAMP}, ",
        "#{orderUpdateTime,jdbcType=TIMESTAMP}, #{orderDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderId", before=false, resultType=Integer.class)
    int insert(LymallOrder record);

    @InsertProvider(type= LymallOrderSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderId", before=false, resultType=Integer.class)
    int insertSelective(LymallOrder record);

    @Select({
        "select",
        "order_id, user_id, order_sn, order_status, aftersale_status, order_consignee, ",
        "order_mobile, order_address, order_message, goods_price, freight_price, coupon_price, ",
        "integral_price, groupon_price, order_price, order_actual_price, pay_id, pay_time, ",
        "ship_sn, ship_channel, ship_time, refund_amount, refund_type, refund_content, ",
        "refund_time, confirm_time, order_comments, order_end_time, order_add_time, order_update_time, ",
        "order_deleted",
        "from lymall_order",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="aftersale_status", property="aftersaleStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="order_consignee", property="orderConsignee", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_mobile", property="orderMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_address", property="orderAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_message", property="orderMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_price", property="goodsPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="freight_price", property="freightPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_price", property="couponPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="integral_price", property="integralPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="groupon_price", property="grouponPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_price", property="orderPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_actual_price", property="orderActualPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_id", property="payId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_time", property="payTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ship_sn", property="shipSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ship_channel", property="shipChannel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ship_time", property="shipTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="refund_amount", property="refundAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="refund_type", property="refundType", jdbcType=JdbcType.VARCHAR),
        @Result(column="refund_content", property="refundContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="refund_time", property="refundTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="confirm_time", property="confirmTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_comments", property="orderComments", jdbcType=JdbcType.SMALLINT),
        @Result(column="order_end_time", property="orderEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_add_time", property="orderAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_update_time", property="orderUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_deleted", property="orderDeleted", jdbcType=JdbcType.BIT)
    })
    LymallOrder selectByPrimaryKey(Integer orderId);

    @UpdateProvider(type=LymallOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallOrder record);

    @Update({
        "update lymall_order",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "order_sn = #{orderSn,jdbcType=VARCHAR},",
          "order_status = #{orderStatus,jdbcType=SMALLINT},",
          "aftersale_status = #{aftersaleStatus,jdbcType=SMALLINT},",
          "order_consignee = #{orderConsignee,jdbcType=VARCHAR},",
          "order_mobile = #{orderMobile,jdbcType=VARCHAR},",
          "order_address = #{orderAddress,jdbcType=VARCHAR},",
          "order_message = #{orderMessage,jdbcType=VARCHAR},",
          "goods_price = #{goodsPrice,jdbcType=DECIMAL},",
          "freight_price = #{freightPrice,jdbcType=DECIMAL},",
          "coupon_price = #{couponPrice,jdbcType=DECIMAL},",
          "integral_price = #{integralPrice,jdbcType=DECIMAL},",
          "groupon_price = #{grouponPrice,jdbcType=DECIMAL},",
          "order_price = #{orderPrice,jdbcType=DECIMAL},",
          "order_actual_price = #{orderActualPrice,jdbcType=DECIMAL},",
          "pay_id = #{payId,jdbcType=VARCHAR},",
          "pay_time = #{payTime,jdbcType=TIMESTAMP},",
          "ship_sn = #{shipSn,jdbcType=VARCHAR},",
          "ship_channel = #{shipChannel,jdbcType=VARCHAR},",
          "ship_time = #{shipTime,jdbcType=TIMESTAMP},",
          "refund_amount = #{refundAmount,jdbcType=DECIMAL},",
          "refund_type = #{refundType,jdbcType=VARCHAR},",
          "refund_content = #{refundContent,jdbcType=VARCHAR},",
          "refund_time = #{refundTime,jdbcType=TIMESTAMP},",
          "confirm_time = #{confirmTime,jdbcType=TIMESTAMP},",
          "order_comments = #{orderComments,jdbcType=SMALLINT},",
          "order_end_time = #{orderEndTime,jdbcType=TIMESTAMP},",
          "order_add_time = #{orderAddTime,jdbcType=TIMESTAMP},",
          "order_update_time = #{orderUpdateTime,jdbcType=TIMESTAMP},",
          "order_deleted = #{orderDeleted,jdbcType=BIT}",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallOrder record);
}