package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domain.LymallGrouponRules;
import org.apache.ibatis.jdbc.SQL;

public class LymallGrouponRulesSqlProvider {
    public String insertSelective(LymallGrouponRules record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_groupon_rules");
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsName() != null) {
            sql.VALUES("goods_name", "#{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.VALUES("goods_pic_url", "#{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getDiscountMoney() != null) {
            sql.VALUES("discount_money", "#{discountMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getDiscountMember() != null) {
            sql.VALUES("discount_member", "#{discountMember,jdbcType=INTEGER}");
        }
        
        if (record.getExpireTime() != null) {
            sql.VALUES("expire_time", "#{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponRulesStatus() != null) {
            sql.VALUES("groupon_rules_status", "#{grouponRulesStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getGrouponRulesAddTime() != null) {
            sql.VALUES("groupon_rules_add_time", "#{grouponRulesAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponRulesUpdateTime() != null) {
            sql.VALUES("groupon_rules_update_time", "#{grouponRulesUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponRulesDeleted() != null) {
            sql.VALUES("groupon_rules_deleted", "#{grouponRulesDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallGrouponRules record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_groupon_rules");
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsName() != null) {
            sql.SET("goods_name = #{goodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsPicUrl() != null) {
            sql.SET("goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getDiscountMoney() != null) {
            sql.SET("discount_money = #{discountMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getDiscountMember() != null) {
            sql.SET("discount_member = #{discountMember,jdbcType=INTEGER}");
        }
        
        if (record.getExpireTime() != null) {
            sql.SET("expire_time = #{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponRulesStatus() != null) {
            sql.SET("groupon_rules_status = #{grouponRulesStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getGrouponRulesAddTime() != null) {
            sql.SET("groupon_rules_add_time = #{grouponRulesAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponRulesUpdateTime() != null) {
            sql.SET("groupon_rules_update_time = #{grouponRulesUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponRulesDeleted() != null) {
            sql.SET("groupon_rules_deleted = #{grouponRulesDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("groupon_rules_id = #{grouponRulesId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}