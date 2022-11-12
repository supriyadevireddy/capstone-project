package com.Repository;

import java.util.List;

import com.pojo.Reimbursement;

public interface IReimbursementRepo {

int createReimbursement(Reimbursement rObj);
	
	int updateReimbursement(Reimbursement rObj);
	
	int deleteReimbursement(int rId);
	
	List<Reimbursement> getReimbursements();
}
