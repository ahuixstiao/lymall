package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallSearchHistorySqlProvider;
import com.ly.lymall.db.domian.LymallSearchHistory;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallSearchHistoryMapper {
    @Delete({
        "delete from lymall_search_history",
        "where search_history_id = #{searchHistoryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer searchHistoryId);

    @Insert({
        "insert into lymall_search_history (user_id, search_keyword, ",
        "search_from, search_history_add_time, ",
        "search_history_update_time, search_history_deleted)",
        "values (#{userId,jdbcType=INTEGER}, #{searchKeyword,jdbcType=VARCHAR}, ",
        "#{searchFrom,jdbcType=VARCHAR}, #{searchHistoryAddTime,jdbcType=TIMESTAMP}, ",
        "#{searchHistoryUpdateTime,jdbcType=TIMESTAMP}, #{searchHistoryDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="searchHistoryId", before=false, resultType=Integer.class)
    int insert(LymallSearchHistory record);

    @InsertProvider(type= LymallSearchHistorySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="searchHistoryId", before=false, resultType=Integer.class)
    int insertSelective(LymallSearchHistory record);

    @Select({
        "select",
        "search_history_id, user_id, search_keyword, search_from, search_history_add_time, ",
        "search_history_update_time, search_history_deleted",
        "from lymall_search_history",
        "where search_history_id = #{searchHistoryId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="search_history_id", property="searchHistoryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="search_keyword", property="searchKeyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_from", property="searchFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_history_add_time", property="searchHistoryAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="search_history_update_time", property="searchHistoryUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="search_history_deleted", property="searchHistoryDeleted", jdbcType=JdbcType.BIT)
    })
    LymallSearchHistory selectByPrimaryKey(Integer searchHistoryId);

    @UpdateProvider(type=LymallSearchHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallSearchHistory record);

    @Update({
        "update lymall_search_history",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "search_keyword = #{searchKeyword,jdbcType=VARCHAR},",
          "search_from = #{searchFrom,jdbcType=VARCHAR},",
          "search_history_add_time = #{searchHistoryAddTime,jdbcType=TIMESTAMP},",
          "search_history_update_time = #{searchHistoryUpdateTime,jdbcType=TIMESTAMP},",
          "search_history_deleted = #{searchHistoryDeleted,jdbcType=BIT}",
        "where search_history_id = #{searchHistoryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallSearchHistory record);
}