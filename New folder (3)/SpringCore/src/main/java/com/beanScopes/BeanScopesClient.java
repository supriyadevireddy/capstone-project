package com.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScopesClient {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beanScopes.xml");
		
		// singleton
		Employee e1= container.getBean("emp" , Employee .class);
		Employee e2= container.getBean("emp" , Employee .class);
		Employee e3= container.getBean("emp" , Employee .class);
		
		System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());		
		System.out.println(e3.hashCode());
		
		//prototype
		Employee e4= container.getBean("emp2" , Employee.class);
		Employee e5= container.getBean("emp2" , Employee.class);
		Employee e6= container.getBean("emp2" , Employee.class);
		
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e6.hashCode());
	}
}

