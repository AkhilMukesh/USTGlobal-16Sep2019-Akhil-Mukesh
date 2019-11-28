package com.ustglobal.mobilesimulatorapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ustglobal.mobilesimulatorapp.dto.Contact;

public class Operation {
	
	static void getAllData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/contactFile?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			while(rs.next()){
				
				String name = rs.getString("name");
				Long number = rs.getLong("number");
				String groups = rs.getString("groups");
				
			
				System.out.println("Name is:"+name);
				System.out.println("Number is:"+number);
				System.out.println("Group is:"+groups);
				System.out.println("==========================");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
