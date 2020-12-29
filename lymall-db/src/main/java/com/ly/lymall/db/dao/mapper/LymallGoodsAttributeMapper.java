package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallGoodsAttributeSqlProvider;
import com.ly.lymall.db.domian.LymallGoodsAttribute;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallGoodsAttributeMapper {
    @Delete({
        "delete from lymall_goods_attribute",
        "where goods_attribute_id = #{goodsAttributeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goodsAttributeId);

    @Insert({
        "insert into lymall_goods_attribute (goods_id, `attribute`, ",
        "goods_attribute_value, goods_attribute_add_time, ",
        "goods_attribute_update_time, goods_attribute_deleted)",
        "values (#{goodsId,jdbcType=INTEGER}, #{attribute,jdbcType=VARCHAR}, ",
        "#{goodsAttributeValue,jdbcType=VARCHAR}, #{goodsAttributeAddTime,jdbcType=TIMESTAMP}, ",
        "#{goodsAttributeUpdateTime,jdbcType=TIMESTAMP}, #{goodsAttributeDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsAttributeId", before=false, resultType=Integer.class)
    int insert(LymallGoodsAttribute record);

    @InsertProvider(type= LymallGoodsAttributeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsAttributeId", before=false, resultType=Integer.class)
    int insertSelective(LymallGoodsAttribute record);

    @Select({
        "select",
        "goods_attribute_id, goods_id, `attribute`, goods_attribute_value, goods_attribute_add_time, ",
        "goods_attribute_update_time, goods_attribute_deleted",
        "from lymall_goods_attribute",
        "where goods_attribute_id = #{goodsAttributeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="goods_attribute_id", property="goodsAttributeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_attribute_value", property="goodsAttributeValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_attribute_add_time", property="goodsAttributeAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_attribute_update_time", property="goodsAttributeUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_attribute_deleted", property="goodsAttributeDeleted", jdbcType=JdbcType.BIT)
    })
    LymallGoodsAttribute selectByPrimaryKey(Integer goodsAttributeId);

    /**
     * 根据商品的goodsId查询 商品参数
     * @param goodsId
     * @return LymallGoodsAttribute
     */
    @Select("select * from lymall_goods_attribute where goods_id=#{goodsId}")
    List<LymallGoodsAttribute> selectByGoodsIdFindGoodsAttriBute(Integer goodsId);


    @UpdateProvider(type=LymallGoodsAttributeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallGoodsAttribute record);

    @Update({
        "update lymall_goods_attribute",
        "set goods_id = #{goodsId,jdbcType=INTEGER},",
          "`attribute` = #{attribute,jdbcType=VARCHAR},",
          "goods_attribute_value = #{goodsAttributeValue,jdbcType=VARCHAR},",
          "goods_attribute_add_time = #{goodsAttributeAddTime,jdbcType=TIMESTAMP},",
          "goods_attribute_update_time = #{goodsAttributeUpdateTime,jdbcType=TIMESTAMP},",
          "goods_attribute_deleted = #{goodsAttributeDeleted,jdbcType=BIT}",
        "where goods_attribute_id = #{goodsAttributeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallGoodsAttribute record);
}