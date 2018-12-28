package com.qn.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qn.shop.entity.Goods;
import com.qn.shop.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mac on 2018/12/28.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Reference
    private IGoodsService goodsService;

    @RequestMapping("/goodslist")
    public String messgga() {

        //通过service获得商品列表
        List<Goods> goods = goodsService.queryAll();


        System.out.println("查询的所有商品："+goods);

        return "goodslist";
    }
}
