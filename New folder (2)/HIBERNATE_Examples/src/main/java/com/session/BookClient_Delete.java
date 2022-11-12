package com.session;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookClient_Delete {

	public static void main(String[] args) {
Configuration configObj = new Configuration ();
configObj.configure();

Session sessObj = configObj.buildSessionFactory().openSession();

Book bObj = new Book ();
bObj.setAmount(99);

Transaction txObj = sessObj.beginTransaction();
sessObj.delete(bObj);
txObj.commit();
sessObj.close();
	}

}

