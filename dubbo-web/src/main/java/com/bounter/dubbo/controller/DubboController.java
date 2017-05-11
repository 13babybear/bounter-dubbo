package com.bounter.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bounter.dubbo.api.service.DubboService1;
import com.bounter.dubbo.api.service.DubboService2;

/**
 * Created by admin on 2017/5/7.
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {
	
	@Autowired
	private DubboService1 dubboService1;
	
	@Autowired
	private DubboService2 DubboService2;
	
	@RequestMapping(value = "/sayHello1")
	public String sayHello1(String name) {
		return "hello1";
	}
	
	@RequestMapping(value = "/sayHello2")
	public String sayHello2(String name) {
		return "hello2";
	}
}
