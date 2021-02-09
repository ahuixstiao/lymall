package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallTopicSqlProvider;
import com.ly.lymall.db.domian.LymallTopic;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallTopicMapper {
    @Delete({
        "delete from lymall_topic",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer topicId);

    @Insert({
        "insert into lymall_topic (topic_title, topic_subtitle, ",
        "topic_price, topic_read_count, ",
        "topic_pic_url, topic_sort_order, ",
        "topic_goods, topic_add_time, ",
        "topic_update_time, topic_deleted, ",
        "topic_content)",
        "values (#{topicTitle,jdbcType=VARCHAR}, #{topicSubtitle,jdbcType=VARCHAR}, ",
        "#{topicPrice,jdbcType=DECIMAL}, #{topicReadCount,jdbcType=VARCHAR}, ",
        "#{topicPicUrl,jdbcType=VARCHAR}, #{topicSortOrder,jdbcType=INTEGER}, ",
        "#{topicGoods,jdbcType=VARCHAR}, #{topicAddTime,jdbcType=TIMESTAMP}, ",
        "#{topicUpdateTime,jdbcType=TIMESTAMP}, #{topicDeleted,jdbcType=BIT}, ",
        "#{topicContent,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="topicId", before=false, resultType=Integer.class)
    int insert(LymallTopic record);

    @InsertProvider(type= LymallTopicSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="topicId", before=false, resultType=Integer.class)
    int insertSelective(LymallTopic record);

    @Select({
        "select",
        "topic_id, topic_title, topic_subtitle, topic_price, topic_read_count, topic_pic_url, ",
        "topic_sort_order, topic_goods, topic_add_time, topic_update_time, topic_deleted, ",
        "topic_content",
        "from lymall_topic",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="topic_id", property="topicId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="topic_title", property="topicTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="topic_subtitle", property="topicSubtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="topic_price", property="topicPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="topic_read_count", property="topicReadCount", jdbcType=JdbcType.VARCHAR),
        @Result(column="topic_pic_url", property="topicPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="topic_sort_order", property="topicSortOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="topic_goods", property="topicGoods", jdbcType=JdbcType.VARCHAR),
        @Result(column="topic_add_time", property="topicAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="topic_update_time", property="topicUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="topic_deleted", property="topicDeleted", jdbcType=JdbcType.BIT),
        @Result(column="topic_content", property="topicContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    LymallTopic selectByPrimaryKey(Integer topicId);

    /**
     * 查询专题精选商品信息
     * @return List<LymallTopic>
     */
    @Select("select * from lymall_topic where topic_deleted=${0}")
    List<LymallTopic> selectByfindAll();

    @UpdateProvider(type=LymallTopicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallTopic record);

    @Update({
        "update lymall_topic",
        "set topic_title = #{topicTitle,jdbcType=VARCHAR},",
          "topic_subtitle = #{topicSubtitle,jdbcType=VARCHAR},",
          "topic_price = #{topicPrice,jdbcType=DECIMAL},",
          "topic_read_count = #{topicReadCount,jdbcType=VARCHAR},",
          "topic_pic_url = #{topicPicUrl,jdbcType=VARCHAR},",
          "topic_sort_order = #{topicSortOrder,jdbcType=INTEGER},",
          "topic_goods = #{topicGoods,jdbcType=VARCHAR},",
          "topic_add_time = #{topicAddTime,jdbcType=TIMESTAMP},",
          "topic_update_time = #{topicUpdateTime,jdbcType=TIMESTAMP},",
          "topic_deleted = #{topicDeleted,jdbcType=BIT},",
          "topic_content = #{topicContent,jdbcType=LONGVARCHAR}",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBlobs(LymallTopic record);

    @Update({
        "update lymall_topic",
        "set topic_title = #{topicTitle,jdbcType=VARCHAR},",
          "topic_subtitle = #{topicSubtitle,jdbcType=VARCHAR},",
          "topic_price = #{topicPrice,jdbcType=DECIMAL},",
          "topic_read_count = #{topicReadCount,jdbcType=VARCHAR},",
          "topic_pic_url = #{topicPicUrl,jdbcType=VARCHAR},",
          "topic_sort_order = #{topicSortOrder,jdbcType=INTEGER},",
          "topic_goods = #{topicGoods,jdbcType=VARCHAR},",
          "topic_add_time = #{topicAddTime,jdbcType=TIMESTAMP},",
          "topic_update_time = #{topicUpdateTime,jdbcType=TIMESTAMP},",
          "topic_deleted = #{topicDeleted,jdbcType=BIT}",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallTopic record);
}