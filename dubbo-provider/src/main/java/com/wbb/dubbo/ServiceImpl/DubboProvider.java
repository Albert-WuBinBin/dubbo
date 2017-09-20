package com.wbb.dubbo.ServiceImpl;

import com.wbb.dubbo.service.DemoService;

public class DubboProvider implements DemoService{

	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hello"+name;
	}

}
