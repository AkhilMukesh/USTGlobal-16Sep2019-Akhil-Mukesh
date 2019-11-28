package com.ustGlobal.accessmodifier.pkg1;

import com.ustGlobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		Sample s = new Sample();
		

		/*
	System.out.println(d.a);
	private not posssible
		 */

		/*
		//default
		System.out.println(d.b);
		System.out.println(s.b);
		d.sub();
		s.sub();
*/
	
		//protected
		System.out.println(s.c);
		s.mul();
  
		//public 
		System.out.println(d.d);
		d.div();
	}
}
