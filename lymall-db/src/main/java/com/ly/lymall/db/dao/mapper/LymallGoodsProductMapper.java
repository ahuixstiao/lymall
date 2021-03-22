package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallGoodsProductSqlProvider;
import com.ly.lymall.db.domain.LymallGoodsProduct;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallGoodsProductMapper {
    @Delete({
        "delete from lymall_goods_product",
        "where goods_product_id = #{goodsProductId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goodsProductId);

    @Insert({
        "insert into lymall_goods_product (goods_id, goods_product_specifications, ",
        "goods_product_price, goods_product_number, ",
        "goods_product_url, goods_product_add_time, ",
        "goods_product_update_time, goods_product_deleted)",
        "values (#{goodsId,jdbcType=INTEGER}, #{goodsProductSpecifications,jdbcType=VARCHAR}, ",
        "#{goodsProductPrice,jdbcType=DECIMAL}, #{goodsProductNumber,jdbcType=INTEGER}, ",
        "#{goodsProductUrl,jdbcType=VARCHAR}, #{goodsProductAddTime,jdbcType=TIMESTAMP}, ",
        "#{goodsProductUpdateTime,jdbcType=TIMESTAMP}, #{goodsProductDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsProductId", before=false, resultType=Integer.class)
    int insert(LymallGoodsProduct record);

    @InsertProvider(type= LymallGoodsProductSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsProductId", before=false, resultType=Integer.class)
    int insertSelective(LymallGoodsProduct record);

    @Select({
        "select",
        "goods_product_id, goods_id, goods_product_specifications, goods_product_price, ",
        "goods_product_number, goods_product_url, goods_product_add_time, goods_product_update_time, ",
        "goods_product_deleted",
        "from lymall_goods_product",
        "where goods_product_id = #{goodsProductId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="goods_product_id", property="goodsProductId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_product_specifications", property="goodsProductSpecifications", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_product_price", property="goodsProductPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_product_number", property="goodsProductNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_product_url", property="goodsProductUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_product_add_time", property="goodsProductAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_product_update_time", property="goodsProductUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_product_deleted", property="goodsProductDeleted", jdbcType=JdbcType.BIT)
    })
    LymallGoodsProduct selectByPrimaryKey(Integer goodsProductId);

    @UpdateProvider(type=LymallGoodsProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallGoodsProduct record);

    @Update({
        "update lymall_goods_product",
        "set goods_id = #{goodsId,jdbcType=INTEGER},",
          "goods_product_specifications = #{goodsProductSpecifications,jdbcType=VARCHAR},",
          "goods_product_price = #{goodsProductPrice,jdbcType=DECIMAL},",
          "goods_product_number = #{goodsProductNumber,jdbcType=INTEGER},",
          "goods_product_url = #{goodsProductUrl,jdbcType=VARCHAR},",
          "goods_product_add_time = #{goodsProductAddTime,jdbcType=TIMESTAMP},",
          "goods_product_update_time = #{goodsProductUpdateTime,jdbcType=TIMESTAMP},",
          "goods_product_deleted = #{goodsProductDeleted,jdbcType=BIT}",
        "where goods_product_id = #{goodsProductId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallGoodsProduct record);
}