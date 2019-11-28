package com.ust.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("akhil");
		hs.add("yogi");
		hs.add("modi");
		hs.add("amit shah");
		
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
