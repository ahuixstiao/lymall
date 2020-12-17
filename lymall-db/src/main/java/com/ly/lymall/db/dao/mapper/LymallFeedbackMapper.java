package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallFeedbackSqlProvider;
import com.ly.lymall.db.domian.LymallFeedback;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallFeedbackMapper {
    @Delete({
        "delete from lymall_feedback",
        "where feedback_id = #{feedbackId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer feedbackId);

    @Insert({
        "insert into lymall_feedback (user_id, user_username, ",
        "user_mobile, feedback_type, ",
        "feedback_content, feedback_status, ",
        "feedback_has_picture, feedback_pic_urls, ",
        "feedback_add_time, feedback_update_time, ",
        "feedback_deleted)",
        "values (#{userId,jdbcType=INTEGER}, #{userUsername,jdbcType=VARCHAR}, ",
        "#{userMobile,jdbcType=VARCHAR}, #{feedbackType,jdbcType=VARCHAR}, ",
        "#{feedbackContent,jdbcType=VARCHAR}, #{feedbackStatus,jdbcType=INTEGER}, ",
        "#{feedbackHasPicture,jdbcType=BIT}, #{feedbackPicUrls,jdbcType=VARCHAR}, ",
        "#{feedbackAddTime,jdbcType=TIMESTAMP}, #{feedbackUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{feedbackDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="feedbackId", before=false, resultType=Integer.class)
    int insert(LymallFeedback record);

    @InsertProvider(type= LymallFeedbackSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="feedbackId", before=false, resultType=Integer.class)
    int insertSelective(LymallFeedback record);

    @Select({
        "select",
        "feedback_id, user_id, user_username, user_mobile, feedback_type, feedback_content, ",
        "feedback_status, feedback_has_picture, feedback_pic_urls, feedback_add_time, ",
        "feedback_update_time, feedback_deleted",
        "from lymall_feedback",
        "where feedback_id = #{feedbackId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="feedback_id", property="feedbackId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_username", property="userUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_mobile", property="userMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="feedback_type", property="feedbackType", jdbcType=JdbcType.VARCHAR),
        @Result(column="feedback_content", property="feedbackContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="feedback_status", property="feedbackStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="feedback_has_picture", property="feedbackHasPicture", jdbcType=JdbcType.BIT),
        @Result(column="feedback_pic_urls", property="feedbackPicUrls", jdbcType=JdbcType.VARCHAR),
        @Result(column="feedback_add_time", property="feedbackAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="feedback_update_time", property="feedbackUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="feedback_deleted", property="feedbackDeleted", jdbcType=JdbcType.BIT)
    })
    LymallFeedback selectByPrimaryKey(Integer feedbackId);

    @UpdateProvider(type=LymallFeedbackSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallFeedback record);

    @Update({
        "update lymall_feedback",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "user_username = #{userUsername,jdbcType=VARCHAR},",
          "user_mobile = #{userMobile,jdbcType=VARCHAR},",
          "feedback_type = #{feedbackType,jdbcType=VARCHAR},",
          "feedback_content = #{feedbackContent,jdbcType=VARCHAR},",
          "feedback_status = #{feedbackStatus,jdbcType=INTEGER},",
          "feedback_has_picture = #{feedbackHasPicture,jdbcType=BIT},",
          "feedback_pic_urls = #{feedbackPicUrls,jdbcType=VARCHAR},",
          "feedback_add_time = #{feedbackAddTime,jdbcType=TIMESTAMP},",
          "feedback_update_time = #{feedbackUpdateTime,jdbcType=TIMESTAMP},",
          "feedback_deleted = #{feedbackDeleted,jdbcType=BIT}",
        "where feedback_id = #{feedbackId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallFeedback record);
}