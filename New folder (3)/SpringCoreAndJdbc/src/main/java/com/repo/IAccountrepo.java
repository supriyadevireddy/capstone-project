package com.repo;

import java.util.List;

import com.pojo.Account;

public interface IAccountrepo  {
	static int createNewAccount(Account account) {
		return 0;
	}	
	
	void getAllAccounts();	
	System.out.println("this is createNewAccount method of IAccountRepo");
	return ;

	int viewBalance(int accountNumber);{
	System.out.println("this is viewBalance method of IAccountRepo class");
	return ;
	}
	int withDrawalOrDeposit(int accountNumber, int amount);	{
System.out.println("this is withDrawalOrDeposit method of IAccountRepo class");
return ;
	}
  int checkAccount(int accountNumber);{
  System.out.println("this is checkAccount method of IAccountRepo class");
  return ;
}}