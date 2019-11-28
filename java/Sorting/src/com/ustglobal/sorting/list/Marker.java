package com.ustglobal.sorting.list;

import java.util.ArrayList;

public class Marker implements Comparable<Marker> {
	
	double price; 
	String color;
	
	public Marker(double price, String color) {
		super();
		this.price = price;
		this.color = color;
	}

	@Override
	public int compareTo(Marker o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
