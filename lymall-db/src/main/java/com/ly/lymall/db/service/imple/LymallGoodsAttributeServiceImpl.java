package com.ly.lymall.db.service.imple;

import com.ly.lymall.db.dao.mapper.LymallGoodsAttributeMapper;
import com.ly.lymall.db.domian.LymallGoodsAttribute;
import com.ly.lymall.db.service.LymallGoodsAttributeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Ahui
 * @Description: 商品参数 业务层实现类
 * @DateTime: 2020/12/29 - 18:32
 **/
@Service
public class LymallGoodsAttributeServiceImpl implements LymallGoodsAttributeService {

    /**
     * 商品参数 mapper接口
     */
    @Resource
    private LymallGoodsAttributeMapper goodsAttributeMapper;

    /**
     * 根据goodsId查询商品参数信息
     *
     * @param goodsId
     * @return LymallGoodsAttribute
     */
    @Override
    public List<LymallGoodsAttribute> selectByGoodsIdFindGoodsAttributeInfo(Integer goodsId) {

        return goodsAttributeMapper.selectByGoodsIdFindGoodsAttriBute(goodsId);
    }
}
