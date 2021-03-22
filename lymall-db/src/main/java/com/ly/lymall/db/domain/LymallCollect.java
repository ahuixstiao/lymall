package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallCollect implements Serializable {
    private Integer collectId;

    private Integer userId;

    private Integer collectValueId;

    private Byte collectType;

    private Date collectAddTime;

    private Date collectUpdateTime;

    private Boolean collectDeleted;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCollectValueId() {
        return collectValueId;
    }

    public void setCollectValueId(Integer collectValueId) {
        this.collectValueId = collectValueId;
    }

    public Byte getCollectType() {
        return collectType;
    }

    public void setCollectType(Byte collectType) {
        this.collectType = collectType;
    }

    public Date getCollectAddTime() {
        return collectAddTime;
    }

    public void setCollectAddTime(Date collectAddTime) {
        this.collectAddTime = collectAddTime;
    }

    public Date getCollectUpdateTime() {
        return collectUpdateTime;
    }

    public void setCollectUpdateTime(Date collectUpdateTime) {
        this.collectUpdateTime = collectUpdateTime;
    }

    public Boolean getCollectDeleted() {
        return collectDeleted;
    }

    public void setCollectDeleted(Boolean collectDeleted) {
        this.collectDeleted = collectDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectId=").append(collectId);
        sb.append(", userId=").append(userId);
        sb.append(", collectValueId=").append(collectValueId);
        sb.append(", collectType=").append(collectType);
        sb.append(", collectAddTime=").append(collectAddTime);
        sb.append(", collectUpdateTime=").append(collectUpdateTime);
        sb.append(", collectDeleted=").append(collectDeleted);
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
        LymallCollect other = (LymallCollect) that;
        return (this.getCollectId() == null ? other.getCollectId() == null : this.getCollectId().equals(other.getCollectId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCollectValueId() == null ? other.getCollectValueId() == null : this.getCollectValueId().equals(other.getCollectValueId()))
            && (this.getCollectType() == null ? other.getCollectType() == null : this.getCollectType().equals(other.getCollectType()))
            && (this.getCollectAddTime() == null ? other.getCollectAddTime() == null : this.getCollectAddTime().equals(other.getCollectAddTime()))
            && (this.getCollectUpdateTime() == null ? other.getCollectUpdateTime() == null : this.getCollectUpdateTime().equals(other.getCollectUpdateTime()))
            && (this.getCollectDeleted() == null ? other.getCollectDeleted() == null : this.getCollectDeleted().equals(other.getCollectDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollectId() == null) ? 0 : getCollectId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCollectValueId() == null) ? 0 : getCollectValueId().hashCode());
        result = prime * result + ((getCollectType() == null) ? 0 : getCollectType().hashCode());
        result = prime * result + ((getCollectAddTime() == null) ? 0 : getCollectAddTime().hashCode());
        result = prime * result + ((getCollectUpdateTime() == null) ? 0 : getCollectUpdateTime().hashCode());
        result = prime * result + ((getCollectDeleted() == null) ? 0 : getCollectDeleted().hashCode());
        return result;
    }
}