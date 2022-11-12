package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderDemo {
	
	@Autowired
	private JmsTemplate jmsTemplate ;
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	void sendInfo(Employee e) {
		
		jmsTemplate.convertAndSend(e);
		
		System.out.println("Employee info send to active server sucessfully");
	}
	
	
}

