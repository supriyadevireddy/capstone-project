package com.pojo;

public class Account {

	private int accountNumber;
	private String accountHolderName;
	private String bankName;
	private String ifscCode;
	private int amount;
	public Account(int i, String accountNumber2, String accountHolderName2, String bankName2, String ifscCode2, String amount2) {
		super();
	
	}
	public Account(int accountNumber, String accountHolderName, String bankName, String ifscCode, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.amount = amount;

	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + ", amount=" + amount + "]";
	}
	
}
