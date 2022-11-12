package com.Autowiring;

public class Sbi implements Atm {

	public boolean validatePin(int pinNo) {
		System.out.println("this is the validate pin no  method of sbi java class");
		return false;
	}

	public void cashWithDrawal(int requestedAmount) {
		System.out.println("this is the cash withdrawal method of sbi  java class");
		
	}

	public double balanceInquiry() {
		System.out.println("this is the balanceinquiry method of  sbi java class");
		return 0;
	}

}

