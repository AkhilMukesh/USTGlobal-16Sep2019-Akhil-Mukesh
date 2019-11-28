package com.ustglobal.mobilesimulatorapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.mobilesimulatorapp.dto.Contact;

public class TestMob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search contact(using name)");
		System.out.println("press 3 to operate on contact");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
		int ch = sc.nextInt();
		switch(ch ) {
		
		case 1:
		
			Operation.getAllData();
			
			break;
			
			
			 
			
			
			
		
		}
		
		
		

	}

}
