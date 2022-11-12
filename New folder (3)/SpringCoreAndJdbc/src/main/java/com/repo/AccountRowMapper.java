package com.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.pojo.Account;

public abstract class AccountRowMapper implements RowMapper {
public Account mapRow(ResultSet rs, int rowNum) throws SQLException{
	
	Account bObj = new Account();
	bObj.setAccountNumber(rs.getInt(1));
	bObj.setAccountHolderName(rs.getString(2));
	bObj.setBankName(rs.getString(3));
	bObj.setIfscCode(rs.getString(4));
	bObj.setAmount(rs.getInt(5));
	
	return bObj;
}
}
