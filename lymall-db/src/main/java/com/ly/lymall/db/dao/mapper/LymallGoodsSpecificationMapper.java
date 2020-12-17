package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallGoodsSpecificationSqlProvider;
import com.ly.lymall.db.domian.LymallGoodsSpecification;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallGoodsSpecificationMapper {
    @Delete({
        "delete from lymall_goods_specification",
        "where goods_specification_id = #{goodsSpecificationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goodsSpecificationId);

    @Insert({
        "insert into lymall_goods_specification (goods_id, goods_specification_specification, ",
        "goods_specification_value, goods_specification_pic_url, ",
        "goods_specification_add_time, goods_specification_update_time, ",
        "goods_specification_deleted)",
        "values (#{goodsId,jdbcType=INTEGER}, #{goodsSpecificationSpecification,jdbcType=VARCHAR}, ",
        "#{goodsSpecificationValue,jdbcType=VARCHAR}, #{goodsSpecificationPicUrl,jdbcType=VARCHAR}, ",
        "#{goodsSpecificationAddTime,jdbcType=TIMESTAMP}, #{goodsSpecificationUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{goodsSpecificationDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsSpecificationId", before=false, resultType=Integer.class)
    int insert(LymallGoodsSpecification record);

    @InsertProvider(type= LymallGoodsSpecificationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsSpecificationId", before=false, resultType=Integer.class)
    int insertSelective(LymallGoodsSpecification record);

    @Select({
        "select",
        "goods_specification_id, goods_id, goods_specification_specification, goods_specification_value, ",
        "goods_specification_pic_url, goods_specification_add_time, goods_specification_update_time, ",
        "goods_specification_deleted",
        "from lymall_goods_specification",
        "where goods_specification_id = #{goodsSpecificationId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="goods_specification_id", property="goodsSpecificationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_specification_specification", property="goodsSpecificationSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_specification_value", property="goodsSpecificationValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_specification_pic_url", property="goodsSpecificationPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_specification_add_time", property="goodsSpecificationAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_specification_update_time", property="goodsSpecificationUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_specification_deleted", property="goodsSpecificationDeleted", jdbcType=JdbcType.BIT)
    })
    LymallGoodsSpecification selectByPrimaryKey(Integer goodsSpecificationId);

    @UpdateProvider(type=LymallGoodsSpecificationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallGoodsSpecification record);

    @Update({
        "update lymall_goods_specification",
        "set goods_id = #{goodsId,jdbcType=INTEGER},",
          "goods_specification_specification = #{goodsSpecificationSpecification,jdbcType=VARCHAR},",
          "goods_specification_value = #{goodsSpecificationValue,jdbcType=VARCHAR},",
          "goods_specification_pic_url = #{goodsSpecificationPicUrl,jdbcType=VARCHAR},",
          "goods_specification_add_time = #{goodsSpecificationAddTime,jdbcType=TIMESTAMP},",
          "goods_specification_update_time = #{goodsSpecificationUpdateTime,jdbcType=TIMESTAMP},",
          "goods_specification_deleted = #{goodsSpecificationDeleted,jdbcType=BIT}",
        "where goods_specification_id = #{goodsSpecificationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallGoodsSpecification record);
}