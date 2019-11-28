package com.ustglobal.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		context.close();
		
		
		
	}

}
