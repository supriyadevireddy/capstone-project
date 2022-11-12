package com.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.exceptions.UserNotFoundException;
import com.pojo.User;

public class UserRepoImpl implements IUserRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
RowMapper<User> rm =(rs,rowNum) -> {
	User uObj = new User(rs.getInt("uId") , rs.getString("fName"), rs.getString("lName"),rs.getString("userName") ,rs.getString("pwd"));
	return uObj;
};
	public int createUser(User uObj) {
		String query ="insert into user_tab(fName,lName,userName,pwd)values(? , ?,  ?,?)";
		int  result = jdbcTemplate.update(query,new Object[] {uObj.getfName(),uObj.getlName(),uObj.getUserName(),uObj.getPwd()});
		return result;
	}

	public User getUser(int uId) {
		String query ="select *  from user_tab where uId = ?";
		User uObj=null;
		try {
			uObj=jdbcTemplate.queryForObject(query, new Object[] {uId} , rm);
		}catch(EmptyResultDataAccessException ex) {
			throw new UserNotFoundException();
		}
		return  uObj;
	}

	public int updateUser(User uObj) {
	String query =" update User_tab set fName=? , lName=? , userName=? , pwd=?";
	int result =jdbcTemplate.update(query,new Object[] {uObj.getfName(),uObj.getlName(),uObj.getUserName(),uObj.getPwd(),uObj.getUserId()});
		return result;
	}

	public int deleteUser(int uId) {
		String query ="delete  from user_tab where uId = ?";
		int result = jdbcTemplate.update(query,new Object[] {uId});
		return result;
	}

	public List<User> getAllUsers() {
		String query ="select * from user_tab";
		List<User>users =jdbcTemplate.query(query, rm);
		return users;
	}

}
