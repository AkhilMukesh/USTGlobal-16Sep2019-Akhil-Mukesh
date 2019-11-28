package com.ustgloabal.predicate;

import java.util.function.Supplier;

import com.ustgloabal.java8features.Student;

public class TestE {
public static void main(String[] args) {
	Supplier<Student> s = () -> new Student(2,"vijay");
	
	
	Student s1 = s.get();
	System.out.println(s1.id);
	
	}


	

}
