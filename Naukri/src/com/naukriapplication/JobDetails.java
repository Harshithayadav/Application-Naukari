package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JobDetails
 */
public class JobDetails extends HttpServlet 
{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String cname=request.getParameter("cname");	
		String cmail=request.getParameter("cmail");
		String jobrole=request.getParameter("jobrole");	
		String jtenth=request.getParameter("jtenth");
		String jpuc=request.getParameter("jpuc");
		String jeng=request.getParameter("jeng");
		String jskills=request.getParameter("jskills");
		String salary=request.getParameter("salary");	
		String location=request.getParameter("location");
		
		
		
		
		Model m=new Model();
		m.setCname(cname);
		m.setCmail(cmail);
		m.setJobrole(jobrole);
		m.setJtenth(jtenth);
		m.setJpuc(jpuc);
		m.setJeng(jeng);
		m.setJskills(jskills);
		m.setSalary(salary);
		m.setLocation(location);
		
		
		int x=m.updatejobdetails();
		if(x==1)
		{
			HttpSession session=request.getSession();
			  session.setAttribute("cname",cname);
			
			((HttpServletResponse) response).sendRedirect("/Naukri/successJobUpdate.jsp");
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/failJobUpdate.html");
		}
		
		
		}		
	
	
	
}
