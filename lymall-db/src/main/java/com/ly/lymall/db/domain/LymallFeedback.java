package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallFeedback implements Serializable {
    private Integer feedbackId;

    private Integer userId;

    private String userUsername;

    private String userMobile;

    private String feedbackType;

    private String feedbackContent;

    private Integer feedbackStatus;

    private Boolean feedbackHasPicture;

    private String feedbackPicUrls;

    private Date feedbackAddTime;

    private Date feedbackUpdateTime;

    private Boolean feedbackDeleted;

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Integer getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(Integer feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public Boolean getFeedbackHasPicture() {
        return feedbackHasPicture;
    }

    public void setFeedbackHasPicture(Boolean feedbackHasPicture) {
        this.feedbackHasPicture = feedbackHasPicture;
    }

    public String getFeedbackPicUrls() {
        return feedbackPicUrls;
    }

    public void setFeedbackPicUrls(String feedbackPicUrls) {
        this.feedbackPicUrls = feedbackPicUrls;
    }

    public Date getFeedbackAddTime() {
        return feedbackAddTime;
    }

    public void setFeedbackAddTime(Date feedbackAddTime) {
        this.feedbackAddTime = feedbackAddTime;
    }

    public Date getFeedbackUpdateTime() {
        return feedbackUpdateTime;
    }

    public void setFeedbackUpdateTime(Date feedbackUpdateTime) {
        this.feedbackUpdateTime = feedbackUpdateTime;
    }

    public Boolean getFeedbackDeleted() {
        return feedbackDeleted;
    }

    public void setFeedbackDeleted(Boolean feedbackDeleted) {
        this.feedbackDeleted = feedbackDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackId=").append(feedbackId);
        sb.append(", userId=").append(userId);
        sb.append(", userUsername=").append(userUsername);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", feedbackType=").append(feedbackType);
        sb.append(", feedbackContent=").append(feedbackContent);
        sb.append(", feedbackStatus=").append(feedbackStatus);
        sb.append(", feedbackHasPicture=").append(feedbackHasPicture);
        sb.append(", feedbackPicUrls=").append(feedbackPicUrls);
        sb.append(", feedbackAddTime=").append(feedbackAddTime);
        sb.append(", feedbackUpdateTime=").append(feedbackUpdateTime);
        sb.append(", feedbackDeleted=").append(feedbackDeleted);
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
        LymallFeedback other = (LymallFeedback) that;
        return (this.getFeedbackId() == null ? other.getFeedbackId() == null : this.getFeedbackId().equals(other.getFeedbackId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserUsername() == null ? other.getUserUsername() == null : this.getUserUsername().equals(other.getUserUsername()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getFeedbackType() == null ? other.getFeedbackType() == null : this.getFeedbackType().equals(other.getFeedbackType()))
            && (this.getFeedbackContent() == null ? other.getFeedbackContent() == null : this.getFeedbackContent().equals(other.getFeedbackContent()))
            && (this.getFeedbackStatus() == null ? other.getFeedbackStatus() == null : this.getFeedbackStatus().equals(other.getFeedbackStatus()))
            && (this.getFeedbackHasPicture() == null ? other.getFeedbackHasPicture() == null : this.getFeedbackHasPicture().equals(other.getFeedbackHasPicture()))
            && (this.getFeedbackPicUrls() == null ? other.getFeedbackPicUrls() == null : this.getFeedbackPicUrls().equals(other.getFeedbackPicUrls()))
            && (this.getFeedbackAddTime() == null ? other.getFeedbackAddTime() == null : this.getFeedbackAddTime().equals(other.getFeedbackAddTime()))
            && (this.getFeedbackUpdateTime() == null ? other.getFeedbackUpdateTime() == null : this.getFeedbackUpdateTime().equals(other.getFeedbackUpdateTime()))
            && (this.getFeedbackDeleted() == null ? other.getFeedbackDeleted() == null : this.getFeedbackDeleted().equals(other.getFeedbackDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeedbackId() == null) ? 0 : getFeedbackId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserUsername() == null) ? 0 : getUserUsername().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getFeedbackType() == null) ? 0 : getFeedbackType().hashCode());
        result = prime * result + ((getFeedbackContent() == null) ? 0 : getFeedbackContent().hashCode());
        result = prime * result + ((getFeedbackStatus() == null) ? 0 : getFeedbackStatus().hashCode());
        result = prime * result + ((getFeedbackHasPicture() == null) ? 0 : getFeedbackHasPicture().hashCode());
        result = prime * result + ((getFeedbackPicUrls() == null) ? 0 : getFeedbackPicUrls().hashCode());
        result = prime * result + ((getFeedbackAddTime() == null) ? 0 : getFeedbackAddTime().hashCode());
        result = prime * result + ((getFeedbackUpdateTime() == null) ? 0 : getFeedbackUpdateTime().hashCode());
        result = prime * result + ((getFeedbackDeleted() == null) ? 0 : getFeedbackDeleted().hashCode());
        return result;
    }
}