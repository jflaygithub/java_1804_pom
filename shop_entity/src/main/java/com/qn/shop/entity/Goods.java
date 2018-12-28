package com.qn.shop.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by mac on 2018/12/28.
 */
@Data
public class Goods implements Serializable {

    private Integer id;
    private String title;
    private String ginfo;
    private double gcount;
    private Integer tid;
    private double allprice;
    private double price;
    private String gimage;
}
