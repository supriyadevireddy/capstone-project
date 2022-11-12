package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderClient {

	public static void main(String[] args) {
ApplicationContext container = new ClassPathXmlApplicationContext("springjms.xml");

SenderDemo s = container.getBean("senderDemo" , SenderDemo.class);
 Book b = new Book (55, 22 , "williams" , "java");
 s.send(b);



	}

}

