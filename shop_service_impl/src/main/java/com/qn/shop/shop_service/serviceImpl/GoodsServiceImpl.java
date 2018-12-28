package com.qn.shop.shop_service.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qn.shop.dao.IGoodsDao;
import com.qn.shop.entity.Goods;
import com.qn.shop.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mac on 2018/12/28.
 */
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private IGoodsDao goodsDao;

    @Override
    public List<Goods> queryAll() {
        System.out.println("调用了service实现类");
        return goodsDao.queryAll();
    }
}
