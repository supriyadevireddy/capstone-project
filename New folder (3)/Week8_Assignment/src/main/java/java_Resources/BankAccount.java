package java_Resources;

public class BankAccount {
private int accountNumber;
private String accountHolderName;
private String bankName;
private String branchName;

public BankAccount() {
	super();
}

public BankAccount(int accountNumber, String accountHolderName, String bankName, String branchName) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.bankName = bankName;
	this.branchName = branchName;
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

public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

@Override
public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", bankName="
			+ bankName + ", branchName=" + branchName + "]";
}

}
