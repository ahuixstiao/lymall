package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallKeywordSqlProvider;
import com.ly.lymall.db.domian.LymallKeyword;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallKeywordMapper {
    @Delete({
        "delete from lymall_keyword",
        "where keyword_id = #{keywordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer keywordId);

    @Insert({
        "insert into lymall_keyword (keyword, keyword_url, ",
        "keyword_is_hot, keyword_is_default, ",
        "keyword_sort_order, keyword_add_time, ",
        "keyword_update_time, keyword_deleted)",
        "values (#{keyword,jdbcType=VARCHAR}, #{keywordUrl,jdbcType=VARCHAR}, ",
        "#{keywordIsHot,jdbcType=BIT}, #{keywordIsDefault,jdbcType=BIT}, ",
        "#{keywordSortOrder,jdbcType=INTEGER}, #{keywordAddTime,jdbcType=TIMESTAMP}, ",
        "#{keywordUpdateTime,jdbcType=TIMESTAMP}, #{keywordDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="keywordId", before=false, resultType=Integer.class)
    int insert(LymallKeyword record);

    @InsertProvider(type= LymallKeywordSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="keywordId", before=false, resultType=Integer.class)
    int insertSelective(LymallKeyword record);

    @Select({
        "select",
        "keyword_id, keyword, keyword_url, keyword_is_hot, keyword_is_default, keyword_sort_order, ",
        "keyword_add_time, keyword_update_time, keyword_deleted",
        "from lymall_keyword",
        "where keyword_id = #{keywordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="keyword_id", property="keywordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword_url", property="keywordUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword_is_hot", property="keywordIsHot", jdbcType=JdbcType.BIT),
        @Result(column="keyword_is_default", property="keywordIsDefault", jdbcType=JdbcType.BIT),
        @Result(column="keyword_sort_order", property="keywordSortOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="keyword_add_time", property="keywordAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="keyword_update_time", property="keywordUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="keyword_deleted", property="keywordDeleted", jdbcType=JdbcType.BIT)
    })
    LymallKeyword selectByPrimaryKey(Integer keywordId);

    @UpdateProvider(type=LymallKeywordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallKeyword record);

    @Update({
        "update lymall_keyword",
        "set keyword = #{keyword,jdbcType=VARCHAR},",
          "keyword_url = #{keywordUrl,jdbcType=VARCHAR},",
          "keyword_is_hot = #{keywordIsHot,jdbcType=BIT},",
          "keyword_is_default = #{keywordIsDefault,jdbcType=BIT},",
          "keyword_sort_order = #{keywordSortOrder,jdbcType=INTEGER},",
          "keyword_add_time = #{keywordAddTime,jdbcType=TIMESTAMP},",
          "keyword_update_time = #{keywordUpdateTime,jdbcType=TIMESTAMP},",
          "keyword_deleted = #{keywordDeleted,jdbcType=BIT}",
        "where keyword_id = #{keywordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallKeyword record);
}