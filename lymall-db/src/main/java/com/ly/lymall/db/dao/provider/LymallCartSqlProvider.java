package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallCart;
import org.apache.ibatis.jdbc.SQL;

public class LymallCartSqlProvider {
    public String insertSelective(LymallCart record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_cart");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSn() != null) {
            sql.VALUES("goods_sn", "#{goodsSn,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.VALUES("goods_name", "#{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPrice() != null) {
            sql.VALUES("goods_price", "#{goodsPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsNumber() != null) {
            sql.VALUES("goods_number", "#{goodsNumber,jdbcType=SMALLINT}");
        }
        
        if (record.getGoodsSpecifications() != null) {
            sql.VALUES("goods_specifications", "#{goodsSpecifications,jdbcType=VARCHAR}");
        }
        
        if (record.getCartChecked() != null) {
            sql.VALUES("cart_checked", "#{cartChecked,jdbcType=BIT}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.VALUES("goods_pic_url", "#{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCartAddTime() != null) {
            sql.VALUES("cart_add_time", "#{cartAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCartUpdateTime() != null) {
            sql.VALUES("cart_update_time", "#{cartUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCartDeleted() != null) {
            sql.VALUES("cart_deleted", "#{cartDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallCart record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_cart");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSn() != null) {
            sql.SET("goods_sn = #{goodsSn,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.SET("goods_name = #{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{productId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPrice() != null) {
            sql.SET("goods_price = #{goodsPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsNumber() != null) {
            sql.SET("goods_number = #{goodsNumber,jdbcType=SMALLINT}");
        }
        
        if (record.getGoodsSpecifications() != null) {
            sql.SET("goods_specifications = #{goodsSpecifications,jdbcType=VARCHAR}");
        }
        
        if (record.getCartChecked() != null) {
            sql.SET("cart_checked = #{cartChecked,jdbcType=BIT}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.SET("goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCartAddTime() != null) {
            sql.SET("cart_add_time = #{cartAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCartUpdateTime() != null) {
            sql.SET("cart_update_time = #{cartUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCartDeleted() != null) {
            sql.SET("cart_deleted = #{cartDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("cart_id = #{cartId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}