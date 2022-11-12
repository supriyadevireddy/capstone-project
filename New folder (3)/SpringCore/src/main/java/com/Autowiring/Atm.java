package com.Autowiring;
public interface Atm {
	
	  boolean validatePin(int pinNo);
	  void cashWithDrawal(int requestedAmount);
	  double balanceInquiry();
	  
	}

