package com.service;

import java.util.List;

import com.pojo.Employee;

public interface IEmplSrv {
    String createEmployee(Employee eObj);
	
	String updateEmployee(Employee eObj);
	
	String deleteEmployee(int emplId);
	
	 List<Employee> getEmployees();
	
     Employee getEmployee(int emplId);

}
