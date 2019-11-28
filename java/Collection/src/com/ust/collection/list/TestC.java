package com.ust.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(22.10);
		al.add("jojo");
		
		Iterator it = al.iterator();
		
		Object o = it.next();
		System.out.println("obj1:"+o);
		
		Object o1 = it.hasNext();
		System.out.println("has next:"+o1);
		
		Object o2 = it.next();
		System.out.println("obj2:"+o2);
		
		boolean o3 = it.hasNext();
		System.out.println("has next:"+o3);
		 

		
//		for(int i = 0;i<al.size() ;i++) {
//			
//			System.out.println(al.get(i));
//		}
//		
		
	while(it.hasNext()) {
		Object o5 = it.next();
		System.out.println(o5);
	}
	}

}
