package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import javax.xml.ws.Dispatch;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(20,"red"));
		al.add(new Marker(40,"green"));
		al.add(new Marker(10,"black"));
		
		System.out.println("before sorting:"+al);
		displayMarkerList(al);
		Collections.sort(al);
		System.out.println("================price===========");
		SortByPrice sb = new SortByPrice();
		Collections.sort(al,sb);
		displayMarkerList(al);
		System.out.println("============color=============");
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		displayMarkerList(al);
		
	}
	
	
	static void displayMarkerList(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price:"+m.price);
			System.out.println("Color:"+m.color);
		}
	}

}
