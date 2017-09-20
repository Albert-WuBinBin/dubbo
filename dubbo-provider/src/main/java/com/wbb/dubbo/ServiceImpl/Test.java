package com.wbb.dubbo.ServiceImpl;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class Test {
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ac=new 
				ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
		
		ac.start();
		System.in.read();
	}
	@Scheduled(cron = "0/5 * * * * *")
	public static void write(){
		System.out.println(new Date());
	}
}
