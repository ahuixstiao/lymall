package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallPermissionSqlProvider;
import com.ly.lymall.db.domain.LymallPermission;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallPermissionMapper {
    @Delete({
        "delete from lymall_permission",
        "where permission_id = #{permissionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer permissionId);

    @Insert({
        "insert into lymall_permission (role_id, permission, ",
        "permission_add_time, permission_update_time, ",
        "permission_deleted)",
        "values (#{roleId,jdbcType=INTEGER}, #{permission,jdbcType=VARCHAR}, ",
        "#{permissionAddTime,jdbcType=TIMESTAMP}, #{permissionUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{permissionDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="permissionId", before=false, resultType=Integer.class)
    int insert(LymallPermission record);

    @InsertProvider(type= LymallPermissionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="permissionId", before=false, resultType=Integer.class)
    int insertSelective(LymallPermission record);

    @Select({
        "select",
        "permission_id, role_id, permission, permission_add_time, permission_update_time, ",
        "permission_deleted",
        "from lymall_permission",
        "where permission_id = #{permissionId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="permission_id", property="permissionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="permission", property="permission", jdbcType=JdbcType.VARCHAR),
        @Result(column="permission_add_time", property="permissionAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="permission_update_time", property="permissionUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="permission_deleted", property="permissionDeleted", jdbcType=JdbcType.BIT)
    })
    LymallPermission selectByPrimaryKey(Integer permissionId);

    @UpdateProvider(type=LymallPermissionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallPermission record);

    @Update({
        "update lymall_permission",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "permission = #{permission,jdbcType=VARCHAR},",
          "permission_add_time = #{permissionAddTime,jdbcType=TIMESTAMP},",
          "permission_update_time = #{permissionUpdateTime,jdbcType=TIMESTAMP},",
          "permission_deleted = #{permissionDeleted,jdbcType=BIT}",
        "where permission_id = #{permissionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallPermission record);
}