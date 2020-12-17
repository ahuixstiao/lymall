package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallLog implements Serializable {
    private Integer logId;

    private String logAdmin;

    private String logIp;

    private Integer logType;

    private String logAction;

    private Boolean logStatus;

    private String logResult;

    private String logComment;

    private Date logAddTime;

    private Date logUpdateTime;

    private Boolean logDeleted;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogAdmin() {
        return logAdmin;
    }

    public void setLogAdmin(String logAdmin) {
        this.logAdmin = logAdmin;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getLogAction() {
        return logAction;
    }

    public void setLogAction(String logAction) {
        this.logAction = logAction;
    }

    public Boolean getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Boolean logStatus) {
        this.logStatus = logStatus;
    }

    public String getLogResult() {
        return logResult;
    }

    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    public String getLogComment() {
        return logComment;
    }

    public void setLogComment(String logComment) {
        this.logComment = logComment;
    }

    public Date getLogAddTime() {
        return logAddTime;
    }

    public void setLogAddTime(Date logAddTime) {
        this.logAddTime = logAddTime;
    }

    public Date getLogUpdateTime() {
        return logUpdateTime;
    }

    public void setLogUpdateTime(Date logUpdateTime) {
        this.logUpdateTime = logUpdateTime;
    }

    public Boolean getLogDeleted() {
        return logDeleted;
    }

    public void setLogDeleted(Boolean logDeleted) {
        this.logDeleted = logDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logAdmin=").append(logAdmin);
        sb.append(", logIp=").append(logIp);
        sb.append(", logType=").append(logType);
        sb.append(", logAction=").append(logAction);
        sb.append(", logStatus=").append(logStatus);
        sb.append(", logResult=").append(logResult);
        sb.append(", logComment=").append(logComment);
        sb.append(", logAddTime=").append(logAddTime);
        sb.append(", logUpdateTime=").append(logUpdateTime);
        sb.append(", logDeleted=").append(logDeleted);
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
        LymallLog other = (LymallLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogAdmin() == null ? other.getLogAdmin() == null : this.getLogAdmin().equals(other.getLogAdmin()))
            && (this.getLogIp() == null ? other.getLogIp() == null : this.getLogIp().equals(other.getLogIp()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogAction() == null ? other.getLogAction() == null : this.getLogAction().equals(other.getLogAction()))
            && (this.getLogStatus() == null ? other.getLogStatus() == null : this.getLogStatus().equals(other.getLogStatus()))
            && (this.getLogResult() == null ? other.getLogResult() == null : this.getLogResult().equals(other.getLogResult()))
            && (this.getLogComment() == null ? other.getLogComment() == null : this.getLogComment().equals(other.getLogComment()))
            && (this.getLogAddTime() == null ? other.getLogAddTime() == null : this.getLogAddTime().equals(other.getLogAddTime()))
            && (this.getLogUpdateTime() == null ? other.getLogUpdateTime() == null : this.getLogUpdateTime().equals(other.getLogUpdateTime()))
            && (this.getLogDeleted() == null ? other.getLogDeleted() == null : this.getLogDeleted().equals(other.getLogDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogAdmin() == null) ? 0 : getLogAdmin().hashCode());
        result = prime * result + ((getLogIp() == null) ? 0 : getLogIp().hashCode());
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getLogAction() == null) ? 0 : getLogAction().hashCode());
        result = prime * result + ((getLogStatus() == null) ? 0 : getLogStatus().hashCode());
        result = prime * result + ((getLogResult() == null) ? 0 : getLogResult().hashCode());
        result = prime * result + ((getLogComment() == null) ? 0 : getLogComment().hashCode());
        result = prime * result + ((getLogAddTime() == null) ? 0 : getLogAddTime().hashCode());
        result = prime * result + ((getLogUpdateTime() == null) ? 0 : getLogUpdateTime().hashCode());
        result = prime * result + ((getLogDeleted() == null) ? 0 : getLogDeleted().hashCode());
        return result;
    }
}