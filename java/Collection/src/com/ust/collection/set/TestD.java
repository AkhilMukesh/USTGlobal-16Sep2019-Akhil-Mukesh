package com.ust.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		ls.add(22.4);
		ls.add(23.4);
		ls.add(11.3);
		ls.add(12.5);
		ls.add(2.4);
		
		
		
		System.out.println("==============using for-each==========");
		for(Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("===========using iterator=============");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
