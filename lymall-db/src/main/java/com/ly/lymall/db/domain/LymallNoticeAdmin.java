package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallNoticeAdmin implements Serializable {
    private Integer noticeAdminId;

    private Integer noticeId;

    private String noticeTitle;

    private Integer noticeReceiveAdminId;

    private Date noticeAdminReadTime;

    private Date noticeAdminAddTime;

    private Date noticeAdminUpdateTime;

    private Boolean noticeAdminDeleted;

    public Integer getNoticeAdminId() {
        return noticeAdminId;
    }

    public void setNoticeAdminId(Integer noticeAdminId) {
        this.noticeAdminId = noticeAdminId;
    }

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

    public Integer getNoticeReceiveAdminId() {
        return noticeReceiveAdminId;
    }

    public void setNoticeReceiveAdminId(Integer noticeReceiveAdminId) {
        this.noticeReceiveAdminId = noticeReceiveAdminId;
    }

    public Date getNoticeAdminReadTime() {
        return noticeAdminReadTime;
    }

    public void setNoticeAdminReadTime(Date noticeAdminReadTime) {
        this.noticeAdminReadTime = noticeAdminReadTime;
    }

    public Date getNoticeAdminAddTime() {
        return noticeAdminAddTime;
    }

    public void setNoticeAdminAddTime(Date noticeAdminAddTime) {
        this.noticeAdminAddTime = noticeAdminAddTime;
    }

    public Date getNoticeAdminUpdateTime() {
        return noticeAdminUpdateTime;
    }

    public void setNoticeAdminUpdateTime(Date noticeAdminUpdateTime) {
        this.noticeAdminUpdateTime = noticeAdminUpdateTime;
    }

    public Boolean getNoticeAdminDeleted() {
        return noticeAdminDeleted;
    }

    public void setNoticeAdminDeleted(Boolean noticeAdminDeleted) {
        this.noticeAdminDeleted = noticeAdminDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeAdminId=").append(noticeAdminId);
        sb.append(", noticeId=").append(noticeId);
        sb.append(", noticeTitle=").append(noticeTitle);
        sb.append(", noticeReceiveAdminId=").append(noticeReceiveAdminId);
        sb.append(", noticeAdminReadTime=").append(noticeAdminReadTime);
        sb.append(", noticeAdminAddTime=").append(noticeAdminAddTime);
        sb.append(", noticeAdminUpdateTime=").append(noticeAdminUpdateTime);
        sb.append(", noticeAdminDeleted=").append(noticeAdminDeleted);
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
        LymallNoticeAdmin other = (LymallNoticeAdmin) that;
        return (this.getNoticeAdminId() == null ? other.getNoticeAdminId() == null : this.getNoticeAdminId().equals(other.getNoticeAdminId()))
            && (this.getNoticeId() == null ? other.getNoticeId() == null : this.getNoticeId().equals(other.getNoticeId()))
            && (this.getNoticeTitle() == null ? other.getNoticeTitle() == null : this.getNoticeTitle().equals(other.getNoticeTitle()))
            && (this.getNoticeReceiveAdminId() == null ? other.getNoticeReceiveAdminId() == null : this.getNoticeReceiveAdminId().equals(other.getNoticeReceiveAdminId()))
            && (this.getNoticeAdminReadTime() == null ? other.getNoticeAdminReadTime() == null : this.getNoticeAdminReadTime().equals(other.getNoticeAdminReadTime()))
            && (this.getNoticeAdminAddTime() == null ? other.getNoticeAdminAddTime() == null : this.getNoticeAdminAddTime().equals(other.getNoticeAdminAddTime()))
            && (this.getNoticeAdminUpdateTime() == null ? other.getNoticeAdminUpdateTime() == null : this.getNoticeAdminUpdateTime().equals(other.getNoticeAdminUpdateTime()))
            && (this.getNoticeAdminDeleted() == null ? other.getNoticeAdminDeleted() == null : this.getNoticeAdminDeleted().equals(other.getNoticeAdminDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoticeAdminId() == null) ? 0 : getNoticeAdminId().hashCode());
        result = prime * result + ((getNoticeId() == null) ? 0 : getNoticeId().hashCode());
        result = prime * result + ((getNoticeTitle() == null) ? 0 : getNoticeTitle().hashCode());
        result = prime * result + ((getNoticeReceiveAdminId() == null) ? 0 : getNoticeReceiveAdminId().hashCode());
        result = prime * result + ((getNoticeAdminReadTime() == null) ? 0 : getNoticeAdminReadTime().hashCode());
        result = prime * result + ((getNoticeAdminAddTime() == null) ? 0 : getNoticeAdminAddTime().hashCode());
        result = prime * result + ((getNoticeAdminUpdateTime() == null) ? 0 : getNoticeAdminUpdateTime().hashCode());
        result = prime * result + ((getNoticeAdminDeleted() == null) ? 0 : getNoticeAdminDeleted().hashCode());
        return result;
    }
}