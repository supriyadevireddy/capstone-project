package com.NonSelect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NonSelectClient {

	public static void main(String[] args) {
ApplicationContext container = new ClassPathXmlApplicationContext("SpringJdbc.xml");
		
		NonSelectDemo demoObj = container.getBean("nonSelectDemo", NonSelectDemo.class);
		
		BankAccount account = new BankAccount (3 ,"parimala", "union", "hyd" );
		demoObj.createAccount(account);
		
		BankAccount account2 = new BankAccount(2, "swaroop", "kotak", "sec");
		demoObj.updateAccount(account2);
		
		demoObj.deleteAccount(1);
		
	}
	}



