package com.app;
public class Subscriber2Demo {
	void receiveInfo(Object object) {
		 
		Employee e = (Employee) object;

		System.out.println("employee object received from topic to subscriber2 sucessfully " + e);
		}
		}


