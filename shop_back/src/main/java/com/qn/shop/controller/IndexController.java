package com.qn.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mac on 2018/12/28.
 */
@Controller
public class IndexController {


    @GetMapping("/")
    public String index() {
        return "index";
    }
}
