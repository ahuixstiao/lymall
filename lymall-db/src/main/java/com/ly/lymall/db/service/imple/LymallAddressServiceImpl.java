package com.ly.lymall.db.service.imple;
import com.ly.lymall.db.dao.mapper.LymallAddressMapper;
import com.ly.lymall.db.domian.LymallAddress;
import com.ly.lymall.db.service.LymallAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-07/ 14:37
 * @Description: Address业务层实现类
 */
@Service
public class LymallAddressServiceImpl implements LymallAddressService {

    @Resource
    private LymallAddressMapper addressMapper;

    /**
     * 根据UserId来查询收货地址
     * @return List<LymallAddress>
     */
    @Override
    public List<LymallAddress> selectFindAllAddRess(Integer userId) {

        return addressMapper.selectFindAllAddRess(userId);
    }

    /**
     * 添加一条收货地址信息
     * @param address
     * @return int
     */
    @Override
    public int insertByAddress(LymallAddress address) {

        return addressMapper.insert(address);
    }

    /**
     * 根据addressId删除一条收货地址
     * @param addressId
     * @return int
     */
    @Override
    public int deleteByAddRess(Integer addressId) {

        return addressMapper.deleteByPrimaryKey(addressId);
    }
}
