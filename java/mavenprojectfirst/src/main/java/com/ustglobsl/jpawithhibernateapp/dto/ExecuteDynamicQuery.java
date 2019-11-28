package com.ustglobal.jdbcapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class ExecuteDynamicQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into employee_info values(?,?,?,?)";
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id );
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			
			int count = pstmt.executeUpdate(sql);
//		int count = stmt.executeUpdate(sql);
//			System.out.println(count+" row(s) deleted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
			} if(pstmt!=null) {
				pstmt.close();
			}
//					if(stmt!=null) {
//					stmt.close();
			//}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
