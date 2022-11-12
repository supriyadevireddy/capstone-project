package com.app;

public class Subscriber1Demo {
	
	 void receiveInfo(Object object) {
		 
	Employee e = (Employee) object;

	System.out.println("employee object received from topic to subscriber1 sucessfully " + e);
	}
	}
