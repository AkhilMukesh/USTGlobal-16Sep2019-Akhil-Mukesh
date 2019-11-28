package com.ust.collection.set;

import java.util.Comparator;

public class Coustmer implements Comparator<Coustmer> {
	
	String name;
	int id;
	double salary;
	public Coustmer(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public int compare(Coustmer o1, Coustmer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
