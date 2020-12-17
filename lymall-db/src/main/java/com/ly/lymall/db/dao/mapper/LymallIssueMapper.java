package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallIssueSqlProvider;
import com.ly.lymall.db.domian.LymallIssue;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface LymallIssueMapper {
    @Delete({
        "delete from lymall_issue",
        "where issue_id = #{issueId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer issueId);

    @Insert({
        "insert into lymall_issue (issue_question, issue_answer, ",
        "issue_add_time, issue_update_time, ",
        "issue_deleted)",
        "values (#{issueQuestion,jdbcType=VARCHAR}, #{issueAnswer,jdbcType=VARCHAR}, ",
        "#{issueAddTime,jdbcType=TIMESTAMP}, #{issueUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{issueDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="issueId", before=false, resultType=Integer.class)
    int insert(LymallIssue record);

    @InsertProvider(type= LymallIssueSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="issueId", before=false, resultType=Integer.class)
    int insertSelective(LymallIssue record);

    @Select({
        "select",
        "issue_id, issue_question, issue_answer, issue_add_time, issue_update_time, issue_deleted",
        "from lymall_issue",
        "where issue_id = #{issueId,jdbcType=INTEGER}"
    })
    @Results( id="issueResult",value={
        @Result(column="issue_id", property="issueId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="issue_question", property="issueQuestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="issue_answer", property="issueAnswer", jdbcType=JdbcType.VARCHAR),
        @Result(column="issue_add_time", property="issueAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="issue_update_time", property="issueUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="issue_deleted", property="issueDeleted", jdbcType=JdbcType.BIT)
    })
    LymallIssue selectByPrimaryKey(Integer issueId);

    /**
     * 查询全部常见问题
     * @return
     */
    @Select("select * from lymall_issue")
    @ResultMap("issueResult")
    List<LymallIssue> selectAllIssue();

    @UpdateProvider(type=LymallIssueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallIssue record);

    @Update({
        "update lymall_issue",
        "set issue_question = #{issueQuestion,jdbcType=VARCHAR},",
          "issue_answer = #{issueAnswer,jdbcType=VARCHAR},",
          "issue_add_time = #{issueAddTime,jdbcType=TIMESTAMP},",
          "issue_update_time = #{issueUpdateTime,jdbcType=TIMESTAMP},",
          "issue_deleted = #{issueDeleted,jdbcType=BIT}",
        "where issue_id = #{issueId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallIssue record);
}