package com.bounter.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bounter.dubbo.api.service.DubboService2;
//import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/5/7.
 */
//@Service("dubboService2")
@Service
public class DubboService2Impl implements DubboService2 {

	@Override
	public String sayHello(String name) {
		 return "hello " + name + ", this is dubbo service2";
	}
}
