package com.ustglobal.empapp;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.dao.DAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.dto.EmployeeDAO;
import com.ustglobal.util.EmployeeManager;

import java.sql.Connection;

public class App {
	public static void main(String[] args) {

		System.out.println("press 1 to show all emp data");
		System.out.println("press 2 to insert emp data");
		System.out.println("press 3 to update data");
		System.out.println("press 4 to delete emp data");
		System.out.println("press 5 to search  emp data");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {

		case 1:

			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();

			for(EmployeeBean bean : result) {
				System.out.println("Gender:"+bean.getGender());
				System.out.println("Name:"+bean.getName());
				System.out.println("Salary"+bean.getSal());
				System.out.println("Id:"+bean.getId());
			}
			break;

		case 2:

			break;


		case 3:
			break;
		case 4:
			break;
		case 5:
			
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("enter id:");	
			int id = sc.nextInt();
			
			EmployeeBean bean = dao5.searchEmployeeData(id);
		



			if(bean != null) {
				System.out.println("gender:"+bean.getGender());
				System.out.println("name:"+bean.getName());
				System.out.println("salary:"+bean.getSal());
				System.out.println("Id:"+bean.getId());

			}else {
				System.out.println("no such data found");
			}
			break;

		}//end of switch
	}//end of main
}//end of class
/*create a project emp app.then make a folder lib.then copy jar file to the lib.then right click on project go to build path.build configuartion.
 * add the jar file.
 * then create class app.
 * 
 * */
