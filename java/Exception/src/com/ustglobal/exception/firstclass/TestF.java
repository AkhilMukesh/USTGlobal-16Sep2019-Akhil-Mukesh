package com.ustglobal.exception.firstclass;

public class TestF {
	public static void main(String[] args) {

		System.out.println("main started");

		PayTm p = new PayTm();

		try {

			p.book();

		}catch(ArithmeticException ae) {

			System.out.println("exception caught in main");

		}finally {
			//closing connnection or clean up process.

			System.out.println("executing finally");

		}
		System.out.println("main ended");


	}

}
