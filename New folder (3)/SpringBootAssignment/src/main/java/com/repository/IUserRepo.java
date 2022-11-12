package com.repository;

import java.util.List;

import com.pojo.User;
@Annotation
public interface IUserRepo {

	int createUser(User uObj);
	User getUser(int uId);
	int updateUser(User uObj);
	int deleteUser( int uId);
	List<User>getAllUsers();

	
}
