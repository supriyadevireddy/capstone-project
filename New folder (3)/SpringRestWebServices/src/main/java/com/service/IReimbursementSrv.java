package com.service;

import java.util.List;

import com.pojo.Reimbursement;

public interface IReimbursementSrv {
	
	String createReimbursement(Reimbursement rObj);
	
	String updateReimbursement(Reimbursement rObj);
	
	String deleteReimbursement(int rId);
	
	List<Reimbursement> getReimbursements();

}
