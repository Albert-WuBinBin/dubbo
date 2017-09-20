package com.wbb.dubbo.comsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wbb.dubbo.service.DemoService;

public class Comsumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("spring-dubbo-config.xml");
		ac.start();
		DemoService dubboProvider = (DemoService) ac.getBean("demoService");
		String hello = dubboProvider.hello("asd");
		System.out.println("²âÊÔ½á¹û£º"+hello);
	}
}
