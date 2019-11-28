package com.ustglobal.sorting.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK {
	public static void main(String[] args) {
		
		Comparator<Employee> comp = (e1,e2) -> {
			
			if(e1.height > e2.height) {
				return 1;
			}else if(e1.height < e2.height) {
				return -1;
			}else {
				return 0;
			}
			
		
		};
		
		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(2, "akhil", 12.3);
		Employee e2 = new Employee(55, "Mukesh", 112.3);
		Employee e3 = new Employee(1, "Pragya", 122.3);
		Employee e4 = new Employee(35, "Anusha", 123.3);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("=============Using iterator==========");
		
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("name is:"+e.name);
			System.out.println("id is:"+e.id);
			System.out.println("height is:"+e.height);
			
			System.out.println("===================================");
		}
		
	}

}
