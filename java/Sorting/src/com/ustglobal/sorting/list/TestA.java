package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al =new ArrayList<Student>();
	
			Student s1 = new Student(10, "Pragya", 99.99);
			Student s2 = new Student(12, "priya", 97.99);
			Student s3 = new Student(14, "anusha", 95.99);
			Student s4 = new Student(2, "Bebo", 69.99);
			
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			System.out.println("before sorting:"+al);
			displayStudent(al);
			
			Collections.sort((List<Student>) al);
			displayStudent(al);
			System.out.println("after sorting"+al);
			
			
			System.out.println("student array list:"+al);
	}
	
	static void displayStudent(ArrayList<Student> al) {
		 Iterator<Student> it = al.iterator();
		 while(it.hasNext()) {
			 
			 Student s = it.next();
			 System.out.println("id is:"+s.id);
			 System.out.println("name is:"+s.name);
			 System.out.println("percentage is:"+s.percentage);
			 System.out.println("--------------------------------");
			 
			 
		 }
	 }

}
