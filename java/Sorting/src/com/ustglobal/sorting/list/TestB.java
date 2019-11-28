package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Laptop> li = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(28999, 4, "Hp");
		Laptop lp2 = new Laptop(39499, 6, "lenovo");
		Laptop lp3 = new Laptop(2999, 4, "Asus");
		Laptop lp4 = new Laptop(28999, 8, "Mac");
		
		
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		li.add(lp4);
		
		li.add(new Laptop(20000,2,"acer"));
		
		displayLaptopDetails(li);
		
		System.out.println("after sorting----->:"+li);
		Collections.sort(li);
		displayLaptopDetails(li);
 	}
	
	
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("brand is:"+lp.name);
			System.out.println("Price is:"+lp.price);
			System.out.println("ram is:"+lp.ram);
			
			  
		}
	}

}
