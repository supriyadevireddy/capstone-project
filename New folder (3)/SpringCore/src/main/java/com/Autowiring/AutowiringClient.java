package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringClient {

	public static void main(String[] args) {
	ApplicationContext container = new ClassPathXmlApplicationContext("Autowiring.xml");
		
		Employee e = container.getBean("emp" , Employee.class);
		System.out.println(e); 
				
	}
	}



