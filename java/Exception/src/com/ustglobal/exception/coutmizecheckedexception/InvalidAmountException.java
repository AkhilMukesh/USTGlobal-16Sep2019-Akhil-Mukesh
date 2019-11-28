package com.ustglobal.exception.coutmizecheckedexception;

public class InvalidAmountException extends Exception{
	
	String msg = "limit is 40000";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}