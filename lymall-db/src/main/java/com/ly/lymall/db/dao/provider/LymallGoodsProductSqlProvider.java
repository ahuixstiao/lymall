package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallGoodsProduct;
import org.apache.ibatis.jdbc.SQL;

public class LymallGoodsProductSqlProvider {
    public String insertSelective(LymallGoodsProduct record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_goods_product");
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsProductSpecifications() != null) {
            sql.VALUES("goods_product_specifications", "#{goodsProductSpecifications,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProductPrice() != null) {
            sql.VALUES("goods_product_price", "#{goodsProductPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsProductNumber() != null) {
            sql.VALUES("goods_product_number", "#{goodsProductNumber,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsProductUrl() != null) {
            sql.VALUES("goods_product_url", "#{goodsProductUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProductAddTime() != null) {
            sql.VALUES("goods_product_add_time", "#{goodsProductAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsProductUpdateTime() != null) {
            sql.VALUES("goods_product_update_time", "#{goodsProductUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsProductDeleted() != null) {
            sql.VALUES("goods_product_deleted", "#{goodsProductDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallGoodsProduct record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_goods_product");
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsProductSpecifications() != null) {
            sql.SET("goods_product_specifications = #{goodsProductSpecifications,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProductPrice() != null) {
            sql.SET("goods_product_price = #{goodsProductPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsProductNumber() != null) {
            sql.SET("goods_product_number = #{goodsProductNumber,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsProductUrl() != null) {
            sql.SET("goods_product_url = #{goodsProductUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsProductAddTime() != null) {
            sql.SET("goods_product_add_time = #{goodsProductAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsProductUpdateTime() != null) {
            sql.SET("goods_product_update_time = #{goodsProductUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsProductDeleted() != null) {
            sql.SET("goods_product_deleted = #{goodsProductDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("goods_product_id = #{goodsProductId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}