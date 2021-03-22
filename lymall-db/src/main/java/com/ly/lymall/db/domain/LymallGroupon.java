package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallGroupon implements Serializable {
    private Integer grouponId;

    private Integer orderId;

    private Integer grouponNum;

    private Integer grouponRulesId;

    private Integer userId;

    private String grouponShareUrl;

    private Integer grouponCreatorId;

    private Date grouponCreatorTime;

    private Short grouponStatus;

    private Date grouponAddTime;

    private Date grouponUpdateTime;

    private Boolean grouponDeleted;

    public Integer getGrouponId() {
        return grouponId;
    }

    public void setGrouponId(Integer grouponId) {
        this.grouponId = grouponId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGrouponNum() {
        return grouponNum;
    }

    public void setGrouponNum(Integer grouponNum) {
        this.grouponNum = grouponNum;
    }

    public Integer getGrouponRulesId() {
        return grouponRulesId;
    }

    public void setGrouponRulesId(Integer grouponRulesId) {
        this.grouponRulesId = grouponRulesId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGrouponShareUrl() {
        return grouponShareUrl;
    }

    public void setGrouponShareUrl(String grouponShareUrl) {
        this.grouponShareUrl = grouponShareUrl;
    }

    public Integer getGrouponCreatorId() {
        return grouponCreatorId;
    }

    public void setGrouponCreatorId(Integer grouponCreatorId) {
        this.grouponCreatorId = grouponCreatorId;
    }

    public Date getGrouponCreatorTime() {
        return grouponCreatorTime;
    }

    public void setGrouponCreatorTime(Date grouponCreatorTime) {
        this.grouponCreatorTime = grouponCreatorTime;
    }

    public Short getGrouponStatus() {
        return grouponStatus;
    }

    public void setGrouponStatus(Short grouponStatus) {
        this.grouponStatus = grouponStatus;
    }

    public Date getGrouponAddTime() {
        return grouponAddTime;
    }

    public void setGrouponAddTime(Date grouponAddTime) {
        this.grouponAddTime = grouponAddTime;
    }

    public Date getGrouponUpdateTime() {
        return grouponUpdateTime;
    }

    public void setGrouponUpdateTime(Date grouponUpdateTime) {
        this.grouponUpdateTime = grouponUpdateTime;
    }

    public Boolean getGrouponDeleted() {
        return grouponDeleted;
    }

    public void setGrouponDeleted(Boolean grouponDeleted) {
        this.grouponDeleted = grouponDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grouponId=").append(grouponId);
        sb.append(", orderId=").append(orderId);
        sb.append(", grouponNum=").append(grouponNum);
        sb.append(", grouponRulesId=").append(grouponRulesId);
        sb.append(", userId=").append(userId);
        sb.append(", grouponShareUrl=").append(grouponShareUrl);
        sb.append(", grouponCreatorId=").append(grouponCreatorId);
        sb.append(", grouponCreatorTime=").append(grouponCreatorTime);
        sb.append(", grouponStatus=").append(grouponStatus);
        sb.append(", grouponAddTime=").append(grouponAddTime);
        sb.append(", grouponUpdateTime=").append(grouponUpdateTime);
        sb.append(", grouponDeleted=").append(grouponDeleted);
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
        LymallGroupon other = (LymallGroupon) that;
        return (this.getGrouponId() == null ? other.getGrouponId() == null : this.getGrouponId().equals(other.getGrouponId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGrouponNum() == null ? other.getGrouponNum() == null : this.getGrouponNum().equals(other.getGrouponNum()))
            && (this.getGrouponRulesId() == null ? other.getGrouponRulesId() == null : this.getGrouponRulesId().equals(other.getGrouponRulesId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGrouponShareUrl() == null ? other.getGrouponShareUrl() == null : this.getGrouponShareUrl().equals(other.getGrouponShareUrl()))
            && (this.getGrouponCreatorId() == null ? other.getGrouponCreatorId() == null : this.getGrouponCreatorId().equals(other.getGrouponCreatorId()))
            && (this.getGrouponCreatorTime() == null ? other.getGrouponCreatorTime() == null : this.getGrouponCreatorTime().equals(other.getGrouponCreatorTime()))
            && (this.getGrouponStatus() == null ? other.getGrouponStatus() == null : this.getGrouponStatus().equals(other.getGrouponStatus()))
            && (this.getGrouponAddTime() == null ? other.getGrouponAddTime() == null : this.getGrouponAddTime().equals(other.getGrouponAddTime()))
            && (this.getGrouponUpdateTime() == null ? other.getGrouponUpdateTime() == null : this.getGrouponUpdateTime().equals(other.getGrouponUpdateTime()))
            && (this.getGrouponDeleted() == null ? other.getGrouponDeleted() == null : this.getGrouponDeleted().equals(other.getGrouponDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrouponId() == null) ? 0 : getGrouponId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGrouponNum() == null) ? 0 : getGrouponNum().hashCode());
        result = prime * result + ((getGrouponRulesId() == null) ? 0 : getGrouponRulesId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGrouponShareUrl() == null) ? 0 : getGrouponShareUrl().hashCode());
        result = prime * result + ((getGrouponCreatorId() == null) ? 0 : getGrouponCreatorId().hashCode());
        result = prime * result + ((getGrouponCreatorTime() == null) ? 0 : getGrouponCreatorTime().hashCode());
        result = prime * result + ((getGrouponStatus() == null) ? 0 : getGrouponStatus().hashCode());
        result = prime * result + ((getGrouponAddTime() == null) ? 0 : getGrouponAddTime().hashCode());
        result = prime * result + ((getGrouponUpdateTime() == null) ? 0 : getGrouponUpdateTime().hashCode());
        result = prime * result + ((getGrouponDeleted() == null) ? 0 : getGrouponDeleted().hashCode());
        return result;
    }
}