package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallLogSqlProvider;
import com.ly.lymall.db.domian.LymallLog;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallLogMapper {
    @Delete({
        "delete from lymall_log",
        "where log_id = #{logId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer logId);

    @Insert({
        "insert into lymall_log (log_admin, log_ip, ",
        "log_type, log_action, ",
        "log_status, log_result, ",
        "log_comment, log_add_time, ",
        "log_update_time, log_deleted)",
        "values (#{logAdmin,jdbcType=VARCHAR}, #{logIp,jdbcType=VARCHAR}, ",
        "#{logType,jdbcType=INTEGER}, #{logAction,jdbcType=VARCHAR}, ",
        "#{logStatus,jdbcType=BIT}, #{logResult,jdbcType=VARCHAR}, ",
        "#{logComment,jdbcType=VARCHAR}, #{logAddTime,jdbcType=TIMESTAMP}, ",
        "#{logUpdateTime,jdbcType=TIMESTAMP}, #{logDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="logId", before=false, resultType=Integer.class)
    int insert(LymallLog record);

    @InsertProvider(type= LymallLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="logId", before=false, resultType=Integer.class)
    int insertSelective(LymallLog record);

    @Select({
        "select",
        "log_id, log_admin, log_ip, log_type, log_action, log_status, log_result, log_comment, ",
        "log_add_time, log_update_time, log_deleted",
        "from lymall_log",
        "where log_id = #{logId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="log_id", property="logId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="log_admin", property="logAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_ip", property="logIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_type", property="logType", jdbcType=JdbcType.INTEGER),
        @Result(column="log_action", property="logAction", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_status", property="logStatus", jdbcType=JdbcType.BIT),
        @Result(column="log_result", property="logResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_comment", property="logComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_add_time", property="logAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="log_update_time", property="logUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="log_deleted", property="logDeleted", jdbcType=JdbcType.BIT)
    })
    LymallLog selectByPrimaryKey(Integer logId);

    @UpdateProvider(type=LymallLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallLog record);

    @Update({
        "update lymall_log",
        "set log_admin = #{logAdmin,jdbcType=VARCHAR},",
          "log_ip = #{logIp,jdbcType=VARCHAR},",
          "log_type = #{logType,jdbcType=INTEGER},",
          "log_action = #{logAction,jdbcType=VARCHAR},",
          "log_status = #{logStatus,jdbcType=BIT},",
          "log_result = #{logResult,jdbcType=VARCHAR},",
          "log_comment = #{logComment,jdbcType=VARCHAR},",
          "log_add_time = #{logAddTime,jdbcType=TIMESTAMP},",
          "log_update_time = #{logUpdateTime,jdbcType=TIMESTAMP},",
          "log_deleted = #{logDeleted,jdbcType=BIT}",
        "where log_id = #{logId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallLog record);
}