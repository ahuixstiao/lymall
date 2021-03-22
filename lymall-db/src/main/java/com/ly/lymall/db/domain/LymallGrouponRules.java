package com.ly.lymall.db.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallGrouponRules implements Serializable {
    private Integer grouponRulesId;

    private Integer goodsId;

    private String goodsName;

    private String goodsPicUrl;

    private BigDecimal discountMoney;

    private Integer discountMember;

    //解决后台日期转换为json的问题：在实体类上用JsonFormat注解
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date expireTime;

    private Short grouponRulesStatus;

    private Date grouponRulesAddTime;

    private Date grouponRulesUpdateTime;

    private Boolean grouponRulesDeleted;

    public Integer getGrouponRulesId() {
        return grouponRulesId;
    }

    public void setGrouponRulesId(Integer grouponRulesId) {
        this.grouponRulesId = grouponRulesId;
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grouponRulesId=").append(grouponRulesId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsPicUrl=").append(goodsPicUrl);
        sb.append(", discountMoney=").append(discountMoney);
        sb.append(", discountMember=").append(discountMember);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", grouponRulesStatus=").append(grouponRulesStatus);
        sb.append(", grouponRulesAddTime=").append(grouponRulesAddTime);
        sb.append(", grouponRulesUpdateTime=").append(grouponRulesUpdateTime);
        sb.append(", grouponRulesDeleted=").append(grouponRulesDeleted);
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
        LymallGrouponRules other = (LymallGrouponRules) that;
        return (this.getGrouponRulesId() == null ? other.getGrouponRulesId() == null : this.getGrouponRulesId().equals(other.getGrouponRulesId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsPicUrl() == null ? other.getGoodsPicUrl() == null : this.getGoodsPicUrl().equals(other.getGoodsPicUrl()))
            && (this.getDiscountMoney() == null ? other.getDiscountMoney() == null : this.getDiscountMoney().equals(other.getDiscountMoney()))
            && (this.getDiscountMember() == null ? other.getDiscountMember() == null : this.getDiscountMember().equals(other.getDiscountMember()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getGrouponRulesStatus() == null ? other.getGrouponRulesStatus() == null : this.getGrouponRulesStatus().equals(other.getGrouponRulesStatus()))
            && (this.getGrouponRulesAddTime() == null ? other.getGrouponRulesAddTime() == null : this.getGrouponRulesAddTime().equals(other.getGrouponRulesAddTime()))
            && (this.getGrouponRulesUpdateTime() == null ? other.getGrouponRulesUpdateTime() == null : this.getGrouponRulesUpdateTime().equals(other.getGrouponRulesUpdateTime()))
            && (this.getGrouponRulesDeleted() == null ? other.getGrouponRulesDeleted() == null : this.getGrouponRulesDeleted().equals(other.getGrouponRulesDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrouponRulesId() == null) ? 0 : getGrouponRulesId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsPicUrl() == null) ? 0 : getGoodsPicUrl().hashCode());
        result = prime * result + ((getDiscountMoney() == null) ? 0 : getDiscountMoney().hashCode());
        result = prime * result + ((getDiscountMember() == null) ? 0 : getDiscountMember().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getGrouponRulesStatus() == null) ? 0 : getGrouponRulesStatus().hashCode());
        result = prime * result + ((getGrouponRulesAddTime() == null) ? 0 : getGrouponRulesAddTime().hashCode());
        result = prime * result + ((getGrouponRulesUpdateTime() == null) ? 0 : getGrouponRulesUpdateTime().hashCode());
        result = prime * result + ((getGrouponRulesDeleted() == null) ? 0 : getGrouponRulesDeleted().hashCode());
        return result;
    }
}