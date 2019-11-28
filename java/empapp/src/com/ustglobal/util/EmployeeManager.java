package com.ustglobal.util;

import com.ustglobal.dao.DAOImpl;
import com.ustglobal.empapp.dto.EmployeeDAO;

public class EmployeeManager {
	
	private EmployeeManager() {
		
	}
	
public static EmployeeDAO getEmployeeDAO() {
	return new DAOImpl(); 
}
}
