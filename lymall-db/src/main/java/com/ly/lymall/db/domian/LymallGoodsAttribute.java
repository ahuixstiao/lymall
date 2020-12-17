package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallGoodsAttribute implements Serializable {
    private Integer goodsAttributeId;

    private Integer goodsId;

    private String attribute;

    private String goodsAttributeValue;

    private Date goodsAttributeAddTime;

    private Date goodsAttributeUpdateTime;

    private Boolean goodsAttributeDeleted;

    public Integer getGoodsAttributeId() {
        return goodsAttributeId;
    }

    public void setGoodsAttributeId(Integer goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getGoodsAttributeValue() {
        return goodsAttributeValue;
    }

    public void setGoodsAttributeValue(String goodsAttributeValue) {
        this.goodsAttributeValue = goodsAttributeValue;
    }

    public Date getGoodsAttributeAddTime() {
        return goodsAttributeAddTime;
    }

    public void setGoodsAttributeAddTime(Date goodsAttributeAddTime) {
        this.goodsAttributeAddTime = goodsAttributeAddTime;
    }

    public Date getGoodsAttributeUpdateTime() {
        return goodsAttributeUpdateTime;
    }

    public void setGoodsAttributeUpdateTime(Date goodsAttributeUpdateTime) {
        this.goodsAttributeUpdateTime = goodsAttributeUpdateTime;
    }

    public Boolean getGoodsAttributeDeleted() {
        return goodsAttributeDeleted;
    }

    public void setGoodsAttributeDeleted(Boolean goodsAttributeDeleted) {
        this.goodsAttributeDeleted = goodsAttributeDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsAttributeId=").append(goodsAttributeId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", attribute=").append(attribute);
        sb.append(", goodsAttributeValue=").append(goodsAttributeValue);
        sb.append(", goodsAttributeAddTime=").append(goodsAttributeAddTime);
        sb.append(", goodsAttributeUpdateTime=").append(goodsAttributeUpdateTime);
        sb.append(", goodsAttributeDeleted=").append(goodsAttributeDeleted);
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
        LymallGoodsAttribute other = (LymallGoodsAttribute) that;
        return (this.getGoodsAttributeId() == null ? other.getGoodsAttributeId() == null : this.getGoodsAttributeId().equals(other.getGoodsAttributeId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()))
            && (this.getGoodsAttributeValue() == null ? other.getGoodsAttributeValue() == null : this.getGoodsAttributeValue().equals(other.getGoodsAttributeValue()))
            && (this.getGoodsAttributeAddTime() == null ? other.getGoodsAttributeAddTime() == null : this.getGoodsAttributeAddTime().equals(other.getGoodsAttributeAddTime()))
            && (this.getGoodsAttributeUpdateTime() == null ? other.getGoodsAttributeUpdateTime() == null : this.getGoodsAttributeUpdateTime().equals(other.getGoodsAttributeUpdateTime()))
            && (this.getGoodsAttributeDeleted() == null ? other.getGoodsAttributeDeleted() == null : this.getGoodsAttributeDeleted().equals(other.getGoodsAttributeDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsAttributeId() == null) ? 0 : getGoodsAttributeId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        result = prime * result + ((getGoodsAttributeValue() == null) ? 0 : getGoodsAttributeValue().hashCode());
        result = prime * result + ((getGoodsAttributeAddTime() == null) ? 0 : getGoodsAttributeAddTime().hashCode());
        result = prime * result + ((getGoodsAttributeUpdateTime() == null) ? 0 : getGoodsAttributeUpdateTime().hashCode());
        result = prime * result + ((getGoodsAttributeDeleted() == null) ? 0 : getGoodsAttributeDeleted().hashCode());
        return result;
    }
}