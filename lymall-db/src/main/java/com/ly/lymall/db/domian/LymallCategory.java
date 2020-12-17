package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallCategory implements Serializable {
    private Integer categoryId;

    private String categoryName;

    private String categoryKeywords;

    private String categoryDesc;

    private Integer categoryPid;

    private String categoryIconUrl;

    private String categoryPicUrl;

    private String categoryLevel;

    private Byte categorySortOrder;

    private Date categoryAddTime;

    private Date categoryUpdateTime;

    private Boolean categoryDeleted;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryKeywords() {
        return categoryKeywords;
    }

    public void setCategoryKeywords(String categoryKeywords) {
        this.categoryKeywords = categoryKeywords;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public String getCategoryIconUrl() {
        return categoryIconUrl;
    }

    public void setCategoryIconUrl(String categoryIconUrl) {
        this.categoryIconUrl = categoryIconUrl;
    }

    public String getCategoryPicUrl() {
        return categoryPicUrl;
    }

    public void setCategoryPicUrl(String categoryPicUrl) {
        this.categoryPicUrl = categoryPicUrl;
    }

    public String getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(String categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Byte getCategorySortOrder() {
        return categorySortOrder;
    }

    public void setCategorySortOrder(Byte categorySortOrder) {
        this.categorySortOrder = categorySortOrder;
    }

    public Date getCategoryAddTime() {
        return categoryAddTime;
    }

    public void setCategoryAddTime(Date categoryAddTime) {
        this.categoryAddTime = categoryAddTime;
    }

    public Date getCategoryUpdateTime() {
        return categoryUpdateTime;
    }

    public void setCategoryUpdateTime(Date categoryUpdateTime) {
        this.categoryUpdateTime = categoryUpdateTime;
    }

    public Boolean getCategoryDeleted() {
        return categoryDeleted;
    }

    public void setCategoryDeleted(Boolean categoryDeleted) {
        this.categoryDeleted = categoryDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryKeywords=").append(categoryKeywords);
        sb.append(", categoryDesc=").append(categoryDesc);
        sb.append(", categoryPid=").append(categoryPid);
        sb.append(", categoryIconUrl=").append(categoryIconUrl);
        sb.append(", categoryPicUrl=").append(categoryPicUrl);
        sb.append(", categoryLevel=").append(categoryLevel);
        sb.append(", categorySortOrder=").append(categorySortOrder);
        sb.append(", categoryAddTime=").append(categoryAddTime);
        sb.append(", categoryUpdateTime=").append(categoryUpdateTime);
        sb.append(", categoryDeleted=").append(categoryDeleted);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LymallCategory other = (LymallCategory) that;
        return (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryKeywords() == null ? other.getCategoryKeywords() == null : this.getCategoryKeywords().equals(other.getCategoryKeywords()))
            && (this.getCategoryDesc() == null ? other.getCategoryDesc() == null : this.getCategoryDesc().equals(other.getCategoryDesc()))
            && (this.getCategoryPid() == null ? other.getCategoryPid() == null : this.getCategoryPid().equals(other.getCategoryPid()))
            && (this.getCategoryIconUrl() == null ? other.getCategoryIconUrl() == null : this.getCategoryIconUrl().equals(other.getCategoryIconUrl()))
            && (this.getCategoryPicUrl() == null ? other.getCategoryPicUrl() == null : this.getCategoryPicUrl().equals(other.getCategoryPicUrl()))
            && (this.getCategoryLevel() == null ? other.getCategoryLevel() == null : this.getCategoryLevel().equals(other.getCategoryLevel()))
            && (this.getCategorySortOrder() == null ? other.getCategorySortOrder() == null : this.getCategorySortOrder().equals(other.getCategorySortOrder()))
            && (this.getCategoryAddTime() == null ? other.getCategoryAddTime() == null : this.getCategoryAddTime().equals(other.getCategoryAddTime()))
            && (this.getCategoryUpdateTime() == null ? other.getCategoryUpdateTime() == null : this.getCategoryUpdateTime().equals(other.getCategoryUpdateTime()))
            && (this.getCategoryDeleted() == null ? other.getCategoryDeleted() == null : this.getCategoryDeleted().equals(other.getCategoryDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryKeywords() == null) ? 0 : getCategoryKeywords().hashCode());
        result = prime * result + ((getCategoryDesc() == null) ? 0 : getCategoryDesc().hashCode());
        result = prime * result + ((getCategoryPid() == null) ? 0 : getCategoryPid().hashCode());
        result = prime * result + ((getCategoryIconUrl() == null) ? 0 : getCategoryIconUrl().hashCode());
        result = prime * result + ((getCategoryPicUrl() == null) ? 0 : getCategoryPicUrl().hashCode());
        result = prime * result + ((getCategoryLevel() == null) ? 0 : getCategoryLevel().hashCode());
        result = prime * result + ((getCategorySortOrder() == null) ? 0 : getCategorySortOrder().hashCode());
        result = prime * result + ((getCategoryAddTime() == null) ? 0 : getCategoryAddTime().hashCode());
        result = prime * result + ((getCategoryUpdateTime() == null) ? 0 : getCategoryUpdateTime().hashCode());
        result = prime * result + ((getCategoryDeleted() == null) ? 0 : getCategoryDeleted().hashCode());
        return result;
    }
}