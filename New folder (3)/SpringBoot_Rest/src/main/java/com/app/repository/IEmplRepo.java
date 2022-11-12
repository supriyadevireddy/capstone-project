package com.app.repository;

import java.util.List;

import com.pojo.Employee;

public interface IEmplRepo {
	
int createEmployee (Employee eObj);
int updateEmployee(Employee eObj);
int deleteEmployee(int emplId);
List<Employee> getEmployees();
Employee getEmployee(int emplId);
}