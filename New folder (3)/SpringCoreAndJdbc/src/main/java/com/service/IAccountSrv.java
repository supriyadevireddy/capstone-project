package com.service;

import com.exception.AccountDoesNotExistException;
import com.exception.InSufficientBalanceException;
import com.pojo.Account;
import com.repo.IAccountrepo;

public interface IAccountSrv {
	
		Object sc = null;

		default void createNewAccount(){
			System.out.println("please enter account Holder Name ");
			String accountHolderName = sc.next();
			System.out.println("please enter bankName");
			String bankName = sc.next();
			System.out.println("please enter ifsc Code");
			String ifscCode = sc.next();
			System.out.println("please enter amount");
			String amount = sc.next();
			return;
			String accountNumber = null;
			Account account = new Account(0,accountNumber,accountHolderName,bankName,ifscCode,amount);
			
			int result;
			try {
				result = IAccountrepo.createNewAccount(account);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(result !=0) {
				System.out.println("Account Creation success");
			}else {
				System.out.println("Account creation failure");		}}
		

		void viewBalance() throws AccountDoesNotExistException;	
       void Syso();
		void withDrawal() throws AccountDoesNotExistException, InSufficientBalanceException ;	

		void deposit() throws AccountDoesNotExistException, InSufficientBalanceException ;	

	}


