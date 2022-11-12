package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.Employee;
import com.repository.IEmplRepo;
@Service
public class EmployeeSrvImpl implements IEmplSrv {
	@Autowired
private IEmplRepo emplRepo;
public void setEmplRepo(IEmplRepo emplRepo) {
	this.emplRepo = emplRepo;
}

	public String createEmployee(Employee eObj) {
		int result = emplRepo.createEmployee(eObj);
		if(result ==0) {
			return "employee creation failure";
		}else
			return"employee creation sucess";
		
	}

	public String updateEmployee(Employee eObj) {
		int result = emplRepo.updateEmployee(eObj);
		if (result ==0) {
			return "employee updation failure";
		}else
			return"employee updation sucess";
	}

	public String deleteEmployee(int emplId) {
		int result = emplRepo.deleteEmployee(emplId);
if(result==0) {
	return "employee deletion sucess";
}else {
	return"employee deletion suess";
}
	}

	public List<Employee> getEmployees() {
		List<Employee> employees =emplRepo.getEmployees();
		return employees;
	}

	public Employee getEmployee(int emplId) {
		return emplRepo.getEmployee(emplId);
	}

}

