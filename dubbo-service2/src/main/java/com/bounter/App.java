package com.bounter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		context.start();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.in.read(); // 按任意键退出
	}
}
