package java_Resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcHelper {

	private Connection con;
	public void JdbcaHelper() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MY_FIRST_SQL","root","Password1!");
	}catch(ClassNotFoundException ex) {
		ex.printStackTrace();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
int createAccount(BankAccount account) {
	int result = 0;
	String query = "insert into bankAccount (accountHolderName, bankName, branchName) values (?, ?, ?)";
    try {
    	PreparedStatement pstmt= con.prepareStatement(query);
    	pstmt.setString(1, account.getAccountHolderName());
    	pstmt.setString(2, account.getBankName());
    	pstmt.setString(1, account.getBranchName());
    	result = pstmt.executeUpdate
    			();
    }catch(SQLException e) {
    	e.printStackTrace();
    }
	return result;
}
public BankAccount getAccount(int accountNumber) {
	// TODO Auto-generated method stub
	return null;
}

}
