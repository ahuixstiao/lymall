package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


public class LymallAddress implements Serializable {
    private Integer addressId;

    private String addressName;

    private Integer userId;

    private String regionProvinceId;

    private String regionCityId;

    private String regionCountyId;

    private String addressAddressDetail;

    private String addressAreaCode;

    private String addressPostalCode;

    private String addressTel;

    private Boolean addressIsDefault;

    private LocalDateTime addressAddTime;

    private Date addressUpdateTime;

    private Boolean addressDeleted;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRegionProvinceId() {
        return regionProvinceId;
    }

    public void setRegionProvinceId(String regionProvinceId) {
        this.regionProvinceId = regionProvinceId;
    }

    public String getRegionCityId() {
        return regionCityId;
    }

    public void setRegionCityId(String regionCityId) {
        this.regionCityId = regionCityId;
    }

    public String getRegionCountyId() {
        return regionCountyId;
    }

    public void setRegionCountyId(String regionCountyId) {
        this.regionCountyId = regionCountyId;
    }

    public String getAddressAddressDetail() {
        return addressAddressDetail;
    }

    public void setAddressAddressDetail(String addressAddressDetail) {
        this.addressAddressDetail = addressAddressDetail;
    }

    public String getAddressAreaCode() {
        return addressAreaCode;
    }

    public void setAddressAreaCode(String addressAreaCode) {
        this.addressAreaCode = addressAreaCode;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public String getAddressTel() {
        return addressTel;
    }

    public void setAddressTel(String addressTel) {
        this.addressTel = addressTel;
    }

    public Boolean getAddressIsDefault() {
        return addressIsDefault;
    }

    public void setAddressIsDefault(Boolean addressIsDefault) {
        this.addressIsDefault = addressIsDefault;
    }

    public LocalDateTime getAddressAddTime() {
        return addressAddTime;
    }

    public void setAddressAddTime(LocalDateTime addressAddTime) {
        this.addressAddTime = addressAddTime;
    }

    public Date getAddressUpdateTime() {
        return addressUpdateTime;
    }

    public void setAddressUpdateTime(Date addressUpdateTime) {
        this.addressUpdateTime = addressUpdateTime;
    }

    public Boolean getAddressDeleted() {
        return addressDeleted;
    }

    public void setAddressDeleted(Boolean addressDeleted) {
        this.addressDeleted = addressDeleted;
    }

    public LymallAddress() {
        super();
    }

    public LymallAddress(Integer addressId, String addressName, Integer userId, String regionProvinceId, String regionCityId, String regionCountyId, String addressAddressDetail, String addressAreaCode, String addressPostalCode, String addressTel, Boolean addressIsDefault, LocalDateTime addressAddTime, Date addressUpdateTime, Boolean addressDeleted) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.userId = userId;
        this.regionProvinceId = regionProvinceId;
        this.regionCityId = regionCityId;
        this.regionCountyId = regionCountyId;
        this.addressAddressDetail = addressAddressDetail;
        this.addressAreaCode = addressAreaCode;
        this.addressPostalCode = addressPostalCode;
        this.addressTel = addressTel;
        this.addressIsDefault = addressIsDefault;
        this.addressAddTime = addressAddTime;
        this.addressUpdateTime = addressUpdateTime;
        this.addressDeleted = addressDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", addressName=").append(addressName);
        sb.append(", userId=").append(userId);
        sb.append(", regionProvinceId=").append(regionProvinceId);
        sb.append(", regionCityId=").append(regionCityId);
        sb.append(", regionCountyId=").append(regionCountyId);
        sb.append(", addressAddressDetail=").append(addressAddressDetail);
        sb.append(", addressAreaCode=").append(addressAreaCode);
        sb.append(", addressPostalCode=").append(addressPostalCode);
        sb.append(", addressTel=").append(addressTel);
        sb.append(", addressIsDefault=").append(addressIsDefault);
        sb.append(", addressAddTime=").append(addressAddTime);
        sb.append(", addressUpdateTime=").append(addressUpdateTime);
        sb.append(", addressDeleted=").append(addressDeleted);
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
        LymallAddress other = (LymallAddress) that;
        return (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getAddressName() == null ? other.getAddressName() == null : this.getAddressName().equals(other.getAddressName()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRegionProvinceId() == null ? other.getRegionProvinceId() == null : this.getRegionProvinceId().equals(other.getRegionProvinceId()))
            && (this.getRegionCityId() == null ? other.getRegionCityId() == null : this.getRegionCityId().equals(other.getRegionCityId()))
            && (this.getRegionCountyId() == null ? other.getRegionCountyId() == null : this.getRegionCountyId().equals(other.getRegionCountyId()))
            && (this.getAddressAddressDetail() == null ? other.getAddressAddressDetail() == null : this.getAddressAddressDetail().equals(other.getAddressAddressDetail()))
            && (this.getAddressAreaCode() == null ? other.getAddressAreaCode() == null : this.getAddressAreaCode().equals(other.getAddressAreaCode()))
            && (this.getAddressPostalCode() == null ? other.getAddressPostalCode() == null : this.getAddressPostalCode().equals(other.getAddressPostalCode()))
            && (this.getAddressTel() == null ? other.getAddressTel() == null : this.getAddressTel().equals(other.getAddressTel()))
            && (this.getAddressIsDefault() == null ? other.getAddressIsDefault() == null : this.getAddressIsDefault().equals(other.getAddressIsDefault()))
            && (this.getAddressAddTime() == null ? other.getAddressAddTime() == null : this.getAddressAddTime().equals(other.getAddressAddTime()))
            && (this.getAddressUpdateTime() == null ? other.getAddressUpdateTime() == null : this.getAddressUpdateTime().equals(other.getAddressUpdateTime()))
            && (this.getAddressDeleted() == null ? other.getAddressDeleted() == null : this.getAddressDeleted().equals(other.getAddressDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getAddressName() == null) ? 0 : getAddressName().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRegionProvinceId() == null) ? 0 : getRegionProvinceId().hashCode());
        result = prime * result + ((getRegionCityId() == null) ? 0 : getRegionCityId().hashCode());
        result = prime * result + ((getRegionCountyId() == null) ? 0 : getRegionCountyId().hashCode());
        result = prime * result + ((getAddressAddressDetail() == null) ? 0 : getAddressAddressDetail().hashCode());
        result = prime * result + ((getAddressAreaCode() == null) ? 0 : getAddressAreaCode().hashCode());
        result = prime * result + ((getAddressPostalCode() == null) ? 0 : getAddressPostalCode().hashCode());
        result = prime * result + ((getAddressTel() == null) ? 0 : getAddressTel().hashCode());
        result = prime * result + ((getAddressIsDefault() == null) ? 0 : getAddressIsDefault().hashCode());
        result = prime * result + ((getAddressAddTime() == null) ? 0 : getAddressAddTime().hashCode());
        result = prime * result + ((getAddressUpdateTime() == null) ? 0 : getAddressUpdateTime().hashCode());
        result = prime * result + ((getAddressDeleted() == null) ? 0 : getAddressDeleted().hashCode());
        return result;
    }
}