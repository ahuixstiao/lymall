package com.ly.lymall.db.service;


import com.ly.lymall.db.domian.LymallAddress;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-07/ 14:37
 * @Description: Address业务层接口
 */
public interface LymallAddressService {

    /**
     * 根据用户的id来查询收货地址
     *
     * @return List<LymallAddress>
     */
    List<LymallAddress> selectFindAllAddRess(Integer userId);

    /**
     * 添加一条收货地址信息
     *
     * @param address
     * @return int
     */
    int insertByAddress(LymallAddress address);

    /**
     * 根据addressId删除一条收货地址
     *
     * @param addressId
     * @return int
     */
    int deleteByAddRess(Integer addressId);

}
