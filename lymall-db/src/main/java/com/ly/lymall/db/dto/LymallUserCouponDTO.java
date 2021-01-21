package com.ly.lymall.db.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: Ahui
 * @Description: coupon DTO类
 * @DateTime: 2021/1/20 - 12:06
 **/
public class LymallUserCouponDTO implements Serializable {
    //coupon

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

    private LocalDateTime couponStartTime;

    private LocalDateTime couponEndTime;

    private LocalDateTime couponAddTime;

    private LocalDateTime couponUpdateTime;

    private Boolean couponDeleted;

    //userCoupon

    private Integer couponUserId;

    private Integer userId;

    private Short couponUserStatus;

    private LocalDateTime couponUserUsedTime;

    private LocalDateTime couponUserStartTime;

    private LocalDateTime couponUserEndTime;

    private Integer orderId;

    private LocalDateTime couponUserAddTime;

    private LocalDateTime couponUserUpdateTime;

    private Boolean couponUserDeleted;


    public LymallUserCouponDTO(Integer couponId, String couponName, String couponDesc, String couponTag, Integer couponTotal, BigDecimal couponDiscount, BigDecimal couponMin, Short couponLimit, Short couponType, Short couponStatus, Short couponGoodsType, String couponGoodsValue, String couponCode, Short couponTimeType, Short couponDays, LocalDateTime couponStartTime, LocalDateTime couponEndTime, LocalDateTime couponAddTime, LocalDateTime couponUpdateTime, Boolean couponDeleted, Integer couponUserId, Integer userId, Short couponUserStatus, LocalDateTime couponUserUsedTime, LocalDateTime couponUserStartTime, LocalDateTime couponUserEndTime, Integer orderId, LocalDateTime couponUserAddTime, LocalDateTime couponUserUpdateTime, Boolean couponUserDeleted) {
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponDesc = couponDesc;
        this.couponTag = couponTag;
        this.couponTotal = couponTotal;
        this.couponDiscount = couponDiscount;
        this.couponMin = couponMin;
        this.couponLimit = couponLimit;
        this.couponType = couponType;
        this.couponStatus = couponStatus;
        this.couponGoodsType = couponGoodsType;
        this.couponGoodsValue = couponGoodsValue;
        this.couponCode = couponCode;
        this.couponTimeType = couponTimeType;
        this.couponDays = couponDays;
        this.couponStartTime = couponStartTime;
        this.couponEndTime = couponEndTime;
        this.couponAddTime = couponAddTime;
        this.couponUpdateTime = couponUpdateTime;
        this.couponDeleted = couponDeleted;
        this.couponUserId = couponUserId;
        this.userId = userId;
        this.couponUserStatus = couponUserStatus;
        this.couponUserUsedTime = couponUserUsedTime;
        this.couponUserStartTime = couponUserStartTime;
        this.couponUserEndTime = couponUserEndTime;
        this.orderId = orderId;
        this.couponUserAddTime = couponUserAddTime;
        this.couponUserUpdateTime = couponUserUpdateTime;
        this.couponUserDeleted = couponUserDeleted;
    }

    public LymallUserCouponDTO() {
        super();
    }

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

    public LocalDateTime getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(LocalDateTime couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public LocalDateTime getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(LocalDateTime couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public LocalDateTime getCouponAddTime() {
        return couponAddTime;
    }

    public void setCouponAddTime(LocalDateTime couponAddTime) {
        this.couponAddTime = couponAddTime;
    }

    public LocalDateTime getCouponUpdateTime() {
        return couponUpdateTime;
    }

    public void setCouponUpdateTime(LocalDateTime couponUpdateTime) {
        this.couponUpdateTime = couponUpdateTime;
    }

    public Boolean getCouponDeleted() {
        return couponDeleted;
    }

    public void setCouponDeleted(Boolean couponDeleted) {
        this.couponDeleted = couponDeleted;
    }

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

    public Short getCouponUserStatus() {
        return couponUserStatus;
    }

    public void setCouponUserStatus(Short couponUserStatus) {
        this.couponUserStatus = couponUserStatus;
    }

    public LocalDateTime getCouponUserUsedTime() {
        return couponUserUsedTime;
    }

    public void setCouponUserUsedTime(LocalDateTime couponUserUsedTime) {
        this.couponUserUsedTime = couponUserUsedTime;
    }

    public LocalDateTime getCouponUserStartTime() {
        return couponUserStartTime;
    }

    public void setCouponUserStartTime(LocalDateTime couponUserStartTime) {
        this.couponUserStartTime = couponUserStartTime;
    }

    public LocalDateTime getCouponUserEndTime() {
        return couponUserEndTime;
    }

    public void setCouponUserEndTime(LocalDateTime couponUserEndTime) {
        this.couponUserEndTime = couponUserEndTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getCouponUserAddTime() {
        return couponUserAddTime;
    }

    public void setCouponUserAddTime(LocalDateTime couponUserAddTime) {
        this.couponUserAddTime = couponUserAddTime;
    }

    public LocalDateTime getCouponUserUpdateTime() {
        return couponUserUpdateTime;
    }

    public void setCouponUserUpdateTime(LocalDateTime couponUserUpdateTime) {
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
        return "LymallUserCouponDTO{" +
                "couponId=" + couponId +
                ", couponName='" + couponName + '\'' +
                ", couponDesc='" + couponDesc + '\'' +
                ", couponTag='" + couponTag + '\'' +
                ", couponTotal=" + couponTotal +
                ", couponDiscount=" + couponDiscount +
                ", couponMin=" + couponMin +
                ", couponLimit=" + couponLimit +
                ", couponType=" + couponType +
                ", couponStatus=" + couponStatus +
                ", couponGoodsType=" + couponGoodsType +
                ", couponGoodsValue='" + couponGoodsValue + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", couponTimeType=" + couponTimeType +
                ", couponDays=" + couponDays +
                ", couponStartTime=" + couponStartTime +
                ", couponEndTime=" + couponEndTime +
                ", couponAddTime=" + couponAddTime +
                ", couponUpdateTime=" + couponUpdateTime +
                ", couponDeleted=" + couponDeleted +
                ", couponUserId=" + couponUserId +
                ", userId=" + userId +
                ", couponUserStatus=" + couponUserStatus +
                ", couponUserUsedTime=" + couponUserUsedTime +
                ", couponUserStartTime=" + couponUserStartTime +
                ", couponUserEndTime=" + couponUserEndTime +
                ", orderId=" + orderId +
                ", couponUserAddTime=" + couponUserAddTime +
                ", couponUserUpdateTime=" + couponUserUpdateTime +
                ", couponUserDeleted=" + couponUserDeleted +
                '}';
    }
}