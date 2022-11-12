package com.Bulk;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HqlSelection {

	public static void main(String[] args) {
		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessionObj = configObj.buildSessionFactory().openSession();
		
		String hqlQuery = "from Student  st";
		
	 Query query = sessionObj.createQuery(hqlQuery);
		
		List<Student> students = query.list();
		
		students.stream().forEach(st -> System.out.println(st));
		
		sessionObj.close();
		
	}

}

