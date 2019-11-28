package com.ustglobal.exception.firstclass;

public class PVR {
	void book() {
		System.out.println("booking start");
		
		try {
		System.out.println(10/0);
		System.out.println("logic for booking");
		System.out.println("booking confiremd");
		
		}catch(ArithmeticException ae) {
			
			System.out.println("booking falied");
			throw ae;
		}
		
		System.out.println("booking end");
	}
}
