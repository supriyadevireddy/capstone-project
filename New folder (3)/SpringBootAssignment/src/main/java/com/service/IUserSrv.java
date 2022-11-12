package com.service;

import java.util.List;

import com.pojo.User;
import com.repository.Annotation;
@Annotation
public interface IUserSrv {

	String createUser(User uObj);
	User getUser(int uId);
	String updateUser(User uObj);
	String deleteUser( int uId);
	List<User>getAllUsers();
	
}
