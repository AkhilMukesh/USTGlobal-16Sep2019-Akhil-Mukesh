package com.ust.collection.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("monu");
		al.add(null);
		al.add(22.9);
		al.add(true);
		
		for(Object o:al) {
			System.out.println(o);
		}
	}
}
