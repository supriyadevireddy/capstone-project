package com.Bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionsDemo {

	public static void main(String[] args) {
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessionObj = configObj.buildSessionFactory().openSession();
		
		Criteria criteriaObj = sessionObj.createCriteria("com.bulk.Student"); 
		
		ProjectionList projList =  Projections.projectionList();  // static methods can be accessed through ClassName
		projList.add(Projections.property("rollNo"));
		projList.add(Projections.property("name"));
		
		criteriaObj.setProjection(projList);  
		
		List<Object[]> rows = criteriaObj.list();
		
		Iterator<Object[]> itrObj = rows.iterator();
		
		while(itrObj.hasNext()) {
			  Object[] columns = itrObj.next();
			  System.out.println(columns[0]+" -- "+columns[1]);
		}
		
	}

}
	

