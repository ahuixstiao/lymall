package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallCommentSqlProvider;
import com.ly.lymall.db.domian.LymallComment;
import com.ly.lymall.db.dto.LymallUserCommentDTO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallCommentMapper {
    @Delete({
        "delete from lymall_comment",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer commentId);

    @Insert({
        "insert into lymall_comment (comment_value_id, comment_type, ",
        "comment_content, comment_admin_content, ",
        "user_id, comment_has_picture, ",
        "comment_pic_urls, comment_star, ",
        "comment_add_time, comment_update_time, ",
        "comment_deleted)",
        "values (#{commentValueId,jdbcType=INTEGER}, #{commentType,jdbcType=TINYINT}, ",
        "#{commentContent,jdbcType=VARCHAR}, #{commentAdminContent,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER}, #{commentHasPicture,jdbcType=BIT}, ",
        "#{commentPicUrls,jdbcType=VARCHAR}, #{commentStar,jdbcType=SMALLINT}, ",
        "#{commentAddTime,jdbcType=TIMESTAMP}, #{commentUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{commentDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="commentId", before=false, resultType=Integer.class)
    int insert(LymallComment record);

    @InsertProvider(type= LymallCommentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="commentId", before=false, resultType=Integer.class)
    int insertSelective(LymallComment record);

    @Select({
        "select",
        "comment_id, comment_value_id, comment_type, comment_content, comment_admin_content, ",
        "user_id, comment_has_picture, comment_pic_urls, comment_star, comment_add_time, ",
        "comment_update_time, comment_deleted",
        "from lymall_comment",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="comment_id", property="commentId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="comment_value_id", property="commentValueId", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_type", property="commentType", jdbcType=JdbcType.TINYINT),
        @Result(column="comment_content", property="commentContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment_admin_content", property="commentAdminContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_has_picture", property="commentHasPicture", jdbcType=JdbcType.BIT),
        @Result(column="comment_pic_urls", property="commentPicUrls", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment_star", property="commentStar", jdbcType=JdbcType.SMALLINT),
        @Result(column="comment_add_time", property="commentAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_update_time", property="commentUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_deleted", property="commentDeleted", jdbcType=JdbcType.BIT)
    })
    LymallComment selectByPrimaryKey(Integer commentId);

    /**
     * 根据userId、goodsId查询出对应的商品评论或专题评论
     * @param userId
     * @param goodsId
     * @param commentType 评价类型 0商品评价 1专题评价
     * @return List<LymallComment>
     */
    @SelectProvider(type=LymallCommentSqlProvider.class,method="selectByGoodsIdFindCommentInfo")
    List<LymallUserCommentDTO> selectByGoodsIdFindComment(Integer userId, Integer goodsId, Integer commentType);

    @UpdateProvider(type=LymallCommentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallComment record);

    @Update({
        "update lymall_comment",
        "set comment_value_id = #{commentValueId,jdbcType=INTEGER},",
          "comment_type = #{commentType,jdbcType=TINYINT},",
          "comment_content = #{commentContent,jdbcType=VARCHAR},",
          "comment_admin_content = #{commentAdminContent,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "comment_has_picture = #{commentHasPicture,jdbcType=BIT},",
          "comment_pic_urls = #{commentPicUrls,jdbcType=VARCHAR},",
          "comment_star = #{commentStar,jdbcType=SMALLINT},",
          "comment_add_time = #{commentAddTime,jdbcType=TIMESTAMP},",
          "comment_update_time = #{commentUpdateTime,jdbcType=TIMESTAMP},",
          "comment_deleted = #{commentDeleted,jdbcType=BIT}",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallComment record);
}