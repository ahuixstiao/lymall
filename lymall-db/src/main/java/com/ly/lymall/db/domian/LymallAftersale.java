package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallAftersale implements Serializable {
    private Integer aftersaleId;

    private String aftersaleSn;

    private Integer orderId;

    private Integer userId;

    private Short aftersaleType;

    private String aftersaleReason;

    private BigDecimal aftersaleAmount;

    private String aftersalePictures;

    private String aftersaleComment;

    private Short aftersaleStatus;

    private Date aftersaleHandleTime;

    private Date aftersaleAddTime;

    private Date aftersaleUpdateTime;

    private Boolean aftersaleDeleted;

    public Integer getAftersaleId() {
        return aftersaleId;
    }

    public void setAftersaleId(Integer aftersaleId) {
        this.aftersaleId = aftersaleId;
    }

    public String getAftersaleSn() {
        return aftersaleSn;
    }

    public void setAftersaleSn(String aftersaleSn) {
        this.aftersaleSn = aftersaleSn;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Short getAftersaleType() {
        return aftersaleType;
    }

    public void setAftersaleType(Short aftersaleType) {
        this.aftersaleType = aftersaleType;
    }

    public String getAftersaleReason() {
        return aftersaleReason;
    }

    public void setAftersaleReason(String aftersaleReason) {
        this.aftersaleReason = aftersaleReason;
    }

    public BigDecimal getAftersaleAmount() {
        return aftersaleAmount;
    }

    public void setAftersaleAmount(BigDecimal aftersaleAmount) {
        this.aftersaleAmount = aftersaleAmount;
    }

    public String getAftersalePictures() {
        return aftersalePictures;
    }

    public void setAftersalePictures(String aftersalePictures) {
        this.aftersalePictures = aftersalePictures;
    }

    public String getAftersaleComment() {
        return aftersaleComment;
    }

    public void setAftersaleComment(String aftersaleComment) {
        this.aftersaleComment = aftersaleComment;
    }

    public Short getAftersaleStatus() {
        return aftersaleStatus;
    }

    public void setAftersaleStatus(Short aftersaleStatus) {
        this.aftersaleStatus = aftersaleStatus;
    }

    public Date getAftersaleHandleTime() {
        return aftersaleHandleTime;
    }

    public void setAftersaleHandleTime(Date aftersaleHandleTime) {
        this.aftersaleHandleTime = aftersaleHandleTime;
    }

    public Date getAftersaleAddTime() {
        return aftersaleAddTime;
    }

    public void setAftersaleAddTime(Date aftersaleAddTime) {
        this.aftersaleAddTime = aftersaleAddTime;
    }

    public Date getAftersaleUpdateTime() {
        return aftersaleUpdateTime;
    }

    public void setAftersaleUpdateTime(Date aftersaleUpdateTime) {
        this.aftersaleUpdateTime = aftersaleUpdateTime;
    }

    public Boolean getAftersaleDeleted() {
        return aftersaleDeleted;
    }

    public void setAftersaleDeleted(Boolean aftersaleDeleted) {
        this.aftersaleDeleted = aftersaleDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aftersaleId=").append(aftersaleId);
        sb.append(", aftersaleSn=").append(aftersaleSn);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", aftersaleType=").append(aftersaleType);
        sb.append(", aftersaleReason=").append(aftersaleReason);
        sb.append(", aftersaleAmount=").append(aftersaleAmount);
        sb.append(", aftersalePictures=").append(aftersalePictures);
        sb.append(", aftersaleComment=").append(aftersaleComment);
        sb.append(", aftersaleStatus=").append(aftersaleStatus);
        sb.append(", aftersaleHandleTime=").append(aftersaleHandleTime);
        sb.append(", aftersaleAddTime=").append(aftersaleAddTime);
        sb.append(", aftersaleUpdateTime=").append(aftersaleUpdateTime);
        sb.append(", aftersaleDeleted=").append(aftersaleDeleted);
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
        LymallAftersale other = (LymallAftersale) that;
        return (this.getAftersaleId() == null ? other.getAftersaleId() == null : this.getAftersaleId().equals(other.getAftersaleId()))
            && (this.getAftersaleSn() == null ? other.getAftersaleSn() == null : this.getAftersaleSn().equals(other.getAftersaleSn()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAftersaleType() == null ? other.getAftersaleType() == null : this.getAftersaleType().equals(other.getAftersaleType()))
            && (this.getAftersaleReason() == null ? other.getAftersaleReason() == null : this.getAftersaleReason().equals(other.getAftersaleReason()))
            && (this.getAftersaleAmount() == null ? other.getAftersaleAmount() == null : this.getAftersaleAmount().equals(other.getAftersaleAmount()))
            && (this.getAftersalePictures() == null ? other.getAftersalePictures() == null : this.getAftersalePictures().equals(other.getAftersalePictures()))
            && (this.getAftersaleComment() == null ? other.getAftersaleComment() == null : this.getAftersaleComment().equals(other.getAftersaleComment()))
            && (this.getAftersaleStatus() == null ? other.getAftersaleStatus() == null : this.getAftersaleStatus().equals(other.getAftersaleStatus()))
            && (this.getAftersaleHandleTime() == null ? other.getAftersaleHandleTime() == null : this.getAftersaleHandleTime().equals(other.getAftersaleHandleTime()))
            && (this.getAftersaleAddTime() == null ? other.getAftersaleAddTime() == null : this.getAftersaleAddTime().equals(other.getAftersaleAddTime()))
            && (this.getAftersaleUpdateTime() == null ? other.getAftersaleUpdateTime() == null : this.getAftersaleUpdateTime().equals(other.getAftersaleUpdateTime()))
            && (this.getAftersaleDeleted() == null ? other.getAftersaleDeleted() == null : this.getAftersaleDeleted().equals(other.getAftersaleDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAftersaleId() == null) ? 0 : getAftersaleId().hashCode());
        result = prime * result + ((getAftersaleSn() == null) ? 0 : getAftersaleSn().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAftersaleType() == null) ? 0 : getAftersaleType().hashCode());
        result = prime * result + ((getAftersaleReason() == null) ? 0 : getAftersaleReason().hashCode());
        result = prime * result + ((getAftersaleAmount() == null) ? 0 : getAftersaleAmount().hashCode());
        result = prime * result + ((getAftersalePictures() == null) ? 0 : getAftersalePictures().hashCode());
        result = prime * result + ((getAftersaleComment() == null) ? 0 : getAftersaleComment().hashCode());
        result = prime * result + ((getAftersaleStatus() == null) ? 0 : getAftersaleStatus().hashCode());
        result = prime * result + ((getAftersaleHandleTime() == null) ? 0 : getAftersaleHandleTime().hashCode());
        result = prime * result + ((getAftersaleAddTime() == null) ? 0 : getAftersaleAddTime().hashCode());
        result = prime * result + ((getAftersaleUpdateTime() == null) ? 0 : getAftersaleUpdateTime().hashCode());
        result = prime * result + ((getAftersaleDeleted() == null) ? 0 : getAftersaleDeleted().hashCode());
        return result;
    }
}