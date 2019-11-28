package com.ustgloabal.predicate;

import java.util.function.Consumer;

import com.ustgloabal.java8features.Student;

public class TestF {
 public static void main(String[] args) {
	
	 Consumer<Student> c = s -> {
	 System.out.println(s.id);
	 };
	 
	 Student s1 = new Student(2, "akhil");
	 
	 c.accept(s1);
}
}
