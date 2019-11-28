package com.ust.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector ll = new Vector();
		ll.add(12);
		ll.add("akhil");
		ll.add(23);
		ll.add("sherya");
		
		System.out.println("======For loop==========");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("======For each==========");
		for(Object o : ll) {
			System.out.println(o);
		}
		
		
		System.out.println("=====iterator==========");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("=======Using list iterator==========");
		ListIterator lt = ll.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
			}
		
		
		

	}

}
