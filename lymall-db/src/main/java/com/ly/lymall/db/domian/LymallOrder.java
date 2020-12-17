package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallOrder implements Serializable {
    private Integer orderId;

    private Integer userId;

    private String orderSn;

    private Short orderStatus;

    private Short aftersaleStatus;

    private String orderConsignee;

    private String orderMobile;

    private String orderAddress;

    private String orderMessage;

    private BigDecimal goodsPrice;

    private BigDecimal freightPrice;

    private BigDecimal couponPrice;

    private BigDecimal integralPrice;

    private BigDecimal grouponPrice;

    private BigDecimal orderPrice;

    private BigDecimal orderActualPrice;

    private String payId;

    private Date payTime;

    private String shipSn;

    private String shipChannel;

    private Date shipTime;

    private BigDecimal refundAmount;

    private String refundType;

    private String refundContent;

    private Date refundTime;

    private Date confirmTime;

    private Short orderComments;

    private Date orderEndTime;

    private Date orderAddTime;

    private Date orderUpdateTime;

    private Boolean orderDeleted;

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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Short getAftersaleStatus() {
        return aftersaleStatus;
    }

    public void setAftersaleStatus(Short aftersaleStatus) {
        this.aftersaleStatus = aftersaleStatus;
    }

    public String getOrderConsignee() {
        return orderConsignee;
    }

    public void setOrderConsignee(String orderConsignee) {
        this.orderConsignee = orderConsignee;
    }

    public String getOrderMobile() {
        return orderMobile;
    }

    public void setOrderMobile(String orderMobile) {
        this.orderMobile = orderMobile;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    public BigDecimal getGrouponPrice() {
        return grouponPrice;
    }

    public void setGrouponPrice(BigDecimal grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderActualPrice() {
        return orderActualPrice;
    }

    public void setOrderActualPrice(BigDecimal orderActualPrice) {
        this.orderActualPrice = orderActualPrice;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn;
    }

    public String getShipChannel() {
        return shipChannel;
    }

    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel;
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Short getOrderComments() {
        return orderComments;
    }

    public void setOrderComments(Short orderComments) {
        this.orderComments = orderComments;
    }

    public Date getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Date orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public Date getOrderAddTime() {
        return orderAddTime;
    }

    public void setOrderAddTime(Date orderAddTime) {
        this.orderAddTime = orderAddTime;
    }

    public Date getOrderUpdateTime() {
        return orderUpdateTime;
    }

    public void setOrderUpdateTime(Date orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
    }

    public Boolean getOrderDeleted() {
        return orderDeleted;
    }

    public void setOrderDeleted(Boolean orderDeleted) {
        this.orderDeleted = orderDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", aftersaleStatus=").append(aftersaleStatus);
        sb.append(", orderConsignee=").append(orderConsignee);
        sb.append(", orderMobile=").append(orderMobile);
        sb.append(", orderAddress=").append(orderAddress);
        sb.append(", orderMessage=").append(orderMessage);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", freightPrice=").append(freightPrice);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", integralPrice=").append(integralPrice);
        sb.append(", grouponPrice=").append(grouponPrice);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderActualPrice=").append(orderActualPrice);
        sb.append(", payId=").append(payId);
        sb.append(", payTime=").append(payTime);
        sb.append(", shipSn=").append(shipSn);
        sb.append(", shipChannel=").append(shipChannel);
        sb.append(", shipTime=").append(shipTime);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", refundType=").append(refundType);
        sb.append(", refundContent=").append(refundContent);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", orderComments=").append(orderComments);
        sb.append(", orderEndTime=").append(orderEndTime);
        sb.append(", orderAddTime=").append(orderAddTime);
        sb.append(", orderUpdateTime=").append(orderUpdateTime);
        sb.append(", orderDeleted=").append(orderDeleted);
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
        LymallOrder other = (LymallOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getAftersaleStatus() == null ? other.getAftersaleStatus() == null : this.getAftersaleStatus().equals(other.getAftersaleStatus()))
            && (this.getOrderConsignee() == null ? other.getOrderConsignee() == null : this.getOrderConsignee().equals(other.getOrderConsignee()))
            && (this.getOrderMobile() == null ? other.getOrderMobile() == null : this.getOrderMobile().equals(other.getOrderMobile()))
            && (this.getOrderAddress() == null ? other.getOrderAddress() == null : this.getOrderAddress().equals(other.getOrderAddress()))
            && (this.getOrderMessage() == null ? other.getOrderMessage() == null : this.getOrderMessage().equals(other.getOrderMessage()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getFreightPrice() == null ? other.getFreightPrice() == null : this.getFreightPrice().equals(other.getFreightPrice()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getIntegralPrice() == null ? other.getIntegralPrice() == null : this.getIntegralPrice().equals(other.getIntegralPrice()))
            && (this.getGrouponPrice() == null ? other.getGrouponPrice() == null : this.getGrouponPrice().equals(other.getGrouponPrice()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getOrderActualPrice() == null ? other.getOrderActualPrice() == null : this.getOrderActualPrice().equals(other.getOrderActualPrice()))
            && (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getShipSn() == null ? other.getShipSn() == null : this.getShipSn().equals(other.getShipSn()))
            && (this.getShipChannel() == null ? other.getShipChannel() == null : this.getShipChannel().equals(other.getShipChannel()))
            && (this.getShipTime() == null ? other.getShipTime() == null : this.getShipTime().equals(other.getShipTime()))
            && (this.getRefundAmount() == null ? other.getRefundAmount() == null : this.getRefundAmount().equals(other.getRefundAmount()))
            && (this.getRefundType() == null ? other.getRefundType() == null : this.getRefundType().equals(other.getRefundType()))
            && (this.getRefundContent() == null ? other.getRefundContent() == null : this.getRefundContent().equals(other.getRefundContent()))
            && (this.getRefundTime() == null ? other.getRefundTime() == null : this.getRefundTime().equals(other.getRefundTime()))
            && (this.getConfirmTime() == null ? other.getConfirmTime() == null : this.getConfirmTime().equals(other.getConfirmTime()))
            && (this.getOrderComments() == null ? other.getOrderComments() == null : this.getOrderComments().equals(other.getOrderComments()))
            && (this.getOrderEndTime() == null ? other.getOrderEndTime() == null : this.getOrderEndTime().equals(other.getOrderEndTime()))
            && (this.getOrderAddTime() == null ? other.getOrderAddTime() == null : this.getOrderAddTime().equals(other.getOrderAddTime()))
            && (this.getOrderUpdateTime() == null ? other.getOrderUpdateTime() == null : this.getOrderUpdateTime().equals(other.getOrderUpdateTime()))
            && (this.getOrderDeleted() == null ? other.getOrderDeleted() == null : this.getOrderDeleted().equals(other.getOrderDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getAftersaleStatus() == null) ? 0 : getAftersaleStatus().hashCode());
        result = prime * result + ((getOrderConsignee() == null) ? 0 : getOrderConsignee().hashCode());
        result = prime * result + ((getOrderMobile() == null) ? 0 : getOrderMobile().hashCode());
        result = prime * result + ((getOrderAddress() == null) ? 0 : getOrderAddress().hashCode());
        result = prime * result + ((getOrderMessage() == null) ? 0 : getOrderMessage().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getFreightPrice() == null) ? 0 : getFreightPrice().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getIntegralPrice() == null) ? 0 : getIntegralPrice().hashCode());
        result = prime * result + ((getGrouponPrice() == null) ? 0 : getGrouponPrice().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderActualPrice() == null) ? 0 : getOrderActualPrice().hashCode());
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getShipSn() == null) ? 0 : getShipSn().hashCode());
        result = prime * result + ((getShipChannel() == null) ? 0 : getShipChannel().hashCode());
        result = prime * result + ((getShipTime() == null) ? 0 : getShipTime().hashCode());
        result = prime * result + ((getRefundAmount() == null) ? 0 : getRefundAmount().hashCode());
        result = prime * result + ((getRefundType() == null) ? 0 : getRefundType().hashCode());
        result = prime * result + ((getRefundContent() == null) ? 0 : getRefundContent().hashCode());
        result = prime * result + ((getRefundTime() == null) ? 0 : getRefundTime().hashCode());
        result = prime * result + ((getConfirmTime() == null) ? 0 : getConfirmTime().hashCode());
        result = prime * result + ((getOrderComments() == null) ? 0 : getOrderComments().hashCode());
        result = prime * result + ((getOrderEndTime() == null) ? 0 : getOrderEndTime().hashCode());
        result = prime * result + ((getOrderAddTime() == null) ? 0 : getOrderAddTime().hashCode());
        result = prime * result + ((getOrderUpdateTime() == null) ? 0 : getOrderUpdateTime().hashCode());
        result = prime * result + ((getOrderDeleted() == null) ? 0 : getOrderDeleted().hashCode());
        return result;
    }
}