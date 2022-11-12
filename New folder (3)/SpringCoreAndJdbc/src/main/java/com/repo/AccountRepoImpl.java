package com.repo;

import com.pojo.Account;

@Repository
public class AccountRepoImpl<JdbcTemplate, Jdbc> implements IAccountrepo{
	@Autowired
	private Jdbc Template;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.setJdbcTemplate(jdbcTemplate);
	}

	public int createNewAccount(Account account) {
		
		String query = "insert into Account (  accountNumber,accountHolderName,bankName,ifscCode,amount) values (?,?, ?, ?, ?)";
		int result =  jdbcTemplate();
		return result;

}

	private int jdbcTemplate() {
		return 0;
	}

	@Override
	public void getAllAccounts() {
		this.getAllAccounts();
	return;
	}

	@Override
	public int viewBalance(int accountNumber) {
	this.viewBalance(accountNumber);
		return 0;
	}

	@Override
	public int withDrawalOrDeposit(int accountNumber, int amount) {
	this.getaccountNumber();
	this.getamount();
		return 0;
	}

	private void getamount() {
     this.getamount();
     Object result;
	return;
		
	}

	private void getaccountNumber() {
		this.getaccountNumber();
		Object result;
		return;
		
	}

	@Override
	public int checkAccount(int accountNumber) {
	this.checkAccount(accountNumber);
		return 0;
	}
}