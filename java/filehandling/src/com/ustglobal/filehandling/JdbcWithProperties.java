package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class JdbcWithProperties {
	public static void main(String[] args) {
		//3 ref variable of interface.we need them thats why we have declared as null.
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		
		
		try {
			reader = new FileReader("text.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			/*
			 * driver is used to provide the connection between java and mysql.
			 * types:1.odbc jdbc bridge:it is an application.
			 * 2.native jdbc
			 * 3.network protocol
			 * 4.native protocol.
			 * */
			//step 1:load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//register driver.divermanagaer is class which is used to register driver.
//			DriverManager.registerDriver(driver);
			
			
			//step 2: get the connection.
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);//we can add query string here also.if we are not giving it in the string url.
			 
			//step 3: issue sql query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			
			//step 4:read the results.
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("id:"+id);
				System.out.println("name:"+name);
				System.out.println("salary:"+sal);
				System.out.println("gender:"+gender);
				System.out.println("================================");
			}
			
		}catch(Exception e) {
		
			e.printStackTrace();
		
		}finally{
			//step 5 : close all jdbc objects.
			try {
			
				if(conn!=null) {
				
					conn.close();
				}
				
				if(stmt!=null) {
				
					stmt.close();
				}
				
				if(rs!=null) {
				
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
			
				e.printStackTrace();
			}
		}
		
	}

}
