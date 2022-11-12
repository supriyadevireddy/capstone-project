package com.select;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.NonSelect.BankAccount;

@Repository
public class SelectDemo {
@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
void getAccountDetails(int accountNumber) {
		
		String query = "select * from bankAccount where accountNumber = ?";
		BankAccount bObj = jdbcTemplate.queryForObject(query, new Object[] { accountNumber }, new BankAccountRowMapper());
		
		System.out.println(bObj);
	}
	
	void getAllAccounts() {
		 String query = "select * from bankAccount";
		 List<BankAccount> bankAccounts = jdbcTemplate.query(query, new BankAccountRowMapper());
		 
		 for(BankAccount ba : bankAccounts) {
			 System.out.println(ba);
		 }
	}
	
	void getAllAccounts_2(String branchName) {
		 String query = "select * from bankAccount where branchName = ?";
		 List<BankAccount> bankAccounts = jdbcTemplate.query(query, new Object[] {branchName}, new BankAccountRowMapper());
		 
		 for(BankAccount ba : bankAccounts) {
			 System.out.println(ba);
		 }
	}
	
	
	  void getAllAccounts_3() {
		  String query = "select * from bankAccount";
	  List<BankAccount> bankAccounts = jdbcTemplate.query(query, new  BankAccountResultSetExtractor());
	  
      for(BankAccount ba : bankAccounts) {
	  System.out.println(ba); } 
      }
	 
	void getBankName(int accountNumber) {
		
		String query = "select bankName from bankAccount where accountNumber = ?";
		String bankName = jdbcTemplate.queryForObject(query,  new Object[] {accountNumber}, String.class);
	    System.out.println(bankName);
		
	}

}


