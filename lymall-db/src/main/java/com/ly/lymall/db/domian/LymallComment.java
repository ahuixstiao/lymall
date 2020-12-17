package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallComment implements Serializable {
    private Integer commentId;

    private Integer commentValueId;

    private Byte commentType;

    private String commentContent;

    private String commentAdminContent;

    private Integer userId;

    private Boolean commentHasPicture;

    private String commentPicUrls;

    private Short commentStar;

    private Date commentAddTime;

    private Date commentUpdateTime;

    private Boolean commentDeleted;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentValueId() {
        return commentValueId;
    }

    public void setCommentValueId(Integer commentValueId) {
        this.commentValueId = commentValueId;
    }

    public Byte getCommentType() {
        return commentType;
    }

    public void setCommentType(Byte commentType) {
        this.commentType = commentType;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentAdminContent() {
        return commentAdminContent;
    }

    public void setCommentAdminContent(String commentAdminContent) {
        this.commentAdminContent = commentAdminContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getCommentHasPicture() {
        return commentHasPicture;
    }

    public void setCommentHasPicture(Boolean commentHasPicture) {
        this.commentHasPicture = commentHasPicture;
    }

    public String getCommentPicUrls() {
        return commentPicUrls;
    }

    public void setCommentPicUrls(String commentPicUrls) {
        this.commentPicUrls = commentPicUrls;
    }

    public Short getCommentStar() {
        return commentStar;
    }

    public void setCommentStar(Short commentStar) {
        this.commentStar = commentStar;
    }

    public Date getCommentAddTime() {
        return commentAddTime;
    }

    public void setCommentAddTime(Date commentAddTime) {
        this.commentAddTime = commentAddTime;
    }

    public Date getCommentUpdateTime() {
        return commentUpdateTime;
    }

    public void setCommentUpdateTime(Date commentUpdateTime) {
        this.commentUpdateTime = commentUpdateTime;
    }

    public Boolean getCommentDeleted() {
        return commentDeleted;
    }

    public void setCommentDeleted(Boolean commentDeleted) {
        this.commentDeleted = commentDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", commentValueId=").append(commentValueId);
        sb.append(", commentType=").append(commentType);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", commentAdminContent=").append(commentAdminContent);
        sb.append(", userId=").append(userId);
        sb.append(", commentHasPicture=").append(commentHasPicture);
        sb.append(", commentPicUrls=").append(commentPicUrls);
        sb.append(", commentStar=").append(commentStar);
        sb.append(", commentAddTime=").append(commentAddTime);
        sb.append(", commentUpdateTime=").append(commentUpdateTime);
        sb.append(", commentDeleted=").append(commentDeleted);
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
        LymallComment other = (LymallComment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getCommentValueId() == null ? other.getCommentValueId() == null : this.getCommentValueId().equals(other.getCommentValueId()))
            && (this.getCommentType() == null ? other.getCommentType() == null : this.getCommentType().equals(other.getCommentType()))
            && (this.getCommentContent() == null ? other.getCommentContent() == null : this.getCommentContent().equals(other.getCommentContent()))
            && (this.getCommentAdminContent() == null ? other.getCommentAdminContent() == null : this.getCommentAdminContent().equals(other.getCommentAdminContent()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCommentHasPicture() == null ? other.getCommentHasPicture() == null : this.getCommentHasPicture().equals(other.getCommentHasPicture()))
            && (this.getCommentPicUrls() == null ? other.getCommentPicUrls() == null : this.getCommentPicUrls().equals(other.getCommentPicUrls()))
            && (this.getCommentStar() == null ? other.getCommentStar() == null : this.getCommentStar().equals(other.getCommentStar()))
            && (this.getCommentAddTime() == null ? other.getCommentAddTime() == null : this.getCommentAddTime().equals(other.getCommentAddTime()))
            && (this.getCommentUpdateTime() == null ? other.getCommentUpdateTime() == null : this.getCommentUpdateTime().equals(other.getCommentUpdateTime()))
            && (this.getCommentDeleted() == null ? other.getCommentDeleted() == null : this.getCommentDeleted().equals(other.getCommentDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getCommentValueId() == null) ? 0 : getCommentValueId().hashCode());
        result = prime * result + ((getCommentType() == null) ? 0 : getCommentType().hashCode());
        result = prime * result + ((getCommentContent() == null) ? 0 : getCommentContent().hashCode());
        result = prime * result + ((getCommentAdminContent() == null) ? 0 : getCommentAdminContent().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCommentHasPicture() == null) ? 0 : getCommentHasPicture().hashCode());
        result = prime * result + ((getCommentPicUrls() == null) ? 0 : getCommentPicUrls().hashCode());
        result = prime * result + ((getCommentStar() == null) ? 0 : getCommentStar().hashCode());
        result = prime * result + ((getCommentAddTime() == null) ? 0 : getCommentAddTime().hashCode());
        result = prime * result + ((getCommentUpdateTime() == null) ? 0 : getCommentUpdateTime().hashCode());
        result = prime * result + ((getCommentDeleted() == null) ? 0 : getCommentDeleted().hashCode());
        return result;
    }
}