package com.ly.lymall.db.service;

import com.ly.lymall.db.domian.LymallAd;

import java.util.List;

/**
 * @Author: ahui
 * @Date: 2020-12-11/ 15:09
 * @Description:
 */

public interface LymallAdService {

    /**
     * 查询全部广告
     *
     * @return List<LymallAd>
     */
    List<LymallAd> selectfindAllAd();
}
