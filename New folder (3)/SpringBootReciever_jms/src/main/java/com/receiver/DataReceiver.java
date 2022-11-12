package com.receiver;

import org.springframework.stereotype.Component;

import com.pojo.Employee;
@Component
public class DataReceiver {
	
	@JmsListener(destination = "first_jms" , containerFactory = "myFactory")
private void receiveData(Employee eObj) {
	
System.out.println("employee received from queue of activemq server is " +eObj);

}
}

