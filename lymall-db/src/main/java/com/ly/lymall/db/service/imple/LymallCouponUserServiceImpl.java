package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallCouponUserMapper;
import com.ly.lymall.db.domain.LymallCouponUser;
import com.ly.lymall.db.dto.LymallUserCouponDTO;
import com.ly.lymall.db.service.LymallCouponUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: TODO
 * @DateTime: 2021/1/19 - 22:01
 **/
@Service
public class LymallCouponUserServiceImpl implements LymallCouponUserService {

    /**
     * couponUser mapper接口
     */
    @Resource
    private LymallCouponUserMapper couponUserMapper;

    /**
     * 该方法传入userId与couponId与status时只查询单张优惠券使用情况
     * 传入userId与status时则按状态来查询用户优惠券信息 比如查询该用户所有未使用的优惠券
     *
     * @param userId
     * @param couponId
     * @param status
     * @return List<LymallUserCouponDTO> 集合
     */
    @Override
    public List<LymallUserCouponDTO> selectByUserIdFindAllCoupon(Integer userId, Integer couponId, Short status, Integer currentPage, Integer limit) {

        PageHelper.startPage(currentPage, limit);

        return couponUserMapper.selectByUserIdFindAllCouponInfo(userId, couponId, status);
    }

    /**
     * 根据用户id添加优惠券
     *
     * @param userCoupon
     * @return int
     */
    @Override
    public int byUserIdAddCouponInfo(LymallCouponUser userCoupon) {

        return couponUserMapper.byUserIdAddCouponInfo(userCoupon);
    }
}
