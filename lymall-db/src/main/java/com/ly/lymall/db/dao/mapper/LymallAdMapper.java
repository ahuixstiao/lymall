package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallAdSqlProvider;
import com.ly.lymall.db.domian.LymallAd;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallAdMapper {
    @Delete({
        "delete from lymall_ad",
        "where ad_id = #{adId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer adId);

    @Insert({
        "insert into lymall_ad (ad_name, ad_link, ",
        "ad_url, ad_position, ",
        "ad_content, ad_start_time, ",
        "ad_end_time, ad_enabled, ",
        "ad_add_time, ad_update_time, ",
        "ad_deleted)",
        "values (#{adName,jdbcType=VARCHAR}, #{adLink,jdbcType=VARCHAR}, ",
        "#{adUrl,jdbcType=VARCHAR}, #{adPosition,jdbcType=TINYINT}, ",
        "#{adContent,jdbcType=VARCHAR}, #{adStartTime,jdbcType=TIMESTAMP}, ",
        "#{adEndTime,jdbcType=TIMESTAMP}, #{adEnabled,jdbcType=BIT}, ",
        "#{adAddTime,jdbcType=TIMESTAMP}, #{adUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{adDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="adId", before=false, resultType=Integer.class)
    int insert(LymallAd record);

    @InsertProvider(type= LymallAdSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="adId", before=false, resultType=Integer.class)
    int insertSelective(LymallAd record);

    @Select({
        "select",
        "ad_id, ad_name, ad_link, ad_url, ad_position, ad_content, ad_start_time, ad_end_time, ",
        "ad_enabled, ad_add_time, ad_update_time, ad_deleted",
        "from lymall_ad",
        "where ad_id = #{adId,jdbcType=INTEGER}"
    })
    @Results( id="adResults",value={
        @Result(column="ad_id", property="adId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ad_name", property="adName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_link", property="adLink", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_url", property="adUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_position", property="adPosition", jdbcType=JdbcType.TINYINT),
        @Result(column="ad_content", property="adContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_start_time", property="adStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ad_end_time", property="adEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ad_enabled", property="adEnabled", jdbcType=JdbcType.BIT),
        @Result(column="ad_add_time", property="adAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ad_update_time", property="adUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ad_deleted", property="adDeleted", jdbcType=JdbcType.BIT)
    })
    LymallAd selectByPrimaryKey(Integer adId);


    /**
     * 查询全部未删除的广告
     * @return List<LymallAd>
     */
    @Select("select * from lymall_ad where ad_deleted=${0}")
    @ResultMap("adResults")
    List<LymallAd> selectByAllAd();


    @UpdateProvider(type=LymallAdSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallAd record);

    @Update({
        "update lymall_ad",
        "set ad_name = #{adName,jdbcType=VARCHAR},",
          "ad_link = #{adLink,jdbcType=VARCHAR},",
          "ad_url = #{adUrl,jdbcType=VARCHAR},",
          "ad_position = #{adPosition,jdbcType=TINYINT},",
          "ad_content = #{adContent,jdbcType=VARCHAR},",
          "ad_start_time = #{adStartTime,jdbcType=TIMESTAMP},",
          "ad_end_time = #{adEndTime,jdbcType=TIMESTAMP},",
          "ad_enabled = #{adEnabled,jdbcType=BIT},",
          "ad_add_time = #{adAddTime,jdbcType=TIMESTAMP},",
          "ad_update_time = #{adUpdateTime,jdbcType=TIMESTAMP},",
          "ad_deleted = #{adDeleted,jdbcType=BIT}",
        "where ad_id = #{adId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallAd record);
}