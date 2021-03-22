package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallRegionSqlProvider;
import com.ly.lymall.db.domain.LymallRegion;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallRegionMapper {
    @Delete({
        "delete from lymall_region",
        "where region_id = #{regionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer regionId);

    @Insert({
        "insert into lymall_region (region_pid, region_name, ",
        "region_type, region_code)",
        "values (#{regionPid,jdbcType=INTEGER}, #{regionName,jdbcType=VARCHAR}, ",
        "#{regionType,jdbcType=TINYINT}, #{regionCode,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="regionId", before=false, resultType=Integer.class)
    int insert(LymallRegion record);

    @InsertProvider(type= LymallRegionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="regionId", before=false, resultType=Integer.class)
    int insertSelective(LymallRegion record);

    @Select({
        "select",
        "region_id, region_pid, region_name, region_type, region_code",
        "from lymall_region",
        "where region_id = #{regionId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="region_id", property="regionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="region_pid", property="regionPid", jdbcType=JdbcType.INTEGER),
        @Result(column="region_name", property="regionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="region_type", property="regionType", jdbcType=JdbcType.TINYINT),
        @Result(column="region_code", property="regionCode", jdbcType=JdbcType.INTEGER)
    })
    LymallRegion selectByPrimaryKey(Integer regionId);

    @UpdateProvider(type=LymallRegionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallRegion record);

    @Update({
        "update lymall_region",
        "set region_pid = #{regionPid,jdbcType=INTEGER},",
          "region_name = #{regionName,jdbcType=VARCHAR},",
          "region_type = #{regionType,jdbcType=TINYINT},",
          "region_code = #{regionCode,jdbcType=INTEGER}",
        "where region_id = #{regionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallRegion record);
}