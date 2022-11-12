package com.associations.manyTomany;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.cfg.Configuration;

public class ManyToManyClient {
	public static void main(String[] args) {
		
			Configuration configObj = new Configuration();
			configObj.configure();
			
			org.hibernate.Session sessionObj = configObj.buildSessionFactory().openSession();
			
			Project p1 = new Project(121,"java",10);
			Project p2 = new Project(122,"hibernate",20);
			Project p3 = new Project(123,"JDBC",30);
			
			Set<Project> Project1 = new HashSet<Project>();
			Project1.add(p1);
			Project1.add(p2);
			Project1.add(p3);
			
			Employee empl1 = new Employee(101,"harika",5000,Project1);
			
			Set<Project> project2 = new HashSet<Project>();
			project2.add(p1);
			project2.add(p2);
			
			Employee empl2 = new Employee(102,"sruthi",7000,project2);
			
		   org.hibernate.Transaction txObj = sessionObj.beginTransaction();
			
		    sessionObj.save(p1);
		    sessionObj.save(p2);
		    sessionObj.save(p3);
		    sessionObj.save(empl1);
	        sessionObj.save(empl2);
			
			txObj.commit();
			sessionObj.close();
			
			
			
		
	}

}
