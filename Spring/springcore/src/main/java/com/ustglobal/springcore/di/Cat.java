package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component(value="cat")
public class Cat implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("meowwwwww");
		
	}

	
	
}