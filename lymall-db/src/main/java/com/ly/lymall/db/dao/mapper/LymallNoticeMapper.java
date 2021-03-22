package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallNoticeSqlProvider;
import com.ly.lymall.db.domain.LymallNotice;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallNoticeMapper {
    @Delete({
        "delete from lymall_notice",
        "where notice_id = #{noticeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer noticeId);

    @Insert({
        "insert into lymall_notice (notice_title, notice_content, ",
        "notice_create_admin_id, notice_add_time, ",
        "notice_update_time, notice_deleted)",
        "values (#{noticeTitle,jdbcType=VARCHAR}, #{noticeContent,jdbcType=VARCHAR}, ",
        "#{noticeCreateAdminId,jdbcType=INTEGER}, #{noticeAddTime,jdbcType=TIMESTAMP}, ",
        "#{noticeUpdateTime,jdbcType=TIMESTAMP}, #{noticeDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="noticeId", before=false, resultType=Integer.class)
    int insert(LymallNotice record);

    @InsertProvider(type= LymallNoticeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="noticeId", before=false, resultType=Integer.class)
    int insertSelective(LymallNotice record);

    @Select({
        "select",
        "notice_id, notice_title, notice_content, notice_create_admin_id, notice_add_time, ",
        "notice_update_time, notice_deleted",
        "from lymall_notice",
        "where notice_id = #{noticeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="notice_id", property="noticeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="notice_title", property="noticeTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="notice_content", property="noticeContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="notice_create_admin_id", property="noticeCreateAdminId", jdbcType=JdbcType.INTEGER),
        @Result(column="notice_add_time", property="noticeAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="notice_update_time", property="noticeUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="notice_deleted", property="noticeDeleted", jdbcType=JdbcType.BIT)
    })
    LymallNotice selectByPrimaryKey(Integer noticeId);

    @UpdateProvider(type=LymallNoticeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallNotice record);

    @Update({
        "update lymall_notice",
        "set notice_title = #{noticeTitle,jdbcType=VARCHAR},",
          "notice_content = #{noticeContent,jdbcType=VARCHAR},",
          "notice_create_admin_id = #{noticeCreateAdminId,jdbcType=INTEGER},",
          "notice_add_time = #{noticeAddTime,jdbcType=TIMESTAMP},",
          "notice_update_time = #{noticeUpdateTime,jdbcType=TIMESTAMP},",
          "notice_deleted = #{noticeDeleted,jdbcType=BIT}",
        "where notice_id = #{noticeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallNotice record);
}