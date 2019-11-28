package com.ustglobal.exception.firstclass;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		
		int[] a = {10,20,30};
		int b = 10;
		
		try {
		
			System.out.println(a[2]);
		
		}catch(ArrayIndexOutOfBoundsException ai) {
		
			System.out.println("index is not present");
		}
		
		try {
		
			System.out.println(b/0);
		
		}catch(ArithmeticException ae) {
		
			System.out.println("number divided by zero");
		}
		
		System.out.println("main ended");
	}

}
