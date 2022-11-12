package com.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsClient {

	public static void main(String[] args) {
		
ApplicationContext container = new ClassPathXmlApplicationContext("annotations.xml");

Address a= container.getBean("address" , Address.class);
Employee e = container.getBean("employee" , Employee.class);
ICICI i = container.getBean("icici" , ICICI.class);
Sbi s = container.getBean("sbi" , Sbi.class);

System.out.println(a);
System.err.println(e);
System.out.println(i);
System.out.println(s);
	}

}

