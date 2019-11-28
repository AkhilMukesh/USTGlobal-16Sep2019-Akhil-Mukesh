package com.ust.collection.list;

import java.util.Collections;
import java.util.LinkedList;

public class Testl {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> i = new LinkedList<Integer>();
		i.add(232);
		i.add(23);
		i.add(22);
		i.add(25);
		i.add(26);
		
		System.out.println("LinkedList Integer arraylist:"+i);
		System.out.println();
		
		System.out.println("before sorting:"+i);
		Collections.sort(i);
		System.out.println("after sorting:"+i);
		System.out.println();
		
		System.out.println("before reverse method:"+i);
		Collections.reverse(i);
		System.out.println("after reverse method:"+i);
		System.out.println();
		
		System.out.println("before shuffle:"+i);
		Collections.shuffle(i);
		System.out.println("after shuffle:"+i);
		System.out.println();
		
		
	}

}
