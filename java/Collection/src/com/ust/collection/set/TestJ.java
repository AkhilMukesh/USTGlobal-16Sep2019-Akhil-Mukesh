package com.ust.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		
		TreeSet<Coustmer> ts = new TreeSet<Coustmer>();
		Coustmer c1 = new Coustmer("manu", 12, 12900);
		Coustmer c2 = new Coustmer("majnu bhai", 10, 1200);
		Coustmer c3 = new Coustmer("Akshay", 4, 3999);
		Coustmer c4 = new Coustmer("Akhil", 10, 1122);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("=============");
		Iterator<Coustmer> it = ts.iterator();
		while(it.hasNext()) {
			Coustmer c = it.next();
			System.out.println("name is:"+c.name);
			System.out.println("id is:"+c.id);
			System.out.println("salary:"+c.salary);
			
		}
	}

}
