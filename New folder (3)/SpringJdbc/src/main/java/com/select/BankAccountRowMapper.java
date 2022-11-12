package com.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.NonSelect.BankAccount;

public class BankAccountRowMapper implements RowMapper<BankAccount>{

	public BankAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BankAccount b = new BankAccount();
		b.setAccntNumber(rs.getInt(1));
		b.setAccntHolName(rs.getString(2));
		b.setbName(rs.getString(3));
		b.setBrName(rs.getString(4));
		
		return b;
	}
	
	

}

