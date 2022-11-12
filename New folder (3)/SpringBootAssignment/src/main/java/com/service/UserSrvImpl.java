package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pojo.User;
import com.repository.IUserRepo;

public class UserSrvImpl {
   
	@Autowired
	private IUserRepo userRepo;
	public void setUserRepo(IUserRepo userRepo) {
		this.userRepo = userRepo;
		
	}
	public String createUser( User user) {
		int result = userRepo.createUser(user);
		String data = prepareResponseMessage(result, "creation of User");
		return data;
	}
	public List<User> getAllUsers(){
		return userRepo.getAllUsers();
	}
	public User getUser(int userId) {
		return userRepo.getUser(userId);
	}
	public String updateUser(User user) {
		int result = userRepo.updateUser(user);
		String data = prepareResponseMessage(result, "updation of User");
		return data;
	}
	public String deleteUser(int userId) {
		int result = userRepo.deleteUser(userId);
		String data = prepareResponseMessage(result, "deletion of User");
		return data;

	}
private String prepareResponseMessage(int result,String action) {
	if(result == 0) {
		return action +" - failed";
	}else {
		return action +" - success";
	}
}}