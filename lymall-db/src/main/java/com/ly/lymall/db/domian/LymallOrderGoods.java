package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallOrderGoods implements Serializable {
    private Integer orderGoodsId;

    private Integer orderId;

    private Integer goodsId;

    private String goodsName;

    private String goodsSn;

    private Integer productId;

    private Short orderGoodsNumber;

    private BigDecimal orderGoodsPrice;

    private String orderGoodsSpecifications;

    private String goodsPicUrl;

    private Integer orderGoodsComment;

    private Date orderGoodsAddTime;

    private Date orderGoodsUpdateTime;

    private Boolean orderGoodsDeleted;

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Short getOrderGoodsNumber() {
        return orderGoodsNumber;
    }

    public void setOrderGoodsNumber(Short orderGoodsNumber) {
        this.orderGoodsNumber = orderGoodsNumber;
    }

    public BigDecimal getOrderGoodsPrice() {
        return orderGoodsPrice;
    }

    public void setOrderGoodsPrice(BigDecimal orderGoodsPrice) {
        this.orderGoodsPrice = orderGoodsPrice;
    }

    public String getOrderGoodsSpecifications() {
        return orderGoodsSpecifications;
    }

    public void setOrderGoodsSpecifications(String orderGoodsSpecifications) {
        this.orderGoodsSpecifications = orderGoodsSpecifications;
    }

    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl;
    }

    public Integer getOrderGoodsComment() {
        return orderGoodsComment;
    }

    public void setOrderGoodsComment(Integer orderGoodsComment) {
        this.orderGoodsComment = orderGoodsComment;
    }

    public Date getOrderGoodsAddTime() {
        return orderGoodsAddTime;
    }

    public void setOrderGoodsAddTime(Date orderGoodsAddTime) {
        this.orderGoodsAddTime = orderGoodsAddTime;
    }

    public Date getOrderGoodsUpdateTime() {
        return orderGoodsUpdateTime;
    }

    public void setOrderGoodsUpdateTime(Date orderGoodsUpdateTime) {
        this.orderGoodsUpdateTime = orderGoodsUpdateTime;
    }

    public Boolean getOrderGoodsDeleted() {
        return orderGoodsDeleted;
    }

    public void setOrderGoodsDeleted(Boolean orderGoodsDeleted) {
        this.orderGoodsDeleted = orderGoodsDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", productId=").append(productId);
        sb.append(", orderGoodsNumber=").append(orderGoodsNumber);
        sb.append(", orderGoodsPrice=").append(orderGoodsPrice);
        sb.append(", orderGoodsSpecifications=").append(orderGoodsSpecifications);
        sb.append(", goodsPicUrl=").append(goodsPicUrl);
        sb.append(", orderGoodsComment=").append(orderGoodsComment);
        sb.append(", orderGoodsAddTime=").append(orderGoodsAddTime);
        sb.append(", orderGoodsUpdateTime=").append(orderGoodsUpdateTime);
        sb.append(", orderGoodsDeleted=").append(orderGoodsDeleted);
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
        LymallOrderGoods other = (LymallOrderGoods) that;
        return (this.getOrderGoodsId() == null ? other.getOrderGoodsId() == null : this.getOrderGoodsId().equals(other.getOrderGoodsId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsSn() == null ? other.getGoodsSn() == null : this.getGoodsSn().equals(other.getGoodsSn()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getOrderGoodsNumber() == null ? other.getOrderGoodsNumber() == null : this.getOrderGoodsNumber().equals(other.getOrderGoodsNumber()))
            && (this.getOrderGoodsPrice() == null ? other.getOrderGoodsPrice() == null : this.getOrderGoodsPrice().equals(other.getOrderGoodsPrice()))
            && (this.getOrderGoodsSpecifications() == null ? other.getOrderGoodsSpecifications() == null : this.getOrderGoodsSpecifications().equals(other.getOrderGoodsSpecifications()))
            && (this.getGoodsPicUrl() == null ? other.getGoodsPicUrl() == null : this.getGoodsPicUrl().equals(other.getGoodsPicUrl()))
            && (this.getOrderGoodsComment() == null ? other.getOrderGoodsComment() == null : this.getOrderGoodsComment().equals(other.getOrderGoodsComment()))
            && (this.getOrderGoodsAddTime() == null ? other.getOrderGoodsAddTime() == null : this.getOrderGoodsAddTime().equals(other.getOrderGoodsAddTime()))
            && (this.getOrderGoodsUpdateTime() == null ? other.getOrderGoodsUpdateTime() == null : this.getOrderGoodsUpdateTime().equals(other.getOrderGoodsUpdateTime()))
            && (this.getOrderGoodsDeleted() == null ? other.getOrderGoodsDeleted() == null : this.getOrderGoodsDeleted().equals(other.getOrderGoodsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderGoodsId() == null) ? 0 : getOrderGoodsId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsSn() == null) ? 0 : getGoodsSn().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getOrderGoodsNumber() == null) ? 0 : getOrderGoodsNumber().hashCode());
        result = prime * result + ((getOrderGoodsPrice() == null) ? 0 : getOrderGoodsPrice().hashCode());
        result = prime * result + ((getOrderGoodsSpecifications() == null) ? 0 : getOrderGoodsSpecifications().hashCode());
        result = prime * result + ((getGoodsPicUrl() == null) ? 0 : getGoodsPicUrl().hashCode());
        result = prime * result + ((getOrderGoodsComment() == null) ? 0 : getOrderGoodsComment().hashCode());
        result = prime * result + ((getOrderGoodsAddTime() == null) ? 0 : getOrderGoodsAddTime().hashCode());
        result = prime * result + ((getOrderGoodsUpdateTime() == null) ? 0 : getOrderGoodsUpdateTime().hashCode());
        result = prime * result + ((getOrderGoodsDeleted() == null) ? 0 : getOrderGoodsDeleted().hashCode());
        return result;
    }
}