package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallGoodsProduct implements Serializable {
    private Integer goodsProductId;

    private Integer goodsId;

    private String goodsProductSpecifications;

    private BigDecimal goodsProductPrice;

    private Integer goodsProductNumber;

    private String goodsProductUrl;

    private Date goodsProductAddTime;

    private Date goodsProductUpdateTime;

    private Boolean goodsProductDeleted;

    public Integer getGoodsProductId() {
        return goodsProductId;
    }

    public void setGoodsProductId(Integer goodsProductId) {
        this.goodsProductId = goodsProductId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsProductSpecifications() {
        return goodsProductSpecifications;
    }

    public void setGoodsProductSpecifications(String goodsProductSpecifications) {
        this.goodsProductSpecifications = goodsProductSpecifications;
    }

    public BigDecimal getGoodsProductPrice() {
        return goodsProductPrice;
    }

    public void setGoodsProductPrice(BigDecimal goodsProductPrice) {
        this.goodsProductPrice = goodsProductPrice;
    }

    public Integer getGoodsProductNumber() {
        return goodsProductNumber;
    }

    public void setGoodsProductNumber(Integer goodsProductNumber) {
        this.goodsProductNumber = goodsProductNumber;
    }

    public String getGoodsProductUrl() {
        return goodsProductUrl;
    }

    public void setGoodsProductUrl(String goodsProductUrl) {
        this.goodsProductUrl = goodsProductUrl;
    }

    public Date getGoodsProductAddTime() {
        return goodsProductAddTime;
    }

    public void setGoodsProductAddTime(Date goodsProductAddTime) {
        this.goodsProductAddTime = goodsProductAddTime;
    }

    public Date getGoodsProductUpdateTime() {
        return goodsProductUpdateTime;
    }

    public void setGoodsProductUpdateTime(Date goodsProductUpdateTime) {
        this.goodsProductUpdateTime = goodsProductUpdateTime;
    }

    public Boolean getGoodsProductDeleted() {
        return goodsProductDeleted;
    }

    public void setGoodsProductDeleted(Boolean goodsProductDeleted) {
        this.goodsProductDeleted = goodsProductDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsProductId=").append(goodsProductId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsProductSpecifications=").append(goodsProductSpecifications);
        sb.append(", goodsProductPrice=").append(goodsProductPrice);
        sb.append(", goodsProductNumber=").append(goodsProductNumber);
        sb.append(", goodsProductUrl=").append(goodsProductUrl);
        sb.append(", goodsProductAddTime=").append(goodsProductAddTime);
        sb.append(", goodsProductUpdateTime=").append(goodsProductUpdateTime);
        sb.append(", goodsProductDeleted=").append(goodsProductDeleted);
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
        LymallGoodsProduct other = (LymallGoodsProduct) that;
        return (this.getGoodsProductId() == null ? other.getGoodsProductId() == null : this.getGoodsProductId().equals(other.getGoodsProductId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsProductSpecifications() == null ? other.getGoodsProductSpecifications() == null : this.getGoodsProductSpecifications().equals(other.getGoodsProductSpecifications()))
            && (this.getGoodsProductPrice() == null ? other.getGoodsProductPrice() == null : this.getGoodsProductPrice().equals(other.getGoodsProductPrice()))
            && (this.getGoodsProductNumber() == null ? other.getGoodsProductNumber() == null : this.getGoodsProductNumber().equals(other.getGoodsProductNumber()))
            && (this.getGoodsProductUrl() == null ? other.getGoodsProductUrl() == null : this.getGoodsProductUrl().equals(other.getGoodsProductUrl()))
            && (this.getGoodsProductAddTime() == null ? other.getGoodsProductAddTime() == null : this.getGoodsProductAddTime().equals(other.getGoodsProductAddTime()))
            && (this.getGoodsProductUpdateTime() == null ? other.getGoodsProductUpdateTime() == null : this.getGoodsProductUpdateTime().equals(other.getGoodsProductUpdateTime()))
            && (this.getGoodsProductDeleted() == null ? other.getGoodsProductDeleted() == null : this.getGoodsProductDeleted().equals(other.getGoodsProductDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsProductId() == null) ? 0 : getGoodsProductId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsProductSpecifications() == null) ? 0 : getGoodsProductSpecifications().hashCode());
        result = prime * result + ((getGoodsProductPrice() == null) ? 0 : getGoodsProductPrice().hashCode());
        result = prime * result + ((getGoodsProductNumber() == null) ? 0 : getGoodsProductNumber().hashCode());
        result = prime * result + ((getGoodsProductUrl() == null) ? 0 : getGoodsProductUrl().hashCode());
        result = prime * result + ((getGoodsProductAddTime() == null) ? 0 : getGoodsProductAddTime().hashCode());
        result = prime * result + ((getGoodsProductUpdateTime() == null) ? 0 : getGoodsProductUpdateTime().hashCode());
        result = prime * result + ((getGoodsProductDeleted() == null) ? 0 : getGoodsProductDeleted().hashCode());
        return result;
    }
}