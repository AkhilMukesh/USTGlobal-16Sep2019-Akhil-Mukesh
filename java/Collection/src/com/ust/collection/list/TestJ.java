package com.ust.collection.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(100, "akhil");
		Student s2 = new Student(102, "mukesh");
		Student s3 = new Student(104, "Pragya");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			
			Student s = al.get(i);
			System.out.println("Id is:"+s.id);
			System.out.println("Name is:"+s.name);
		}
		
		System.out.println("=======For each=============");
		
		for(Student s: al) {
			System.out.println(s);
		}
	}
}
