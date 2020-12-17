package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallFootprintSqlProvider;
import com.ly.lymall.db.domian.LymallFootprint;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallFootprintMapper {
    @Delete({
        "delete from lymall_footprint",
        "where footprint_id = #{footprintId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer footprintId);

    @Insert({
        "insert into lymall_footprint (user_id, goods_id, ",
        "footprint_add_time, footprint_update_time, ",
        "footprint_deleted)",
        "values (#{userId,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{footprintAddTime,jdbcType=TIMESTAMP}, #{footprintUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{footprintDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="footprintId", before=false, resultType=Integer.class)
    int insert(LymallFootprint record);

    @InsertProvider(type= LymallFootprintSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="footprintId", before=false, resultType=Integer.class)
    int insertSelective(LymallFootprint record);

    @Select({
        "select",
        "footprint_id, user_id, goods_id, footprint_add_time, footprint_update_time, ",
        "footprint_deleted",
        "from lymall_footprint",
        "where footprint_id = #{footprintId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="footprint_id", property="footprintId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="footprint_add_time", property="footprintAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="footprint_update_time", property="footprintUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="footprint_deleted", property="footprintDeleted", jdbcType=JdbcType.BIT)
    })
    LymallFootprint selectByPrimaryKey(Integer footprintId);

    @UpdateProvider(type=LymallFootprintSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallFootprint record);

    @Update({
        "update lymall_footprint",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "goods_id = #{goodsId,jdbcType=INTEGER},",
          "footprint_add_time = #{footprintAddTime,jdbcType=TIMESTAMP},",
          "footprint_update_time = #{footprintUpdateTime,jdbcType=TIMESTAMP},",
          "footprint_deleted = #{footprintDeleted,jdbcType=BIT}",
        "where footprint_id = #{footprintId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallFootprint record);
}