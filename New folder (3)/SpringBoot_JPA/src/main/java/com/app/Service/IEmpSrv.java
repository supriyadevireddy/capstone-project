package com.app.Service;

import java.util.List;

import com.app.entity.Employee;

public interface IEmpSrv {
     String createEmployee(Employee emp);
     List<Employee>getAllEmployees();
     String updateEmployee(Employee emp);
     String deleteEmployee(int id);
     Employee  getEmployeeOnId(int id);
     List<Employee>getAllEmployeesBasedOnSalary(int salary);
     
}

