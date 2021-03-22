package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallCart implements Serializable {
    private Integer cartId;

    private Integer userId;

    private Integer goodsId;

    private String goodsSn;

    private String goodsName;

    private Integer productId;

    private BigDecimal goodsPrice;

    private Short goodsNumber;

    private String goodsSpecifications;

    private Boolean cartChecked;

    private String goodsPicUrl;

    private Date cartAddTime;

    private Date cartUpdateTime;

    private Boolean cartDeleted;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsSpecifications() {
        return goodsSpecifications;
    }

    public void setGoodsSpecifications(String goodsSpecifications) {
        this.goodsSpecifications = goodsSpecifications;
    }

    public Boolean getCartChecked() {
        return cartChecked;
    }

    public void setCartChecked(Boolean cartChecked) {
        this.cartChecked = cartChecked;
    }

    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl;
    }

    public Date getCartAddTime() {
        return cartAddTime;
    }

    public void setCartAddTime(Date cartAddTime) {
        this.cartAddTime = cartAddTime;
    }

    public Date getCartUpdateTime() {
        return cartUpdateTime;
    }

    public void setCartUpdateTime(Date cartUpdateTime) {
        this.cartUpdateTime = cartUpdateTime;
    }

    public Boolean getCartDeleted() {
        return cartDeleted;
    }

    public void setCartDeleted(Boolean cartDeleted) {
        this.cartDeleted = cartDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", userId=").append(userId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", productId=").append(productId);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsSpecifications=").append(goodsSpecifications);
        sb.append(", cartChecked=").append(cartChecked);
        sb.append(", goodsPicUrl=").append(goodsPicUrl);
        sb.append(", cartAddTime=").append(cartAddTime);
        sb.append(", cartUpdateTime=").append(cartUpdateTime);
        sb.append(", cartDeleted=").append(cartDeleted);
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
        LymallCart other = (LymallCart) that;
        return (this.getCartId() == null ? other.getCartId() == null : this.getCartId().equals(other.getCartId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsSn() == null ? other.getGoodsSn() == null : this.getGoodsSn().equals(other.getGoodsSn()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getGoodsSpecifications() == null ? other.getGoodsSpecifications() == null : this.getGoodsSpecifications().equals(other.getGoodsSpecifications()))
            && (this.getCartChecked() == null ? other.getCartChecked() == null : this.getCartChecked().equals(other.getCartChecked()))
            && (this.getGoodsPicUrl() == null ? other.getGoodsPicUrl() == null : this.getGoodsPicUrl().equals(other.getGoodsPicUrl()))
            && (this.getCartAddTime() == null ? other.getCartAddTime() == null : this.getCartAddTime().equals(other.getCartAddTime()))
            && (this.getCartUpdateTime() == null ? other.getCartUpdateTime() == null : this.getCartUpdateTime().equals(other.getCartUpdateTime()))
            && (this.getCartDeleted() == null ? other.getCartDeleted() == null : this.getCartDeleted().equals(other.getCartDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartId() == null) ? 0 : getCartId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsSn() == null) ? 0 : getGoodsSn().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getGoodsSpecifications() == null) ? 0 : getGoodsSpecifications().hashCode());
        result = prime * result + ((getCartChecked() == null) ? 0 : getCartChecked().hashCode());
        result = prime * result + ((getGoodsPicUrl() == null) ? 0 : getGoodsPicUrl().hashCode());
        result = prime * result + ((getCartAddTime() == null) ? 0 : getCartAddTime().hashCode());
        result = prime * result + ((getCartUpdateTime() == null) ? 0 : getCartUpdateTime().hashCode());
        result = prime * result + ((getCartDeleted() == null) ? 0 : getCartDeleted().hashCode());
        return result;
    }
}