package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallCategorySqlProvider;
import com.ly.lymall.db.domian.LymallCategory;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface LymallCategoryMapper {
    @Delete({
        "delete from lymall_category",
        "where category_id = #{categoryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer categoryId);

    @Insert({
        "insert into lymall_category (category_name, category_keywords, ",
        "category_desc, category_pid, ",
        "category_icon_url, category_pic_url, ",
        "category_level, category_sort_order, ",
        "category_add_time, category_update_time, ",
        "category_deleted)",
        "values (#{categoryName,jdbcType=VARCHAR}, #{categoryKeywords,jdbcType=VARCHAR}, ",
        "#{categoryDesc,jdbcType=VARCHAR}, #{categoryPid,jdbcType=INTEGER}, ",
        "#{categoryIconUrl,jdbcType=VARCHAR}, #{categoryPicUrl,jdbcType=VARCHAR}, ",
        "#{categoryLevel,jdbcType=VARCHAR}, #{categorySortOrder,jdbcType=TINYINT}, ",
        "#{categoryAddTime,jdbcType=TIMESTAMP}, #{categoryUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{categoryDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="categoryId", before=false, resultType=Integer.class)
    int insert(LymallCategory record);

    @InsertProvider(type= LymallCategorySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="categoryId", before=false, resultType=Integer.class)
    int insertSelective(LymallCategory record);

    @Select({
        "select",
        "category_id, category_name, category_keywords, category_desc, category_pid, ",
        "category_icon_url, category_pic_url, category_level, category_sort_order, category_add_time, ",
        "category_update_time, category_deleted",
        "from lymall_category",
        "where category_id = #{categoryId,jdbcType=INTEGER}"
    })
    @Results(id ="categoryResults",value={
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="category_name", property="categoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_keywords", property="categoryKeywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_desc", property="categoryDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_pid", property="categoryPid", jdbcType=JdbcType.INTEGER),
        @Result(column="category_icon_url", property="categoryIconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_pic_url", property="categoryPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_level", property="categoryLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_sort_order", property="categorySortOrder", jdbcType=JdbcType.TINYINT),
        @Result(column="category_add_time", property="categoryAddTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="category_update_time", property="categoryUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="category_deleted", property="categoryDeleted", jdbcType=JdbcType.BIT)
    })
    LymallCategory selectByPrimaryKey(Integer categoryId);

    /**
     * 根据pid查询商品类别
     * @param categoryPid
     * @return List<LymallCategory>
     */
    @Select("select * from lymall_category where category_pid=#{categoryPid} and category_deleted=${0}")
    @ResultMap("categoryResults")
    List<LymallCategory> selectfindByCategory(Integer categoryPid);


    @UpdateProvider(type=LymallCategorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallCategory record);

    @Update({
        "update lymall_category",
        "set category_name = #{categoryName,jdbcType=VARCHAR},",
          "category_keywords = #{categoryKeywords,jdbcType=VARCHAR},",
          "category_desc = #{categoryDesc,jdbcType=VARCHAR},",
          "category_pid = #{categoryPid,jdbcType=INTEGER},",
          "category_icon_url = #{categoryIconUrl,jdbcType=VARCHAR},",
          "category_pic_url = #{categoryPicUrl,jdbcType=VARCHAR},",
          "category_level = #{categoryLevel,jdbcType=VARCHAR},",
          "category_sort_order = #{categorySortOrder,jdbcType=TINYINT},",
          "category_add_time = #{categoryAddTime,jdbcType=TIMESTAMP},",
          "category_update_time = #{categoryUpdateTime,jdbcType=TIMESTAMP},",
          "category_deleted = #{categoryDeleted,jdbcType=BIT}",
        "where category_id = #{categoryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallCategory record);
}