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
     * 根据categoryId查询分类信息
     * @param categoryId
     * @return String
     */
    public String selectByPidFindCategory(Integer categoryId){
        SQL sql=new SQL();
        sql.SELECT("*")
                .FROM("lymall_category")
                .WHERE("category_pid="+categoryId)
                .AND().WHERE("category_deleted=0");

        return sql.toString();
    }

    /**
     * 根据传入的categoryName查询商品信息
     * @param categoryName
     * @return String
     */
    public String selectByCategoryFindGoods(String categoryName){
        SQL sql=new SQL();

        sql.SELECT("A.goods_id,A.goods_name,A.goods_retail_price,A.goods_pic_url,B.category_name,B.category_id,B.category_pid")
                .FROM("lymall_goods A,lymall_category B")
                .WHERE("A.category_id=B.category_id and B.category_pid=(select category_id from lymall_category where category_name='"+categoryName+"')")
                .ORDER_BY("A.goods_retail_price asc");

        return sql.toString();
    }

    /**
     * 根据Set集合中的categoryId查询分类
     * @param setListCategoryId
     * @return
     */
    public String selectByFindAllCategoryId(Set setListCategoryId){
        SQL sql=new SQL();
        sql.SELECT("*")
                .FROM("lymall_category")
                //通过获取set集合的字符串参数[1011004, 1008009, 1017000, 1008002, 1008016, 1036000]并替换中括号为圆括号进行 in 的查询操作
                .WHERE("category_id in"+setListCategoryId.toString().replace("[","(").replace("]",")"));

        return sql.toString();
    }

}