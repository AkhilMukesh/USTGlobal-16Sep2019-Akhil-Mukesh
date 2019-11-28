package com.ustGlobal.accessmodifier.pkg2;

public class Run {
public static void main(String[] args) {
	Demo d = new Demo();
	
	/*
	System.out.println(d.a);
	private not posssible
	*/
	
	//default
	System.out.println(d.b);
	d.sub();
	
	//protected 
	System.out.println(d.c);
	d.mul();
	
	//public 
	System.out.println(d.d);
	d.div();
	
}
}
