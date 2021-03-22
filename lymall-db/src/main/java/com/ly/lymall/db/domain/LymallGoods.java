package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallGoods implements Serializable {
    private Integer goodsId;

    private String goodsSn;

    private String goodsName;

    private Integer categoryId;

    private Integer brandId;

    private String goodsGallery;

    private String goodsKeywords;

    private String goodsBrief;

    private Boolean goodsIsOnSale;

    private Short goodsSortOrder;

    private String goodsPicUrl;

    private String goodsShareUrl;

    private Boolean goodsIsNew;

    private Boolean goodsIsHot;

    private String goodsUnit;

    private BigDecimal goodsCounterPrice;

    private BigDecimal goodsRetailPrice;

    private Date goodsAddTime;

    private Date goodsUpdateTime;

    private Boolean goodsDeleted;

    private String goodsDetail;

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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getGoodsGallery() {
        return goodsGallery;
    }

    public void setGoodsGallery(String goodsGallery) {
        this.goodsGallery = goodsGallery;
    }

    public String getGoodsKeywords() {
        return goodsKeywords;
    }

    public void setGoodsKeywords(String goodsKeywords) {
        this.goodsKeywords = goodsKeywords;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public Boolean getGoodsIsOnSale() {
        return goodsIsOnSale;
    }

    public void setGoodsIsOnSale(Boolean goodsIsOnSale) {
        this.goodsIsOnSale = goodsIsOnSale;
    }

    public Short getGoodsSortOrder() {
        return goodsSortOrder;
    }

    public void setGoodsSortOrder(Short goodsSortOrder) {
        this.goodsSortOrder = goodsSortOrder;
    }

    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl;
    }

    public String getGoodsShareUrl() {
        return goodsShareUrl;
    }

    public void setGoodsShareUrl(String goodsShareUrl) {
        this.goodsShareUrl = goodsShareUrl;
    }

    public Boolean getGoodsIsNew() {
        return goodsIsNew;
    }

    public void setGoodsIsNew(Boolean goodsIsNew) {
        this.goodsIsNew = goodsIsNew;
    }

    public Boolean getGoodsIsHot() {
        return goodsIsHot;
    }

    public void setGoodsIsHot(Boolean goodsIsHot) {
        this.goodsIsHot = goodsIsHot;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public BigDecimal getGoodsCounterPrice() {
        return goodsCounterPrice;
    }

    public void setGoodsCounterPrice(BigDecimal goodsCounterPrice) {
        this.goodsCounterPrice = goodsCounterPrice;
    }

    public BigDecimal getGoodsRetailPrice() {
        return goodsRetailPrice;
    }

    public void setGoodsRetailPrice(BigDecimal goodsRetailPrice) {
        this.goodsRetailPrice = goodsRetailPrice;
    }

    public Date getGoodsAddTime() {
        return goodsAddTime;
    }

    public void setGoodsAddTime(Date goodsAddTime) {
        this.goodsAddTime = goodsAddTime;
    }

    public Date getGoodsUpdateTime() {
        return goodsUpdateTime;
    }

    public void setGoodsUpdateTime(Date goodsUpdateTime) {
        this.goodsUpdateTime = goodsUpdateTime;
    }

    public Boolean getGoodsDeleted() {
        return goodsDeleted;
    }

    public void setGoodsDeleted(Boolean goodsDeleted) {
        this.goodsDeleted = goodsDeleted;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", brandId=").append(brandId);
        sb.append(", goodsGallery=").append(goodsGallery);
        sb.append(", goodsKeywords=").append(goodsKeywords);
        sb.append(", goodsBrief=").append(goodsBrief);
        sb.append(", goodsIsOnSale=").append(goodsIsOnSale);
        sb.append(", goodsSortOrder=").append(goodsSortOrder);
        sb.append(", goodsPicUrl=").append(goodsPicUrl);
        sb.append(", goodsShareUrl=").append(goodsShareUrl);
        sb.append(", goodsIsNew=").append(goodsIsNew);
        sb.append(", goodsIsHot=").append(goodsIsHot);
        sb.append(", goodsUnit=").append(goodsUnit);
        sb.append(", goodsCounterPrice=").append(goodsCounterPrice);
        sb.append(", goodsRetailPrice=").append(goodsRetailPrice);
        sb.append(", goodsAddTime=").append(goodsAddTime);
        sb.append(", goodsUpdateTime=").append(goodsUpdateTime);
        sb.append(", goodsDeleted=").append(goodsDeleted);
        sb.append(", goodsDetail=").append(goodsDetail);
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
        LymallGoods other = (LymallGoods) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsSn() == null ? other.getGoodsSn() == null : this.getGoodsSn().equals(other.getGoodsSn()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getGoodsGallery() == null ? other.getGoodsGallery() == null : this.getGoodsGallery().equals(other.getGoodsGallery()))
            && (this.getGoodsKeywords() == null ? other.getGoodsKeywords() == null : this.getGoodsKeywords().equals(other.getGoodsKeywords()))
            && (this.getGoodsBrief() == null ? other.getGoodsBrief() == null : this.getGoodsBrief().equals(other.getGoodsBrief()))
            && (this.getGoodsIsOnSale() == null ? other.getGoodsIsOnSale() == null : this.getGoodsIsOnSale().equals(other.getGoodsIsOnSale()))
            && (this.getGoodsSortOrder() == null ? other.getGoodsSortOrder() == null : this.getGoodsSortOrder().equals(other.getGoodsSortOrder()))
            && (this.getGoodsPicUrl() == null ? other.getGoodsPicUrl() == null : this.getGoodsPicUrl().equals(other.getGoodsPicUrl()))
            && (this.getGoodsShareUrl() == null ? other.getGoodsShareUrl() == null : this.getGoodsShareUrl().equals(other.getGoodsShareUrl()))
            && (this.getGoodsIsNew() == null ? other.getGoodsIsNew() == null : this.getGoodsIsNew().equals(other.getGoodsIsNew()))
            && (this.getGoodsIsHot() == null ? other.getGoodsIsHot() == null : this.getGoodsIsHot().equals(other.getGoodsIsHot()))
            && (this.getGoodsUnit() == null ? other.getGoodsUnit() == null : this.getGoodsUnit().equals(other.getGoodsUnit()))
            && (this.getGoodsCounterPrice() == null ? other.getGoodsCounterPrice() == null : this.getGoodsCounterPrice().equals(other.getGoodsCounterPrice()))
            && (this.getGoodsRetailPrice() == null ? other.getGoodsRetailPrice() == null : this.getGoodsRetailPrice().equals(other.getGoodsRetailPrice()))
            && (this.getGoodsAddTime() == null ? other.getGoodsAddTime() == null : this.getGoodsAddTime().equals(other.getGoodsAddTime()))
            && (this.getGoodsUpdateTime() == null ? other.getGoodsUpdateTime() == null : this.getGoodsUpdateTime().equals(other.getGoodsUpdateTime()))
            && (this.getGoodsDeleted() == null ? other.getGoodsDeleted() == null : this.getGoodsDeleted().equals(other.getGoodsDeleted()))
            && (this.getGoodsDetail() == null ? other.getGoodsDetail() == null : this.getGoodsDetail().equals(other.getGoodsDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsSn() == null) ? 0 : getGoodsSn().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getGoodsGallery() == null) ? 0 : getGoodsGallery().hashCode());
        result = prime * result + ((getGoodsKeywords() == null) ? 0 : getGoodsKeywords().hashCode());
        result = prime * result + ((getGoodsBrief() == null) ? 0 : getGoodsBrief().hashCode());
        result = prime * result + ((getGoodsIsOnSale() == null) ? 0 : getGoodsIsOnSale().hashCode());
        result = prime * result + ((getGoodsSortOrder() == null) ? 0 : getGoodsSortOrder().hashCode());
        result = prime * result + ((getGoodsPicUrl() == null) ? 0 : getGoodsPicUrl().hashCode());
        result = prime * result + ((getGoodsShareUrl() == null) ? 0 : getGoodsShareUrl().hashCode());
        result = prime * result + ((getGoodsIsNew() == null) ? 0 : getGoodsIsNew().hashCode());
        result = prime * result + ((getGoodsIsHot() == null) ? 0 : getGoodsIsHot().hashCode());
        result = prime * result + ((getGoodsUnit() == null) ? 0 : getGoodsUnit().hashCode());
        result = prime * result + ((getGoodsCounterPrice() == null) ? 0 : getGoodsCounterPrice().hashCode());
        result = prime * result + ((getGoodsRetailPrice() == null) ? 0 : getGoodsRetailPrice().hashCode());
        result = prime * result + ((getGoodsAddTime() == null) ? 0 : getGoodsAddTime().hashCode());
        result = prime * result + ((getGoodsUpdateTime() == null) ? 0 : getGoodsUpdateTime().hashCode());
        result = prime * result + ((getGoodsDeleted() == null) ? 0 : getGoodsDeleted().hashCode());
        result = prime * result + ((getGoodsDetail() == null) ? 0 : getGoodsDetail().hashCode());
        return result;
    }
}