package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Subscriber1Client {

	public static void main(String[] args) {
ApplicationContext container = new ClassPathXmlApplicationContext("SpringJms.xml");

	}

}

