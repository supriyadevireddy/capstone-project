package com.NonSelect;

public class BankAccount {

	private int accntNumber;
	private String accntHolName;
	private String bName;
	private String brName;
	
	public BankAccount() {
		super();
	}
	public BankAccount(int accntNumber, String accntHolName, String bName, String brName) {
		super();
		this.accntNumber = accntNumber;
		this.accntHolName = accntHolName;
		this.bName = bName;
		this.brName = brName;
	}
	public int getAccntNumber() {
		return accntNumber;
	}
	public void setAccntNumber(int accntNumber) {
		this.accntNumber = accntNumber;
	}
	public String getAccntHolName() {
		return accntHolName;
	}
	public void setAccntHolName(String accntHolName) {
		this.accntHolName = accntHolName;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getBrName() {
		return brName;
	}
	public void setBrName(String brName) {
		this.brName = brName;
	}
	@Override
	public String toString() {
		return "BankAccount [accntNumber=" + accntNumber + ", accntHolName=" + accntHolName + ", bName=" + bName
				+ ", brName=" + brName + "]";
	}
	
}

