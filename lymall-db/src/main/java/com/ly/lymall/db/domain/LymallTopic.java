package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LymallTopic implements Serializable {
    private Integer topicId;

    private String topicTitle;

    private String topicSubtitle;

    private BigDecimal topicPrice;

    private String topicReadCount;

    private String topicPicUrl;

    private Integer topicSortOrder;

    private String topicGoods;

    private Date topicAddTime;

    private Date topicUpdateTime;

    private Boolean topicDeleted;

    private String topicContent;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicSubtitle() {
        return topicSubtitle;
    }

    public void setTopicSubtitle(String topicSubtitle) {
        this.topicSubtitle = topicSubtitle;
    }

    public BigDecimal getTopicPrice() {
        return topicPrice;
    }

    public void setTopicPrice(BigDecimal topicPrice) {
        this.topicPrice = topicPrice;
    }

    public String getTopicReadCount() {
        return topicReadCount;
    }

    public void setTopicReadCount(String topicReadCount) {
        this.topicReadCount = topicReadCount;
    }

    public String getTopicPicUrl() {
        return topicPicUrl;
    }

    public void setTopicPicUrl(String topicPicUrl) {
        this.topicPicUrl = topicPicUrl;
    }

    public Integer getTopicSortOrder() {
        return topicSortOrder;
    }

    public void setTopicSortOrder(Integer topicSortOrder) {
        this.topicSortOrder = topicSortOrder;
    }

    public String getTopicGoods() {
        return topicGoods;
    }

    public void setTopicGoods(String topicGoods) {
        this.topicGoods = topicGoods;
    }

    public Date getTopicAddTime() {
        return topicAddTime;
    }

    public void setTopicAddTime(Date topicAddTime) {
        this.topicAddTime = topicAddTime;
    }

    public Date getTopicUpdateTime() {
        return topicUpdateTime;
    }

    public void setTopicUpdateTime(Date topicUpdateTime) {
        this.topicUpdateTime = topicUpdateTime;
    }

    public Boolean getTopicDeleted() {
        return topicDeleted;
    }

    public void setTopicDeleted(Boolean topicDeleted) {
        this.topicDeleted = topicDeleted;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", topicId=").append(topicId);
        sb.append(", topicTitle=").append(topicTitle);
        sb.append(", topicSubtitle=").append(topicSubtitle);
        sb.append(", topicPrice=").append(topicPrice);
        sb.append(", topicReadCount=").append(topicReadCount);
        sb.append(", topicPicUrl=").append(topicPicUrl);
        sb.append(", topicSortOrder=").append(topicSortOrder);
        sb.append(", topicGoods=").append(topicGoods);
        sb.append(", topicAddTime=").append(topicAddTime);
        sb.append(", topicUpdateTime=").append(topicUpdateTime);
        sb.append(", topicDeleted=").append(topicDeleted);
        sb.append(", topicContent=").append(topicContent);
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
        LymallTopic other = (LymallTopic) that;
        return (this.getTopicId() == null ? other.getTopicId() == null : this.getTopicId().equals(other.getTopicId()))
            && (this.getTopicTitle() == null ? other.getTopicTitle() == null : this.getTopicTitle().equals(other.getTopicTitle()))
            && (this.getTopicSubtitle() == null ? other.getTopicSubtitle() == null : this.getTopicSubtitle().equals(other.getTopicSubtitle()))
            && (this.getTopicPrice() == null ? other.getTopicPrice() == null : this.getTopicPrice().equals(other.getTopicPrice()))
            && (this.getTopicReadCount() == null ? other.getTopicReadCount() == null : this.getTopicReadCount().equals(other.getTopicReadCount()))
            && (this.getTopicPicUrl() == null ? other.getTopicPicUrl() == null : this.getTopicPicUrl().equals(other.getTopicPicUrl()))
            && (this.getTopicSortOrder() == null ? other.getTopicSortOrder() == null : this.getTopicSortOrder().equals(other.getTopicSortOrder()))
            && (this.getTopicGoods() == null ? other.getTopicGoods() == null : this.getTopicGoods().equals(other.getTopicGoods()))
            && (this.getTopicAddTime() == null ? other.getTopicAddTime() == null : this.getTopicAddTime().equals(other.getTopicAddTime()))
            && (this.getTopicUpdateTime() == null ? other.getTopicUpdateTime() == null : this.getTopicUpdateTime().equals(other.getTopicUpdateTime()))
            && (this.getTopicDeleted() == null ? other.getTopicDeleted() == null : this.getTopicDeleted().equals(other.getTopicDeleted()))
            && (this.getTopicContent() == null ? other.getTopicContent() == null : this.getTopicContent().equals(other.getTopicContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        result = prime * result + ((getTopicTitle() == null) ? 0 : getTopicTitle().hashCode());
        result = prime * result + ((getTopicSubtitle() == null) ? 0 : getTopicSubtitle().hashCode());
        result = prime * result + ((getTopicPrice() == null) ? 0 : getTopicPrice().hashCode());
        result = prime * result + ((getTopicReadCount() == null) ? 0 : getTopicReadCount().hashCode());
        result = prime * result + ((getTopicPicUrl() == null) ? 0 : getTopicPicUrl().hashCode());
        result = prime * result + ((getTopicSortOrder() == null) ? 0 : getTopicSortOrder().hashCode());
        result = prime * result + ((getTopicGoods() == null) ? 0 : getTopicGoods().hashCode());
        result = prime * result + ((getTopicAddTime() == null) ? 0 : getTopicAddTime().hashCode());
        result = prime * result + ((getTopicUpdateTime() == null) ? 0 : getTopicUpdateTime().hashCode());
        result = prime * result + ((getTopicDeleted() == null) ? 0 : getTopicDeleted().hashCode());
        result = prime * result + ((getTopicContent() == null) ? 0 : getTopicContent().hashCode());
        return result;
    }
}