package com.Bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class RestrictionsDemo {

	public static void main(String[] args) {
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessionObj = configObj.buildSessionFactory().openSession();
		
		Criteria criteriaObj = sessionObj.createCriteria("com.bulk.Student");   // select * from st_tab
		
		
		Criterion criterionObj1 = Restrictions.ge("rollNo",11 );  // roll_No >= 2
		Criterion criterionObj2 = Restrictions.eq("course", "hibernate");   // course = 'hibernate
		
		//criteriaObj.add(Restrictions.and(criterionObj1, criterionObj2));
		criteriaObj.add(Restrictions.or(criterionObj1, criterionObj2));
		
		//criteriaObj.add(criterionObj1);  // select * from st_tab where roll_No >= 2
		//criteriaObj.add(criterionObj2);  // select * from st_tab where roll_No >= 2 and course = 'hibernate';
		
		List<Student> listObj = criteriaObj.list();
		
		Iterator<Student> itrObj = listObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
	}

}

