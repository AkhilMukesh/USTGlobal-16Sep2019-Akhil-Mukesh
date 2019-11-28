package com.ust.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenricsClass {
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sherya");
		al.add("savita");
		al.add("sunny");
		al.add("katrina");
		
		
		String names = al.get(0);
		System.out.println(names.toUpperCase());
		
	Iterator<String> li = al.iterator();
	while(li.hasNext()) {
		String s = li.next();
		System.out.println(s);
	}
	
	System.out.println("========List Iterator============");
	
	
	ListIterator<String> l = al.listIterator();
	while(l.hasNext()) {
		String s =l.next();
		System.out.println(s);
	}
	
	
	System.out.println("=======For-Each=======");
	
	for(String s : al) {
		System.out.println(s);
	}
	}

}
