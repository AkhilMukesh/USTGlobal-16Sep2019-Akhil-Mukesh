package com.ust.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	HashSet<Employee> hs = new HashSet<Employee>();

	Employee e1 = new Employee(10, "akhil", 29979);
	Employee e2 = new Employee(12, "mukesh", 2000000);
	Employee e3 = new Employee(11, "gudu bhaiya", 2000);
	Employee e4 = new Employee(9, "munu bahiya", 20000);
	Employee e5 = new Employee(9, "munu bahiya", 20000);
	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	System.out.println("========using iterator==========");
	Iterator<Employee> it = hs.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		
		System.out.println("id:"+e.id);
		System.out.println("name:"+e.name);
		System.out.println("salary:"+e.salary);
		System.out.println("=============================");
	}
 }
}
