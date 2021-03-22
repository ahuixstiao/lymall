package com.ly.lymall.db.domain;

import java.io.Serializable;
import java.util.Date;

public class LymallPermission implements Serializable {
    private Integer permissionId;

    private Integer roleId;

    private String permission;

    private Date permissionAddTime;

    private Date permissionUpdateTime;

    private Boolean permissionDeleted;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Date getPermissionAddTime() {
        return permissionAddTime;
    }

    public void setPermissionAddTime(Date permissionAddTime) {
        this.permissionAddTime = permissionAddTime;
    }

    public Date getPermissionUpdateTime() {
        return permissionUpdateTime;
    }

    public void setPermissionUpdateTime(Date permissionUpdateTime) {
        this.permissionUpdateTime = permissionUpdateTime;
    }

    public Boolean getPermissionDeleted() {
        return permissionDeleted;
    }

    public void setPermissionDeleted(Boolean permissionDeleted) {
        this.permissionDeleted = permissionDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionId=").append(permissionId);
        sb.append(", roleId=").append(roleId);
        sb.append(", permission=").append(permission);
        sb.append(", permissionAddTime=").append(permissionAddTime);
        sb.append(", permissionUpdateTime=").append(permissionUpdateTime);
        sb.append(", permissionDeleted=").append(permissionDeleted);
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
        LymallPermission other = (LymallPermission) that;
        return (this.getPermissionId() == null ? other.getPermissionId() == null : this.getPermissionId().equals(other.getPermissionId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getPermission() == null ? other.getPermission() == null : this.getPermission().equals(other.getPermission()))
            && (this.getPermissionAddTime() == null ? other.getPermissionAddTime() == null : this.getPermissionAddTime().equals(other.getPermissionAddTime()))
            && (this.getPermissionUpdateTime() == null ? other.getPermissionUpdateTime() == null : this.getPermissionUpdateTime().equals(other.getPermissionUpdateTime()))
            && (this.getPermissionDeleted() == null ? other.getPermissionDeleted() == null : this.getPermissionDeleted().equals(other.getPermissionDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPermissionId() == null) ? 0 : getPermissionId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getPermission() == null) ? 0 : getPermission().hashCode());
        result = prime * result + ((getPermissionAddTime() == null) ? 0 : getPermissionAddTime().hashCode());
        result = prime * result + ((getPermissionUpdateTime() == null) ? 0 : getPermissionUpdateTime().hashCode());
        result = prime * result + ((getPermissionDeleted() == null) ? 0 : getPermissionDeleted().hashCode());
        return result;
    }
}