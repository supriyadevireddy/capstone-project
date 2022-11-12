package com.app;


public class ReceiverDemo {

	private void receiveData(Object object) {
Book b = (Book) object;
System.out.println("received  info to receiver from queue  of activeMQ server is "+ b);

	}
	

}
