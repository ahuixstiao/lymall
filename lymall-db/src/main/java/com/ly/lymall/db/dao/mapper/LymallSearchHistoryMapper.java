package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallSearchHistorySqlProvider;
import com.ly.lymall.db.domain.LymallSearchHistory;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface LymallSearchHistoryMapper {
    @Delete({
        "delete from lymall_search_history",
        "where search_history_id = #{searchHistoryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer searchHistoryId);

    /**
     * 根据userId删除历史关键字
     * @param userId
     * @return int
     */
    @DeleteProvider(value=LymallSearchHistorySqlProvider.class,method="deleteByUseridAndHistoryKeywordId")
    int deleteByHistoryKeyword(Integer userId);

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

    /**
     * 根据userId插入搜索历史关键字
     * @param keyword
     * @param userId
     * @return int
     */
    @InsertProvider(type=LymallSearchHistorySqlProvider.class,method="insertByUserIdCreateHistoryKeyword")
    int createHistoryKeyword(String keyword, Integer userId, LocalDateTime addTime);

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

    /**
     * 根据用户id查询 历史关键字
     * @return List<LymallSearchHistory>
     */
    @SelectProvider(type=LymallSearchHistorySqlProvider.class,method="selectByUserIdFindAllHistory")
    List<LymallSearchHistory> selectByUserIdFindHistory(Integer userId);

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