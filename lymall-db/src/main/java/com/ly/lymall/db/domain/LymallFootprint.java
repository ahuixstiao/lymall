package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallFootprint implements Serializable {
    private Integer footprintId;

    private Integer userId;

    private Integer goodsId;

    private Date footprintAddTime;

    private Date footprintUpdateTime;

    private Boolean footprintDeleted;

    public Integer getFootprintId() {
        return footprintId;
    }

    public void setFootprintId(Integer footprintId) {
        this.footprintId = footprintId;
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

    public Date getFootprintAddTime() {
        return footprintAddTime;
    }

    public void setFootprintAddTime(Date footprintAddTime) {
        this.footprintAddTime = footprintAddTime;
    }

    public Date getFootprintUpdateTime() {
        return footprintUpdateTime;
    }

    public void setFootprintUpdateTime(Date footprintUpdateTime) {
        this.footprintUpdateTime = footprintUpdateTime;
    }

    public Boolean getFootprintDeleted() {
        return footprintDeleted;
    }

    public void setFootprintDeleted(Boolean footprintDeleted) {
        this.footprintDeleted = footprintDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", footprintId=").append(footprintId);
        sb.append(", userId=").append(userId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", footprintAddTime=").append(footprintAddTime);
        sb.append(", footprintUpdateTime=").append(footprintUpdateTime);
        sb.append(", footprintDeleted=").append(footprintDeleted);
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
        LymallFootprint other = (LymallFootprint) that;
        return (this.getFootprintId() == null ? other.getFootprintId() == null : this.getFootprintId().equals(other.getFootprintId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getFootprintAddTime() == null ? other.getFootprintAddTime() == null : this.getFootprintAddTime().equals(other.getFootprintAddTime()))
            && (this.getFootprintUpdateTime() == null ? other.getFootprintUpdateTime() == null : this.getFootprintUpdateTime().equals(other.getFootprintUpdateTime()))
            && (this.getFootprintDeleted() == null ? other.getFootprintDeleted() == null : this.getFootprintDeleted().equals(other.getFootprintDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFootprintId() == null) ? 0 : getFootprintId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getFootprintAddTime() == null) ? 0 : getFootprintAddTime().hashCode());
        result = prime * result + ((getFootprintUpdateTime() == null) ? 0 : getFootprintUpdateTime().hashCode());
        result = prime * result + ((getFootprintDeleted() == null) ? 0 : getFootprintDeleted().hashCode());
        return result;
    }
}