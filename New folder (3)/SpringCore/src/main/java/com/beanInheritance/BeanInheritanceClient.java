package com.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceClient {

	public static void main(String[] args) {

		ApplicationContext container =new ClassPathXmlApplicationContext("beanInheritance.xml");
		
		Employee e1= container.getBean("emp" , Employee.class);
		RegEmployee re = container.getBean("regEmp" , RegEmployee.class);
		
		System.out.println(e1);
		System.out.println(re);
	}

}

