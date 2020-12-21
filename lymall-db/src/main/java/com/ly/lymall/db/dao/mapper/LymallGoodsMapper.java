package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallGoodsSqlProvider;
import com.ly.lymall.db.domian.LymallGoods;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface LymallGoodsMapper {
    /**
     * 删除
     * @param goodsId
     * @return int
     */
    @Delete({
        "delete from lymall_goods",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goodsId);

    //------------------------------------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------------------------------------
    //插入

    @Insert({
        "insert into lymall_goods (goods_sn, goods_name, ",
        "category_id, brand_id, ",
        "goods_gallery, goods_keywords, ",
        "goods_brief, goods_is_on_sale, ",
        "goods_sort_order, goods_pic_url, ",
        "goods_share_url, goods_is_new, ",
        "goods_is_hot, goods_unit, ",
        "goods_counter_price, goods_retail_price, ",
        "goods_add_time, goods_update_time, ",
        "goods_deleted, goods_detail)",
        "values (#{goodsSn,jdbcType=VARCHAR}, #{goodsName,jdbcType=VARCHAR}, ",
        "#{categoryId,jdbcType=INTEGER}, #{brandId,jdbcType=INTEGER}, ",
        "#{goodsGallery,jdbcType=VARCHAR}, #{goodsKeywords,jdbcType=VARCHAR}, ",
        "#{goodsBrief,jdbcType=VARCHAR}, #{goodsIsOnSale,jdbcType=BIT}, ",
        "#{goodsSortOrder,jdbcType=SMALLINT}, #{goodsPicUrl,jdbcType=VARCHAR}, ",
        "#{goodsShareUrl,jdbcType=VARCHAR}, #{goodsIsNew,jdbcType=BIT}, ",
        "#{goodsIsHot,jdbcType=BIT}, #{goodsUnit,jdbcType=VARCHAR}, ",
        "#{goodsCounterPrice,jdbcType=DECIMAL}, #{goodsRetailPrice,jdbcType=DECIMAL}, ",
        "#{goodsAddTime,jdbcType=TIMESTAMP}, #{goodsUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{goodsDeleted,jdbcType=BIT}, #{goodsDetail,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsId", before=false, resultType=Integer.class)
    int insert(LymallGoods record);

    @InsertProvider(type= LymallGoodsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsId", before=false, resultType=Integer.class)
    int insertSelective(LymallGoods record);

    //------------------------------------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------------------------------------
    //查询

    @Select({
        "select",
        "goods_id, goods_sn, goods_name, category_id, brand_id, goods_gallery, goods_keywords, ",
        "goods_brief, goods_is_on_sale, goods_sort_order, goods_pic_url, goods_share_url, ",
        "goods_is_new, goods_is_hot, goods_unit, goods_counter_price, goods_retail_price, ",
        "goods_add_time, goods_update_time, goods_deleted, goods_detail",
        "from lymall_goods",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    @Results(id="goodsResult",value={
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_sn", property="goodsSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_gallery", property="goodsGallery", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_keywords", property="goodsKeywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_brief", property="goodsBrief", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_is_on_sale", property="goodsIsOnSale", jdbcType=JdbcType.BIT),
        @Result(column="goods_sort_order", property="goodsSortOrder", jdbcType=JdbcType.SMALLINT),
        @Result(column="goods_pic_url", property="goodsPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_share_url", property="goodsShareUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_is_new", property="goodsIsNew", jdbcType=JdbcType.BIT),
        @Result(column="goods_is_hot", property="goodsIsHot", jdbcType=JdbcType.BIT),
        @Result(column="goods_unit", property="goodsUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_counter_price", property="goodsCounterPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_retail_price", property="goodsRetailPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_add_time", property="goodsAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_update_time", property="goodsUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_deleted", property="goodsDeleted", jdbcType=JdbcType.BIT),
        @Result(column="goods_detail", property="goodsDetail", jdbcType=JdbcType.LONGVARCHAR)
    })
    LymallGoods selectByPrimaryKey(Integer goodsId);

    /**
     * 根据字段来查询商品
     * @param productTypes 要查询的商品字段
     * @return List<LymallGoods>
     */
    @SelectProvider(value=LymallGoodsSqlProvider.class,method="selectfindAllGoods")
    List<LymallGoods> selectfindAllGoods(String productTypes);

    /**
     * 根据商品名称或关键字搜索商品并排序
     * @param keyword
     * @param orderCloumn
     * @param orderType
     * @param categoryId
     * @return List<LymallGoods>
     */
    @SelectProvider(value=LymallGoodsSqlProvider.class,method="searchProductsBasedOnKeywords")
    List<LymallGoods> searchProducts(String keyword, String orderCloumn,String orderType,Integer categoryId);

    /**
     * 获取商品总条数
     * @return int
     */
    @Select("select count(*) from lymall_goods")
    int selectByAllCount();

    //------------------------------------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------------------------------------
    //修改

    @UpdateProvider(type=LymallGoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallGoods record);

    @Update({
        "update lymall_goods",
        "set goods_sn = #{goodsSn,jdbcType=VARCHAR},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "category_id = #{categoryId,jdbcType=INTEGER},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "goods_gallery = #{goodsGallery,jdbcType=VARCHAR},",
          "goods_keywords = #{goodsKeywords,jdbcType=VARCHAR},",
          "goods_brief = #{goodsBrief,jdbcType=VARCHAR},",
          "goods_is_on_sale = #{goodsIsOnSale,jdbcType=BIT},",
          "goods_sort_order = #{goodsSortOrder,jdbcType=SMALLINT},",
          "goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR},",
          "goods_share_url = #{goodsShareUrl,jdbcType=VARCHAR},",
          "goods_is_new = #{goodsIsNew,jdbcType=BIT},",
          "goods_is_hot = #{goodsIsHot,jdbcType=BIT},",
          "goods_unit = #{goodsUnit,jdbcType=VARCHAR},",
          "goods_counter_price = #{goodsCounterPrice,jdbcType=DECIMAL},",
          "goods_retail_price = #{goodsRetailPrice,jdbcType=DECIMAL},",
          "goods_add_time = #{goodsAddTime,jdbcType=TIMESTAMP},",
          "goods_update_time = #{goodsUpdateTime,jdbcType=TIMESTAMP},",
          "goods_deleted = #{goodsDeleted,jdbcType=BIT},",
          "goods_detail = #{goodsDetail,jdbcType=LONGVARCHAR}",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(LymallGoods record);

    @Update({
        "update lymall_goods",
        "set goods_sn = #{goodsSn,jdbcType=VARCHAR},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "category_id = #{categoryId,jdbcType=INTEGER},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "goods_gallery = #{goodsGallery,jdbcType=VARCHAR},",
          "goods_keywords = #{goodsKeywords,jdbcType=VARCHAR},",
          "goods_brief = #{goodsBrief,jdbcType=VARCHAR},",
          "goods_is_on_sale = #{goodsIsOnSale,jdbcType=BIT},",
          "goods_sort_order = #{goodsSortOrder,jdbcType=SMALLINT},",
          "goods_pic_url = #{goodsPicUrl,jdbcType=VARCHAR},",
          "goods_share_url = #{goodsShareUrl,jdbcType=VARCHAR},",
          "goods_is_new = #{goodsIsNew,jdbcType=BIT},",
          "goods_is_hot = #{goodsIsHot,jdbcType=BIT},",
          "goods_unit = #{goodsUnit,jdbcType=VARCHAR},",
          "goods_counter_price = #{goodsCounterPrice,jdbcType=DECIMAL},",
          "goods_retail_price = #{goodsRetailPrice,jdbcType=DECIMAL},",
          "goods_add_time = #{goodsAddTime,jdbcType=TIMESTAMP},",
          "goods_update_time = #{goodsUpdateTime,jdbcType=TIMESTAMP},",
          "goods_deleted = #{goodsDeleted,jdbcType=BIT}",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallGoods record);
}