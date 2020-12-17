package com.ly.lymall.db.domian;

import java.io.Serializable;
import java.util.Date;

public class LymallRole implements Serializable {
    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private Boolean roleEnabled;

    private Date roleAddTime;

    private Date roleUpdateTime;

    private Boolean roleDeleted;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Boolean getRoleEnabled() {
        return roleEnabled;
    }

    public void setRoleEnabled(Boolean roleEnabled) {
        this.roleEnabled = roleEnabled;
    }

    public Date getRoleAddTime() {
        return roleAddTime;
    }

    public void setRoleAddTime(Date roleAddTime) {
        this.roleAddTime = roleAddTime;
    }

    public Date getRoleUpdateTime() {
        return roleUpdateTime;
    }

    public void setRoleUpdateTime(Date roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }

    public Boolean getRoleDeleted() {
        return roleDeleted;
    }

    public void setRoleDeleted(Boolean roleDeleted) {
        this.roleDeleted = roleDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleDesc=").append(roleDesc);
        sb.append(", roleEnabled=").append(roleEnabled);
        sb.append(", roleAddTime=").append(roleAddTime);
        sb.append(", roleUpdateTime=").append(roleUpdateTime);
        sb.append(", roleDeleted=").append(roleDeleted);
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
        LymallRole other = (LymallRole) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleDesc() == null ? other.getRoleDesc() == null : this.getRoleDesc().equals(other.getRoleDesc()))
            && (this.getRoleEnabled() == null ? other.getRoleEnabled() == null : this.getRoleEnabled().equals(other.getRoleEnabled()))
            && (this.getRoleAddTime() == null ? other.getRoleAddTime() == null : this.getRoleAddTime().equals(other.getRoleAddTime()))
            && (this.getRoleUpdateTime() == null ? other.getRoleUpdateTime() == null : this.getRoleUpdateTime().equals(other.getRoleUpdateTime()))
            && (this.getRoleDeleted() == null ? other.getRoleDeleted() == null : this.getRoleDeleted().equals(other.getRoleDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleDesc() == null) ? 0 : getRoleDesc().hashCode());
        result = prime * result + ((getRoleEnabled() == null) ? 0 : getRoleEnabled().hashCode());
        result = prime * result + ((getRoleAddTime() == null) ? 0 : getRoleAddTime().hashCode());
        result = prime * result + ((getRoleUpdateTime() == null) ? 0 : getRoleUpdateTime().hashCode());
        result = prime * result + ((getRoleDeleted() == null) ? 0 : getRoleDeleted().hashCode());
        return result;
    }
}