package com.ust.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashSet  ls = new LinkedHashSet();
		ls.add("akhil");
		ls.add("yogi");
		ls.add("modi");
		ls.add("amit shah");
		ls.add(null);
		ls.add(null);
		
		
		System.out.println("=========for==============");
		for(int i=0;i<ls.size();i++) {
			System.out.println("Using for loop:"+ls);
		}
		
		
		
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
