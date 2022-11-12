package com.session;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class BookClient_Get {

	public static void main(String[] args) {
		
		// in this syntax.get and .load also  tries
		
Configuration configObj = new Configuration();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession();

Book bObj = (Book) sessObj.get(Book.class, 44);// get  result
//Book bObj = (Book) sessObj.get(Book.class, 11); // get null
//Book bObj= (Book) sessObj.load(Book.class, 44); // get result
//Book bObj = (Book) sessObj.load(Book.class, 11); //get  objectNotFoundexception

System.out.println("hello");
System.out.println(bObj);
System.out.println("program get executed");
}

}

