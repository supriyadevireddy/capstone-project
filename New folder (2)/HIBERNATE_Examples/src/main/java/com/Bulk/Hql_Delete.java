package com.Bulk;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hql_Delete {

	public static void main(String[] args) {
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessObj = configObj.buildSessionFactory().openSession();
		
		String hqlQuery = " delete from Student  where rollNo= 13";
		
		Query sqlQuery = sessObj.createQuery(hqlQuery);
		
		Transaction txObj = sessObj.beginTransaction();
		
		int result =sqlQuery.executeUpdate();
		txObj.commit();
		System.out.println("no of records are updated " +result);
		sessObj.close();
		
		
		
	}

}

