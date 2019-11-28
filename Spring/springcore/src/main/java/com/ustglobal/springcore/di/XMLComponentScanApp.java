package com.ustglobal.springcore.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love java");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("chucha");
		System.out.println(pet.getName());
	}
	
	

}
