package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallCoupon implements Serializable {
    private Integer couponId;

    private String couponName;

    private String couponDesc;

    private String couponTag;

    private Integer couponTotal;

    private BigDecimal couponDiscount;

    private BigDecimal couponMin;

    private Short couponLimit;

    private Short couponType;

    private Short couponStatus;

    private Short couponGoodsType;

    private String couponGoodsValue;

    private String couponCode;

    private Short couponTimeType;

    private Short couponDays;

    private Date couponStartTime;

    private Date couponEndTime;

    private Date couponAddTime;

    private Date couponUpdateTime;

    private Boolean couponDeleted;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    public String getCouponTag() {
        return couponTag;
    }

    public void setCouponTag(String couponTag) {
        this.couponTag = couponTag;
    }

    public Integer getCouponTotal() {
        return couponTotal;
    }

    public void setCouponTotal(Integer couponTotal) {
        this.couponTotal = couponTotal;
    }

    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal getCouponMin() {
        return couponMin;
    }

    public void setCouponMin(BigDecimal couponMin) {
        this.couponMin = couponMin;
    }

    public Short getCouponLimit() {
        return couponLimit;
    }

    public void setCouponLimit(Short couponLimit) {
        this.couponLimit = couponLimit;
    }

    public Short getCouponType() {
        return couponType;
    }

    public void setCouponType(Short couponType) {
        this.couponType = couponType;
    }

    public Short getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Short couponStatus) {
        this.couponStatus = couponStatus;
    }

    public Short getCouponGoodsType() {
        return couponGoodsType;
    }

    public void setCouponGoodsType(Short couponGoodsType) {
        this.couponGoodsType = couponGoodsType;
    }

    public String getCouponGoodsValue() {
        return couponGoodsValue;
    }

    public void setCouponGoodsValue(String couponGoodsValue) {
        this.couponGoodsValue = couponGoodsValue;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Short getCouponTimeType() {
        return couponTimeType;
    }

    public void setCouponTimeType(Short couponTimeType) {
        this.couponTimeType = couponTimeType;
    }

    public Short getCouponDays() {
        return couponDays;
    }

    public void setCouponDays(Short couponDays) {
        this.couponDays = couponDays;
    }

    public Date getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public Date getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public Date getCouponAddTime() {
        return couponAddTime;
    }

    public void setCouponAddTime(Date couponAddTime) {
        this.couponAddTime = couponAddTime;
    }

    public Date getCouponUpdateTime() {
        return couponUpdateTime;
    }

    public void setCouponUpdateTime(Date couponUpdateTime) {
        this.couponUpdateTime = couponUpdateTime;
    }

    public Boolean getCouponDeleted() {
        return couponDeleted;
    }

    public void setCouponDeleted(Boolean couponDeleted) {
        this.couponDeleted = couponDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponId=").append(couponId);
        sb.append(", couponName=").append(couponName);
        sb.append(", couponDesc=").append(couponDesc);
        sb.append(", couponTag=").append(couponTag);
        sb.append(", couponTotal=").append(couponTotal);
        sb.append(", couponDiscount=").append(couponDiscount);
        sb.append(", couponMin=").append(couponMin);
        sb.append(", couponLimit=").append(couponLimit);
        sb.append(", couponType=").append(couponType);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", couponGoodsType=").append(couponGoodsType);
        sb.append(", couponGoodsValue=").append(couponGoodsValue);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", couponTimeType=").append(couponTimeType);
        sb.append(", couponDays=").append(couponDays);
        sb.append(", couponStartTime=").append(couponStartTime);
        sb.append(", couponEndTime=").append(couponEndTime);
        sb.append(", couponAddTime=").append(couponAddTime);
        sb.append(", couponUpdateTime=").append(couponUpdateTime);
        sb.append(", couponDeleted=").append(couponDeleted);
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
        LymallCoupon other = (LymallCoupon) that;
        return (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCouponName() == null ? other.getCouponName() == null : this.getCouponName().equals(other.getCouponName()))
            && (this.getCouponDesc() == null ? other.getCouponDesc() == null : this.getCouponDesc().equals(other.getCouponDesc()))
            && (this.getCouponTag() == null ? other.getCouponTag() == null : this.getCouponTag().equals(other.getCouponTag()))
            && (this.getCouponTotal() == null ? other.getCouponTotal() == null : this.getCouponTotal().equals(other.getCouponTotal()))
            && (this.getCouponDiscount() == null ? other.getCouponDiscount() == null : this.getCouponDiscount().equals(other.getCouponDiscount()))
            && (this.getCouponMin() == null ? other.getCouponMin() == null : this.getCouponMin().equals(other.getCouponMin()))
            && (this.getCouponLimit() == null ? other.getCouponLimit() == null : this.getCouponLimit().equals(other.getCouponLimit()))
            && (this.getCouponType() == null ? other.getCouponType() == null : this.getCouponType().equals(other.getCouponType()))
            && (this.getCouponStatus() == null ? other.getCouponStatus() == null : this.getCouponStatus().equals(other.getCouponStatus()))
            && (this.getCouponGoodsType() == null ? other.getCouponGoodsType() == null : this.getCouponGoodsType().equals(other.getCouponGoodsType()))
            && (this.getCouponGoodsValue() == null ? other.getCouponGoodsValue() == null : this.getCouponGoodsValue().equals(other.getCouponGoodsValue()))
            && (this.getCouponCode() == null ? other.getCouponCode() == null : this.getCouponCode().equals(other.getCouponCode()))
            && (this.getCouponTimeType() == null ? other.getCouponTimeType() == null : this.getCouponTimeType().equals(other.getCouponTimeType()))
            && (this.getCouponDays() == null ? other.getCouponDays() == null : this.getCouponDays().equals(other.getCouponDays()))
            && (this.getCouponStartTime() == null ? other.getCouponStartTime() == null : this.getCouponStartTime().equals(other.getCouponStartTime()))
            && (this.getCouponEndTime() == null ? other.getCouponEndTime() == null : this.getCouponEndTime().equals(other.getCouponEndTime()))
            && (this.getCouponAddTime() == null ? other.getCouponAddTime() == null : this.getCouponAddTime().equals(other.getCouponAddTime()))
            && (this.getCouponUpdateTime() == null ? other.getCouponUpdateTime() == null : this.getCouponUpdateTime().equals(other.getCouponUpdateTime()))
            && (this.getCouponDeleted() == null ? other.getCouponDeleted() == null : this.getCouponDeleted().equals(other.getCouponDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponName() == null) ? 0 : getCouponName().hashCode());
        result = prime * result + ((getCouponDesc() == null) ? 0 : getCouponDesc().hashCode());
        result = prime * result + ((getCouponTag() == null) ? 0 : getCouponTag().hashCode());
        result = prime * result + ((getCouponTotal() == null) ? 0 : getCouponTotal().hashCode());
        result = prime * result + ((getCouponDiscount() == null) ? 0 : getCouponDiscount().hashCode());
        result = prime * result + ((getCouponMin() == null) ? 0 : getCouponMin().hashCode());
        result = prime * result + ((getCouponLimit() == null) ? 0 : getCouponLimit().hashCode());
        result = prime * result + ((getCouponType() == null) ? 0 : getCouponType().hashCode());
        result = prime * result + ((getCouponStatus() == null) ? 0 : getCouponStatus().hashCode());
        result = prime * result + ((getCouponGoodsType() == null) ? 0 : getCouponGoodsType().hashCode());
        result = prime * result + ((getCouponGoodsValue() == null) ? 0 : getCouponGoodsValue().hashCode());
        result = prime * result + ((getCouponCode() == null) ? 0 : getCouponCode().hashCode());
        result = prime * result + ((getCouponTimeType() == null) ? 0 : getCouponTimeType().hashCode());
        result = prime * result + ((getCouponDays() == null) ? 0 : getCouponDays().hashCode());
        result = prime * result + ((getCouponStartTime() == null) ? 0 : getCouponStartTime().hashCode());
        result = prime * result + ((getCouponEndTime() == null) ? 0 : getCouponEndTime().hashCode());
        result = prime * result + ((getCouponAddTime() == null) ? 0 : getCouponAddTime().hashCode());
        result = prime * result + ((getCouponUpdateTime() == null) ? 0 : getCouponUpdateTime().hashCode());
        result = prime * result + ((getCouponDeleted() == null) ? 0 : getCouponDeleted().hashCode());
        return result;
    }
}