package com.ly.lymall.db.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: ahui
 * @Date: 2020-12-14/ 16:56
 * @Description: 团购规则与商品信息实体类
 */
public class LymallGrouponRulesDTO implements Serializable{
    /**
     * goods
     */
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

    /**
     * GrouponRules
     */
    private Integer grouponRulesId;

    private BigDecimal discountMoney;

    private Integer discountMember;

    //解决后台日期转换为json的问题：在实体类上用JsonFormat注解
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date expireTime;

    private Short grouponRulesStatus;

    private Date grouponRulesAddTime;

    private Date grouponRulesUpdateTime;

    private Boolean grouponRulesDeleted;

    public LymallGrouponRulesDTO() {
        super();
    }

    public LymallGrouponRulesDTO(Integer goodsId, String goodsSn, String goodsName, Integer categoryId, Integer brandId, String goodsGallery, String goodsKeywords, String goodsBrief, Boolean goodsIsOnSale, Short goodsSortOrder, String goodsPicUrl, String goodsShareUrl, Boolean goodsIsNew, Boolean goodsIsHot, String goodsUnit, BigDecimal goodsCounterPrice, BigDecimal goodsRetailPrice, Date goodsAddTime, Date goodsUpdateTime, Boolean goodsDeleted, String goodsDetail, Integer grouponRulesId, BigDecimal discountMoney, Integer discountMember, Date expireTime, Short grouponRulesStatus, Date grouponRulesAddTime, Date grouponRulesUpdateTime, Boolean grouponRulesDeleted) {
        this.goodsId = goodsId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.goodsGallery = goodsGallery;
        this.goodsKeywords = goodsKeywords;
        this.goodsBrief = goodsBrief;
        this.goodsIsOnSale = goodsIsOnSale;
        this.goodsSortOrder = goodsSortOrder;
        this.goodsPicUrl = goodsPicUrl;
        this.goodsShareUrl = goodsShareUrl;
        this.goodsIsNew = goodsIsNew;
        this.goodsIsHot = goodsIsHot;
        this.goodsUnit = goodsUnit;
        this.goodsCounterPrice = goodsCounterPrice;
        this.goodsRetailPrice = goodsRetailPrice;
        this.goodsAddTime = goodsAddTime;
        this.goodsUpdateTime = goodsUpdateTime;
        this.goodsDeleted = goodsDeleted;
        this.goodsDetail = goodsDetail;
        this.grouponRulesId = grouponRulesId;
        this.discountMoney = discountMoney;
        this.discountMember = discountMember;
        this.expireTime = expireTime;
        this.grouponRulesStatus = grouponRulesStatus;
        this.grouponRulesAddTime = grouponRulesAddTime;
        this.grouponRulesUpdateTime = grouponRulesUpdateTime;
        this.grouponRulesDeleted = grouponRulesDeleted;
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

    public Integer getGrouponRulesId() {
        return grouponRulesId;
    }

    public void setGrouponRulesId(Integer grouponRulesId) {
        this.grouponRulesId = grouponRulesId;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Integer getDiscountMember() {
        return discountMember;
    }

    public void setDiscountMember(Integer discountMember) {
        this.discountMember = discountMember;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Short getGrouponRulesStatus() {
        return grouponRulesStatus;
    }

    public void setGrouponRulesStatus(Short grouponRulesStatus) {
        this.grouponRulesStatus = grouponRulesStatus;
    }

    public Date getGrouponRulesAddTime() {
        return grouponRulesAddTime;
    }

    public void setGrouponRulesAddTime(Date grouponRulesAddTime) {
        this.grouponRulesAddTime = grouponRulesAddTime;
    }

    public Date getGrouponRulesUpdateTime() {
        return grouponRulesUpdateTime;
    }

    public void setGrouponRulesUpdateTime(Date grouponRulesUpdateTime) {
        this.grouponRulesUpdateTime = grouponRulesUpdateTime;
    }

    public Boolean getGrouponRulesDeleted() {
        return grouponRulesDeleted;
    }

    public void setGrouponRulesDeleted(Boolean grouponRulesDeleted) {
        this.grouponRulesDeleted = grouponRulesDeleted;
    }

    @Override
    public String toString() {
        return "LymallGrouponRulesDTO{" +
                "goodsId=" + goodsId +
                ", goodsSn='" + goodsSn + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", categoryId=" + categoryId +
                ", brandId=" + brandId +
                ", goodsGallery='" + goodsGallery + '\'' +
                ", goodsKeywords='" + goodsKeywords + '\'' +
                ", goodsBrief='" + goodsBrief + '\'' +
                ", goodsIsOnSale=" + goodsIsOnSale +
                ", goodsSortOrder=" + goodsSortOrder +
                ", goodsPicUrl='" + goodsPicUrl + '\'' +
                ", goodsShareUrl='" + goodsShareUrl + '\'' +
                ", goodsIsNew=" + goodsIsNew +
                ", goodsIsHot=" + goodsIsHot +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", goodsCounterPrice=" + goodsCounterPrice +
                ", goodsRetailPrice=" + goodsRetailPrice +
                ", goodsAddTime=" + goodsAddTime +
                ", goodsUpdateTime=" + goodsUpdateTime +
                ", goodsDeleted=" + goodsDeleted +
                ", goodsDetail='" + goodsDetail + '\'' +
                ", grouponRulesId=" + grouponRulesId +
                ", discountMoney=" + discountMoney +
                ", discountMember=" + discountMember +
                ", expireTime=" + expireTime +
                ", grouponRulesStatus=" + grouponRulesStatus +
                ", grouponRulesAddTime=" + grouponRulesAddTime +
                ", grouponRulesUpdateTime=" + grouponRulesUpdateTime +
                ", grouponRulesDeleted=" + grouponRulesDeleted +
                '}';
    }
}
