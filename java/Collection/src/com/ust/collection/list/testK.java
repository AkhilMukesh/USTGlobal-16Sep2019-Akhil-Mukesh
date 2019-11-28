package com.ust.collection.list;

import java.util.ArrayList;
import java.util.List;

public class testK {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(23.4);
		al.add(null);
	    al.add(23.4);
	    al.add(21.4);
	    al.add(24.5);
	    System.out.println(al);
	    al.add(2,28.7);
	    System.out.println("After adding 2nd index:"+al);
	    al.add(0,22.9);
	    System.out.println("after adding 0th index:"+al);
	    Double val = al.get(4);
	    System.out.println(val);
	    al.clear();
	    System.out.println("After clear method:"+al);
	    al.contains(54.6);
	    System.out.println("after contains method:"+al);
	    
	    
	    List<Double> ali = new ArrayList<>();
	    ali.add(69.0);
	    ali.add(69.1);
	    ali.add(69.2);
	    ali.add(69.3);
	    ali.add(69.4);
	    ali.add(69.5);
	    al.addAll(ali);
	    
	    System.out.println("after add all:"+al);
	    
	    boolean contain = al.containsAll(ali);
	    System.out.println("conatins all:"+contain);
	    System.out.println("before remove: "+al);
	    
	    boolean res = al.removeAll(ali);
	    System.out.println("removed all of ali: "+res);
	    System.out.println("after remove: "+al);
	}
}
