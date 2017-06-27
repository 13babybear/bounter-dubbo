package com.bounter.service.impl;

//import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bounter.dubbo.api.service.DubboService1;

/**
 * Created by admin on 2017/5/7.
 */
//@Service("dubboService1")
@Service
public class DubboService1Impl implements DubboService1 {

	@Override
	public String sayHello(String name) {
		return "hello " + name + ", this is dubbo service1";
	}
}
