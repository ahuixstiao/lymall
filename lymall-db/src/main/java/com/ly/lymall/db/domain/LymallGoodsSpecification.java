package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallGoodsSpecification implements Serializable {
    private Integer goodsSpecificationId;

    private Integer goodsId;

    private String goodsSpecificationSpecification;

    private String goodsSpecificationValue;

    private String goodsSpecificationPicUrl;

    private Date goodsSpecificationAddTime;

    private Date goodsSpecificationUpdateTime;

    private Boolean goodsSpecificationDeleted;

    public Integer getGoodsSpecificationId() {
        return goodsSpecificationId;
    }

    public void setGoodsSpecificationId(Integer goodsSpecificationId) {
        this.goodsSpecificationId = goodsSpecificationId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSpecificationSpecification() {
        return goodsSpecificationSpecification;
    }

    public void setGoodsSpecificationSpecification(String goodsSpecificationSpecification) {
        this.goodsSpecificationSpecification = goodsSpecificationSpecification;
    }

    public String getGoodsSpecificationValue() {
        return goodsSpecificationValue;
    }

    public void setGoodsSpecificationValue(String goodsSpecificationValue) {
        this.goodsSpecificationValue = goodsSpecificationValue;
    }

    public String getGoodsSpecificationPicUrl() {
        return goodsSpecificationPicUrl;
    }

    public void setGoodsSpecificationPicUrl(String goodsSpecificationPicUrl) {
        this.goodsSpecificationPicUrl = goodsSpecificationPicUrl;
    }

    public Date getGoodsSpecificationAddTime() {
        return goodsSpecificationAddTime;
    }

    public void setGoodsSpecificationAddTime(Date goodsSpecificationAddTime) {
        this.goodsSpecificationAddTime = goodsSpecificationAddTime;
    }

    public Date getGoodsSpecificationUpdateTime() {
        return goodsSpecificationUpdateTime;
    }

    public void setGoodsSpecificationUpdateTime(Date goodsSpecificationUpdateTime) {
        this.goodsSpecificationUpdateTime = goodsSpecificationUpdateTime;
    }

    public Boolean getGoodsSpecificationDeleted() {
        return goodsSpecificationDeleted;
    }

    public void setGoodsSpecificationDeleted(Boolean goodsSpecificationDeleted) {
        this.goodsSpecificationDeleted = goodsSpecificationDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsSpecificationId=").append(goodsSpecificationId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSpecificationSpecification=").append(goodsSpecificationSpecification);
        sb.append(", goodsSpecificationValue=").append(goodsSpecificationValue);
        sb.append(", goodsSpecificationPicUrl=").append(goodsSpecificationPicUrl);
        sb.append(", goodsSpecificationAddTime=").append(goodsSpecificationAddTime);
        sb.append(", goodsSpecificationUpdateTime=").append(goodsSpecificationUpdateTime);
        sb.append(", goodsSpecificationDeleted=").append(goodsSpecificationDeleted);
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
        LymallGoodsSpecification other = (LymallGoodsSpecification) that;
        return (this.getGoodsSpecificationId() == null ? other.getGoodsSpecificationId() == null : this.getGoodsSpecificationId().equals(other.getGoodsSpecificationId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsSpecificationSpecification() == null ? other.getGoodsSpecificationSpecification() == null : this.getGoodsSpecificationSpecification().equals(other.getGoodsSpecificationSpecification()))
            && (this.getGoodsSpecificationValue() == null ? other.getGoodsSpecificationValue() == null : this.getGoodsSpecificationValue().equals(other.getGoodsSpecificationValue()))
            && (this.getGoodsSpecificationPicUrl() == null ? other.getGoodsSpecificationPicUrl() == null : this.getGoodsSpecificationPicUrl().equals(other.getGoodsSpecificationPicUrl()))
            && (this.getGoodsSpecificationAddTime() == null ? other.getGoodsSpecificationAddTime() == null : this.getGoodsSpecificationAddTime().equals(other.getGoodsSpecificationAddTime()))
            && (this.getGoodsSpecificationUpdateTime() == null ? other.getGoodsSpecificationUpdateTime() == null : this.getGoodsSpecificationUpdateTime().equals(other.getGoodsSpecificationUpdateTime()))
            && (this.getGoodsSpecificationDeleted() == null ? other.getGoodsSpecificationDeleted() == null : this.getGoodsSpecificationDeleted().equals(other.getGoodsSpecificationDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsSpecificationId() == null) ? 0 : getGoodsSpecificationId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsSpecificationSpecification() == null) ? 0 : getGoodsSpecificationSpecification().hashCode());
        result = prime * result + ((getGoodsSpecificationValue() == null) ? 0 : getGoodsSpecificationValue().hashCode());
        result = prime * result + ((getGoodsSpecificationPicUrl() == null) ? 0 : getGoodsSpecificationPicUrl().hashCode());
        result = prime * result + ((getGoodsSpecificationAddTime() == null) ? 0 : getGoodsSpecificationAddTime().hashCode());
        result = prime * result + ((getGoodsSpecificationUpdateTime() == null) ? 0 : getGoodsSpecificationUpdateTime().hashCode());
        result = prime * result + ((getGoodsSpecificationDeleted() == null) ? 0 : getGoodsSpecificationDeleted().hashCode());
        return result;
    }
}