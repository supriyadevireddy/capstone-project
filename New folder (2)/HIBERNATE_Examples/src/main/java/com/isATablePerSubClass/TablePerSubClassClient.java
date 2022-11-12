package com.isATablePerSubClass;import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerSubClassClient {

	public static void main(String[] args) {
		Configuration configObj = new Configuration();
		configObj.configure();

		Session sessObj = configObj.buildSessionFactory().openSession();

		Employee emp = new Employee(44 , "parimala" , "engineer");
		RegularEmployee regObj = new RegularEmployee(55 , "sreeshitha" , "seniorEngineer" , 9999 , 999);
		ContractEmployee conObj = new ContractEmployee(66 , "sreenitha" , "CA" , 999 , 90);

		Transaction txObj = sessObj.beginTransaction();
		
		sessObj.save(emp);
		sessObj.save(regObj);
		sessObj.save(conObj);
		
		txObj.commit();
		sessObj.close();
		}
	



	}





