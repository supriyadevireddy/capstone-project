package com.session;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookClient_InsertWays {

	public static void main(String[] args) {
Configuration configObj = new Configuration ();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession();

 Book bObj = new Book (22, "javascript" , "swaroop");
 
  Transaction txObj = sessObj.beginTransaction();
  
  // int  amount  = (Integer) sessObj.save(bObj);
   //System.out.println("amount with which we got new record inserted is " + amount );
 // sessObj.persist(bObj);
   
   sessObj.saveOrUpdate(bObj);
   
  txObj.commit();
  sessObj.close();
  
 
	}

}

