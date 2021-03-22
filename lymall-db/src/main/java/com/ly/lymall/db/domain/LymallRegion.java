package com.ly.lymall.db.domain;

import java.io.Serializable;

public class LymallRegion implements Serializable {
    private Integer regionId;

    private Integer regionPid;

    private String regionName;

    private Byte regionType;

    private Integer regionCode;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getRegionPid() {
        return regionPid;
    }

    public void setRegionPid(Integer regionPid) {
        this.regionPid = regionPid;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Byte getRegionType() {
        return regionType;
    }

    public void setRegionType(Byte regionType) {
        this.regionType = regionType;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", regionId=").append(regionId);
        sb.append(", regionPid=").append(regionPid);
        sb.append(", regionName=").append(regionName);
        sb.append(", regionType=").append(regionType);
        sb.append(", regionCode=").append(regionCode);
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
        LymallRegion other = (LymallRegion) that;
        return (this.getRegionId() == null ? other.getRegionId() == null : this.getRegionId().equals(other.getRegionId()))
            && (this.getRegionPid() == null ? other.getRegionPid() == null : this.getRegionPid().equals(other.getRegionPid()))
            && (this.getRegionName() == null ? other.getRegionName() == null : this.getRegionName().equals(other.getRegionName()))
            && (this.getRegionType() == null ? other.getRegionType() == null : this.getRegionType().equals(other.getRegionType()))
            && (this.getRegionCode() == null ? other.getRegionCode() == null : this.getRegionCode().equals(other.getRegionCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegionId() == null) ? 0 : getRegionId().hashCode());
        result = prime * result + ((getRegionPid() == null) ? 0 : getRegionPid().hashCode());
        result = prime * result + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        result = prime * result + ((getRegionType() == null) ? 0 : getRegionType().hashCode());
        result = prime * result + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        return result;
    }
}