package com.ly.lymall.db.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ahui
 * @Date: 2020/12/19/16:29
 * @Description: 商品类别信息DTO
 */
public class LymallGoodsCategoryDTO implements Serializable {
    //goods
    private Integer goodsId;

    private String goodsName;

    private String goodsPicUrl;

    private BigDecimal goodsRetailPrice;

    private Boolean goodsDeleted;

    //category
    private Integer categoryId;

    private String categoryName;

    private Integer categoryPid;

    private Boolean categoryDeleted;

    public LymallGoodsCategoryDTO() {
        super();
    }

    public LymallGoodsCategoryDTO(Integer goodsId, String goodsName, String goodsPicUrl, BigDecimal goodsRetailPrice, Boolean goodsDeleted, Integer categoryId, String categoryName, Integer categoryPid, Boolean categoryDeleted) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPicUrl = goodsPicUrl;
        this.goodsRetailPrice = goodsRetailPrice;
        this.goodsDeleted = goodsDeleted;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryPid = categoryPid;
        this.categoryDeleted = categoryDeleted;
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

    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl;
    }

    public BigDecimal getGoodsRetailPrice() {
        return goodsRetailPrice;
    }

    public void setGoodsRetailPrice(BigDecimal goodsRetailPrice) {
        this.goodsRetailPrice = goodsRetailPrice;
    }

    public Boolean getGoodsDeleted() {
        return goodsDeleted;
    }

    public void setGoodsDeleted(Boolean goodsDeleted) {
        this.goodsDeleted = goodsDeleted;
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

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public Boolean getCategoryDeleted() {
        return categoryDeleted;
    }

    public void setCategoryDeleted(Boolean categoryDeleted) {
        this.categoryDeleted = categoryDeleted;
    }

    @Override
    public String toString() {
        return "LymallGoodsCategoryDTO{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPicUrl='" + goodsPicUrl + '\'' +
                ", goodsRetailPrice=" + goodsRetailPrice +
                ", goodsDeleted=" + goodsDeleted +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryPid=" + categoryPid +
                ", categoryDeleted=" + categoryDeleted +
                '}';
    }
}
