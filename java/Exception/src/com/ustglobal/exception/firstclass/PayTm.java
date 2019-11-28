package com.ustglobal.exception.firstclass;

public class PayTm {
	void book() {

		System.out.println("PayTm staretd");

		Irctc ir = new Irctc();
		ir.confirm();

		System.out.println("PayTm ended");
	}

}
