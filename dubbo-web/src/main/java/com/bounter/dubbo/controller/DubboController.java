package com.bounter.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bounter.dubbo.api.service.DubboService1;

/**
 * Created by admin on 2017/5/7.
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {
	
	@Reference
	private DubboService1 dubboService1;
	
//	@Autowired
//	@Reference
//	private DubboService2 DubboService2;
	
	@RequestMapping(value = "/sayHello1")
	public String sayHello1(String name) {
		return dubboService1.sayHello("simon");
	}
	
//	@RequestMapping(value = "/sayHello2")
//	public String sayHello2(String name) {
//		return "hello2";
//	}
}
