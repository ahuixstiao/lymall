package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallGoods;
import org.apache.ibatis.jdbc.SQL;

public class LymallGoodsSqlProvider {
    public String insertSelective(LymallGoods record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_goods");
        
        if (record.getGoodsSn() != null) {
            sql.VALUES("goods_sn", "#{goodsSn,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.VALUES("goods_name", "#{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryId() != null) {
            sql.VALUES("category_id", "#{categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandId() != null) {
            sql.VALUES("brand_id", "#{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsGallery() != null) {
            sql.VALUES("goods_gallery", "#{goodsGallery,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsKeywords() != null) {
            sql.VALUES("goods_keywords", "#{goodsKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsBrief() != null) {
            sql.VALUES("goods_brief", "#{goodsBrief,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsIsOnSale() != null) {
            sql.VALUES("goods_is_on_sale", "#{goodsIsOnSale,jdbcType=BIT}");
        }
        
        if (record.getGoodsSortOrder() != null) {
            sql.VALUES("goods_sort_order", "#{goodsSortOrder,jdbcType=SMALLINT}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.VALUES("goods_pic_url", "#{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsShareUrl() != null) {
            sql.VALUES("goods_share_url", "#{goodsShareUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsIsNew() != null) {
            sql.VALUES("goods_is_new", "#{goodsIsNew,jdbcType=BIT}");
        }
        
        if (record.getGoodsIsHot() != null) {
            sql.VALUES("goods_is_hot", "#{goodsIsHot,jdbcType=BIT}");
        }
        
        if (record.getGoodsUnit() != null) {
            sql.VALUES("goods_unit", "#{goodsUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsCounterPrice() != null) {
            sql.VALUES("goods_counter_price", "#{goodsCounterPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsRetailPrice() != null) {
            sql.VALUES("goods_retail_price", "#{goodsRetailPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsAddTime() != null) {
            sql.VALUES("goods_add_time", "#{goodsAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsUpdateTime() != null) {
            sql.VALUES("goods_update_time", "#{goodsUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsDeleted() != null) {
            sql.VALUES("goods_deleted", "#{goodsDeleted,jdbcType=BIT}");
        }
        
        if (record.getGoodsDetail() != null) {
            sql.VALUES("goods_detail", "#{goodsDetail,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallGoods record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_goods");
        
        if (record.getGoodsSn() != null) {
            sql.SET("goods_sn = #{goodsSn,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsName() != null) {
            sql.SET("goods_name = #{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsGallery() != null) {
            sql.SET("goods_gallery = #{goodsGallery,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsKeywords() != null) {
            sql.SET("goods_keywords = #{goodsKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsBrief() != null) {
            sql.SET("goods_brief = #{goodsBrief,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsIsOnSale() != null) {
            sql.SET("goods_is_on_sale = #{goodsIsOnSale,jdbcType=BIT}");
        }
        
        if (record.getGoodsSortOrder() != null) {
            sql.SET("goods_sort_order = #{goodsSortOrder,jdbcType=SMALLINT}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.SET("goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsShareUrl() != null) {
            sql.SET("goods_share_url = #{goodsShareUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsIsNew() != null) {
            sql.SET("goods_is_new = #{goodsIsNew,jdbcType=BIT}");
        }
        
        if (record.getGoodsIsHot() != null) {
            sql.SET("goods_is_hot = #{goodsIsHot,jdbcType=BIT}");
        }
        
        if (record.getGoodsUnit() != null) {
            sql.SET("goods_unit = #{goodsUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsCounterPrice() != null) {
            sql.SET("goods_counter_price = #{goodsCounterPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsRetailPrice() != null) {
            sql.SET("goods_retail_price = #{goodsRetailPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsAddTime() != null) {
            sql.SET("goods_add_time = #{goodsAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsUpdateTime() != null) {
            sql.SET("goods_update_time = #{goodsUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGoodsDeleted() != null) {
            sql.SET("goods_deleted = #{goodsDeleted,jdbcType=BIT}");
        }
        
        if (record.getGoodsDetail() != null) {
            sql.SET("goods_detail = #{goodsDetail,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("goods_id = #{goodsId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}