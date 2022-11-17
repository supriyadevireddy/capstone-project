package Com.app.Repository;

import java.util.List;

import Com.app.Pojo.Reimbursement;

public interface IReimbursementRepo {
	
	int insertReimbursement(Reimbursement rObj);
	
	List<Reimbursement> getAllReimbursements(int userId);

	List<Reimbursement> getAllReimbursements();
	
	int updateReimbursement(Reimbursement rObj );

}

