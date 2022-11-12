package com.app.controller;

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

import com.pojo.Employee;
import com.pojo.ResponseEntity;
import com.service.IEmplSrv;

@RestController
@RequestMapping(value="/Employee")
public class EmployeeController {
@Autowired
	private IEmplSrv emplsrv;
public void setEmpsrv(IEmplSrv empsrv) {
	this.emplsrv = emplsrv;
}
@PostMapping(value="/action")
	public ResponseEntity  createEmployee(@RequestBody Employee eObj) {
		String Data =emplsrv.createEmployee(eObj);
		ResponseEntity resp = new ResponseEntity(Data , 200);
		return resp;
	
}
@PutMapping(value ="/action2")
	public ResponseEntity updateEmployee(@RequestBody Employee eObj) {
		String Data =emplsrv.updateEmployee(eObj);
		ResponseEntity resp = new ResponseEntity (Data , 200);
		return resp;
	}
@DeleteMapping(value ="/action/{emplId}")
public ResponseEntity deleteEmployee(@PathVariable int emplId) {
	String Data =emplsrv.deleteEmployee(emplId);
	ResponseEntity resp = new ResponseEntity (Data , 200);
	return resp;
	
}
@GetMapping(value = "/action3")
public ResponseEntity displayEmployees() {
	List<Employee>employees = emplsrv.getEmployees();
	ResponseEntity resp = new ResponseEntity (employees , 200);
	return resp;
	
}
@GetMapping(value = "/action4/{emplId}")
public ResponseEntity getEmployee(@PathVariable int emplId) {
	Employee eObj = emplsrv.getEmployee(emplId);
	ResponseEntity resp = new ResponseEntity (eObj , 200);
	return resp;
	
	
}
}
