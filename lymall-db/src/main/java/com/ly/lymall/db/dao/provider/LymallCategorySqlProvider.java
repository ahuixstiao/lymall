package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallCategory;
import org.apache.ibatis.jdbc.SQL;

import java.util.Set;

public class LymallCategorySqlProvider {
    public String insertSelective(LymallCategory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_category");
        
        if (record.getCategoryName() != null) {
            sql.VALUES("category_name", "#{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryKeywords() != null) {
            sql.VALUES("category_keywords", "#{categoryKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryDesc() != null) {
            sql.VALUES("category_desc", "#{categoryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPid() != null) {
            sql.VALUES("category_pid", "#{categoryPid,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIconUrl() != null) {
            sql.VALUES("category_icon_url", "#{categoryIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPicUrl() != null) {
            sql.VALUES("category_pic_url", "#{categoryPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryLevel() != null) {
            sql.VALUES("category_level", "#{categoryLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getCategorySortOrder() != null) {
            sql.VALUES("category_sort_order", "#{categorySortOrder,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryAddTime() != null) {
            sql.VALUES("category_add_time", "#{categoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryUpdateTime() != null) {
            sql.VALUES("category_update_time", "#{categoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryDeleted() != null) {
            sql.VALUES("category_deleted", "#{categoryDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallCategory record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_category");
        
        if (record.getCategoryName() != null) {
            sql.SET("category_name = #{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryKeywords() != null) {
            sql.SET("category_keywords = #{categoryKeywords,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryDesc() != null) {
            sql.SET("category_desc = #{categoryDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPid() != null) {
            sql.SET("category_pid = #{categoryPid,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryIconUrl() != null) {
            sql.SET("category_icon_url = #{categoryIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPicUrl() != null) {
            sql.SET("category_pic_url = #{categoryPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryLevel() != null) {
            sql.SET("category_level = #{categoryLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getCategorySortOrder() != null) {
            sql.SET("category_sort_order = #{categorySortOrder,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryAddTime() != null) {
            sql.SET("category_add_time = #{categoryAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryUpdateTime() != null) {
            sql.SET("category_update_time = #{categoryUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCategoryDeleted() != null) {
            sql.SET("category_deleted = #{categoryDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("category_id = #{categoryId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * 根据categoryPid查询商品类别
     * @param categoryPid
     * @return String
     */
    public String selectByPidFindCategory(Integer categoryPid){
        SQL sql=new SQL();
        sql.SELECT("*")
                .FROM("lymall_category")
                .WHERE("category_pid="+categoryPid)
                .AND().WHERE("category_deleted=0");

        return sql.toString();
    }

    /**
     * 根据Set集合中的categoryId查询分类
     * @param setListCategoryId
     * @return String 返回sql语句
     */
    public String selectByCategoryIdFindCategoryInfo(Set setListCategoryId){
        SQL sql=new SQL();
        sql.SELECT("*")
                .FROM("lymall_category")
                //通过获取set集合的字符串参数[1011004, 1008009, 1017000, 1008002, 1008016, 1036000]并替换中括号为圆括号进行 in 的查询操作
                .WHERE("category_id in"+setListCategoryId.toString().replace("[","(").replace("]",")"));

        return sql.toString();
    }

}