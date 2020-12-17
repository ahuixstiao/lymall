package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallNoticeAdminSqlProvider;
import com.ly.lymall.db.domian.LymallNoticeAdmin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallNoticeAdminMapper {
    @Delete({
        "delete from lymall_notice_admin",
        "where notice_admin_id = #{noticeAdminId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer noticeAdminId);

    @Insert({
        "insert into lymall_notice_admin (notice_id, notice_title, ",
        "notice_receive_admin_id, notice_admin_read_time, ",
        "notice_admin_add_time, notice_admin_update_time, ",
        "notice_admin_deleted)",
        "values (#{noticeId,jdbcType=INTEGER}, #{noticeTitle,jdbcType=VARCHAR}, ",
        "#{noticeReceiveAdminId,jdbcType=INTEGER}, #{noticeAdminReadTime,jdbcType=TIMESTAMP}, ",
        "#{noticeAdminAddTime,jdbcType=TIMESTAMP}, #{noticeAdminUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{noticeAdminDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="noticeAdminId", before=false, resultType=Integer.class)
    int insert(LymallNoticeAdmin record);

    @InsertProvider(type= LymallNoticeAdminSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="noticeAdminId", before=false, resultType=Integer.class)
    int insertSelective(LymallNoticeAdmin record);

    @Select({
        "select",
        "notice_admin_id, notice_id, notice_title, notice_receive_admin_id, notice_admin_read_time, ",
        "notice_admin_add_time, notice_admin_update_time, notice_admin_deleted",
        "from lymall_notice_admin",
        "where notice_admin_id = #{noticeAdminId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="notice_admin_id", property="noticeAdminId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="notice_id", property="noticeId", jdbcType=JdbcType.INTEGER),
        @Result(column="notice_title", property="noticeTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="notice_receive_admin_id", property="noticeReceiveAdminId", jdbcType=JdbcType.INTEGER),
        @Result(column="notice_admin_read_time", property="noticeAdminReadTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="notice_admin_add_time", property="noticeAdminAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="notice_admin_update_time", property="noticeAdminUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="notice_admin_deleted", property="noticeAdminDeleted", jdbcType=JdbcType.BIT)
    })
    LymallNoticeAdmin selectByPrimaryKey(Integer noticeAdminId);

    @UpdateProvider(type=LymallNoticeAdminSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallNoticeAdmin record);

    @Update({
        "update lymall_notice_admin",
        "set notice_id = #{noticeId,jdbcType=INTEGER},",
          "notice_title = #{noticeTitle,jdbcType=VARCHAR},",
          "notice_receive_admin_id = #{noticeReceiveAdminId,jdbcType=INTEGER},",
          "notice_admin_read_time = #{noticeAdminReadTime,jdbcType=TIMESTAMP},",
          "notice_admin_add_time = #{noticeAdminAddTime,jdbcType=TIMESTAMP},",
          "notice_admin_update_time = #{noticeAdminUpdateTime,jdbcType=TIMESTAMP},",
          "notice_admin_deleted = #{noticeAdminDeleted,jdbcType=BIT}",
        "where notice_admin_id = #{noticeAdminId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallNoticeAdmin record);
}