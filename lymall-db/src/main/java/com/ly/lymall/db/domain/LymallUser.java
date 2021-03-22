package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class LymallUser implements Serializable {
    private Integer userId;

    private String userUsername;

    private String userPassword;

    private Byte userGender;

    private Date userBirthday;

    private LocalDateTime userLastLoginTime;

    private String userLastLoginIp;

    private Byte userLevel;

    private String userNickname;

    private String userMobile;

    private String userAvatar;

    private String userWeixinOpenid;

    private String userSessionKey;

    private Byte userStatus;

    private Date userAddTime;

    private Date userUpdateTime;

    private Boolean userDeleted;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Byte getUserGender() {
        return userGender;
    }

    public void setUserGender(Byte userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public LocalDateTime getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(LocalDateTime userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    public Byte getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserWeixinOpenid() {
        return userWeixinOpenid;
    }

    public void setUserWeixinOpenid(String userWeixinOpenid) {
        this.userWeixinOpenid = userWeixinOpenid;
    }

    public String getUserSessionKey() {
        return userSessionKey;
    }

    public void setUserSessionKey(String userSessionKey) {
        this.userSessionKey = userSessionKey;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserAddTime() {
        return userAddTime;
    }

    public void setUserAddTime(Date userAddTime) {
        this.userAddTime = userAddTime;
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Boolean getUserDeleted() {
        return userDeleted;
    }

    public void setUserDeleted(Boolean userDeleted) {
        this.userDeleted = userDeleted;
    }

    public LymallUser() {
        super();
    }

    public LymallUser(Integer userId, String userUsername, String userPassword, Byte userGender, Date userBirthday, LocalDateTime userLastLoginTime, String userLastLoginIp, Byte userLevel, String userNickname, String userMobile, String userAvatar, String userWeixinOpenid, String userSessionKey, Byte userStatus, Date userAddTime, Date userUpdateTime, Boolean userDeleted) {
        super();
        this.userId = userId;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userBirthday = userBirthday;
        this.userLastLoginTime = userLastLoginTime;
        this.userLastLoginIp = userLastLoginIp;
        this.userLevel = userLevel;
        this.userNickname = userNickname;
        this.userMobile = userMobile;
        this.userAvatar = userAvatar;
        this.userWeixinOpenid = userWeixinOpenid;
        this.userSessionKey = userSessionKey;
        this.userStatus = userStatus;
        this.userAddTime = userAddTime;
        this.userUpdateTime = userUpdateTime;
        this.userDeleted = userDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userUsername=").append(userUsername);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userGender=").append(userGender);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userLastLoginTime=").append(userLastLoginTime);
        sb.append(", userLastLoginIp=").append(userLastLoginIp);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userAvatar=").append(userAvatar);
        sb.append(", userWeixinOpenid=").append(userWeixinOpenid);
        sb.append(", userSessionKey=").append(userSessionKey);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userAddTime=").append(userAddTime);
        sb.append(", userUpdateTime=").append(userUpdateTime);
        sb.append(", userDeleted=").append(userDeleted);
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
        LymallUser other = (LymallUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserUsername() == null ? other.getUserUsername() == null : this.getUserUsername().equals(other.getUserUsername()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
            && (this.getUserLastLoginTime() == null ? other.getUserLastLoginTime() == null : this.getUserLastLoginTime().equals(other.getUserLastLoginTime()))
            && (this.getUserLastLoginIp() == null ? other.getUserLastLoginIp() == null : this.getUserLastLoginIp().equals(other.getUserLastLoginIp()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getUserAvatar() == null ? other.getUserAvatar() == null : this.getUserAvatar().equals(other.getUserAvatar()))
            && (this.getUserWeixinOpenid() == null ? other.getUserWeixinOpenid() == null : this.getUserWeixinOpenid().equals(other.getUserWeixinOpenid()))
            && (this.getUserSessionKey() == null ? other.getUserSessionKey() == null : this.getUserSessionKey().equals(other.getUserSessionKey()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserAddTime() == null ? other.getUserAddTime() == null : this.getUserAddTime().equals(other.getUserAddTime()))
            && (this.getUserUpdateTime() == null ? other.getUserUpdateTime() == null : this.getUserUpdateTime().equals(other.getUserUpdateTime()))
            && (this.getUserDeleted() == null ? other.getUserDeleted() == null : this.getUserDeleted().equals(other.getUserDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserUsername() == null) ? 0 : getUserUsername().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserLastLoginTime() == null) ? 0 : getUserLastLoginTime().hashCode());
        result = prime * result + ((getUserLastLoginIp() == null) ? 0 : getUserLastLoginIp().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getUserAvatar() == null) ? 0 : getUserAvatar().hashCode());
        result = prime * result + ((getUserWeixinOpenid() == null) ? 0 : getUserWeixinOpenid().hashCode());
        result = prime * result + ((getUserSessionKey() == null) ? 0 : getUserSessionKey().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserAddTime() == null) ? 0 : getUserAddTime().hashCode());
        result = prime * result + ((getUserUpdateTime() == null) ? 0 : getUserUpdateTime().hashCode());
        result = prime * result + ((getUserDeleted() == null) ? 0 : getUserDeleted().hashCode());
        return result;
    }
}