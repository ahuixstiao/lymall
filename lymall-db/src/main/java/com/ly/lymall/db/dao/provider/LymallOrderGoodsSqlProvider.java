package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallOrderGoods;
import org.apache.ibatis.jdbc.SQL;

public class LymallOrderGoodsSqlProvider {
    public String insertSelective(LymallOrderGoods record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_order_goods");
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsName() != null) {
            sql.VALUES("goods_name", "#{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSn() != null) {
            sql.VALUES("goods_sn", "#{goodsSn,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderGoodsNumber() != null) {
            sql.VALUES("order_goods_number", "#{orderGoodsNumber,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderGoodsPrice() != null) {
            sql.VALUES("order_goods_price", "#{orderGoodsPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderGoodsSpecifications() != null) {
            sql.VALUES("order_goods_specifications", "#{orderGoodsSpecifications,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.VALUES("goods_pic_url", "#{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderGoodsComment() != null) {
            sql.VALUES("order_goods_comment", "#{orderGoodsComment,jdbcType=INTEGER}");
        }
        
        if (record.getOrderGoodsAddTime() != null) {
            sql.VALUES("order_goods_add_time", "#{orderGoodsAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderGoodsUpdateTime() != null) {
            sql.VALUES("order_goods_update_time", "#{orderGoodsUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderGoodsDeleted() != null) {
            sql.VALUES("order_goods_deleted", "#{orderGoodsDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallOrderGoods record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_order_goods");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsName() != null) {
            sql.SET("goods_name = #{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSn() != null) {
            sql.SET("goods_sn = #{goodsSn,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{productId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderGoodsNumber() != null) {
            sql.SET("order_goods_number = #{orderGoodsNumber,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderGoodsPrice() != null) {
            sql.SET("order_goods_price = #{orderGoodsPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderGoodsSpecifications() != null) {
            sql.SET("order_goods_specifications = #{orderGoodsSpecifications,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.SET("goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderGoodsComment() != null) {
            sql.SET("order_goods_comment = #{orderGoodsComment,jdbcType=INTEGER}");
        }
        
        if (record.getOrderGoodsAddTime() != null) {
            sql.SET("order_goods_add_time = #{orderGoodsAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderGoodsUpdateTime() != null) {
            sql.SET("order_goods_update_time = #{orderGoodsUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderGoodsDeleted() != null) {
            sql.SET("order_goods_deleted = #{orderGoodsDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("order_goods_id = #{orderGoodsId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}