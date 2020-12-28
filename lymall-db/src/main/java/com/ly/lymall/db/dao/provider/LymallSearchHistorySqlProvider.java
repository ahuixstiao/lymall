package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallSearchHistory;
import org.apache.ibatis.jdbc.SQL;

public class LymallSearchHistorySqlProvider {
    public String insertSelective(LymallSearchHistory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_search_history");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSearchKeyword() != null) {
            sql.VALUES("search_keyword", "#{searchKeyword,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchFrom() != null) {
            sql.VALUES("search_from", "#{searchFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchHistoryAddTime() != null) {
            sql.VALUES("search_history_add_time", "#{searchHistoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryUpdateTime() != null) {
            sql.VALUES("search_history_update_time", "#{searchHistoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryDeleted() != null) {
            sql.VALUES("search_history_deleted", "#{searchHistoryDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallSearchHistory record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_search_history");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSearchKeyword() != null) {
            sql.SET("search_keyword = #{searchKeyword,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchFrom() != null) {
            sql.SET("search_from = #{searchFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getSearchHistoryAddTime() != null) {
            sql.SET("search_history_add_time = #{searchHistoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryUpdateTime() != null) {
            sql.SET("search_history_update_time = #{searchHistoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSearchHistoryDeleted() != null) {
            sql.SET("search_history_deleted = #{searchHistoryDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("search_history_id = #{searchHistoryId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * 根据用户id来查询历史关键字
     * @param userId
     * @return 返回String类型的sql语句
     */
    public String selectByUserIdFindAllHistory(Integer userId){
        SQL sql=new SQL();
        sql.SELECT("*")
                .FROM("lymall_search_history")
                .WHERE("user_id="+userId);

        return sql.toString();
    }

    /**
     * 根据userId插入历史搜索关键字
     * @param keyword
     * @param userId
     * @return String
     */
    public String insertByUserIdCreateHistoryKeyword(String keyword, Integer userId){
        SQL sql=new SQL();
        sql.INSERT_INTO("ymall_search_history (search_keyword,user_id)")
                .VALUES(keyword,userId.toString());
        return sql.toString();
    }

    /**
     * 根据userId来进行 删除历史关键字
     * @param userId
     * @return String
     */
    public String deleteByUseridAndHistoryKeywordId(Integer userId){
        SQL sql=new SQL();

        sql.DELETE_FROM("lymall_search_history").WHERE("user_id="+userId);

        return sql.toString();
    }
}