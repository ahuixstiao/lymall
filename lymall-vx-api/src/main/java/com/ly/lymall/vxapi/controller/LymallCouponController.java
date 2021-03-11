package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallCoupon;
import com.ly.lymall.db.domian.LymallCouponUser;
import com.ly.lymall.db.dto.LymallUserCouponDTO;
import com.ly.lymall.db.service.LymallCouponService;
import com.ly.lymall.db.service.LymallCouponUserService;
import com.ly.lymall.vxapi.utils.ExceptionCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: 优惠券 表现层
 * @DateTime: 2021/1/20 - 11:42
 **/
@RestController
@RequestMapping(path = "/wx")
public class LymallCouponController {

    /**
     * 优惠券 业务层接口
     */
    @Resource
    private LymallCouponService couponService;

    /**
     * 用户优惠券信息 业务层接口
     */
    @Resource
    private LymallCouponUserService couponUserService;

    /**
     * 领取优惠券 先查询账户中是否存在该优惠券再执行领取
     * @param couponId
     * @param userId
     * @return Object
     */
    @RequestMapping(path = "coupon/getCoupon")
    public Object getCouponInfo(Integer couponId,Integer userId,Short status){
        //查询用户要领取的优惠券信息
        LymallCoupon coupon=couponService.selectByCouponIdFindCouponInfo(couponId);
        //查询用户的优惠券是否存在该优惠券并且未使用
        List<LymallUserCouponDTO> couponUsers=couponUserService.selectByUserIdFindAllCoupon(userId,couponId,status,1,10);

        //判断该用户未领取该优惠券或该优惠券不处于未使用状态
        if(couponUsers==null && couponUsers.size()==0){
            LymallCouponUser lymallCouponUser=new LymallCouponUser();
            lymallCouponUser.setUserId(userId);
            lymallCouponUser.setCouponId(couponId);
            lymallCouponUser.setCouponUserStartTime(LocalDateTime.now());
            lymallCouponUser.setCouponUserEndTime(LocalDateTime.now().plusDays(coupon.getCouponDays()));
            lymallCouponUser.setCouponUserAddTime(LocalDateTime.now());
            //插入数据库
            couponUserService.byUserIdAddCouponInfo(lymallCouponUser);
            return ResponseUtil.ok();
        }
        return ResponseUtil.fail();
    }

    /**
     * 获取用户优惠券信息
     * @param userId
     * @param status
     * @return Object
     */
    @RequestMapping(path = "coupon/selectUserCoupon")
    public Object getUserCouponInfo(Integer userId,Short status,Integer currentPage,Integer limit){
        /**
         * 查询用户已有优惠券 按照userId与status状态来查询
         */
        List<LymallUserCouponDTO> lymallCouponUsers=couponUserService.selectByUserIdFindAllCoupon(userId,null,status,currentPage,limit);
        if(lymallCouponUsers.size()!=0){
            //需要返回的数据是 用户所拥有的优惠券信息与优惠券有效开始时间与结束时间
            return ResponseUtil.okListPage(lymallCouponUsers);
        }
        return ResponseUtil.fail();
    }

    /**
     * 使用兑换码兑换优惠券
     * @param code
     * @param userId
     * @return Object
     */
    @RequestMapping(path = "coupon/promoCodGetCoupon")
    public Object byPromoCodGetCoupon(String code,Integer userId){
        //通过兑换码查询是否存在该优惠券 再查询用户是否已领取
        LymallCoupon lymallCoupon=couponService.selectByPromoCodFindCoupon(code);
        if(lymallCoupon!=null){
            LymallCouponUser lymallCouponUser=new LymallCouponUser();
            lymallCouponUser.setUserId(userId);
            lymallCouponUser.setCouponId(lymallCoupon.getCouponId());
            lymallCouponUser.setCouponUserStartTime(LocalDateTime.now());
            lymallCouponUser.setCouponUserEndTime(LocalDateTime.now().plusDays(lymallCoupon.getCouponDays()));
            lymallCouponUser.setCouponUserAddTime(LocalDateTime.now());
            couponUserService.byUserIdAddCouponInfo(lymallCouponUser);
            return ResponseUtil.ok();
        }
        return ResponseUtil.fail(ExceptionCode.COUPON_CODE_INVALID,"优惠码不存在");
    }
}
