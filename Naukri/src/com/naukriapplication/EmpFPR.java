package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class empFPR
 */
public class EmpFPR extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String uotp=request.getParameter("uotp");
		System.out.println(uotp);
		HttpSession session1=request.getSession();
		String a=(String)session1.getAttribute("otp1");
		System.out.println(a);

if(uotp.equals(a))
{
	  	 response.sendRedirect("/Naukri/empFPRP.html");  
	  
}
else
{
	response.sendRedirect("/Naukri/empFP.html");
}
	
	}


}