package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	
	
	try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection(url);
		
		
		
		String sql = "update employee_info set name = ?,sal = ?, gender = ? where id = ?";
		pstmt = conn.prepareStatement(sql);
		String empid = args[0];
		int id = Integer.parseInt(empid);
		
		String name = args[1];
		
		
		String empsal = args[2];
		int sal = Integer.parseInt(empsal);
		
		String gender = args[3];
		pstmt.setInt(4, id);
		pstmt.setString(1, name);
		pstmt.setInt(2, sal);
		pstmt.setString(3, gender);
		
		int count = pstmt.executeUpdate();
		
		System.out.println(count+" row(S) upadated");
		
		
//		rs = pstmt.executeQuery();
		
		
//		if(rs.next()) {
//			int emp_id = rs.getInt("id");
//			int sal = rs.getInt("sal");
//			String name = rs.getString("name");
//			String gender = rs.getString("gender");
//			
//			System.out.println("id:"+emp_id);
//			System.out.println("name:"+name);
//			System.out.println("salary:"+sal);
//			System.out.println("gemder:"+gender);
//			
//		}
		
		}catch(SQLException e){
		e.printStackTrace();
	}finally {
		try {
		if(conn!=null) {
			conn.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
//		if(rs!=null) {
//			rs.close();
//		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	}

}
