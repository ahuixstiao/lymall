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

    /**
     * 根据goodsId查询商品信息
     * @param goodsId
     * @return
     */
    @Select("select * from lymall_goods where goods_id=#{goodsId}")
    LymallGoods selectByPrimaryKey(Integer goodsId);

    /**
     * 查询热门或新品商品信息
     * @param productTypes 要查询的商品字段
     * @return List<LymallGoods>
     */
    @SelectProvider(value=LymallGoodsSqlProvider.class,method="selectByHotOrNewGoodsFieldFindGoodsInfo")
    List<LymallGoods> selectByHotOrNewGoodsFindInfo(String productTypes);

    /**
     * 根据商品名称或关键字搜索商品并排序
     * @param keyword
     * @param orderCloumn
     * @param orderType
     * @param categoryId
     * @return List<LymallGoods>
     */
    @SelectProvider(value=LymallGoodsSqlProvider.class,method="searchProductsBasedOnKeywords")
    List<LymallGoods> selectBySearchProducts(String keyword, String orderCloumn,String orderType,Integer categoryId);

    /**
     * 根据关键字搜索商品名称
     * @param keyword
     * @return List<LymallGoods>
     */
    @SelectProvider(value=LymallGoodsSqlProvider.class,method="slectByGiveHintsBasedOnKeywords")
    List<LymallGoods> selectByKeywordSearchGoodsName(String keyword);

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