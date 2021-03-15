package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class LymallSearchHistory implements Serializable {
    private Integer searchHistoryId;

    private Integer userId;

    private String searchKeyword;

    private String searchFrom;

    private LocalDateTime searchHistoryAddTime;

    private LocalDateTime searchHistoryUpdateTime;

    private Boolean searchHistoryDeleted;

    public Integer getSearchHistoryId() {
        return searchHistoryId;
    }

    public void setSearchHistoryId(Integer searchHistoryId) {
        this.searchHistoryId = searchHistoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public String getSearchFrom() {
        return searchFrom;
    }

    public void setSearchFrom(String searchFrom) {
        this.searchFrom = searchFrom;
    }

    public LocalDateTime getSearchHistoryAddTime() {
        return searchHistoryAddTime;
    }

    public void setSearchHistoryAddTime(LocalDateTime searchHistoryAddTime) {
        this.searchHistoryAddTime = searchHistoryAddTime;
    }

    public LocalDateTime getSearchHistoryUpdateTime() {
        return searchHistoryUpdateTime;
    }

    public void setSearchHistoryUpdateTime(LocalDateTime searchHistoryUpdateTime) {
        this.searchHistoryUpdateTime = searchHistoryUpdateTime;
    }

    public Boolean getSearchHistoryDeleted() {
        return searchHistoryDeleted;
    }

    public void setSearchHistoryDeleted(Boolean searchHistoryDeleted) {
        this.searchHistoryDeleted = searchHistoryDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", searchHistoryId=").append(searchHistoryId);
        sb.append(", userId=").append(userId);
        sb.append(", searchKeyword=").append(searchKeyword);
        sb.append(", searchFrom=").append(searchFrom);
        sb.append(", searchHistoryAddTime=").append(searchHistoryAddTime);
        sb.append(", searchHistoryUpdateTime=").append(searchHistoryUpdateTime);
        sb.append(", searchHistoryDeleted=").append(searchHistoryDeleted);
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
        LymallSearchHistory other = (LymallSearchHistory) that;
        return (this.getSearchHistoryId() == null ? other.getSearchHistoryId() == null : this.getSearchHistoryId().equals(other.getSearchHistoryId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSearchKeyword() == null ? other.getSearchKeyword() == null : this.getSearchKeyword().equals(other.getSearchKeyword()))
            && (this.getSearchFrom() == null ? other.getSearchFrom() == null : this.getSearchFrom().equals(other.getSearchFrom()))
            && (this.getSearchHistoryAddTime() == null ? other.getSearchHistoryAddTime() == null : this.getSearchHistoryAddTime().equals(other.getSearchHistoryAddTime()))
            && (this.getSearchHistoryUpdateTime() == null ? other.getSearchHistoryUpdateTime() == null : this.getSearchHistoryUpdateTime().equals(other.getSearchHistoryUpdateTime()))
            && (this.getSearchHistoryDeleted() == null ? other.getSearchHistoryDeleted() == null : this.getSearchHistoryDeleted().equals(other.getSearchHistoryDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSearchHistoryId() == null) ? 0 : getSearchHistoryId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSearchKeyword() == null) ? 0 : getSearchKeyword().hashCode());
        result = prime * result + ((getSearchFrom() == null) ? 0 : getSearchFrom().hashCode());
        result = prime * result + ((getSearchHistoryAddTime() == null) ? 0 : getSearchHistoryAddTime().hashCode());
        result = prime * result + ((getSearchHistoryUpdateTime() == null) ? 0 : getSearchHistoryUpdateTime().hashCode());
        result = prime * result + ((getSearchHistoryDeleted() == null) ? 0 : getSearchHistoryDeleted().hashCode());
        return result;
    }
}