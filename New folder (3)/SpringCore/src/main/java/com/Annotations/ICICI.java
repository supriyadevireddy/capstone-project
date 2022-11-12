package com.Annotations;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements Atm {

	public boolean validatePin(int pinNo) {
		System.out.println("this is the validate pin no method of icici java class");
		return false;
	}

	public void cashWithDrawal(int requestedAmount) {
		System.out.println("this is the cash withdrawal method of icici java class");
		
	}

	public double balanceInquiry() {
		System.out.println("this is the balance inquiry method of icici java class");
		return 0;
	}

}

