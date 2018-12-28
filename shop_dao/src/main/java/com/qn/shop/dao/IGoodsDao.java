package com.qn.shop.dao;

import com.qn.shop.entity.Goods;

import java.util.List;

/**
 * Created by mac on 2018/12/28.
 */
public interface IGoodsDao {

    List<Goods> queryAll();
}
