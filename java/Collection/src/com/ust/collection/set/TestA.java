package com.ust.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add("akhil");
		hs.add(22.3);
		hs.add(96);
		hs.add(96);
		hs.add(null);
		
		
		
		
		
		System.out.println("==============using for-each==========");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("===========using iterator=============");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
		
		
	}

}
