package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpFPRP
 */
public class EmpFPRP extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session1=request.getSession(true);
		String eemail=(String)session1.getAttribute("eemail");
		String emppassword=request.getParameter("emppassword");
		Model m=new Model();
		m.setEemail(eemail);
		m.setEmppassword(emppassword);
		session1.invalidate();
		int x=m.forgotPassword();
		
		if(x==1)
		{
			response.sendRedirect("/Naukri/successfullyPasswordReset.html");
		}
		else
		{
			response.sendRedirect("/Naukri/failurePasswordReset.html");
		}
		
		
		
		
		}
	
	
	

}
