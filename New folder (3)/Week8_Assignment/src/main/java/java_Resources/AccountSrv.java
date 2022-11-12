package java_Resources;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class AccountSrv extends HttpServlet {

private JdbcHelper jdbcHelper;

@Override
	protected void doGet(javax.servlet.http.HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	

int accountNumber = Integer.parseInt(req.getParameter("accountNumber"));
BankAccount account = (jdbcHelper.getAccount(accountNumber));

resp.setContentType("text/html");
PrintWriter pwObj = resp.getWriter();
pwObj.println("<h3> AccountNumber : "+account.getAccountNumber()+" </h3>");
pwObj.println("<h3> AccountHolder : "+account.getAccountHolderName()+" </h3>");
pwObj.println("<h3> Bank Name : "+account.getBankName()+" </h3>");
pwObj.println("<h3> Branch Name : "+account.getBranchName()+" </h3>");

HttpSession sessionObj = req.getSession();
String userName = (String)( sessionObj.getAttribute("userName"));
String password = (String) ( sessionObj.getAttribute("pwd"));
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	

{
	String accountHolderName = (req.getParameter("accHolderName"));
	
	String bankName =(req.getParameter("bnkName"));
	String branchName = (req.getParameter("brcName"));
	
	BankAccount ba = new BankAccount(0, accountHolderName, bankName, branchName);
	int result = jdbcHelper.createAccount(ba);
	( resp).setContentType("text/html");
	PrintWriter pwObj = resp.getWriter();
	 
	pwObj.println("<h2> Response from doPost method of AccountSrv </h2>");
	if(result ==0) {
		pwObj.println("<h3 style='color:red>' Account creation failed </h3>");
	}else {
		pwObj.println("<h3 style='color:green>' Account creation success </h3>");
	}
	HttpSession sessionObj = req.getSession(true);
	sessionObj.setAttribute("userName"," supriya");
	sessionObj.setAttribute("pwd", "java");
	}

}}













