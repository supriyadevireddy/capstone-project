package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderClient {

	public static void main(String[] args) {
		
ApplicationContext container =  new ClassPathXmlApplicationContext("springjms.xml");

SenderDemo  s = container .getBean("SenderDemo" , SenderDemo.class);
Employee e = new Employee(2 , "shitha", "female", 444);

s.sendInfo(e);

	}

}

