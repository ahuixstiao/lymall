package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallSystem implements Serializable {
    private Integer systemId;

    private String systemKeyName;

    private String systemKeyValue;

    private Date systemAddTime;

    private Date systemUpdateTime;

    private Boolean systemDeleted;

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getSystemKeyName() {
        return systemKeyName;
    }

    public void setSystemKeyName(String systemKeyName) {
        this.systemKeyName = systemKeyName;
    }

    public String getSystemKeyValue() {
        return systemKeyValue;
    }

    public void setSystemKeyValue(String systemKeyValue) {
        this.systemKeyValue = systemKeyValue;
    }

    public Date getSystemAddTime() {
        return systemAddTime;
    }

    public void setSystemAddTime(Date systemAddTime) {
        this.systemAddTime = systemAddTime;
    }

    public Date getSystemUpdateTime() {
        return systemUpdateTime;
    }

    public void setSystemUpdateTime(Date systemUpdateTime) {
        this.systemUpdateTime = systemUpdateTime;
    }

    public Boolean getSystemDeleted() {
        return systemDeleted;
    }

    public void setSystemDeleted(Boolean systemDeleted) {
        this.systemDeleted = systemDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", systemId=").append(systemId);
        sb.append(", systemKeyName=").append(systemKeyName);
        sb.append(", systemKeyValue=").append(systemKeyValue);
        sb.append(", systemAddTime=").append(systemAddTime);
        sb.append(", systemUpdateTime=").append(systemUpdateTime);
        sb.append(", systemDeleted=").append(systemDeleted);
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
        LymallSystem other = (LymallSystem) that;
        return (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getSystemKeyName() == null ? other.getSystemKeyName() == null : this.getSystemKeyName().equals(other.getSystemKeyName()))
            && (this.getSystemKeyValue() == null ? other.getSystemKeyValue() == null : this.getSystemKeyValue().equals(other.getSystemKeyValue()))
            && (this.getSystemAddTime() == null ? other.getSystemAddTime() == null : this.getSystemAddTime().equals(other.getSystemAddTime()))
            && (this.getSystemUpdateTime() == null ? other.getSystemUpdateTime() == null : this.getSystemUpdateTime().equals(other.getSystemUpdateTime()))
            && (this.getSystemDeleted() == null ? other.getSystemDeleted() == null : this.getSystemDeleted().equals(other.getSystemDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getSystemKeyName() == null) ? 0 : getSystemKeyName().hashCode());
        result = prime * result + ((getSystemKeyValue() == null) ? 0 : getSystemKeyValue().hashCode());
        result = prime * result + ((getSystemAddTime() == null) ? 0 : getSystemAddTime().hashCode());
        result = prime * result + ((getSystemUpdateTime() == null) ? 0 : getSystemUpdateTime().hashCode());
        result = prime * result + ((getSystemDeleted() == null) ? 0 : getSystemDeleted().hashCode());
        return result;
    }
}