package com.qn.shop;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.qn.shop.shop_service.serviceImpl")
@MapperScan("com.qn.shop.dao")
public class ShopServiceImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopServiceImplApplication.class, args);
	}

}

