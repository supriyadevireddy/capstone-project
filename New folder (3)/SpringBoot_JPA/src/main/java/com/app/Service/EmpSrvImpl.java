package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.repository.IEmpRepo;
@Service
public class EmpSrvImpl  implements IEmpSrv{

	@Autowired
	private IEmpRepo emprepo;
	public void setEmprepo(IEmpRepo emprepo) {
		this.emprepo = emprepo;
	}
	
	public String createEmployee(Employee emp) {
		emprepo.save(emp);
		return "employee creation sucess";
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employees =emprepo.findAll();
		return employees;
	}

	public String updateEmployee(Employee emp) {
		emprepo.save(emp);
		return "employee updation sucess";
	}

	public String deleteEmployee(int id) {
		emprepo.deleteById(id);
		return "employee deletion sucess";
	}

	public Employee getEmployeeOnId(int id) {
		Employee emp = emprepo.findById(id).get();
		return emp;
	}

	public List<Employee> getAllEmployeesBasedOnSalary(int salary) {
		List<Employee> employees =emprepo.getEmployeesBasedOnSalary(salary);
		return employees;
	}
 
}

