package com.ustglobal.empapp.dto;

import java.util.ArrayList;

public interface EmployeeDAO {
	
	public ArrayList<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
	
	
}
