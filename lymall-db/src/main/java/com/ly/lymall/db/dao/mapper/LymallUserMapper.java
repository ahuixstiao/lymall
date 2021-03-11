package com.ly.lymall.db.dao.mapper;

import com.ly.lymall.db.dao.provider.LymallUserSqlProvider;
import com.ly.lymall.db.domian.LymallUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.time.LocalDateTime;

@Mapper
public interface LymallUserMapper {
    /**
     * 删除
     *
     * @param userId
     * @return int
     */
    @Delete({
            "delete from lymall_user",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);
    //------------------------------------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------------------------------------
    //插入

    @Insert({
            "insert into lymall_user (user_username, user_password, ",
            "user_gender, user_birthday, ",
            "user_last_login_time, user_last_login_ip, ",
            "user_level, user_nickname, ",
            "user_mobile, user_avatar, ",
            "user_weixin_openid, user_session_key, ",
            "user_status, user_add_time, ",
            "user_update_time, user_deleted)",
            "values (#{userUsername,jdbcType=VARCHAR}, #{userPassword,jdbcType=VARCHAR}, ",
            "#{userGender,jdbcType=TINYINT}, #{userBirthday,jdbcType=DATE}, ",
            "#{userLastLoginTime,jdbcType=TIMESTAMP}, #{userLastLoginIp,jdbcType=VARCHAR}, ",
            "#{userLevel,jdbcType=TINYINT}, #{userNickname,jdbcType=VARCHAR}, ",
            "#{userMobile,jdbcType=VARCHAR}, #{userAvatar,jdbcType=VARCHAR}, ",
            "#{userWeixinOpenid,jdbcType=VARCHAR}, #{userSessionKey,jdbcType=VARCHAR}, ",
            "#{userStatus,jdbcType=TINYINT}, #{userAddTime,jdbcType=TIMESTAMP}, ",
            "#{userUpdateTime,jdbcType=TIMESTAMP}, #{userDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "userId", before = false, resultType = Integer.class)
    int insert(LymallUser record);

    @InsertProvider(type = LymallUserSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "userId", before = false, resultType = Integer.class)
    int insertSelective(LymallUser record);
    //------------------------------------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------------------------------------
    //查询

    @Select({
            "select",
            "user_id, user_username, user_password, user_gender, user_birthday, user_last_login_time, ",
            "user_last_login_ip, user_level, user_nickname, user_mobile, user_avatar, user_weixin_openid, ",
            "user_session_key, user_status, user_add_time, user_update_time, user_deleted",
            "from lymall_user",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results(id = "userResult", value = {
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_username", property = "userUsername", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_password", property = "userPassword", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_gender", property = "userGender", jdbcType = JdbcType.TINYINT),
            @Result(column = "user_birthday", property = "userBirthday", jdbcType = JdbcType.DATE),
            @Result(column = "user_last_login_time", property = "userLastLoginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_last_login_ip", property = "userLastLoginIp", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_level", property = "userLevel", jdbcType = JdbcType.TINYINT),
            @Result(column = "user_nickname", property = "userNickname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_mobile", property = "userMobile", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_avatar", property = "userAvatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_weixin_openid", property = "userWeixinOpenid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_session_key", property = "userSessionKey", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_status", property = "userStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "user_add_time", property = "userAddTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_update_time", property = "userUpdateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_deleted", property = "userDeleted", jdbcType = JdbcType.BIT)
    })
    LymallUser selectByPrimaryKey(Integer userId);

    /**
     * 根据传递进来的实体参数查询相应的用户数据 目前支持 id username password
     *
     * @param lymallUser
     * @return LymallUser
     */
    @Select({
            "select",
            "user_id, user_username, user_password, user_gender, user_birthday, user_last_login_time, ",
            "user_last_login_ip, user_level, user_nickname, user_mobile, user_avatar, user_weixin_openid, ",
            "user_session_key, user_status, user_add_time, user_update_time, user_deleted",
            "from lymall_user",
            "where user_username=#{userUsername} or user_password=#{userPassword} or user_mobile=#{userMobile}"
    })
    @ResultMap("userResult")
    LymallUser selectUserInfo(LymallUser lymallUser);

    /**
     * 验证用户输入的账号密码是否正确
     *
     * @param userUsername 用户账号
     * @param userPassword 用户密码
     */
    @Select({
            "select",
            "user_id, user_username, user_password, user_gender, user_birthday, user_last_login_time, ",
            "user_last_login_ip, user_level, user_nickname, user_mobile, user_avatar, user_weixin_openid, ",
            "user_session_key, user_status, user_add_time, user_update_time, user_deleted",
            "from lymall_user",
            "where user_username=#{userUsername} and user_password=#{userPassword}"
    })
    @ResultMap("userResult")
    LymallUser loginAuthentication(String userUsername, String userPassword);


    /**
     * 修改最后一次登录时间
     *
     * @param userLastLoginTime
     * @param userUsername
     * @return int
     */
    @Update({"update lymall_user",
            "set user_last_login_time=#{userLastLoginTime}",
            "where user_username=#{userUsername}"
    })
    int updateByLastLoginTime(LocalDateTime userLastLoginTime, String userUsername);

    /**
     * 修改密码
     *
     * @param userPassword
     * @param userUsername
     * @return int
     */
    @Update({"update lymall_user",
            "set user_password=#{userPassword}",
            "where user_username=#{userUsername}"
    })
    int updateByrePassword(String userPassword, String userUsername);


    @UpdateProvider(type = LymallUserSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LymallUser record);

    @Update({
            "update lymall_user",
            "set user_username = #{userUsername,jdbcType=VARCHAR},",
            "user_password = #{userPassword,jdbcType=VARCHAR},",
            "user_gender = #{userGender,jdbcType=TINYINT},",
            "user_birthday = #{userBirthday,jdbcType=DATE},",
            "user_last_login_time = #{userLastLoginTime,jdbcType=TIMESTAMP},",
            "user_last_login_ip = #{userLastLoginIp,jdbcType=VARCHAR},",
            "user_level = #{userLevel,jdbcType=TINYINT},",
            "user_nickname = #{userNickname,jdbcType=VARCHAR},",
            "user_mobile = #{userMobile,jdbcType=VARCHAR},",
            "user_avatar = #{userAvatar,jdbcType=VARCHAR},",
            "user_weixin_openid = #{userWeixinOpenid,jdbcType=VARCHAR},",
            "user_session_key = #{userSessionKey,jdbcType=VARCHAR},",
            "user_status = #{userStatus,jdbcType=TINYINT},",
            "user_add_time = #{userAddTime,jdbcType=TIMESTAMP},",
            "user_update_time = #{userUpdateTime,jdbcType=TIMESTAMP},",
            "user_deleted = #{userDeleted,jdbcType=BIT}",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LymallUser record);
}