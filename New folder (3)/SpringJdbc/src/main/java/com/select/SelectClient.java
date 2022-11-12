package com.select;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SelectClient {

	public static void main(String[] args) {

		ApplicationContext  container =  new ClassPathXmlApplicationContext("SpringJdbc.xml");
		
		 SelectDemo s = container.getBean("selectDemo" , SelectDemo.class)  ;
		
			  s.getAccountDetails(2); 
			  s.getAllAccounts(); 
			  s.getAllAccounts_2("sec");
			  s.getBankName(4);
			 
	                   s.getAllAccounts_3();
	                   
	}

}

