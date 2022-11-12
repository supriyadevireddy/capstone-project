package com.Bulk;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HqlSelection2 {

	public static void main(String[] args) {
		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessionObj = configObj.buildSessionFactory().openSession();
		
		String hqlQuery = "select  rollNo ,  name  from Student" ;
		
		Query sqlQuery = sessionObj.createQuery(hqlQuery);
		
		List<Object[]> results = sqlQuery.list();   // Object[]  -- represents the data of selected columns in 1 row 
		
		// List<Object[]>  -- represents the data of selected columns in all rows
		
		results.stream().forEach(row -> {
					Arrays.asList(row).stream().forEach(col -> System.out.print(col+" "));
					System.out.println();
					});
		
		/*for(Object[] row : results) {
			
			System.out.println(row[0]+" -- "+row[1]);
			
		}*/
		
	}


	}



