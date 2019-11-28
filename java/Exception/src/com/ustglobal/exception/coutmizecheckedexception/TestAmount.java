package com.ustglobal.exception.coutmizecheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main start");
		
		ValidateAmount v = new ValidateAmount();
		try {
			v.checkAmount(2000);
			System.out.println("widthdraw cash");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println("main end ");
	}

}
