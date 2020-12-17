package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallCouponUser implements Serializable {
    private Integer couponUserId;

    private Integer userId;

    private Integer couponId;

    private Short couponUserStatus;

    private Date couponUserUsedTime;

    private Date couponUserStartTime;

    private Date couponUserEndTime;

    private Integer orderId;

    private Date couponUserAddTime;

    private Date couponUserUpdateTime;

    private Boolean couponUserDeleted;

    public Integer getCouponUserId() {
        return couponUserId;
    }

    public void setCouponUserId(Integer couponUserId) {
        this.couponUserId = couponUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Short getCouponUserStatus() {
        return couponUserStatus;
    }

    public void setCouponUserStatus(Short couponUserStatus) {
        this.couponUserStatus = couponUserStatus;
    }

    public Date getCouponUserUsedTime() {
        return couponUserUsedTime;
    }

    public void setCouponUserUsedTime(Date couponUserUsedTime) {
        this.couponUserUsedTime = couponUserUsedTime;
    }

    public Date getCouponUserStartTime() {
        return couponUserStartTime;
    }

    public void setCouponUserStartTime(Date couponUserStartTime) {
        this.couponUserStartTime = couponUserStartTime;
    }

    public Date getCouponUserEndTime() {
        return couponUserEndTime;
    }

    public void setCouponUserEndTime(Date couponUserEndTime) {
        this.couponUserEndTime = couponUserEndTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCouponUserAddTime() {
        return couponUserAddTime;
    }

    public void setCouponUserAddTime(Date couponUserAddTime) {
        this.couponUserAddTime = couponUserAddTime;
    }

    public Date getCouponUserUpdateTime() {
        return couponUserUpdateTime;
    }

    public void setCouponUserUpdateTime(Date couponUserUpdateTime) {
        this.couponUserUpdateTime = couponUserUpdateTime;
    }

    public Boolean getCouponUserDeleted() {
        return couponUserDeleted;
    }

    public void setCouponUserDeleted(Boolean couponUserDeleted) {
        this.couponUserDeleted = couponUserDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponUserId=").append(couponUserId);
        sb.append(", userId=").append(userId);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponUserStatus=").append(couponUserStatus);
        sb.append(", couponUserUsedTime=").append(couponUserUsedTime);
        sb.append(", couponUserStartTime=").append(couponUserStartTime);
        sb.append(", couponUserEndTime=").append(couponUserEndTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", couponUserAddTime=").append(couponUserAddTime);
        sb.append(", couponUserUpdateTime=").append(couponUserUpdateTime);
        sb.append(", couponUserDeleted=").append(couponUserDeleted);
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
        LymallCouponUser other = (LymallCouponUser) that;
        return (this.getCouponUserId() == null ? other.getCouponUserId() == null : this.getCouponUserId().equals(other.getCouponUserId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCouponUserStatus() == null ? other.getCouponUserStatus() == null : this.getCouponUserStatus().equals(other.getCouponUserStatus()))
            && (this.getCouponUserUsedTime() == null ? other.getCouponUserUsedTime() == null : this.getCouponUserUsedTime().equals(other.getCouponUserUsedTime()))
            && (this.getCouponUserStartTime() == null ? other.getCouponUserStartTime() == null : this.getCouponUserStartTime().equals(other.getCouponUserStartTime()))
            && (this.getCouponUserEndTime() == null ? other.getCouponUserEndTime() == null : this.getCouponUserEndTime().equals(other.getCouponUserEndTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getCouponUserAddTime() == null ? other.getCouponUserAddTime() == null : this.getCouponUserAddTime().equals(other.getCouponUserAddTime()))
            && (this.getCouponUserUpdateTime() == null ? other.getCouponUserUpdateTime() == null : this.getCouponUserUpdateTime().equals(other.getCouponUserUpdateTime()))
            && (this.getCouponUserDeleted() == null ? other.getCouponUserDeleted() == null : this.getCouponUserDeleted().equals(other.getCouponUserDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponUserId() == null) ? 0 : getCouponUserId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponUserStatus() == null) ? 0 : getCouponUserStatus().hashCode());
        result = prime * result + ((getCouponUserUsedTime() == null) ? 0 : getCouponUserUsedTime().hashCode());
        result = prime * result + ((getCouponUserStartTime() == null) ? 0 : getCouponUserStartTime().hashCode());
        result = prime * result + ((getCouponUserEndTime() == null) ? 0 : getCouponUserEndTime().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getCouponUserAddTime() == null) ? 0 : getCouponUserAddTime().hashCode());
        result = prime * result + ((getCouponUserUpdateTime() == null) ? 0 : getCouponUserUpdateTime().hashCode());
        result = prime * result + ((getCouponUserDeleted() == null) ? 0 : getCouponUserDeleted().hashCode());
        return result;
    }
}