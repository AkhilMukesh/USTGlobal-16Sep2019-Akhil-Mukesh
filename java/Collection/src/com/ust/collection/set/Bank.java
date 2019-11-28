package com.ust.collection.set;

import java.util.Comparator;

public class Bank implements Comparator<Bank>{
	String name;
	int pincode;
	long micr;
	
	
	public Bank(String name, int pincode, long micr) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.micr = micr;
	}


	@Override
	public int compare(Bank o1, Bank o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
