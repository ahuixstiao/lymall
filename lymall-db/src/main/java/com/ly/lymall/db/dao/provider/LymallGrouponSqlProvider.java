package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallGroupon;
import org.apache.ibatis.jdbc.SQL;

public class LymallGrouponSqlProvider {
    public String insertSelective(LymallGroupon record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_groupon");
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponNum() != null) {
            sql.VALUES("groupon_num", "#{grouponNum,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponRulesId() != null) {
            sql.VALUES("groupon_rules_id", "#{grouponRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponShareUrl() != null) {
            sql.VALUES("groupon_share_url", "#{grouponShareUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGrouponCreatorId() != null) {
            sql.VALUES("groupon_creator_id", "#{grouponCreatorId,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponCreatorTime() != null) {
            sql.VALUES("groupon_creator_time", "#{grouponCreatorTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponStatus() != null) {
            sql.VALUES("groupon_status", "#{grouponStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getGrouponAddTime() != null) {
            sql.VALUES("groupon_add_time", "#{grouponAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponUpdateTime() != null) {
            sql.VALUES("groupon_update_time", "#{grouponUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponDeleted() != null) {
            sql.VALUES("groupon_deleted", "#{grouponDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallGroupon record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_groupon");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponNum() != null) {
            sql.SET("groupon_num = #{grouponNum,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponRulesId() != null) {
            sql.SET("groupon_rules_id = #{grouponRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponShareUrl() != null) {
            sql.SET("groupon_share_url = #{grouponShareUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGrouponCreatorId() != null) {
            sql.SET("groupon_creator_id = #{grouponCreatorId,jdbcType=INTEGER}");
        }
        
        if (record.getGrouponCreatorTime() != null) {
            sql.SET("groupon_creator_time = #{grouponCreatorTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponStatus() != null) {
            sql.SET("groupon_status = #{grouponStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getGrouponAddTime() != null) {
            sql.SET("groupon_add_time = #{grouponAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponUpdateTime() != null) {
            sql.SET("groupon_update_time = #{grouponUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGrouponDeleted() != null) {
            sql.SET("groupon_deleted = #{grouponDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("groupon_id = #{grouponId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}