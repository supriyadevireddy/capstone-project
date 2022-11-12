package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderDemo {
@Autowired
private JmsTemplate jmsTemplate;
public void setJmsTemplate(JmsTemplate jmsTemplate) {
	this.jmsTemplate = jmsTemplate;
}
 void send( Book b) {
	
jmsTemplate.convertAndSend(b);
System.out.println("book object send to activeMQ server sucessfully");

}
}

