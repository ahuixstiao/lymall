package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallAddressSqlProvider;
import com.ly.lymall.db.domain.LymallAddress;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallAddressMapper {
    @Delete({
        "delete from lymall_address",
        "where address_id = #{addressId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer addressId);

    @Insert({
        "insert into lymall_address (address_name, user_id, ",
        "region_province_id, region_city_id, ",
        "region_county_id, address_address_detail, ",
        "address_area_code, address_postal_code, ",
        "address_tel, address_is_default, ",
        "address_add_time, address_update_time, ",
        "address_deleted)",
        "values (#{addressName,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{regionProvinceId,jdbcType=VARCHAR}, #{regionCityId,jdbcType=VARCHAR}, ",
        "#{regionCountyId,jdbcType=VARCHAR}, #{addressAddressDetail,jdbcType=VARCHAR}, ",
        "#{addressAreaCode,jdbcType=CHAR}, #{addressPostalCode,jdbcType=CHAR}, ",
        "#{addressTel,jdbcType=VARCHAR}, #{addressIsDefault,jdbcType=BIT}, ",
        "#{addressAddTime,jdbcType=TIMESTAMP}, #{addressUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{addressDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="addressId", before=false, resultType=Integer.class)
    int insert(LymallAddress record);

    @InsertProvider(type= LymallAddressSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="addressId", before=false, resultType=Integer.class)
    int insertSelective(LymallAddress record);

    @Select({
        "select",
        "address_id, address_name, user_id, region_province_id, region_city_id, region_county_id, ",
        "address_address_detail, address_area_code, address_postal_code, address_tel, ",
        "address_is_default, address_add_time, address_update_time, address_deleted",
        "from lymall_address",
        "where address_id = #{addressId,jdbcType=INTEGER}"
    })
    @Results(id="addressResult",value={
        @Result(column="address_id", property="addressId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address_name", property="addressName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="region_province_id", property="regionProvinceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="region_city_id", property="regionCityId", jdbcType=JdbcType.VARCHAR),
        @Result(column="region_county_id", property="regionCountyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_address_detail", property="addressAddressDetail", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_area_code", property="addressAreaCode", jdbcType=JdbcType.CHAR),
        @Result(column="address_postal_code", property="addressPostalCode", jdbcType=JdbcType.CHAR),
        @Result(column="address_tel", property="addressTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_is_default", property="addressIsDefault", jdbcType=JdbcType.BIT),
        @Result(column="address_add_time", property="addressAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="address_update_time", property="addressUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="address_deleted", property="addressDeleted", jdbcType=JdbcType.BIT)
    })
    LymallAddress selectByPrimaryKey(Integer addressId);

    /**
     * 根据id查询用户收货地址信息
     * @param userId
     * @return
     */
    @Select("select * from lymall_address where user_id=#{user_id} and address_deleted=${0}")
    @ResultMap("addressResult")
    List<LymallAddress> selectFindAllAddRess(Integer userId);


    @UpdateProvider(type=LymallAddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallAddress record);

    @Update({
        "update lymall_address",
        "set address_name = #{addressName,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "region_province_id = #{regionProvinceId,jdbcType=VARCHAR},",
          "region_city_id = #{regionCityId,jdbcType=VARCHAR},",
          "region_county_id = #{regionCountyId,jdbcType=VARCHAR},",
          "address_address_detail = #{addressAddressDetail,jdbcType=VARCHAR},",
          "address_area_code = #{addressAreaCode,jdbcType=CHAR},",
          "address_postal_code = #{addressPostalCode,jdbcType=CHAR},",
          "address_tel = #{addressTel,jdbcType=VARCHAR},",
          "address_is_default = #{addressIsDefault,jdbcType=BIT},",
          "address_add_time = #{addressAddTime,jdbcType=TIMESTAMP},",
          "address_update_time = #{addressUpdateTime,jdbcType=TIMESTAMP},",
          "address_deleted = #{addressDeleted,jdbcType=BIT}",
        "where address_id = #{addressId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallAddress record);
}