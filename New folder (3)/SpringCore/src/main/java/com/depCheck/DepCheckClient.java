package com.depCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepCheckClient {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("depCheck.xml");
		
		Employee e = container.getBean("emp" , Employee.class);
		System.out.println(e); 
				
	}

}

