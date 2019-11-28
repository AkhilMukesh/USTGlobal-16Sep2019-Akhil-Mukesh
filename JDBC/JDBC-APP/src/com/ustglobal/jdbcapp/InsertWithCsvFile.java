package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;

public class InsertWithCsvFile {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");

			
				BufferedReader reader = new BufferedReader(in);
				Connection conn = DriverManager.getConnection(url);
					java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
			while(reader.ready()) {
				String line = reader.readLine();
				String[] data = line.split(",");
				String name = data[1];
				int id = Integer.parseInt(data[0]);
				int sal = Integer.parseInt(data[2]);
				String gender = data[3];
				
				
				pstmt.setString(4, gender);
				pstmt.setString(2,name);
				pstmt.setInt(3, sal);
				pstmt.setInt(1, id);
				
				pstmt.addBatch();
				
				
				
				
			}//end of while loop
			
		int[] counts =	pstmt.executeBatch();
			
		System.out.println(counts.length+" Row(s) Inserted");
			
		}catch(Exception e) {
	
			e.printStackTrace();
		}
	}

}
