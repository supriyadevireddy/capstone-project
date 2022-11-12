package Com.app.Service;

import java.util.List;

import Com.app.Pojo.Reimbursement;

public interface IReimbursementSrv {
	
	String applyReimbursement(Reimbursement rObj);
	
	List<Reimbursement> getReimbursements(int userId);
	
	List<Reimbursement> getAllReimbursements();
	
	String updateReimbursements(Reimbursement rObj);

}

