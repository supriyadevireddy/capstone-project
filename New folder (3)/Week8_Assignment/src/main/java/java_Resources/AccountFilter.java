package java_Resources;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AccountFilter implements Filter{

	public AccountFilter() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String sessionId = req.getParameter("sessionId");
		if(sessionId !=null && sessionId.equals("12345")) {
			chain.doFilter(req, resp);
		}else {
			resp.setContentType("text/html");
			PrintWriter pwObj= resp.getWriter();
			pwObj.println("<h2> page Not Found </h2>");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
