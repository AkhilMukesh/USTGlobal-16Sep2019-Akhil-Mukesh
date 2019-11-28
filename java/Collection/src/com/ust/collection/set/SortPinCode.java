package com.ust.collection.set;

import java.util.Comparator;

public class SortPinCode implements Comparator<Bank>{

	@Override
	public int compare(Bank b1, Bank b2) {
		// TODO Auto-generated method stub
		Integer i = b1.pincode;
		Integer j = b2.pincode;
		
		
		
		return b1.compare(b1, b2);
	}

}
