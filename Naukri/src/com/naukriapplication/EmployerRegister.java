package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployerRegister
 */
public class EmployerRegister extends HttpServlet {
	
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String empname=request.getParameter("empname");	
		String empusername=request.getParameter("empusername");	
		
		String emppassword=request.getParameter("emppassword");	
		String epassword=request.getParameter("epassword");
		String eemail=request.getParameter("eemail");	
		
		
		Model m=new Model();
		m.setEmpname(empname);
		m.setEmpusername(empusername);
		m.setEmppassword(emppassword);
		m.setEemail(eemail);
	
		
		int x=m.registerEmp();
		if(x==1)
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/EmployerLogin.html");
		}
		
		}
		
		
		}	


