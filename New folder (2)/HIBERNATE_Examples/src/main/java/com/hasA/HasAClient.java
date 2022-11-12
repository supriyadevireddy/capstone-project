package com.hasA;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HasAClient {

	public static void main(String[] args) {
		
Configuration configObj = new Configuration();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession();

Address aObj = new Address(11 , "hyd" , "sec");
Employee eObj = new Employee(1 , "nitha" , 9999 , aObj);

Address aObj2 = new Address(22 , "bnglr"  , " karnataka");
Employee eObj2 = new Employee(2 , "shitha ", 7777 , aObj2);

	Transaction txObj = sessObj.beginTransaction();
	
sessObj.save(aObj);
sessObj.save(aObj2);

sessObj.save(eObj);
sessObj.save(eObj2);
 txObj.commit();
 sessObj.close();


	}

}

