package com.session;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookClient_Insert {

	public static void main(String[] args) {
		
Configuration configObj = new Configuration();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession()	;

Book bObj = new Book(66 , "javaScript" , "jackob");
Book bObj2  =new Book(55 , "css" , "john");


Transaction txObj = sessObj.beginTransaction();
sessObj.save(bObj);
sessObj.save(bObj2);
txObj.commit();
sessObj.close();
}
}
