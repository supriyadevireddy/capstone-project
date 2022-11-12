package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansClient {

	public static void main(String[] args) {
	ApplicationContext container =  new ClassPathXmlApplicationContext("beans.xml");
	
	Address a1=container.getBean("adrObj",Address.class);
	Address a2 = container.getBean("adrObj2", Address.class);
	
	Student student = container.getBean("st", Student.class);
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(student);
	}

}

