package com.ustgloabal.predicate;

import java.util.function.Function;

import com.ustgloabal.java8features.Student;

public class TestD {
public static void main(String[] args) {
	Function<Integer, Student> f = id ->{
		Student s = new Student(2,"vijay");
		s.id= id;
		return s;
	};
	
	Student s = f.apply(27);
	System.out.println("id :"+s.id);
	
	
}
}
