package com.ustglobal.sorting.list;

public class Penn implements Comparable<Penn> {
	
	int price;
	String brand;
	String color;
	public Penn(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
	@Override
	public int compareTo(Penn o) {
		// TODO Auto-generated method stub
		Integer i = this.price;
		Integer j = o.price;
	
		return i.compareTo(j);
	}
	
	
}
