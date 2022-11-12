package com.controller;

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

import com.pojo.ResponseEntity;
import com.pojo.User;
import com.service.IUserSrv;

@RestController
@RequestMapping(value ="/User")
public class UserController {
	
	@Autowired
	private IUserSrv usrSrv;
	public void setUsrSrv(IUserSrv usrSrv) {
		this.usrSrv = usrSrv;
	}	
	
	@PostMapping(value="/action")
public ResponseEntity createUser (@RequestBody User uObj) {
	String data = usrSrv.createUser(uObj);
	ResponseEntity resp = new ResponseEntity(data , 200);
	return resp;
}
	@GetMapping(value="/action/{uId}")
	public ResponseEntity getUser (@PathVariable int uId) {
		User uObj = usrSrv.getUser(uId);
		ResponseEntity resp = new ResponseEntity(uObj , 200);
		return resp;
	}
	@PutMapping(value ="/action")
	public ResponseEntity updateUser(@RequestBody User uObj) {
		String data = usrSrv.updateUser(uObj);
		ResponseEntity resp = new ResponseEntity(data , 200);
		return resp;
}
	@DeleteMapping(value="/action/{uId}")
	public ResponseEntity deleteUser (@PathVariable int uId) {
		String data= usrSrv.deleteUser(uId);
		ResponseEntity resp = new ResponseEntity(data , 200);
		return resp;
	}
	@GetMapping(value="/action")
	public ResponseEntity getAllUsers() {
		List<User>users=usrSrv.getAllUsers();
		ResponseEntity resp = new ResponseEntity(users , 200);
		return resp;
		
	}
}
