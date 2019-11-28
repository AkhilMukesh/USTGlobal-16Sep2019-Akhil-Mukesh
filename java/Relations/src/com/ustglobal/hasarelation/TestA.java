package com.ustglobal.hasarelation;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("============");
		p.m.write();   //has-a-realtion
		System.out.println("====================");
		
		Car c = new Car();
		c.reverse();
		System.out.println(c.m.name);
		c.m.music();
		
		
	}

}
