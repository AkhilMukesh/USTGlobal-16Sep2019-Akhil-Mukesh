package com.ustgloabal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Predicate<Student> p = s->{
			if(s.id>=35) {
				return true;
			}
			else {
				return false;
			}
		};
		
		
		
		
		
		
		
		
		
		
		
		
		Student s = new Student(45, "smita");
		boolean res=p.test(s);
		System.out.println(resc);
	}
}
