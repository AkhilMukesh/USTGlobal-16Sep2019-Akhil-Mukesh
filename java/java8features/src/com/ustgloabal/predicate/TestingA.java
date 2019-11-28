package com.ustgloabal.predicate;

import java.util.function.Predicate;

public class TestingA {
	
	public static void main(String[] args) {
		
		Predicate<TestA> p = t->{
			if(t.age>=18) {
				return true;
			}else {
				return false;
			}
		};
		
		TestA t = new TestA(18, "Gaitonde", 999999);
		System.out.println(p.test(t));
	}

}
