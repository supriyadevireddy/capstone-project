package com.session;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient_UpdateAndMerge {

	public static void main(String[] args) {
		
Configuration configObj = new Configuration();
configObj.configure();

Session sessObj =configObj.buildSessionFactory().openSession();

Employee eObj = (Employee) sessObj.get(Employee .class  , 2);

Employee eObj2 = new Employee(2 ,  "shitha" , 7777);

Transaction txObj = sessObj.beginTransaction();

//sessObj.update(eObj2); // if we have already  this id  it don't update  exception occur
sessObj.merge(eObj2);// this will update(merge) with same id
txObj.commit();
sessObj.close();


	}

}

