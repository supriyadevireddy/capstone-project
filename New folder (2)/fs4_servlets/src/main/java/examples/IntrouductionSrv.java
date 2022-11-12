package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IntrouductionSrv extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	resp.setContentType("txt/html");
	PrintWriter pwObj = resp.getWriter();
	pwObj.println("hii");
	pwObj.println(9000);
	pwObj.println("----");
	
	pwObj.println("<h1> this is response from doGet method of IntroductionSrv program </h1>");
	pwObj.close();
	}
}
//javax.servlet



