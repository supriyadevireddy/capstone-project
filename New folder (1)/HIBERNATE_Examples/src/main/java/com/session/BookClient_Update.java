package com.session;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookClient_Update {

	public static void main(String[] args) {
		
Configuration configObj = new Configuration ();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession();

Book bObj = new Book (66 , "java" , "rolls");

Transaction txObj = sessObj.beginTransaction();

sessObj.update(bObj);

txObj.commit();
sessObj.close();
	}

}

