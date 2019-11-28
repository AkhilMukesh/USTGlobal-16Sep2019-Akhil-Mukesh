package com.ust.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(22.4);
		ts.add(23.4);
		ts.add(11.3);
		ts.add(12.5);
		ts.add(2.4);
		
		System.out.println("=========for==============");
		for(int i=0;i<ts.size();i++) {
			System.out.println("Using for loop:"+ts);
		}
		

		
		System.out.println("==============using for-each==========");
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("===========using iterator=============");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}

}
