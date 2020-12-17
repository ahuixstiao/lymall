package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallAdminSqlProvider;
import com.ly.lymall.db.domian.LymallAdmin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallAdminMapper {
    @Delete({
        "delete from lymall_admin",
        "where admin_id = #{adminId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer adminId);

    @Insert({
        "insert into lymall_admin (admin_username, admin_password, ",
        "admin_last_login_ip, admin_last_login_time, ",
        "admin_avatar, admin_add_time, ",
        "admin_update_time, admin_deleted, ",
        "admin_role_ids)",
        "values (#{adminUsername,jdbcType=VARCHAR}, #{adminPassword,jdbcType=VARCHAR}, ",
        "#{adminLastLoginIp,jdbcType=VARCHAR}, #{adminLastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{adminAvatar,jdbcType=VARCHAR}, #{adminAddTime,jdbcType=TIMESTAMP}, ",
        "#{adminUpdateTime,jdbcType=TIMESTAMP}, #{adminDeleted,jdbcType=BIT}, ",
        "#{adminRoleIds,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="adminId", before=false, resultType=Integer.class)
    int insert(LymallAdmin record);

    @InsertProvider(type= LymallAdminSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="adminId", before=false, resultType=Integer.class)
    int insertSelective(LymallAdmin record);

    @Select({
        "select",
        "admin_id, admin_username, admin_password, admin_last_login_ip, admin_last_login_time, ",
        "admin_avatar, admin_add_time, admin_update_time, admin_deleted, admin_role_ids",
        "from lymall_admin",
        "where admin_id = #{adminId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="admin_username", property="adminUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_password", property="adminPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_last_login_ip", property="adminLastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_last_login_time", property="adminLastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin_avatar", property="adminAvatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_add_time", property="adminAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin_update_time", property="adminUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin_deleted", property="adminDeleted", jdbcType=JdbcType.BIT),
        @Result(column="admin_role_ids", property="adminRoleIds", jdbcType=JdbcType.VARCHAR)
    })
    LymallAdmin selectByPrimaryKey(Integer adminId);

    @UpdateProvider(type=LymallAdminSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallAdmin record);

    @Update({
        "update lymall_admin",
        "set admin_username = #{adminUsername,jdbcType=VARCHAR},",
          "admin_password = #{adminPassword,jdbcType=VARCHAR},",
          "admin_last_login_ip = #{adminLastLoginIp,jdbcType=VARCHAR},",
          "admin_last_login_time = #{adminLastLoginTime,jdbcType=TIMESTAMP},",
          "admin_avatar = #{adminAvatar,jdbcType=VARCHAR},",
          "admin_add_time = #{adminAddTime,jdbcType=TIMESTAMP},",
          "admin_update_time = #{adminUpdateTime,jdbcType=TIMESTAMP},",
          "admin_deleted = #{adminDeleted,jdbcType=BIT},",
          "admin_role_ids = #{adminRoleIds,jdbcType=VARCHAR}",
        "where admin_id = #{adminId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallAdmin record);
}