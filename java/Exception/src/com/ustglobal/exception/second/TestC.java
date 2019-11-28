package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
			
		Scanner sc1 = new Scanner(System.in);
			try(Scanner sc = new Scanner(System.in)){
				System.out.println("enter age ");
				int a = sc.nextInt();
				System.out.println("entered age is:"+a);
				try {
				System.out.println(a/0);
				}
				catch(ArithmeticException ae) {
					System.out.println("dividng by zero");
				}finally {
					System.out.println("finally executed");
				}
				
				System.out.println("======================");
			
			try {
				
			}
			
			}
			
	}
}
