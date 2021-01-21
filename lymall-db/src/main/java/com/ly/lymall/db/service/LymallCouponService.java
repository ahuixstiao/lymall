package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallCoupon;
import com.ly.lymall.db.domian.LymallCouponUser;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:21
 * @Description: 优惠券信息 Service接口
 */
public interface LymallCouponService {

    /**
     * 查询全部 优惠券信息 并分页
     * @param currentPage
     * @param count
     * @return List<LymallCoupon>
     */
    List<LymallCoupon> selectFindAllCoupon(Integer currentPage,Integer count);

    /**
     * 根据couponId查询优惠券信息
     * @param couponId
     * @return LymallCoupon
     */
    LymallCoupon selectByCouponIdFindCouponInfo(Integer couponId);

    /**
     * 通过优惠码查找优惠券信息
     * @param code
     * @return LymallCoupon
     */
    LymallCoupon selectByPromoCodFindCoupon(String code);
}
