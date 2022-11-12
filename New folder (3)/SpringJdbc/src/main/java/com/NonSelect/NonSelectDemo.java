package com.NonSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NonSelectDemo {
	@Autowired
	private  JdbcTemplate jdbcTemplate ;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	void createAccount(BankAccount account) {
		String query = "insert into bankAccount values (?, ?, ?, ?)";
		int result = jdbcTemplate.update(query,
				new Object[] {account.getAccntNumber(), account.getAccntHolName(), account.getbName(), account.getBrName()});
		System.out.println("no of records inserted into account table are "+result);
	}
	
	void updateAccount(BankAccount account) {
		String query = "update bankAccount set accountHolderName = ?, bankName = ?, branchName = ? where accountNumber = ?";
		int result = jdbcTemplate.update(query, new Object[] {account.getAccntHolName(), account.getbName(), account.getBrName(), account.getAccntNumber()});
		System.out.println("no of records updated are "+result);
	}
	
	void deleteAccount(int accountNumber) {
		 String query = "delete from bankAccount where accountNumber = ?";
		 int result = jdbcTemplate.update(query, new Object[] {accountNumber});
		 System.out.println("no of records deleted are "+result);
	}
	
	
}



