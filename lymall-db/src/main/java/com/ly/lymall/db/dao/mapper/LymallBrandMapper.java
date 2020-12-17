package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallBrandSqlProvider;
import com.ly.lymall.db.domian.LymallBrand;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallBrandMapper {
    @Delete({
        "delete from lymall_brand",
        "where brand_id = #{brandId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer brandId);

    @Insert({
        "insert into lymall_brand (brand_name, brand_desc, ",
        "brand_pic_url, brand_sort_order, ",
        "brand_floor_price, brand_add_time, ",
        "brand_update_time, brand_deleted)",
        "values (#{brandName,jdbcType=VARCHAR}, #{brandDesc,jdbcType=VARCHAR}, ",
        "#{brandPicUrl,jdbcType=VARCHAR}, #{brandSortOrder,jdbcType=TINYINT}, ",
        "#{brandFloorPrice,jdbcType=DECIMAL}, #{brandAddTime,jdbcType=TIMESTAMP}, ",
        "#{brandUpdateTime,jdbcType=TIMESTAMP}, #{brandDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="brandId", before=false, resultType=Integer.class)
    int insert(LymallBrand record);

    @InsertProvider(type= LymallBrandSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="brandId", before=false, resultType=Integer.class)
    int insertSelective(LymallBrand record);

    @Select({
        "select",
        "brand_id, brand_name, brand_desc, brand_pic_url, brand_sort_order, brand_floor_price, ",
        "brand_add_time, brand_update_time, brand_deleted",
        "from lymall_brand",
        "where brand_id = #{brandId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="brand_name", property="brandName", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_desc", property="brandDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_pic_url", property="brandPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_sort_order", property="brandSortOrder", jdbcType=JdbcType.TINYINT),
        @Result(column="brand_floor_price", property="brandFloorPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="brand_add_time", property="brandAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="brand_update_time", property="brandUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="brand_deleted", property="brandDeleted", jdbcType=JdbcType.BIT)
    })
    LymallBrand selectByPrimaryKey(Integer brandId);

    /**
     * 查询全部品牌厂商商品信息
     * @return List<LymallBrand>
     */
    @Select("select * from lymall_brand where brand_deleted=${0}")
    List<LymallBrand> selectFindAll();

    @UpdateProvider(type=LymallBrandSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallBrand record);

    @Update({
        "update lymall_brand",
        "set brand_name = #{brandName,jdbcType=VARCHAR},",
          "brand_desc = #{brandDesc,jdbcType=VARCHAR},",
          "brand_pic_url = #{brandPicUrl,jdbcType=VARCHAR},",
          "brand_sort_order = #{brandSortOrder,jdbcType=TINYINT},",
          "brand_floor_price = #{brandFloorPrice,jdbcType=DECIMAL},",
          "brand_add_time = #{brandAddTime,jdbcType=TIMESTAMP},",
          "brand_update_time = #{brandUpdateTime,jdbcType=TIMESTAMP},",
          "brand_deleted = #{brandDeleted,jdbcType=BIT}",
        "where brand_id = #{brandId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallBrand record);
}