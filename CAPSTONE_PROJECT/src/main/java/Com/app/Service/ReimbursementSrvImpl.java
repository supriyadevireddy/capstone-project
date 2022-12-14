package Com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.app.Pojo.Reimbursement;
import Com.app.Repository.IReimbursementRepo;

@Service
public class ReimbursementSrvImpl implements IReimbursementSrv {

	@Autowired
	private IReimbursementRepo reimbursementRepo;
	public void setReimbursementRepo(IReimbursementRepo reimbursementRepo) {
		this.reimbursementRepo = reimbursementRepo;
	}
	
	public String applyReimbursement(Reimbursement rObj) {
		int result = reimbursementRepo.insertReimbursement(rObj);
		if(result != 0) {
			return "Reimubursement applied successfully";
		}else {
			return "Reimbursement application failed";
		}
	}

	public List<Com.app.Pojo.Reimbursement> getReimbursements(int userId) {
		
		List<Reimbursement> reimbursements = reimbursementRepo.getAllReimbursements(userId);
		
		return reimbursements;
	}

	public List<Reimbursement> getAllReimbursements() {
		
		return  reimbursementRepo.getAllReimbursements();
	}

	public String updateReimbursements(Reimbursement rObj) {
		int result = reimbursementRepo.updateReimbursement(rObj);
		if(result != 0) {
			return "success";
		}else {
			return "Failure";
		}
	}

}

