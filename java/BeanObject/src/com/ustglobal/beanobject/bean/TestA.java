package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestA {
public static void main(String[] args) {
	Student s= new Student();
	s.setId(10);
	s.setName("Akhil");
	s.setRollno(134);
	
	Database d = new Database();
	d.receive(s);
	
	
	
	
	
	Employee e = new Employee();
	e.setDept("IT");
	e.setDesg("developer");
	e.setName("Akhil");
	e.setId(007);
	e.setSalary(1000);
	d.save(e);
	
	
	//taking input from user
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter age:");
//	int age = sc.nextInt();
//	System.out.println("Age is:"+age);
//	
//	System.out.println("Enter a name: ");
//	String name = sc.next();
//	System.out.println("Name is:"+name);
	
	System.out.println("Enter Last Name");
	String Lname = sc.nextLine();
	System.out.println("last name is:"+Lname);
	
	
	
	
	
	
//	
//	sc.next();
//	sc.nextInt();
//	sc.nextLine();
//	sc.nextByte();
//	sc.nextShort();
//	sc.nextDouble();
//	sc.nextFloat();
//	sc.nextBoolean();
}
}
