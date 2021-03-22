package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallIssue implements Serializable {
    private Integer issueId;

    private String issueQuestion;

    private String issueAnswer;

    private Date issueAddTime;

    private Date issueUpdateTime;

    private Boolean issueDeleted;

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getIssueQuestion() {
        return issueQuestion;
    }

    public void setIssueQuestion(String issueQuestion) {
        this.issueQuestion = issueQuestion;
    }

    public String getIssueAnswer() {
        return issueAnswer;
    }

    public void setIssueAnswer(String issueAnswer) {
        this.issueAnswer = issueAnswer;
    }

    public Date getIssueAddTime() {
        return issueAddTime;
    }

    public void setIssueAddTime(Date issueAddTime) {
        this.issueAddTime = issueAddTime;
    }

    public Date getIssueUpdateTime() {
        return issueUpdateTime;
    }

    public void setIssueUpdateTime(Date issueUpdateTime) {
        this.issueUpdateTime = issueUpdateTime;
    }

    public Boolean getIssueDeleted() {
        return issueDeleted;
    }

    public void setIssueDeleted(Boolean issueDeleted) {
        this.issueDeleted = issueDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", issueId=").append(issueId);
        sb.append(", issueQuestion=").append(issueQuestion);
        sb.append(", issueAnswer=").append(issueAnswer);
        sb.append(", issueAddTime=").append(issueAddTime);
        sb.append(", issueUpdateTime=").append(issueUpdateTime);
        sb.append(", issueDeleted=").append(issueDeleted);
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
        LymallIssue other = (LymallIssue) that;
        return (this.getIssueId() == null ? other.getIssueId() == null : this.getIssueId().equals(other.getIssueId()))
            && (this.getIssueQuestion() == null ? other.getIssueQuestion() == null : this.getIssueQuestion().equals(other.getIssueQuestion()))
            && (this.getIssueAnswer() == null ? other.getIssueAnswer() == null : this.getIssueAnswer().equals(other.getIssueAnswer()))
            && (this.getIssueAddTime() == null ? other.getIssueAddTime() == null : this.getIssueAddTime().equals(other.getIssueAddTime()))
            && (this.getIssueUpdateTime() == null ? other.getIssueUpdateTime() == null : this.getIssueUpdateTime().equals(other.getIssueUpdateTime()))
            && (this.getIssueDeleted() == null ? other.getIssueDeleted() == null : this.getIssueDeleted().equals(other.getIssueDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIssueId() == null) ? 0 : getIssueId().hashCode());
        result = prime * result + ((getIssueQuestion() == null) ? 0 : getIssueQuestion().hashCode());
        result = prime * result + ((getIssueAnswer() == null) ? 0 : getIssueAnswer().hashCode());
        result = prime * result + ((getIssueAddTime() == null) ? 0 : getIssueAddTime().hashCode());
        result = prime * result + ((getIssueUpdateTime() == null) ? 0 : getIssueUpdateTime().hashCode());
        result = prime * result + ((getIssueDeleted() == null) ? 0 : getIssueDeleted().hashCode());
        return result;
    }
}