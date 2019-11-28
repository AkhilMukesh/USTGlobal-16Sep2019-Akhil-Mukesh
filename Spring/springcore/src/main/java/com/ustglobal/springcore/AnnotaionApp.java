package com.ustglobal.springcore;



import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotaionApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		/*
		 * Animal animal = context.getBean(Animal.class);
		 * 
		 * animal.makeSound();
		 */
		
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		context.close();

	}

	
}
