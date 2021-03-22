package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallCartSqlProvider;
import com.ly.lymall.db.domain.LymallCart;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallCartMapper {
    @Delete({
        "delete from lymall_cart",
        "where cart_id = #{cartId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cartId);

    @Insert({
        "insert into lymall_cart (user_id, goods_id, ",
        "goods_sn, goods_name, ",
        "product_id, goods_price, ",
        "goods_number, goods_specifications, ",
        "cart_checked, goods_pic_url, ",
        "cart_add_time, cart_update_time, ",
        "cart_deleted)",
        "values (#{userId,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{goodsSn,jdbcType=VARCHAR}, #{goodsName,jdbcType=VARCHAR}, ",
        "#{productId,jdbcType=INTEGER}, #{goodsPrice,jdbcType=DECIMAL}, ",
        "#{goodsNumber,jdbcType=SMALLINT}, #{goodsSpecifications,jdbcType=VARCHAR}, ",
        "#{cartChecked,jdbcType=BIT}, #{goodsPicUrl,jdbcType=VARCHAR}, ",
        "#{cartAddTime,jdbcType=TIMESTAMP}, #{cartUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{cartDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="cartId", before=false, resultType=Integer.class)
    int insert(LymallCart record);

    @InsertProvider(type= LymallCartSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="cartId", before=false, resultType=Integer.class)
    int insertSelective(LymallCart record);

    @Select({
        "select",
        "cart_id, user_id, goods_id, goods_sn, goods_name, product_id, goods_price, goods_number, ",
        "goods_specifications, cart_checked, goods_pic_url, cart_add_time, cart_update_time, ",
        "cart_deleted",
        "from lymall_cart",
        "where cart_id = #{cartId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cart_id", property="cartId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_sn", property="goodsSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_price", property="goodsPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_number", property="goodsNumber", jdbcType=JdbcType.SMALLINT),
        @Result(column="goods_specifications", property="goodsSpecifications", jdbcType=JdbcType.VARCHAR),
        @Result(column="cart_checked", property="cartChecked", jdbcType=JdbcType.BIT),
        @Result(column="goods_pic_url", property="goodsPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="cart_add_time", property="cartAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cart_update_time", property="cartUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cart_deleted", property="cartDeleted", jdbcType=JdbcType.BIT)
    })
    LymallCart selectByPrimaryKey(Integer cartId);

    @UpdateProvider(type=LymallCartSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallCart record);

    @Update({
        "update lymall_cart",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "goods_id = #{goodsId,jdbcType=INTEGER},",
          "goods_sn = #{goodsSn,jdbcType=VARCHAR},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "product_id = #{productId,jdbcType=INTEGER},",
          "goods_price = #{goodsPrice,jdbcType=DECIMAL},",
          "goods_number = #{goodsNumber,jdbcType=SMALLINT},",
          "goods_specifications = #{goodsSpecifications,jdbcType=VARCHAR},",
          "cart_checked = #{cartChecked,jdbcType=BIT},",
          "goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR},",
          "cart_add_time = #{cartAddTime,jdbcType=TIMESTAMP},",
          "cart_update_time = #{cartUpdateTime,jdbcType=TIMESTAMP},",
          "cart_deleted = #{cartDeleted,jdbcType=BIT}",
        "where cart_id = #{cartId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallCart record);
}