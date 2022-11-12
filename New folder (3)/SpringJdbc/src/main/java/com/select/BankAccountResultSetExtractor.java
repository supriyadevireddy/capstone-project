package com.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.NonSelect.BankAccount;

public class BankAccountResultSetExtractor implements ResultSetExtractor<List<BankAccount>>{

	public List<BankAccount> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<BankAccount> bankaccounts = new ArrayList<BankAccount>();
		
		while (rs.next()) {
		BankAccount ba = new BankAccount();
		
		ba.setAccntNumber(rs.getInt(1));
		ba.setAccntHolName(rs.getString(2));
		ba.setbName(rs.getString(3));
		ba.setBrName(rs.getString(4));
		
		bankaccounts.add(ba);
	}
		return bankaccounts;
	}

}

