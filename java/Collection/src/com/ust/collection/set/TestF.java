package com.ust.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("Bill Gates");
	ts.add("Mark Zukerberg");
	ts.add("Steve jobs");
	ts.add("Elon musk");
	ts.add("Warren Buffet");
	

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
