package com.pojo;
public class Reimbursement {
	private int reimbursementId;
	private String userName;
	private String reason;
	private int amount;
	private String status;

	public Reimbursement() {
		super();
	}

	public Reimbursement(int reimbursementId, String userName, String reason, int amount, String status) {
		super();
		this.reimbursementId = reimbursementId;
		this.userName = userName;
		this.reason = reason;
		this.amount = amount;
		this.status = status;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementId=" + reimbursementId + ", userName=" + userName + ", reason=" + reason
				+ ", amount=" + amount + ", status=" + status + "]";
	}

}


