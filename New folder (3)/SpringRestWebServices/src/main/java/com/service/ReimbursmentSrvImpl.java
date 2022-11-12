package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.Reimbursement;
import com.repository.IReimbursementRepo;

@Service
public class ReimbursementSrvImpl implements IReimbursementSrv {
	
	// autowiring the repo layer in service layer ---- in order to call the methods of repo layer from service layer
	@Autowired
	private IReimbursementRepo reimbursementRepo;
	public void setReimbursementRepo(IReimbursementRepo reimbursementRepo) {
		this.reimbursementRepo = reimbursementRepo;
	}

	public String createReimbursement(Reimbursement rObj) {

		int result = reimbursementRepo.createReimbursement(rObj);  		// step 4 in the diagram explanation
		if(result == 0) {
			return "reimbursement creation failure";
		}else {
			return "reimbursement creation success";  // STEP 7
		}
	}

	public String updateReimbursement(Reimbursement rObj) {

		int result = reimbursementRepo.updateReimbursement(rObj);
		if(result == 0) {
			return "reimbursement updation failure";
		}else {
			return "reimbursement update success";
		}
	
	}

	public String deleteReimbursement(int rId) {

		int result = reimbursementRepo.deleteReimbursement(rId);
		if(result == 0) {
			return "reimbursement deletion failure";
		}else {
			return "reimbursement deletion success";
		}
	}

	public List<Reimbursement> getReimbursements() {

		List<Reimbursement> reimbursements = reimbursementRepo.getReimbursements();
		return reimbursements;
	}

}