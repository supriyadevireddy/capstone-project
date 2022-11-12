package Com.app.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Reimbursement;
import com.app.util.DateConversion;

import ch.qos.logback.classic.pattern.DateConverter;

public class ReimbursementRowMapper implements RowMapper<Com.app.Pojo.Reimbursement> {

	public Com.app.Pojo.Reimbursement mapRow(ResultSet rs, int rowNum) throws SQLException {

		Com.app.Pojo.Reimbursement rObj = new Com.app.Pojo.Reimbursement();
		
		rObj.setReimbursementId(rs.getInt("reimbursementId"));
		rObj.setUserId(rs.getInt("userId"));
		rObj.setReason(rs.getString("reason"));
		rObj.setAmount(rs.getInt("amount"));
		rObj.setStatus(rs.getString("status"));
		if(rs.getDate("raisedOn")!=null) {
			Object DateConversion;
			rObj.setRaisedOn(((Object) DateConversion).convertDateFromSqlToUtil(rs.getDate(6)));
		}
	//	if(rs.getString("userName") != null) {
			rObj.setUserName(rs.getString("userName"));
		//}
		
		
		return rObj;
	}

}
