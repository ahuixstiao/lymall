package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallSystemSqlProvider;
import com.ly.lymall.db.domain.LymallSystem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallSystemMapper {
    @Delete({
        "delete from lymall_system",
        "where system_id = #{systemId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer systemId);

    @Insert({
        "insert into lymall_system (system_key_name, system_key_value, ",
        "system_add_time, system_update_time, ",
        "system_deleted)",
        "values (#{systemKeyName,jdbcType=VARCHAR}, #{systemKeyValue,jdbcType=VARCHAR}, ",
        "#{systemAddTime,jdbcType=TIMESTAMP}, #{systemUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{systemDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="systemId", before=false, resultType=Integer.class)
    int insert(LymallSystem record);

    @InsertProvider(type= LymallSystemSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="systemId", before=false, resultType=Integer.class)
    int insertSelective(LymallSystem record);

    @Select({
        "select",
        "system_id, system_key_name, system_key_value, system_add_time, system_update_time, ",
        "system_deleted",
        "from lymall_system",
        "where system_id = #{systemId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="system_id", property="systemId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="system_key_name", property="systemKeyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="system_key_value", property="systemKeyValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="system_add_time", property="systemAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="system_update_time", property="systemUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="system_deleted", property="systemDeleted", jdbcType=JdbcType.BIT)
    })
    LymallSystem selectByPrimaryKey(Integer systemId);

    @UpdateProvider(type=LymallSystemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallSystem record);

    @Update({
        "update lymall_system",
        "set system_key_name = #{systemKeyName,jdbcType=VARCHAR},",
          "system_key_value = #{systemKeyValue,jdbcType=VARCHAR},",
          "system_add_time = #{systemAddTime,jdbcType=TIMESTAMP},",
          "system_update_time = #{systemUpdateTime,jdbcType=TIMESTAMP},",
          "system_deleted = #{systemDeleted,jdbcType=BIT}",
        "where system_id = #{systemId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallSystem record);
}