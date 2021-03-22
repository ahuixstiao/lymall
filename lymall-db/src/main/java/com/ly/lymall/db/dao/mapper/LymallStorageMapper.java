package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallStorageSqlProvider;
import com.ly.lymall.db.domain.LymallStorage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LymallStorageMapper {
    @Delete({
        "delete from lymall_storage",
        "where storage_id = #{storageId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer storageId);

    @Insert({
        "insert into lymall_storage (storage_key, storage_name, ",
        "storage_type, storage_size, ",
        "storage_url, storage_add_time, ",
        "storage_update_time, storage_deleted)",
        "values (#{storageKey,jdbcType=VARCHAR}, #{storageName,jdbcType=VARCHAR}, ",
        "#{storageType,jdbcType=VARCHAR}, #{storageSize,jdbcType=INTEGER}, ",
        "#{storageUrl,jdbcType=VARCHAR}, #{storageAddTime,jdbcType=TIMESTAMP}, ",
        "#{storageUpdateTime,jdbcType=TIMESTAMP}, #{storageDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="storageId", before=false, resultType=Integer.class)
    int insert(LymallStorage record);

    @InsertProvider(type= LymallStorageSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="storageId", before=false, resultType=Integer.class)
    int insertSelective(LymallStorage record);

    @Select({
        "select",
        "storage_id, storage_key, storage_name, storage_type, storage_size, storage_url, ",
        "storage_add_time, storage_update_time, storage_deleted",
        "from lymall_storage",
        "where storage_id = #{storageId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="storage_id", property="storageId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="storage_key", property="storageKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_name", property="storageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_type", property="storageType", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_size", property="storageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="storage_url", property="storageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_add_time", property="storageAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="storage_update_time", property="storageUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="storage_deleted", property="storageDeleted", jdbcType=JdbcType.BIT)
    })
    LymallStorage selectByPrimaryKey(Integer storageId);

    @UpdateProvider(type=LymallStorageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallStorage record);

    @Update({
        "update lymall_storage",
        "set storage_key = #{storageKey,jdbcType=VARCHAR},",
          "storage_name = #{storageName,jdbcType=VARCHAR},",
          "storage_type = #{storageType,jdbcType=VARCHAR},",
          "storage_size = #{storageSize,jdbcType=INTEGER},",
          "storage_url = #{storageUrl,jdbcType=VARCHAR},",
          "storage_add_time = #{storageAddTime,jdbcType=TIMESTAMP},",
          "storage_update_time = #{storageUpdateTime,jdbcType=TIMESTAMP},",
          "storage_deleted = #{storageDeleted,jdbcType=BIT}",
        "where storage_id = #{storageId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallStorage record);
}