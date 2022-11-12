package Associations.ManyToMany;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyClient {

	public static void main(String[] args) {
		Configuration configObj = new Configuration();
		configObj.configure();
		
		Session sessionObj = configObj.buildSessionFactory().openSession();
		
		Course c1 = new Course(201, "java", 30, 9000, "virat");
		Course c2 = new Course(202, "html", 10, 2000, "yoshi");
		Course c3 = new Course(203, "angular", 20, 70000, "sumit");
		
		Set<Course> courses1 = new HashSet<Course>();
		courses1.add(c1);
		courses1.add(c2);
		courses1.add(c3);
		
		Student st1 = new Student(1, "harika", 'F', 89898989L, "harika@gmail.com", courses1);
		
		Set<Course> courses2 = new HashSet<Course>();
		courses2.add(c1);
		courses2.add(c2);
		
		Student st2 = new Student(2, "arif", 'M', 848484848L, "arif@gmail.com", courses2);
		
		Transaction txObj = sessionObj.beginTransaction();
		
		sessionObj.save(c1);
		sessionObj.save(c2);
		sessionObj.save(c3);
		sessionObj.save(st1);
		sessionObj.save(st2);
		
		txObj.commit();
		sessionObj.close();
		
		
		
	}


	}



