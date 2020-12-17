package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallCoupon;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:21
 * @Description: 填写该类的描述
 */
public interface LymallCouponService {

    /**
     * 查询全部 优惠券信息 并分页
     * @param currentPage
     * @param count
     * @return List<LymallCoupon>
     */
    List<LymallCoupon> selectFindAll(Integer currentPage,Integer count);

}
