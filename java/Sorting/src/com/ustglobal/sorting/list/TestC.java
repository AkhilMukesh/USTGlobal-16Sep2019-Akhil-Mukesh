package com.ustglobal.sorting.list;

import java.util.LinkedList;



public class TestC {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> i = new LinkedList<Integer>();
		i.add(2);
		i.add(22);
		i.add(23);
		i.add(12);
		i.add(62);
		
		Integer peekElement = i.peek();
		System.out.println("peek element:"+peekElement);
		Integer peekFirstElement = i.peekFirst();
		System.out.println("peek first element:"+peekFirstElement);
		Integer peekLastElement = i.peekLast();
		System.out.println("peek last element:"+peekLastElement);
		
		System.out.println("after peek----->"+i);
		
		System.out.println("============================");
		
		Integer pollElement = i.poll();
		System.out.println("peek element:"+pollElement);
		Integer pollFirstElement = i.pollFirst();
		System.out.println("peek first element:"+pollFirstElement);
		Integer pollLastElement = i.pollLast();
		System.out.println("peek last element:"+pollLastElement);
		
		System.out.println("after pool----->"+i);
		
		System.out.println("============================");
		
		i.push(12);
		System.out.println("after push:"+i);

		Integer p = i.pop();
		System.out.println(p);
		
		System.out.println("after pop:"+i);
		
		
		
		
	}
}
