package com.ustglobal.exception.coutmizeuncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		
		
		System.out.println("main start");
		
		Validator v = new Validator();
		try {
			v.verify(12);
			
		}catch(InvalidAgeException ie) {
			System.out.println("exception occured");
		}
	
		
		System.out.println("main end");
	}

}
