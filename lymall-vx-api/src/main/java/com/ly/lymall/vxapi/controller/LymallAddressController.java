package com.ly.lymall.vxapi.controller;

import com.ly.lymall.core.utils.ResponseUtil;
import com.ly.lymall.db.domian.LymallAddress;
import com.ly.lymall.db.service.LymallAddressService;
import com.ly.lymall.vxapi.utils.ExceptionCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author: ahui
 * @Date: 2020-12-07/ 14:38
 * @Description: 收货地址 表现层Controller类
 */
@RestController
@RequestMapping(path = "/wx")
public class LymallAddressController  {

    @Resource
    private LymallAddressService addressService;

    /**
     * 根据用户的id来查询收货地址
     * @return List<LymallAddress>
     */
    @RequestMapping(path = "address/list")
    public Object selectByShippingAddress(Integer userId) {

        //执行查询
        List<LymallAddress> list=addressService.selectFindAllAddRess(userId);
        //判断返回的集合是否为空
        if(list!=null&&!list.isEmpty()){
            return ResponseUtil.ok(list);
        }
        return ResponseUtil.fail(ExceptionCode.NO_DELIVERY_ADDRESS_YET,"尚无收货地址~ 添加一个收货地址让你心爱的快递到家吧！");
    }

    /**
     * 根据用户填入的信息来添加一条收货地址信息
     * @param address
     * @return Object
     */
    @RequestMapping(path = "address/save")
    public Object insertByAddress(LymallAddress address){

        int insertAddress=addressService.insertByAddress(address);
        if(insertAddress!=0){
            return ResponseUtil.ok();
        }
        return ResponseUtil.fail();
    }

    /**
     * 根据addressId删除一条收货地址信息
     * @param addressId
     * @return Object
     */
    @RequestMapping(path = "address/delete")
    public Object deleteByshippingAddress(Integer addressId){

        //执行业务层删除方法
        int deleteAddress=addressService.deleteByAddRess(addressId);

        if(deleteAddress!=0){
            return ResponseUtil.ok();
        }
        return ResponseUtil.fail(ExceptionCode.ADDRESS_DELETION_FAILED,"收货地址删除失败");
    }
}