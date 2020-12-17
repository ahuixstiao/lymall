package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallRoleSqlProvider;
import com.ly.lymall.db.domian.LymallRole;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallRoleMapper {
    @Delete({
        "delete from lymall_role",
        "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    @Insert({
        "insert into lymall_role (role_name, role_desc, ",
        "role_enabled, role_add_time, ",
        "role_update_time, role_deleted)",
        "values (#{roleName,jdbcType=VARCHAR}, #{roleDesc,jdbcType=VARCHAR}, ",
        "#{roleEnabled,jdbcType=BIT}, #{roleAddTime,jdbcType=TIMESTAMP}, ",
        "#{roleUpdateTime,jdbcType=TIMESTAMP}, #{roleDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="roleId", before=false, resultType=Integer.class)
    int insert(LymallRole record);

    @InsertProvider(type= LymallRoleSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="roleId", before=false, resultType=Integer.class)
    int insertSelective(LymallRole record);

    @Select({
        "select",
        "role_id, role_name, role_desc, role_enabled, role_add_time, role_update_time, ",
        "role_deleted",
        "from lymall_role",
        "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_desc", property="roleDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_enabled", property="roleEnabled", jdbcType=JdbcType.BIT),
        @Result(column="role_add_time", property="roleAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="role_update_time", property="roleUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="role_deleted", property="roleDeleted", jdbcType=JdbcType.BIT)
    })
    LymallRole selectByPrimaryKey(Integer roleId);

    @UpdateProvider(type=LymallRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallRole record);

    @Update({
        "update lymall_role",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "role_desc = #{roleDesc,jdbcType=VARCHAR},",
          "role_enabled = #{roleEnabled,jdbcType=BIT},",
          "role_add_time = #{roleAddTime,jdbcType=TIMESTAMP},",
          "role_update_time = #{roleUpdateTime,jdbcType=TIMESTAMP},",
          "role_deleted = #{roleDeleted,jdbcType=BIT}",
        "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallRole record);
}