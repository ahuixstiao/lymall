package com.ly.lymall.db.service.imple;

import com.github.pagehelper.PageHelper;
import com.ly.lymall.db.dao.mapper.LymallCouponMapper;
import com.ly.lymall.db.domian.LymallCoupon;
import com.ly.lymall.db.service.LymallCouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:21
 * @Description: 优惠券 业务层实现类
 */
@Service
public class LymallCouponServiceImpl implements LymallCouponService {

    @Resource
    private LymallCouponMapper couponMapper;

    /**
     * 查询全部 优惠券信息 并分页
     * @param currentPage
     * @param count
     * @return List<LymallCoupon>
     */
    @Override
    public List<LymallCoupon> selectFindAll(Integer currentPage,Integer count){

        //分页
        PageHelper.startPage(currentPage,count);

        return couponMapper.selectFindAll();
    }
}
