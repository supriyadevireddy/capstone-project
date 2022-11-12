package com.examples;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.AccountSrvImpl;
import com.service.IAccountSrv;

public class AppStarter {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("soring.jdbc.xml");
        IAccountSrv accountSrv = container.getBean("accountSrvImpl",AccountSrvImpl.class);
     System.out.println("please press 1 to create new Account \n " +
                        "press 2 to view balance \n " +
    		            "press 3 to withdraw \n " +
                        "press 4 to exit"
                  );
     Scanner sc = new Scanner(System.in);
      
     int usersChoice = sc.nextInt(); 
     
    	 switch(usersChoice) {
    	 case 1:
    		 accountSrv.createNewAccount();
    		 break;
     }
    	 System.out.println(accountSrv);
	}

}
