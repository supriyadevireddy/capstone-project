package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.entity.ResponseEntity;
import com.app.service.IEmpSrv;

@RestController
@RequestMapping(value ="/employee")
public class EmployeeController {
	
	@Autowired
	private IEmpSrv empsrv;
	public void setEmpsrv(IEmpSrv empsrv) {
		this.empsrv = empsrv;
	}
	
	
	    @PostMapping(value="/action")
		public ResponseEntity createEmployee(@RequestBody Employee emp) {
			String result =empsrv.createEmployee(emp);
			ResponseEntity resp = new ResponseEntity(200 , result);
			return resp;
		}
	    @GetMapping(value = "/action")
		public ResponseEntity getAllEmployees() {
			List<Employee> employees =empsrv.getAllEmployees();
			ResponseEntity resp = new ResponseEntity(200 , employees);
			return resp;
			
		}
	    @PutMapping(value="/action")
	   public ResponseEntity updateEmployee(@RequestBody Employee emp){
		 String result=  empsrv.updateEmployee(emp);
		 ResponseEntity resp = new ResponseEntity(200 , result);
		return resp;
		   
	   }
	    @DeleteMapping(value="/action/{id}")
	   public ResponseEntity deleteEmployee(@PathVariable int id){
		   String result =empsrv.deleteEmployee(id);
			 ResponseEntity resp = new ResponseEntity(200 , result);
		return resp;
		   
	   }
	    @GetMapping(value ="/action/{id}")
	    public ResponseEntity getEmployeeOnId(@PathVariable int id) {
	    	Employee emp = empsrv.getEmployeeOnId(id);
	    	 ResponseEntity resp = new ResponseEntity(200 , emp);
			return resp;
	    	
	    }
	    @GetMapping(value="/action/{id}")
	    public ResponseEntity getAllEmployeesBasedOnSalary(@PathVariable int salary) {
	    	List<Employee> employees =empsrv.getAllEmployeesBasedOnSalary(salary);
	    	 ResponseEntity resp = new ResponseEntity(200 , employees);
			return resp;
	    	
	    }

}

