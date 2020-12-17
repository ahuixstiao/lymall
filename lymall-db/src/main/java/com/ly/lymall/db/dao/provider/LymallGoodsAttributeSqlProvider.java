package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallGoodsAttribute;
import org.apache.ibatis.jdbc.SQL;

public class LymallGoodsAttributeSqlProvider {
    public String insertSelective(LymallGoodsAttribute record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_goods_attribute");
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getAttribute() != null) {
            sql.VALUES("`attribute`", "#{attribute,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAttributeValue() != null) {
            sql.VALUES("goods_attribute_value", "#{goodsAttributeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAttributeAddTime() != null) {
            sql.VALUES("goods_attribute_add_time", "#{goodsAttributeAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsAttributeUpdateTime() != null) {
            sql.VALUES("goods_attribute_update_time", "#{goodsAttributeUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsAttributeDeleted() != null) {
            sql.VALUES("goods_attribute_deleted", "#{goodsAttributeDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallGoodsAttribute record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_goods_attribute");
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getAttribute() != null) {
            sql.SET("`attribute` = #{attribute,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAttributeValue() != null) {
            sql.SET("goods_attribute_value = #{goodsAttributeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsAttributeAddTime() != null) {
            sql.SET("goods_attribute_add_time = #{goodsAttributeAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsAttributeUpdateTime() != null) {
            sql.SET("goods_attribute_update_time = #{goodsAttributeUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsAttributeDeleted() != null) {
            sql.SET("goods_attribute_deleted = #{goodsAttributeDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("goods_attribute_id = #{goodsAttributeId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}