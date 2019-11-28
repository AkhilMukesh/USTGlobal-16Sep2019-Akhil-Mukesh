package com.ust.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	TreeSet<Bank> ts = new TreeSet<Bank>();
	SortPinCode sp = new SortPinCode();
	Bank b1 = new Bank("HDFC", 56009, 75786);
	Bank b2 = new Bank("DFC", 5609, 77863);
	Bank b3 = new Bank("FC", 569, 7563);
	Bank b4 = new Bank("HDFC", 56009, 757833);
	
	System.out.println("======using itetrator=========");
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank b = it.next();
		
		System.out.println("pincode:"+b.pincode);
		System.out.println("name:"+b.name);
		System.out.println("micr:"+b.micr);
		System.out.println("=============================");
	}
}
}
