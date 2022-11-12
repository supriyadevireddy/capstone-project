package com.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Reimbursement;

@Repository
public class ReimbursementRepoImpl implements IReimbursementRepo {
	
	// autowire jdbcTemplate in repo layer  --- to communicate with db from repo layer
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int createReimbursement(Reimbursement rObj) {
		// STEP 5 : communicating with db from repo layer using jdbcTemplate object
		String query = "insert into reimbursement_tab(userName, reason, amount, status) values (?, ?, ?, ?)";
		int result = jdbcTemplate.update(query, new Object[] {rObj.getUserName(), rObj.getReason(), rObj.getAmount(), rObj.getStatus()});
		return result;  // STEP 6
	}

	public int updateReimbursement(Reimbursement rObj) {

		String query = "update reimbursement_tab set userName = ?, reason = ?, amount = ?, status = ? where rId = ?";
		int result = jdbcTemplate.update(query, new Object[] {rObj.getUserName(), rObj.getReason(), rObj.getAmount(), rObj.getStatus(), rObj.getReimbursementId()});
		return result;
	}

	public int deleteReimbursement(int rId) {

		String query = "delete from reimbursement_tab where rId = ?";
		int result = jdbcTemplate.update(query, new Object[] {rId});
		return result;
	}

	public List<Reimbursement> getReimbursements() {

		String query = "select * from reimbursement_tab";
		
		RowMapper<Reimbursement> rm = (rs, rowNum) -> {
			Reimbursement rObj = new Reimbursement(rs.getInt("rId"), rs.getString("userName"), rs.getString("reason"), rs.getInt("amount"), rs.getString("status"));
			return rObj;
		};
		
		List<Reimbursement> reimbursements = jdbcTemplate.query(query, rm);
		return reimbursements;
	}

}
