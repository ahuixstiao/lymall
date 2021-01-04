package com.ly.lymall.db.dto;

import java.util.Date;

/**
 * @Author: Ahui
 * @Description: 用户评价DTO
 * @DateTime: 2020/12/31 - 09:19
 **/
public class LymallUserCommentDTO {

    //comment

    private Integer commentId;

    private Integer commentValueId;

    private Byte commentType;

    private String commentContent;

    private String commentAdminContent;

    private Boolean commentHasPicture;

    private String commentPicUrls;

    private Short commentStar;

    private Date commentAddTime;

    private Date commentUpdateTime;

    private Boolean commentDeleted;

    //user

    private Integer userId;

    private String userNickname;

    private String userAvatar;

    public LymallUserCommentDTO() {
        super();
    }

    public LymallUserCommentDTO(Integer commentId, Integer commentValueId, Byte commentType, String commentContent, String commentAdminContent, Boolean commentHasPicture, String commentPicUrls, Short commentStar, Date commentAddTime, Date commentUpdateTime, Boolean commentDeleted, Integer userId, String userNickname, String userAvatar) {
        super();
        this.commentId = commentId;
        this.commentValueId = commentValueId;
        this.commentType = commentType;
        this.commentContent = commentContent;
        this.commentAdminContent = commentAdminContent;
        this.commentHasPicture = commentHasPicture;
        this.commentPicUrls = commentPicUrls;
        this.commentStar = commentStar;
        this.commentAddTime = commentAddTime;
        this.commentUpdateTime = commentUpdateTime;
        this.commentDeleted = commentDeleted;
        this.userId = userId;
        this.userNickname = userNickname;
        this.userAvatar = userAvatar;
    }

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    @Override
    public String toString() {
        return "LymallUserCommentDTO{" +
                "commentId=" + commentId +
                ", commentValueId=" + commentValueId +
                ", commentType=" + commentType +
                ", commentContent='" + commentContent + '\'' +
                ", commentAdminContent='" + commentAdminContent + '\'' +
                ", commentHasPicture=" + commentHasPicture +
                ", commentPicUrls='" + commentPicUrls + '\'' +
                ", commentStar=" + commentStar +
                ", commentAddTime=" + commentAddTime +
                ", commentUpdateTime=" + commentUpdateTime +
                ", commentDeleted=" + commentDeleted +
                ", userId=" + userId +
                ", userNickname='" + userNickname + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                '}';
    }
}
