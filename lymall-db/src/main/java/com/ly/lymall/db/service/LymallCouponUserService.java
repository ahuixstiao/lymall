package com.ly.lymall.db.service;

import com.ly.lymall.db.domain.LymallCouponUser;
import com.ly.lymall.db.dto.LymallUserCouponDTO;

import java.util.List;

/**
 * @Author: Ahui
 * @Description: 用户优惠券信息 Service接口
 * @DateTime: 2021/1/19 - 22:01
 **/
public interface LymallCouponUserService {


    /**
     * 该方法传入userId与couponId与status时只查询单张优惠券使用情况
     * 传入userId与status时则按状态来查询用户优惠券信息 比如查询该用户所有未使用的优惠券
     * @param userId
     * @param couponId
     * @param status
     * @return List<LymallCouponUser> 集合
     */
    List<LymallUserCouponDTO> selectByUserIdFindAllCoupon(Integer userId, Integer couponId, Short status,Integer currentPage,Integer limit);

    /**
     * 根据用户id添加优惠券
     * @param userCoupon
     * @return int
     */
    int byUserIdAddCouponInfo(LymallCouponUser userCoupon);


}
