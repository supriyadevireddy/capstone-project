package com.session;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class EmployeeClient_Cache {

	public static void main(String[] args) {
		
Configuration configObj = new Configuration();
configObj.configure();

Session sesObj = configObj.buildSessionFactory().openSession();

Employee emp1 =( Employee) sesObj.get(Employee.class , 1);
Employee emp2 =( Employee) sesObj.get(Employee.class , 1);

System.out.println(emp1);
System.out.println(emp2);

	}

}

