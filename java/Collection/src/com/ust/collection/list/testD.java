package com.ust.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class testD {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("akhil");
		al.add("mukesh");
		al.add(2);
		al.add(5);
		
		ListIterator li = al.listIterator();
		
		System.out.println("====================");
		
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		
		System.out.println("====================");
		
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}

}
