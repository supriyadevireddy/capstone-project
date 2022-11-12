package com.receiver;

public @interface JmsListener {

	String destination();

	String containerFactory();

}
