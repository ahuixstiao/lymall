package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallAftersaleSqlProvider;
import com.ly.lymall.db.domain.LymallAftersale;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallAftersaleMapper {
    @Delete({
        "delete from lymall_aftersale",
        "where aftersale_id = #{aftersaleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer aftersaleId);

    @Insert({
        "insert into lymall_aftersale (aftersale_sn, order_id, ",
        "user_id, aftersale_type, ",
        "aftersale_reason, aftersale_amount, ",
        "aftersale_pictures, aftersale_comment, ",
        "aftersale_status, aftersale_handle_time, ",
        "aftersale_add_time, aftersale_update_time, ",
        "aftersale_deleted)",
        "values (#{aftersaleSn,jdbcType=VARCHAR}, #{orderId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{aftersaleType,jdbcType=SMALLINT}, ",
        "#{aftersaleReason,jdbcType=VARCHAR}, #{aftersaleAmount,jdbcType=DECIMAL}, ",
        "#{aftersalePictures,jdbcType=VARCHAR}, #{aftersaleComment,jdbcType=VARCHAR}, ",
        "#{aftersaleStatus,jdbcType=SMALLINT}, #{aftersaleHandleTime,jdbcType=TIMESTAMP}, ",
        "#{aftersaleAddTime,jdbcType=TIMESTAMP}, #{aftersaleUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{aftersaleDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="aftersaleId", before=false, resultType=Integer.class)
    int insert(LymallAftersale record);

    @InsertProvider(type= LymallAftersaleSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="aftersaleId", before=false, resultType=Integer.class)
    int insertSelective(LymallAftersale record);

    @Select({
        "select",
        "aftersale_id, aftersale_sn, order_id, user_id, aftersale_type, aftersale_reason, ",
        "aftersale_amount, aftersale_pictures, aftersale_comment, aftersale_status, aftersale_handle_time, ",
        "aftersale_add_time, aftersale_update_time, aftersale_deleted",
        "from lymall_aftersale",
        "where aftersale_id = #{aftersaleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="aftersale_id", property="aftersaleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="aftersale_sn", property="aftersaleSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="aftersale_type", property="aftersaleType", jdbcType=JdbcType.SMALLINT),
        @Result(column="aftersale_reason", property="aftersaleReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="aftersale_amount", property="aftersaleAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="aftersale_pictures", property="aftersalePictures", jdbcType=JdbcType.VARCHAR),
        @Result(column="aftersale_comment", property="aftersaleComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="aftersale_status", property="aftersaleStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="aftersale_handle_time", property="aftersaleHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="aftersale_add_time", property="aftersaleAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="aftersale_update_time", property="aftersaleUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="aftersale_deleted", property="aftersaleDeleted", jdbcType=JdbcType.BIT)
    })
    LymallAftersale selectByPrimaryKey(Integer aftersaleId);

    @UpdateProvider(type=LymallAftersaleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallAftersale record);

    @Update({
        "update lymall_aftersale",
        "set aftersale_sn = #{aftersaleSn,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "aftersale_type = #{aftersaleType,jdbcType=SMALLINT},",
          "aftersale_reason = #{aftersaleReason,jdbcType=VARCHAR},",
          "aftersale_amount = #{aftersaleAmount,jdbcType=DECIMAL},",
          "aftersale_pictures = #{aftersalePictures,jdbcType=VARCHAR},",
          "aftersale_comment = #{aftersaleComment,jdbcType=VARCHAR},",
          "aftersale_status = #{aftersaleStatus,jdbcType=SMALLINT},",
          "aftersale_handle_time = #{aftersaleHandleTime,jdbcType=TIMESTAMP},",
          "aftersale_add_time = #{aftersaleAddTime,jdbcType=TIMESTAMP},",
          "aftersale_update_time = #{aftersaleUpdateTime,jdbcType=TIMESTAMP},",
          "aftersale_deleted = #{aftersaleDeleted,jdbcType=BIT}",
        "where aftersale_id = #{aftersaleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallAftersale record);
}