package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallGoodsSpecification;
import org.apache.ibatis.jdbc.SQL;

public class LymallGoodsSpecificationSqlProvider {
    public String insertSelective(LymallGoodsSpecification record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_goods_specification");
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSpecificationSpecification() != null) {
            sql.VALUES("goods_specification_specification", "#{goodsSpecificationSpecification,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSpecificationValue() != null) {
            sql.VALUES("goods_specification_value", "#{goodsSpecificationValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSpecificationPicUrl() != null) {
            sql.VALUES("goods_specification_pic_url", "#{goodsSpecificationPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSpecificationAddTime() != null) {
            sql.VALUES("goods_specification_add_time", "#{goodsSpecificationAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsSpecificationUpdateTime() != null) {
            sql.VALUES("goods_specification_update_time", "#{goodsSpecificationUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsSpecificationDeleted() != null) {
            sql.VALUES("goods_specification_deleted", "#{goodsSpecificationDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallGoodsSpecification record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_goods_specification");
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsSpecificationSpecification() != null) {
            sql.SET("goods_specification_specification = #{goodsSpecificationSpecification,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSpecificationValue() != null) {
            sql.SET("goods_specification_value = #{goodsSpecificationValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSpecificationPicUrl() != null) {
            sql.SET("goods_specification_pic_url = #{goodsSpecificationPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsSpecificationAddTime() != null) {
            sql.SET("goods_specification_add_time = #{goodsSpecificationAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsSpecificationUpdateTime() != null) {
            sql.SET("goods_specification_update_time = #{goodsSpecificationUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsSpecificationDeleted() != null) {
            sql.SET("goods_specification_deleted = #{goodsSpecificationDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("goods_specification_id = #{goodsSpecificationId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}