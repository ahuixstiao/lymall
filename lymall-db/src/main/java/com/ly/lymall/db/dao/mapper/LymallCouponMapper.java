package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallCouponSqlProvider;
import com.ly.lymall.db.domain.LymallCoupon;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallCouponMapper {
    @Delete({
        "delete from lymall_coupon",
        "where coupon_id = #{couponId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer couponId);

    @Insert({
        "insert into lymall_coupon (coupon_name, coupon_desc, ",
        "coupon_tag, coupon_total, ",
        "coupon_discount, coupon_min, ",
        "coupon_limit, coupon_type, ",
        "coupon_status, coupon_goods_type, ",
        "coupon_goods_value, coupon_code, ",
        "coupon_time_type, coupon_days, ",
        "coupon_start_time, coupon_end_time, ",
        "coupon_add_time, coupon_update_time, ",
        "coupon_deleted)",
        "values (#{couponName,jdbcType=VARCHAR}, #{couponDesc,jdbcType=VARCHAR}, ",
        "#{couponTag,jdbcType=VARCHAR}, #{couponTotal,jdbcType=INTEGER}, ",
        "#{couponDiscount,jdbcType=DECIMAL}, #{couponMin,jdbcType=DECIMAL}, ",
        "#{couponLimit,jdbcType=SMALLINT}, #{couponType,jdbcType=SMALLINT}, ",
        "#{couponStatus,jdbcType=SMALLINT}, #{couponGoodsType,jdbcType=SMALLINT}, ",
        "#{couponGoodsValue,jdbcType=VARCHAR}, #{couponCode,jdbcType=VARCHAR}, ",
        "#{couponTimeType,jdbcType=SMALLINT}, #{couponDays,jdbcType=SMALLINT}, ",
        "#{couponStartTime,jdbcType=TIMESTAMP}, #{couponEndTime,jdbcType=TIMESTAMP}, ",
        "#{couponAddTime,jdbcType=TIMESTAMP}, #{couponUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{couponDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="couponId", before=false, resultType=Integer.class)
    int insert(LymallCoupon record);

    @InsertProvider(type= LymallCouponSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="couponId", before=false, resultType=Integer.class)
    int insertSelective(LymallCoupon record);

    @Select({
        "select",
        "coupon_id, coupon_name, coupon_desc, coupon_tag, coupon_total, coupon_discount, ",
        "coupon_min, coupon_limit, coupon_type, coupon_status, coupon_goods_type, coupon_goods_value, ",
        "coupon_code, coupon_time_type, coupon_days, coupon_start_time, coupon_end_time, ",
        "coupon_add_time, coupon_update_time, coupon_deleted",
        "from lymall_coupon",
        "where coupon_id = #{couponId,jdbcType=INTEGER}"
    })
    @Results(id="couponResults",value={
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="coupon_name", property="couponName", jdbcType=JdbcType.VARCHAR),
        @Result(column="coupon_desc", property="couponDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="coupon_tag", property="couponTag", jdbcType=JdbcType.VARCHAR),
        @Result(column="coupon_total", property="couponTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_discount", property="couponDiscount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_min", property="couponMin", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_limit", property="couponLimit", jdbcType=JdbcType.SMALLINT),
        @Result(column="coupon_type", property="couponType", jdbcType=JdbcType.SMALLINT),
        @Result(column="coupon_status", property="couponStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="coupon_goods_type", property="couponGoodsType", jdbcType=JdbcType.SMALLINT),
        @Result(column="coupon_goods_value", property="couponGoodsValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="coupon_code", property="couponCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="coupon_time_type", property="couponTimeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="coupon_days", property="couponDays", jdbcType=JdbcType.SMALLINT),
        @Result(column="coupon_start_time", property="couponStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="coupon_end_time", property="couponEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="coupon_add_time", property="couponAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="coupon_update_time", property="couponUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="coupon_deleted", property="couponDeleted", jdbcType=JdbcType.BIT)
    })
    LymallCoupon selectByPrimaryKey(Integer couponId);


    /**
     * 查询所有优惠券
     * @return List<LymallCoupon>
     */
    @Select("select * from lymall_coupon where coupon_deleted=${0}")
    @ResultMap("couponResults")
    List<LymallCoupon> selectFindAll();

    /**
     * 根据couponId查询优惠券信息
     * @param couponId
     * @return LymallCoupon
     */
    @Select("select * from lymall_coupon where coupon_id=#{couponId}")
    LymallCoupon selectByCouponIdFindCouponInfo(Integer couponId);

    /**
     * 通过优惠码查找优惠券信息
     * @param code
     * @return LymallCoupon
     */
    @Select("select * from lymall_coupon where coupon_code=#{code}")
    LymallCoupon selectByPromoCodFindCoupon(String code);

    @UpdateProvider(type=LymallCouponSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallCoupon record);

    @Update({
        "update lymall_coupon",
        "set coupon_name = #{couponName,jdbcType=VARCHAR},",
          "coupon_desc = #{couponDesc,jdbcType=VARCHAR},",
          "coupon_tag = #{couponTag,jdbcType=VARCHAR},",
          "coupon_total = #{couponTotal,jdbcType=INTEGER},",
          "coupon_discount = #{couponDiscount,jdbcType=DECIMAL},",
          "coupon_min = #{couponMin,jdbcType=DECIMAL},",
          "coupon_limit = #{couponLimit,jdbcType=SMALLINT},",
          "coupon_type = #{couponType,jdbcType=SMALLINT},",
          "coupon_status = #{couponStatus,jdbcType=SMALLINT},",
          "coupon_goods_type = #{couponGoodsType,jdbcType=SMALLINT},",
          "coupon_goods_value = #{couponGoodsValue,jdbcType=VARCHAR},",
          "coupon_code = #{couponCode,jdbcType=VARCHAR},",
          "coupon_time_type = #{couponTimeType,jdbcType=SMALLINT},",
          "coupon_days = #{couponDays,jdbcType=SMALLINT},",
          "coupon_start_time = #{couponStartTime,jdbcType=TIMESTAMP},",
          "coupon_end_time = #{couponEndTime,jdbcType=TIMESTAMP},",
          "coupon_add_time = #{couponAddTime,jdbcType=TIMESTAMP},",
          "coupon_update_time = #{couponUpdateTime,jdbcType=TIMESTAMP},",
          "coupon_deleted = #{couponDeleted,jdbcType=BIT}",
        "where coupon_id = #{couponId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallCoupon record);
}