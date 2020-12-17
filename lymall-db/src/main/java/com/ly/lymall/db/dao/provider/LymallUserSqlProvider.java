package com.ly.lymall.db.dao.provider;

import com.ly.lymall.db.domian.LymallUser;
import org.apache.ibatis.jdbc.SQL;

public class LymallUserSqlProvider {
    public String insertSelective(LymallUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lymall_user");
        
        if (record.getUserUsername() != null) {
            sql.VALUES("user_username", "#{userUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.VALUES("user_password", "#{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGender() != null) {
            sql.VALUES("user_gender", "#{userGender,jdbcType=TINYINT}");
        }
        
        if (record.getUserBirthday() != null) {
            sql.VALUES("user_birthday", "#{userBirthday,jdbcType=DATE}");
        }
        
        if (record.getUserLastLoginTime() != null) {
            sql.VALUES("user_last_login_time", "#{userLastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserLastLoginIp() != null) {
            sql.VALUES("user_last_login_ip", "#{userLastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            sql.VALUES("user_level", "#{userLevel,jdbcType=TINYINT}");
        }
        
        if (record.getUserNickname() != null) {
            sql.VALUES("user_nickname", "#{userNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.VALUES("user_mobile", "#{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAvatar() != null) {
            sql.VALUES("user_avatar", "#{userAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWeixinOpenid() != null) {
            sql.VALUES("user_weixin_openid", "#{userWeixinOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSessionKey() != null) {
            sql.VALUES("user_session_key", "#{userSessionKey,jdbcType=VARCHAR}");
        }
        
        if (record.getUserStatus() != null) {
            sql.VALUES("user_status", "#{userStatus,jdbcType=TINYINT}");
        }
        
        if (record.getUserAddTime() != null) {
            sql.VALUES("user_add_time", "#{userAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserUpdateTime() != null) {
            sql.VALUES("user_update_time", "#{userUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserDeleted() != null) {
            sql.VALUES("user_deleted", "#{userDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LymallUser record) {
        SQL sql = new SQL();
        sql.UPDATE("lymall_user");
        
        if (record.getUserUsername() != null) {
            sql.SET("user_username = #{userUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.SET("user_password = #{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserGender() != null) {
            sql.SET("user_gender = #{userGender,jdbcType=TINYINT}");
        }
        
        if (record.getUserBirthday() != null) {
            sql.SET("user_birthday = #{userBirthday,jdbcType=DATE}");
        }
        
        if (record.getUserLastLoginTime() != null) {
            sql.SET("user_last_login_time = #{userLastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserLastLoginIp() != null) {
            sql.SET("user_last_login_ip = #{userLastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            sql.SET("user_level = #{userLevel,jdbcType=TINYINT}");
        }
        
        if (record.getUserNickname() != null) {
            sql.SET("user_nickname = #{userNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.SET("user_mobile = #{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAvatar() != null) {
            sql.SET("user_avatar = #{userAvatar,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWeixinOpenid() != null) {
            sql.SET("user_weixin_openid = #{userWeixinOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSessionKey() != null) {
            sql.SET("user_session_key = #{userSessionKey,jdbcType=VARCHAR}");
        }
        
        if (record.getUserStatus() != null) {
            sql.SET("user_status = #{userStatus,jdbcType=TINYINT}");
        }
        
        if (record.getUserAddTime() != null) {
            sql.SET("user_add_time = #{userAddTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserUpdateTime() != null) {
            sql.SET("user_update_time = #{userUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserDeleted() != null) {
            sql.SET("user_deleted = #{userDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("user_id = #{userId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}