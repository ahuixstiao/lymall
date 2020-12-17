package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallGrouponSqlProvider;
import com.ly.lymall.db.domian.LymallGroupon;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallGrouponMapper {
    @Delete({
        "delete from lymall_groupon",
        "where groupon_id = #{grouponId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer grouponId);

    @Insert({
        "insert into lymall_groupon (order_id, groupon_num, ",
        "groupon_rules_id, user_id, ",
        "groupon_share_url, groupon_creator_id, ",
        "groupon_creator_time, groupon_status, ",
        "groupon_add_time, groupon_update_time, ",
        "groupon_deleted)",
        "values (#{orderId,jdbcType=INTEGER}, #{grouponNum,jdbcType=INTEGER}, ",
        "#{grouponRulesId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{grouponShareUrl,jdbcType=VARCHAR}, #{grouponCreatorId,jdbcType=INTEGER}, ",
        "#{grouponCreatorTime,jdbcType=TIMESTAMP}, #{grouponStatus,jdbcType=SMALLINT}, ",
        "#{grouponAddTime,jdbcType=TIMESTAMP}, #{grouponUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{grouponDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="grouponId", before=false, resultType=Integer.class)
    int insert(LymallGroupon record);

    @InsertProvider(type= LymallGrouponSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="grouponId", before=false, resultType=Integer.class)
    int insertSelective(LymallGroupon record);

    @Select({
        "select",
        "groupon_id, order_id, groupon_num, groupon_rules_id, user_id, groupon_share_url, ",
        "groupon_creator_id, groupon_creator_time, groupon_status, groupon_add_time, ",
        "groupon_update_time, groupon_deleted",
        "from lymall_groupon",
        "where groupon_id = #{grouponId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="groupon_id", property="grouponId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="groupon_num", property="grouponNum", jdbcType=JdbcType.INTEGER),
        @Result(column="groupon_rules_id", property="grouponRulesId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="groupon_share_url", property="grouponShareUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="groupon_creator_id", property="grouponCreatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="groupon_creator_time", property="grouponCreatorTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="groupon_status", property="grouponStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="groupon_add_time", property="grouponAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="groupon_update_time", property="grouponUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="groupon_deleted", property="grouponDeleted", jdbcType=JdbcType.BIT)
    })
    LymallGroupon selectByPrimaryKey(Integer grouponId);

    @UpdateProvider(type=LymallGrouponSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallGroupon record);

    @Update({
        "update lymall_groupon",
        "set order_id = #{orderId,jdbcType=INTEGER},",
          "groupon_num = #{grouponNum,jdbcType=INTEGER},",
          "groupon_rules_id = #{grouponRulesId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "groupon_share_url = #{grouponShareUrl,jdbcType=VARCHAR},",
          "groupon_creator_id = #{grouponCreatorId,jdbcType=INTEGER},",
          "groupon_creator_time = #{grouponCreatorTime,jdbcType=TIMESTAMP},",
          "groupon_status = #{grouponStatus,jdbcType=SMALLINT},",
          "groupon_add_time = #{grouponAddTime,jdbcType=TIMESTAMP},",
          "groupon_update_time = #{grouponUpdateTime,jdbcType=TIMESTAMP},",
          "groupon_deleted = #{grouponDeleted,jdbcType=BIT}",
        "where groupon_id = #{grouponId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallGroupon record);
}