package com.ly.lymall.db.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Ahui
 * @Description: TODO
 * @DateTime: 2021/1/5 - 10:46
 **/
public class LymallGoodsCategoryDTO implements Serializable {

    //category
    private Integer categoryId;

    private String categoryName;

    private String categoryKeywords;

    private String categoryDesc;

    private Integer categoryPid;

    private String categoryIconUrl;

    private String categoryPicUrl;

    private String categoryLevel;

    private Byte categorySortOrder;

    private Date categoryAddTime;

    private Date categoryUpdateTime;

    private Boolean categoryDeleted;

    //goods
    private Integer goodsId;

    private String goodsSn;

    private String goodsName;

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

    public LymallGoodsCategoryDTO() {
        super();
    }

    public LymallGoodsCategoryDTO(Integer categoryId, String categoryName, String categoryKeywords, String categoryDesc, Integer categoryPid, String categoryIconUrl, String categoryPicUrl, String categoryLevel, Byte categorySortOrder, Date categoryAddTime, Date categoryUpdateTime, Boolean categoryDeleted, Integer goodsId, String goodsSn, String goodsName, Integer brandId, String goodsGallery, String goodsKeywords, String goodsBrief, Boolean goodsIsOnSale, Short goodsSortOrder, String goodsPicUrl, String goodsShareUrl, Boolean goodsIsNew, Boolean goodsIsHot, String goodsUnit, BigDecimal goodsCounterPrice, BigDecimal goodsRetailPrice, Date goodsAddTime, Date goodsUpdateTime, Boolean goodsDeleted, String goodsDetail) {
        super();
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryKeywords = categoryKeywords;
        this.categoryDesc = categoryDesc;
        this.categoryPid = categoryPid;
        this.categoryIconUrl = categoryIconUrl;
        this.categoryPicUrl = categoryPicUrl;
        this.categoryLevel = categoryLevel;
        this.categorySortOrder = categorySortOrder;
        this.categoryAddTime = categoryAddTime;
        this.categoryUpdateTime = categoryUpdateTime;
        this.categoryDeleted = categoryDeleted;
        this.goodsId = goodsId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
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
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryKeywords() {
        return categoryKeywords;
    }

    public void setCategoryKeywords(String categoryKeywords) {
        this.categoryKeywords = categoryKeywords;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public String getCategoryIconUrl() {
        return categoryIconUrl;
    }

    public void setCategoryIconUrl(String categoryIconUrl) {
        this.categoryIconUrl = categoryIconUrl;
    }

    public String getCategoryPicUrl() {
        return categoryPicUrl;
    }

    public void setCategoryPicUrl(String categoryPicUrl) {
        this.categoryPicUrl = categoryPicUrl;
    }

    public String getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(String categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Byte getCategorySortOrder() {
        return categorySortOrder;
    }

    public void setCategorySortOrder(Byte categorySortOrder) {
        this.categorySortOrder = categorySortOrder;
    }

    public Date getCategoryAddTime() {
        return categoryAddTime;
    }

    public void setCategoryAddTime(Date categoryAddTime) {
        this.categoryAddTime = categoryAddTime;
    }

    public Date getCategoryUpdateTime() {
        return categoryUpdateTime;
    }

    public void setCategoryUpdateTime(Date categoryUpdateTime) {
        this.categoryUpdateTime = categoryUpdateTime;
    }

    public Boolean getCategoryDeleted() {
        return categoryDeleted;
    }

    public void setCategoryDeleted(Boolean categoryDeleted) {
        this.categoryDeleted = categoryDeleted;
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
        return "LymallGoodsCategoryDTO{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryKeywords='" + categoryKeywords + '\'' +
                ", categoryDesc='" + categoryDesc + '\'' +
                ", categoryPid=" + categoryPid +
                ", categoryIconUrl='" + categoryIconUrl + '\'' +
                ", categoryPicUrl='" + categoryPicUrl + '\'' +
                ", categoryLevel='" + categoryLevel + '\'' +
                ", categorySortOrder=" + categorySortOrder +
                ", categoryAddTime=" + categoryAddTime +
                ", categoryUpdateTime=" + categoryUpdateTime +
                ", categoryDeleted=" + categoryDeleted +
                ", goodsId=" + goodsId +
                ", goodsSn='" + goodsSn + '\'' +
                ", goodsName='" + goodsName + '\'' +
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
                '}';
    }
}
