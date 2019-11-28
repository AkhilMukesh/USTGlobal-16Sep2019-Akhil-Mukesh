/*
 * Genrics:
 * 
 * ArrayList <String> ol = new ArrayList<String>();
 * it will store only stirng otger type is not allowed.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */














package com.ust.collection.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Sherya");
		al.add(4);
		al.add("Alia");
		al.add(26);
		

		Object o = al.get(0);
		String name = (String)o;
		System.out.println(name.toUpperCase());
	}

}

