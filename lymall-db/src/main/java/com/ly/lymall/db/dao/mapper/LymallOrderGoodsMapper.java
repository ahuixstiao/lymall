package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallOrderGoodsSqlProvider;
import com.ly.lymall.db.domian.LymallOrderGoods;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallOrderGoodsMapper {
    @Delete({
        "delete from lymall_order_goods",
        "where order_goods_id = #{orderGoodsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer orderGoodsId);

    @Insert({
        "insert into lymall_order_goods (order_id, goods_id, ",
        "goods_name, goods_sn, ",
        "product_id, order_goods_number, ",
        "order_goods_price, order_goods_specifications, ",
        "goods_pic_url, order_goods_comment, ",
        "order_goods_add_time, order_goods_update_time, ",
        "order_goods_deleted)",
        "values (#{orderId,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{goodsName,jdbcType=VARCHAR}, #{goodsSn,jdbcType=VARCHAR}, ",
        "#{productId,jdbcType=INTEGER}, #{orderGoodsNumber,jdbcType=SMALLINT}, ",
        "#{orderGoodsPrice,jdbcType=DECIMAL}, #{orderGoodsSpecifications,jdbcType=VARCHAR}, ",
        "#{goodsPicUrl,jdbcType=VARCHAR}, #{orderGoodsComment,jdbcType=INTEGER}, ",
        "#{orderGoodsAddTime,jdbcType=TIMESTAMP}, #{orderGoodsUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{orderGoodsDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderGoodsId", before=false, resultType=Integer.class)
    int insert(LymallOrderGoods record);

    @InsertProvider(type= LymallOrderGoodsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderGoodsId", before=false, resultType=Integer.class)
    int insertSelective(LymallOrderGoods record);

    @Select({
        "select",
        "order_goods_id, order_id, goods_id, goods_name, goods_sn, product_id, order_goods_number, ",
        "order_goods_price, order_goods_specifications, goods_pic_url, order_goods_comment, ",
        "order_goods_add_time, order_goods_update_time, order_goods_deleted",
        "from lymall_order_goods",
        "where order_goods_id = #{orderGoodsId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="order_goods_id", property="orderGoodsId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_sn", property="goodsSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_goods_number", property="orderGoodsNumber", jdbcType=JdbcType.SMALLINT),
        @Result(column="order_goods_price", property="orderGoodsPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_goods_specifications", property="orderGoodsSpecifications", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_pic_url", property="goodsPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_goods_comment", property="orderGoodsComment", jdbcType=JdbcType.INTEGER),
        @Result(column="order_goods_add_time", property="orderGoodsAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_goods_update_time", property="orderGoodsUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_goods_deleted", property="orderGoodsDeleted", jdbcType=JdbcType.BIT)
    })
    LymallOrderGoods selectByPrimaryKey(Integer orderGoodsId);

    @UpdateProvider(type=LymallOrderGoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallOrderGoods record);

    @Update({
        "update lymall_order_goods",
        "set order_id = #{orderId,jdbcType=INTEGER},",
          "goods_id = #{goodsId,jdbcType=INTEGER},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "goods_sn = #{goodsSn,jdbcType=VARCHAR},",
          "product_id = #{productId,jdbcType=INTEGER},",
          "order_goods_number = #{orderGoodsNumber,jdbcType=SMALLINT},",
          "order_goods_price = #{orderGoodsPrice,jdbcType=DECIMAL},",
          "order_goods_specifications = #{orderGoodsSpecifications,jdbcType=VARCHAR},",
          "goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR},",
          "order_goods_comment = #{orderGoodsComment,jdbcType=INTEGER},",
          "order_goods_add_time = #{orderGoodsAddTime,jdbcType=TIMESTAMP},",
          "order_goods_update_time = #{orderGoodsUpdateTime,jdbcType=TIMESTAMP},",
          "order_goods_deleted = #{orderGoodsDeleted,jdbcType=BIT}",
        "where order_goods_id = #{orderGoodsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallOrderGoods record);
}