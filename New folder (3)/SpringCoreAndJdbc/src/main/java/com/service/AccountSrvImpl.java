package com.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.exception.AccountDoesNotExistException;
import com.exception.InSufficientBalanceException;
import com.pojo.Account;
import com.repo.Autowired;
import com.repo.IAccountrepo;

@Service
public class AccountSrvImpl implements IAccountSrv {
	
	Scanner sc = new Scanner(System.in);
	
     @Autowired
	private IAccountrepo accountrepo;
	public void setAccountRepo(IAccountrepo accountrepo) {
		this.accountrepo =accountrepo;
	}
	
	public void createNewAccount() {
		System.out.println("please enter account Holder Name ");
		String accountHolderName = sc.next();
		System.out.println("please enter bankName");
		String bankName = sc.next();
		System.out.println("please enter ifsc Code");
		String ifscCode = sc.next();
		System.out.println("please enter amount");
		String amount = sc.next();
		
		String accountNumber = null;
		Account account = new Account(0,accountNumber,accountHolderName,bankName,ifscCode,amount);
		int result = 0;
		try {
			result = IAccountrepo.createNewAccount(account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result !=0) {
			System.out.println("Account Creation success");
		}else {
			System.out.println("Account creation failure");
		}
	}

	public void displayAllAccount() {
		System.out.println("please enter account Holder Name ");
		sc.next();
		System.out.println("please enter bankName");
		sc.next();
		System.out.println("please enter ifsc Code");
		sc.next();
		System.out.println("please enter amount");
		sc.next();
		return;
		
	}

	public void viewBalance() throws AccountDoesNotExistException {
		this.viewBalance();
		return;
	}

	public void withDrawal() throws AccountDoesNotExistException, InSufficientBalanceException {
		this.withDrawal();
		return;
		
	}

	public void deposit() throws AccountDoesNotExistException, InSufficientBalanceException {
		this.deposit();
		return;
		
	}

	@Override
	public void Syso() {
		// TODO Auto-generated method stub
		
	}

}
