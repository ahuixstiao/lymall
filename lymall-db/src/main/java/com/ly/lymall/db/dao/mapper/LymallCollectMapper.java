package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallCollectSqlProvider;
import com.ly.lymall.db.domian.LymallCollect;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallCollectMapper {
    @Delete({
        "delete from lymall_collect",
        "where collect_id = #{collectId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer collectId);

    @Insert({
        "insert into lymall_collect (user_id, collect_value_id, ",
        "collect_type, collect_add_time, ",
        "collect_update_time, collect_deleted)",
        "values (#{userId,jdbcType=INTEGER}, #{collectValueId,jdbcType=INTEGER}, ",
        "#{collectType,jdbcType=TINYINT}, #{collectAddTime,jdbcType=TIMESTAMP}, ",
        "#{collectUpdateTime,jdbcType=TIMESTAMP}, #{collectDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="collectId", before=false, resultType=Integer.class)
    int insert(LymallCollect record);

    @InsertProvider(type= LymallCollectSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="collectId", before=false, resultType=Integer.class)
    int insertSelective(LymallCollect record);

    @Select({
        "select",
        "collect_id, user_id, collect_value_id, collect_type, collect_add_time, collect_update_time, ",
        "collect_deleted",
        "from lymall_collect",
        "where collect_id = #{collectId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="collect_id", property="collectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_value_id", property="collectValueId", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_type", property="collectType", jdbcType=JdbcType.TINYINT),
        @Result(column="collect_add_time", property="collectAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="collect_update_time", property="collectUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="collect_deleted", property="collectDeleted", jdbcType=JdbcType.BIT)
    })
    LymallCollect selectByPrimaryKey(Integer collectId);

    @UpdateProvider(type=LymallCollectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallCollect record);

    @Update({
        "update lymall_collect",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "collect_value_id = #{collectValueId,jdbcType=INTEGER},",
          "collect_type = #{collectType,jdbcType=TINYINT},",
          "collect_add_time = #{collectAddTime,jdbcType=TIMESTAMP},",
          "collect_update_time = #{collectUpdateTime,jdbcType=TIMESTAMP},",
          "collect_deleted = #{collectDeleted,jdbcType=BIT}",
        "where collect_id = #{collectId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallCollect record);
}