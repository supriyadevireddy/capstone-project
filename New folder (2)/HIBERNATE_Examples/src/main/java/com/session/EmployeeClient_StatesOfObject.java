package com.session;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient_StatesOfObject {

	public static void main(String[] args) {
		
Configuration configObj = new Configuration();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession();

Employee eobj = new Employee( 1,"nitha" , 9999 );
System.out.println(sessObj.contains(eobj)); //false //Transient state ---Obj present only here

Transaction txObj = sessObj.beginTransaction();
sessObj.save(eobj);
txObj.commit();
System.out.println(sessObj.contains(eobj));//true //persistent state ---Obj present here and in sql also

sessObj.evict(eobj);
System.out.println(sessObj.contains(eobj));//false //detached state --- Obj present only here because after using evict obj remove from sql

sessObj.close();

	}

}

