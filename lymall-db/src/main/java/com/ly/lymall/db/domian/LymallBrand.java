package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallBrand implements Serializable {
    private Integer brandId;

    private String brandName;

    private String brandDesc;

    private String brandPicUrl;

    private Byte brandSortOrder;

    private BigDecimal brandFloorPrice;

    private Date brandAddTime;

    private Date brandUpdateTime;

    private Boolean brandDeleted;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getBrandPicUrl() {
        return brandPicUrl;
    }

    public void setBrandPicUrl(String brandPicUrl) {
        this.brandPicUrl = brandPicUrl;
    }

    public Byte getBrandSortOrder() {
        return brandSortOrder;
    }

    public void setBrandSortOrder(Byte brandSortOrder) {
        this.brandSortOrder = brandSortOrder;
    }

    public BigDecimal getBrandFloorPrice() {
        return brandFloorPrice;
    }

    public void setBrandFloorPrice(BigDecimal brandFloorPrice) {
        this.brandFloorPrice = brandFloorPrice;
    }

    public Date getBrandAddTime() {
        return brandAddTime;
    }

    public void setBrandAddTime(Date brandAddTime) {
        this.brandAddTime = brandAddTime;
    }

    public Date getBrandUpdateTime() {
        return brandUpdateTime;
    }

    public void setBrandUpdateTime(Date brandUpdateTime) {
        this.brandUpdateTime = brandUpdateTime;
    }

    public Boolean getBrandDeleted() {
        return brandDeleted;
    }

    public void setBrandDeleted(Boolean brandDeleted) {
        this.brandDeleted = brandDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandId=").append(brandId);
        sb.append(", brandName=").append(brandName);
        sb.append(", brandDesc=").append(brandDesc);
        sb.append(", brandPicUrl=").append(brandPicUrl);
        sb.append(", brandSortOrder=").append(brandSortOrder);
        sb.append(", brandFloorPrice=").append(brandFloorPrice);
        sb.append(", brandAddTime=").append(brandAddTime);
        sb.append(", brandUpdateTime=").append(brandUpdateTime);
        sb.append(", brandDeleted=").append(brandDeleted);
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
        LymallBrand other = (LymallBrand) that;
        return (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getBrandDesc() == null ? other.getBrandDesc() == null : this.getBrandDesc().equals(other.getBrandDesc()))
            && (this.getBrandPicUrl() == null ? other.getBrandPicUrl() == null : this.getBrandPicUrl().equals(other.getBrandPicUrl()))
            && (this.getBrandSortOrder() == null ? other.getBrandSortOrder() == null : this.getBrandSortOrder().equals(other.getBrandSortOrder()))
            && (this.getBrandFloorPrice() == null ? other.getBrandFloorPrice() == null : this.getBrandFloorPrice().equals(other.getBrandFloorPrice()))
            && (this.getBrandAddTime() == null ? other.getBrandAddTime() == null : this.getBrandAddTime().equals(other.getBrandAddTime()))
            && (this.getBrandUpdateTime() == null ? other.getBrandUpdateTime() == null : this.getBrandUpdateTime().equals(other.getBrandUpdateTime()))
            && (this.getBrandDeleted() == null ? other.getBrandDeleted() == null : this.getBrandDeleted().equals(other.getBrandDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getBrandDesc() == null) ? 0 : getBrandDesc().hashCode());
        result = prime * result + ((getBrandPicUrl() == null) ? 0 : getBrandPicUrl().hashCode());
        result = prime * result + ((getBrandSortOrder() == null) ? 0 : getBrandSortOrder().hashCode());
        result = prime * result + ((getBrandFloorPrice() == null) ? 0 : getBrandFloorPrice().hashCode());
        result = prime * result + ((getBrandAddTime() == null) ? 0 : getBrandAddTime().hashCode());
        result = prime * result + ((getBrandUpdateTime() == null) ? 0 : getBrandUpdateTime().hashCode());
        result = prime * result + ((getBrandDeleted() == null) ? 0 : getBrandDeleted().hashCode());
        return result;
    }
}