package com.ust.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("akhil");
		al.add("pragya");
		al.add("sunny");
		al.add("anusha");
		al.add("alia");
		
		System.out.println("Before sort-->"+al);
		Collections.sort(al);
		System.out.println("after sort-->"+al);
	}

}
