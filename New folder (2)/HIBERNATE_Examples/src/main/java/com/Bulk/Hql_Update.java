package com.Bulk;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hql_Update {

	public static void main(String[] args) {
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessObj = configObj.buildSessionFactory().openSession();
		
		String  hqlQuery =  "update Student  set name='parimala', course='html' where rollNo=11";
		
		Query sqlQuery = sessObj.createQuery(hqlQuery);
		
		Transaction txObj = sessObj.beginTransaction();
		
		int noOfRecUpdated =sqlQuery.executeUpdate();
		txObj.commit();
		
		System.out.println("no of records updated are" +noOfRecUpdated);
		sessObj.close();
	}

}

