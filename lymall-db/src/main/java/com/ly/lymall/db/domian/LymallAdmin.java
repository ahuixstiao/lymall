package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallAdmin implements Serializable {
    private Integer adminId;

    private String adminUsername;

    private String adminPassword;

    private String adminLastLoginIp;

    private Date adminLastLoginTime;

    private String adminAvatar;

    private Date adminAddTime;

    private Date adminUpdateTime;

    private Boolean adminDeleted;

    private String adminRoleIds;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminLastLoginIp() {
        return adminLastLoginIp;
    }

    public void setAdminLastLoginIp(String adminLastLoginIp) {
        this.adminLastLoginIp = adminLastLoginIp;
    }

    public Date getAdminLastLoginTime() {
        return adminLastLoginTime;
    }

    public void setAdminLastLoginTime(Date adminLastLoginTime) {
        this.adminLastLoginTime = adminLastLoginTime;
    }

    public String getAdminAvatar() {
        return adminAvatar;
    }

    public void setAdminAvatar(String adminAvatar) {
        this.adminAvatar = adminAvatar;
    }

    public Date getAdminAddTime() {
        return adminAddTime;
    }

    public void setAdminAddTime(Date adminAddTime) {
        this.adminAddTime = adminAddTime;
    }

    public Date getAdminUpdateTime() {
        return adminUpdateTime;
    }

    public void setAdminUpdateTime(Date adminUpdateTime) {
        this.adminUpdateTime = adminUpdateTime;
    }

    public Boolean getAdminDeleted() {
        return adminDeleted;
    }

    public void setAdminDeleted(Boolean adminDeleted) {
        this.adminDeleted = adminDeleted;
    }

    public String getAdminRoleIds() {
        return adminRoleIds;
    }

    public void setAdminRoleIds(String adminRoleIds) {
        this.adminRoleIds = adminRoleIds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminUsername=").append(adminUsername);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminLastLoginIp=").append(adminLastLoginIp);
        sb.append(", adminLastLoginTime=").append(adminLastLoginTime);
        sb.append(", adminAvatar=").append(adminAvatar);
        sb.append(", adminAddTime=").append(adminAddTime);
        sb.append(", adminUpdateTime=").append(adminUpdateTime);
        sb.append(", adminDeleted=").append(adminDeleted);
        sb.append(", adminRoleIds=").append(adminRoleIds);
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
        LymallAdmin other = (LymallAdmin) that;
        return (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getAdminUsername() == null ? other.getAdminUsername() == null : this.getAdminUsername().equals(other.getAdminUsername()))
            && (this.getAdminPassword() == null ? other.getAdminPassword() == null : this.getAdminPassword().equals(other.getAdminPassword()))
            && (this.getAdminLastLoginIp() == null ? other.getAdminLastLoginIp() == null : this.getAdminLastLoginIp().equals(other.getAdminLastLoginIp()))
            && (this.getAdminLastLoginTime() == null ? other.getAdminLastLoginTime() == null : this.getAdminLastLoginTime().equals(other.getAdminLastLoginTime()))
            && (this.getAdminAvatar() == null ? other.getAdminAvatar() == null : this.getAdminAvatar().equals(other.getAdminAvatar()))
            && (this.getAdminAddTime() == null ? other.getAdminAddTime() == null : this.getAdminAddTime().equals(other.getAdminAddTime()))
            && (this.getAdminUpdateTime() == null ? other.getAdminUpdateTime() == null : this.getAdminUpdateTime().equals(other.getAdminUpdateTime()))
            && (this.getAdminDeleted() == null ? other.getAdminDeleted() == null : this.getAdminDeleted().equals(other.getAdminDeleted()))
            && (this.getAdminRoleIds() == null ? other.getAdminRoleIds() == null : this.getAdminRoleIds().equals(other.getAdminRoleIds()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getAdminUsername() == null) ? 0 : getAdminUsername().hashCode());
        result = prime * result + ((getAdminPassword() == null) ? 0 : getAdminPassword().hashCode());
        result = prime * result + ((getAdminLastLoginIp() == null) ? 0 : getAdminLastLoginIp().hashCode());
        result = prime * result + ((getAdminLastLoginTime() == null) ? 0 : getAdminLastLoginTime().hashCode());
        result = prime * result + ((getAdminAvatar() == null) ? 0 : getAdminAvatar().hashCode());
        result = prime * result + ((getAdminAddTime() == null) ? 0 : getAdminAddTime().hashCode());
        result = prime * result + ((getAdminUpdateTime() == null) ? 0 : getAdminUpdateTime().hashCode());
        result = prime * result + ((getAdminDeleted() == null) ? 0 : getAdminDeleted().hashCode());
        result = prime * result + ((getAdminRoleIds() == null) ? 0 : getAdminRoleIds().hashCode());
        return result;
    }
}