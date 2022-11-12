package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReceiverClient {

	public static void main(String[] args) {
		
ApplicationContext container = new ClassPathXmlApplicationContext ("springjms.xml");

	}

}

