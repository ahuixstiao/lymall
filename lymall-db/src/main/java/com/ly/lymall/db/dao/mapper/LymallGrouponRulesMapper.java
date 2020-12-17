package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallGrouponRulesSqlProvider;
import com.ly.lymall.db.domian.LymallGrouponRules;
import com.ly.lymall.db.dto.LymallGrouponRulesDTO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallGrouponRulesMapper {
    @Delete({
        "delete from lymall_groupon_rules",
        "where groupon_rules_id = #{grouponRulesId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer grouponRulesId);

    @Insert({
        "insert into lymall_groupon_rules (goods_id, goods_name, ",
        "goods_pic_url, discount_money, ",
        "discount_member, expire_time, ",
        "groupon_rules_status, groupon_rules_add_time, ",
        "groupon_rules_update_time, groupon_rules_deleted)",
        "values (#{goodsId,jdbcType=INTEGER}, #{goodsName,jdbcType=VARCHAR}, ",
        "#{goodsPicUrl,jdbcType=VARCHAR}, #{discountMoney,jdbcType=DECIMAL}, ",
        "#{discountMember,jdbcType=INTEGER}, #{expireTime,jdbcType=TIMESTAMP}, ",
        "#{grouponRulesStatus,jdbcType=SMALLINT}, #{grouponRulesAddTime,jdbcType=TIMESTAMP}, ",
        "#{grouponRulesUpdateTime,jdbcType=TIMESTAMP}, #{grouponRulesDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="grouponRulesId", before=false, resultType=Integer.class)
    int insert(LymallGrouponRules record);

    @InsertProvider(type= LymallGrouponRulesSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="grouponRulesId", before=false, resultType=Integer.class)
    int insertSelective(LymallGrouponRules record);

    @Select({
        "select",
        "groupon_rules_id, goods_id, goods_name, goods_pic_url, discount_money, discount_member, ",
        "expire_time, groupon_rules_status, groupon_rules_add_time, groupon_rules_update_time, ",
        "groupon_rules_deleted",
        "from lymall_groupon_rules",
        "where groupon_rules_id = #{grouponRulesId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="groupon_rules_id", property="grouponRulesId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_pic_url", property="goodsPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="discount_money", property="discountMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="discount_member", property="discountMember", jdbcType=JdbcType.INTEGER),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="groupon_rules_status", property="grouponRulesStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="groupon_rules_add_time", property="grouponRulesAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="groupon_rules_update_time", property="grouponRulesUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="groupon_rules_deleted", property="grouponRulesDeleted", jdbcType=JdbcType.BIT)
    })
    LymallGrouponRules selectByPrimaryKey(Integer grouponRulesId);

    /**
     * 查询团购商品
     * @return List<LymallGrouponRules>
     */
    @Select("select * from grouppurchasearea")
    List<LymallGrouponRulesDTO> findAllGroupbuy();

    @UpdateProvider(type=LymallGrouponRulesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallGrouponRules record);

    @Update({
        "update lymall_groupon_rules",
        "set goods_id = #{goodsId,jdbcType=INTEGER},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR},",
          "discount_money = #{discountMoney,jdbcType=DECIMAL},",
          "discount_member = #{discountMember,jdbcType=INTEGER},",
          "expire_time = #{expireTime,jdbcType=TIMESTAMP},",
          "groupon_rules_status = #{grouponRulesStatus,jdbcType=SMALLINT},",
          "groupon_rules_add_time = #{grouponRulesAddTime,jdbcType=TIMESTAMP},",
          "groupon_rules_update_time = #{grouponRulesUpdateTime,jdbcType=TIMESTAMP},",
          "groupon_rules_deleted = #{grouponRulesDeleted,jdbcType=BIT}",
        "where groupon_rules_id = #{grouponRulesId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallGrouponRules record);
}