package com.wbb.dubbo.ServiceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new 
				ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
		try {
			ac.start();
			System.out.println("Í¨µÀ¿ªÆô");
			System.in.read();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
