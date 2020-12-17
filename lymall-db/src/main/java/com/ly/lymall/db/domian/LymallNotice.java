package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallNotice implements Serializable {
    private Integer noticeId;

    private String noticeTitle;

    private String noticeContent;

    private Integer noticeCreateAdminId;

    private Date noticeAddTime;

    private Date noticeUpdateTime;

    private Boolean noticeDeleted;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Integer getNoticeCreateAdminId() {
        return noticeCreateAdminId;
    }

    public void setNoticeCreateAdminId(Integer noticeCreateAdminId) {
        this.noticeCreateAdminId = noticeCreateAdminId;
    }

    public Date getNoticeAddTime() {
        return noticeAddTime;
    }

    public void setNoticeAddTime(Date noticeAddTime) {
        this.noticeAddTime = noticeAddTime;
    }

    public Date getNoticeUpdateTime() {
        return noticeUpdateTime;
    }

    public void setNoticeUpdateTime(Date noticeUpdateTime) {
        this.noticeUpdateTime = noticeUpdateTime;
    }

    public Boolean getNoticeDeleted() {
        return noticeDeleted;
    }

    public void setNoticeDeleted(Boolean noticeDeleted) {
        this.noticeDeleted = noticeDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeId=").append(noticeId);
        sb.append(", noticeTitle=").append(noticeTitle);
        sb.append(", noticeContent=").append(noticeContent);
        sb.append(", noticeCreateAdminId=").append(noticeCreateAdminId);
        sb.append(", noticeAddTime=").append(noticeAddTime);
        sb.append(", noticeUpdateTime=").append(noticeUpdateTime);
        sb.append(", noticeDeleted=").append(noticeDeleted);
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
        LymallNotice other = (LymallNotice) that;
        return (this.getNoticeId() == null ? other.getNoticeId() == null : this.getNoticeId().equals(other.getNoticeId()))
            && (this.getNoticeTitle() == null ? other.getNoticeTitle() == null : this.getNoticeTitle().equals(other.getNoticeTitle()))
            && (this.getNoticeContent() == null ? other.getNoticeContent() == null : this.getNoticeContent().equals(other.getNoticeContent()))
            && (this.getNoticeCreateAdminId() == null ? other.getNoticeCreateAdminId() == null : this.getNoticeCreateAdminId().equals(other.getNoticeCreateAdminId()))
            && (this.getNoticeAddTime() == null ? other.getNoticeAddTime() == null : this.getNoticeAddTime().equals(other.getNoticeAddTime()))
            && (this.getNoticeUpdateTime() == null ? other.getNoticeUpdateTime() == null : this.getNoticeUpdateTime().equals(other.getNoticeUpdateTime()))
            && (this.getNoticeDeleted() == null ? other.getNoticeDeleted() == null : this.getNoticeDeleted().equals(other.getNoticeDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoticeId() == null) ? 0 : getNoticeId().hashCode());
        result = prime * result + ((getNoticeTitle() == null) ? 0 : getNoticeTitle().hashCode());
        result = prime * result + ((getNoticeContent() == null) ? 0 : getNoticeContent().hashCode());
        result = prime * result + ((getNoticeCreateAdminId() == null) ? 0 : getNoticeCreateAdminId().hashCode());
        result = prime * result + ((getNoticeAddTime() == null) ? 0 : getNoticeAddTime().hashCode());
        result = prime * result + ((getNoticeUpdateTime() == null) ? 0 : getNoticeUpdateTime().hashCode());
        result = prime * result + ((getNoticeDeleted() == null) ? 0 : getNoticeDeleted().hashCode());
        return result;
    }
}