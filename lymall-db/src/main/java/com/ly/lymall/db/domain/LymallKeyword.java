package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallKeyword implements Serializable {
    private Integer keywordId;

    private String keyword;

    private String keywordUrl;

    private Boolean keywordIsHot;

    private Boolean keywordIsDefault;

    private Integer keywordSortOrder;

    private Date keywordAddTime;

    private Date keywordUpdateTime;

    private Boolean keywordDeleted;

    public Integer getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Integer keywordId) {
        this.keywordId = keywordId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeywordUrl() {
        return keywordUrl;
    }

    public void setKeywordUrl(String keywordUrl) {
        this.keywordUrl = keywordUrl;
    }

    public Boolean getKeywordIsHot() {
        return keywordIsHot;
    }

    public void setKeywordIsHot(Boolean keywordIsHot) {
        this.keywordIsHot = keywordIsHot;
    }

    public Boolean getKeywordIsDefault() {
        return keywordIsDefault;
    }

    public void setKeywordIsDefault(Boolean keywordIsDefault) {
        this.keywordIsDefault = keywordIsDefault;
    }

    public Integer getKeywordSortOrder() {
        return keywordSortOrder;
    }

    public void setKeywordSortOrder(Integer keywordSortOrder) {
        this.keywordSortOrder = keywordSortOrder;
    }

    public Date getKeywordAddTime() {
        return keywordAddTime;
    }

    public void setKeywordAddTime(Date keywordAddTime) {
        this.keywordAddTime = keywordAddTime;
    }

    public Date getKeywordUpdateTime() {
        return keywordUpdateTime;
    }

    public void setKeywordUpdateTime(Date keywordUpdateTime) {
        this.keywordUpdateTime = keywordUpdateTime;
    }

    public Boolean getKeywordDeleted() {
        return keywordDeleted;
    }

    public void setKeywordDeleted(Boolean keywordDeleted) {
        this.keywordDeleted = keywordDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keywordId=").append(keywordId);
        sb.append(", keyword=").append(keyword);
        sb.append(", keywordUrl=").append(keywordUrl);
        sb.append(", keywordIsHot=").append(keywordIsHot);
        sb.append(", keywordIsDefault=").append(keywordIsDefault);
        sb.append(", keywordSortOrder=").append(keywordSortOrder);
        sb.append(", keywordAddTime=").append(keywordAddTime);
        sb.append(", keywordUpdateTime=").append(keywordUpdateTime);
        sb.append(", keywordDeleted=").append(keywordDeleted);
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
        LymallKeyword other = (LymallKeyword) that;
        return (this.getKeywordId() == null ? other.getKeywordId() == null : this.getKeywordId().equals(other.getKeywordId()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getKeywordUrl() == null ? other.getKeywordUrl() == null : this.getKeywordUrl().equals(other.getKeywordUrl()))
            && (this.getKeywordIsHot() == null ? other.getKeywordIsHot() == null : this.getKeywordIsHot().equals(other.getKeywordIsHot()))
            && (this.getKeywordIsDefault() == null ? other.getKeywordIsDefault() == null : this.getKeywordIsDefault().equals(other.getKeywordIsDefault()))
            && (this.getKeywordSortOrder() == null ? other.getKeywordSortOrder() == null : this.getKeywordSortOrder().equals(other.getKeywordSortOrder()))
            && (this.getKeywordAddTime() == null ? other.getKeywordAddTime() == null : this.getKeywordAddTime().equals(other.getKeywordAddTime()))
            && (this.getKeywordUpdateTime() == null ? other.getKeywordUpdateTime() == null : this.getKeywordUpdateTime().equals(other.getKeywordUpdateTime()))
            && (this.getKeywordDeleted() == null ? other.getKeywordDeleted() == null : this.getKeywordDeleted().equals(other.getKeywordDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeywordId() == null) ? 0 : getKeywordId().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getKeywordUrl() == null) ? 0 : getKeywordUrl().hashCode());
        result = prime * result + ((getKeywordIsHot() == null) ? 0 : getKeywordIsHot().hashCode());
        result = prime * result + ((getKeywordIsDefault() == null) ? 0 : getKeywordIsDefault().hashCode());
        result = prime * result + ((getKeywordSortOrder() == null) ? 0 : getKeywordSortOrder().hashCode());
        result = prime * result + ((getKeywordAddTime() == null) ? 0 : getKeywordAddTime().hashCode());
        result = prime * result + ((getKeywordUpdateTime() == null) ? 0 : getKeywordUpdateTime().hashCode());
        result = prime * result + ((getKeywordDeleted() == null) ? 0 : getKeywordDeleted().hashCode());
        return result;
    }
}