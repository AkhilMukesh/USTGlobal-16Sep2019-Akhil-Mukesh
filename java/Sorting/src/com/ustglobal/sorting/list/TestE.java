package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE    {
	public static void main(String[] args) {

		ArrayList<Penn> al = new ArrayList<Penn>();
		Penn p1 = new Penn(20, "nokia");
		Penn p2 = new Penn( 5, "reylnods");
		Penn p3 = new Penn(50, "parker");
		Penn p4 = new Penn(10, "nataraj");


		al.add(p1);
		al.add(p2);al.add(p3);al.add(p4);		
		
		displayPenDetails(al);
		Collections.sort(al);
	
		System.out.println("after sorting:"+al);
		displayPenDetails(al);

	}
	
	static void displayPenDetails(ArrayList<Penn> al) {
		Iterator<Penn> it = al.iterator();
		while(it.hasNext()) {
			Penn p = it.next();
			System.out.println("brand is:"+p.brand);
			System.out.println("Price is:"+p.price);
		
			
			  
		}

	}
}
