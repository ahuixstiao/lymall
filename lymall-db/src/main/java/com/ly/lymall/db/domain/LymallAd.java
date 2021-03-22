package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallAd implements Serializable {
    private Integer adId;

    private String adName;

    private String adLink;

    private String adUrl;

    private Byte adPosition;

    private String adContent;

    private Date adStartTime;

    private Date adEndTime;

    private Boolean adEnabled;

    private Date adAddTime;

    private Date adUpdateTime;

    private Boolean adDeleted;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public Byte getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(Byte adPosition) {
        this.adPosition = adPosition;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }

    public Date getAdStartTime() {
        return adStartTime;
    }

    public void setAdStartTime(Date adStartTime) {
        this.adStartTime = adStartTime;
    }

    public Date getAdEndTime() {
        return adEndTime;
    }

    public void setAdEndTime(Date adEndTime) {
        this.adEndTime = adEndTime;
    }

    public Boolean getAdEnabled() {
        return adEnabled;
    }

    public void setAdEnabled(Boolean adEnabled) {
        this.adEnabled = adEnabled;
    }

    public Date getAdAddTime() {
        return adAddTime;
    }

    public void setAdAddTime(Date adAddTime) {
        this.adAddTime = adAddTime;
    }

    public Date getAdUpdateTime() {
        return adUpdateTime;
    }

    public void setAdUpdateTime(Date adUpdateTime) {
        this.adUpdateTime = adUpdateTime;
    }

    public Boolean getAdDeleted() {
        return adDeleted;
    }

    public void setAdDeleted(Boolean adDeleted) {
        this.adDeleted = adDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adId=").append(adId);
        sb.append(", adName=").append(adName);
        sb.append(", adLink=").append(adLink);
        sb.append(", adUrl=").append(adUrl);
        sb.append(", adPosition=").append(adPosition);
        sb.append(", adContent=").append(adContent);
        sb.append(", adStartTime=").append(adStartTime);
        sb.append(", adEndTime=").append(adEndTime);
        sb.append(", adEnabled=").append(adEnabled);
        sb.append(", adAddTime=").append(adAddTime);
        sb.append(", adUpdateTime=").append(adUpdateTime);
        sb.append(", adDeleted=").append(adDeleted);
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
        LymallAd other = (LymallAd) that;
        return (this.getAdId() == null ? other.getAdId() == null : this.getAdId().equals(other.getAdId()))
            && (this.getAdName() == null ? other.getAdName() == null : this.getAdName().equals(other.getAdName()))
            && (this.getAdLink() == null ? other.getAdLink() == null : this.getAdLink().equals(other.getAdLink()))
            && (this.getAdUrl() == null ? other.getAdUrl() == null : this.getAdUrl().equals(other.getAdUrl()))
            && (this.getAdPosition() == null ? other.getAdPosition() == null : this.getAdPosition().equals(other.getAdPosition()))
            && (this.getAdContent() == null ? other.getAdContent() == null : this.getAdContent().equals(other.getAdContent()))
            && (this.getAdStartTime() == null ? other.getAdStartTime() == null : this.getAdStartTime().equals(other.getAdStartTime()))
            && (this.getAdEndTime() == null ? other.getAdEndTime() == null : this.getAdEndTime().equals(other.getAdEndTime()))
            && (this.getAdEnabled() == null ? other.getAdEnabled() == null : this.getAdEnabled().equals(other.getAdEnabled()))
            && (this.getAdAddTime() == null ? other.getAdAddTime() == null : this.getAdAddTime().equals(other.getAdAddTime()))
            && (this.getAdUpdateTime() == null ? other.getAdUpdateTime() == null : this.getAdUpdateTime().equals(other.getAdUpdateTime()))
            && (this.getAdDeleted() == null ? other.getAdDeleted() == null : this.getAdDeleted().equals(other.getAdDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdId() == null) ? 0 : getAdId().hashCode());
        result = prime * result + ((getAdName() == null) ? 0 : getAdName().hashCode());
        result = prime * result + ((getAdLink() == null) ? 0 : getAdLink().hashCode());
        result = prime * result + ((getAdUrl() == null) ? 0 : getAdUrl().hashCode());
        result = prime * result + ((getAdPosition() == null) ? 0 : getAdPosition().hashCode());
        result = prime * result + ((getAdContent() == null) ? 0 : getAdContent().hashCode());
        result = prime * result + ((getAdStartTime() == null) ? 0 : getAdStartTime().hashCode());
        result = prime * result + ((getAdEndTime() == null) ? 0 : getAdEndTime().hashCode());
        result = prime * result + ((getAdEnabled() == null) ? 0 : getAdEnabled().hashCode());
        result = prime * result + ((getAdAddTime() == null) ? 0 : getAdAddTime().hashCode());
        result = prime * result + ((getAdUpdateTime() == null) ? 0 : getAdUpdateTime().hashCode());
        result = prime * result + ((getAdDeleted() == null) ? 0 : getAdDeleted().hashCode());
        return result;
    }
}