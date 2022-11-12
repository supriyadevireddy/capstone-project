package com.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.exception.EmployeeNotFoundException;
import com.pojo.Employee;

@Repository
public class EmployeeRepoImpl implements IEmplRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	RowMapper<Employee> rm = (rs , rowNum)->{
		Employee eObj = new Employee (rs.getInt("emplId") , rs.getString("name") , rs.getInt("salary"));
		return eObj;
	};

	public int createEmployee(Employee eObj) {
		String query="insert into emp_demo(emplId , name , salary) values (? , ? , ?)";
		int result = jdbcTemplate.update(query , new Object[] { eObj.getName() , eObj.getSalary()});
		return result;
	}

	public int updateEmployee(Employee eObj) {
		String query = "update emp_demo set name = ? , salary = ? where  emplId= ?" ;
		int result = jdbcTemplate.update(query , new Object[] { eObj.getName() , eObj.getSalary()});
		return result;
	}

	public int deleteEmployee(int emplId) {
		String query = " delete emp_demo where emplId =?";
		int result = jdbcTemplate.update(query , new Object[] {emplId});
		return result;
	}

	public List<Employee> getEmployees() {
		String query = "select * from emp_demo";
		List<Employee> employees = jdbcTemplate.query(query , rm);
		return employees;
	}

	public Employee getEmployee(int emplId) {
		String query = "Select * from emp_demo where emplId =?";
		
		Employee eObj = null;
		try {
		eObj =jdbcTemplate.queryForObject(query, new Object[] {emplId}, rm);
		}catch(EmptyResultDataAccessException e) {
			throw new EmployeeNotFoundException();
		}
		
		return eObj;
	}

}

