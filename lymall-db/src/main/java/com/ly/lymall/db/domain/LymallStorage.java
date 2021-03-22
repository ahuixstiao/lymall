package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallStorage implements Serializable {
    private Integer storageId;

    private String storageKey;

    private String storageName;

    private String storageType;

    private Integer storageSize;

    private String storageUrl;

    private Date storageAddTime;

    private Date storageUpdateTime;

    private Boolean storageDeleted;

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public String getStorageKey() {
        return storageKey;
    }

    public void setStorageKey(String storageKey) {
        this.storageKey = storageKey;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
    }

    public Date getStorageAddTime() {
        return storageAddTime;
    }

    public void setStorageAddTime(Date storageAddTime) {
        this.storageAddTime = storageAddTime;
    }

    public Date getStorageUpdateTime() {
        return storageUpdateTime;
    }

    public void setStorageUpdateTime(Date storageUpdateTime) {
        this.storageUpdateTime = storageUpdateTime;
    }

    public Boolean getStorageDeleted() {
        return storageDeleted;
    }

    public void setStorageDeleted(Boolean storageDeleted) {
        this.storageDeleted = storageDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storageId=").append(storageId);
        sb.append(", storageKey=").append(storageKey);
        sb.append(", storageName=").append(storageName);
        sb.append(", storageType=").append(storageType);
        sb.append(", storageSize=").append(storageSize);
        sb.append(", storageUrl=").append(storageUrl);
        sb.append(", storageAddTime=").append(storageAddTime);
        sb.append(", storageUpdateTime=").append(storageUpdateTime);
        sb.append(", storageDeleted=").append(storageDeleted);
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
        LymallStorage other = (LymallStorage) that;
        return (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
            && (this.getStorageKey() == null ? other.getStorageKey() == null : this.getStorageKey().equals(other.getStorageKey()))
            && (this.getStorageName() == null ? other.getStorageName() == null : this.getStorageName().equals(other.getStorageName()))
            && (this.getStorageType() == null ? other.getStorageType() == null : this.getStorageType().equals(other.getStorageType()))
            && (this.getStorageSize() == null ? other.getStorageSize() == null : this.getStorageSize().equals(other.getStorageSize()))
            && (this.getStorageUrl() == null ? other.getStorageUrl() == null : this.getStorageUrl().equals(other.getStorageUrl()))
            && (this.getStorageAddTime() == null ? other.getStorageAddTime() == null : this.getStorageAddTime().equals(other.getStorageAddTime()))
            && (this.getStorageUpdateTime() == null ? other.getStorageUpdateTime() == null : this.getStorageUpdateTime().equals(other.getStorageUpdateTime()))
            && (this.getStorageDeleted() == null ? other.getStorageDeleted() == null : this.getStorageDeleted().equals(other.getStorageDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
        result = prime * result + ((getStorageKey() == null) ? 0 : getStorageKey().hashCode());
        result = prime * result + ((getStorageName() == null) ? 0 : getStorageName().hashCode());
        result = prime * result + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        result = prime * result + ((getStorageSize() == null) ? 0 : getStorageSize().hashCode());
        result = prime * result + ((getStorageUrl() == null) ? 0 : getStorageUrl().hashCode());
        result = prime * result + ((getStorageAddTime() == null) ? 0 : getStorageAddTime().hashCode());
        result = prime * result + ((getStorageUpdateTime() == null) ? 0 : getStorageUpdateTime().hashCode());
        result = prime * result + ((getStorageDeleted() == null) ? 0 : getStorageDeleted().hashCode());
        return result;
    }
}