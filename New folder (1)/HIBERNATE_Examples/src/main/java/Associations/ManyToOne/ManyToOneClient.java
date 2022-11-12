package Associations.ManyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneClient {

	public static void main(String[] args) {

		Configuration configObj = new Configuration ();
		configObj.configure();
		
		Session sessObj = configObj.buildSessionFactory().openSession();
		
		Location loc1 = new Location (1 , "hyd" , "telangaana");
		Location loc2 = new Location (2 , "bnglr" , "karnataka");
		Location loc3 = new Location (3 , "chni" , "tamilnadu");
		
		
		Student st1 = new Student (11 , "nitha" , 'f' , loc1);
		Student st2 = new Student (22 , "shitha" , 'f' , loc1);
		Student st3 = new Student(33 , "pariamal" , 'f' , loc2);
		Student st4 = new Student (44 , "venu" , 'm' , loc2);
		Student st5 = new Student (55 , "swaroop" , 'm' , loc3);
		
		Transaction txObj = sessObj.beginTransaction();
		sessObj.save(loc1);
		sessObj.save(loc2);
		sessObj.save(loc3);
		sessObj.save(st1);
		sessObj.save(st2);
		sessObj.save(st3);
		sessObj.save(st4);
		sessObj.save(st5);
		
		txObj.commit();
		sessObj.close();
		
		
		
		
		
	}

}

