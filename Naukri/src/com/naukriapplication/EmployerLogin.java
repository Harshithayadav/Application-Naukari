
package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployerLogin
 */
public class EmployerLogin extends HttpServlet {
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empusername=request.getParameter("empusername");	
		String emppassword=request.getParameter("emppassword");	
		
		Model m=new Model();
		m.setEmpusername(empusername);
		m.setEmppassword(emppassword);
		
int x=m.loginEmp();

if(x==1)
{
	String empname=m.getEmpname();
	
	HttpSession session=request.getSession(true);
	  session.setAttribute("empname",empname);
	  session.setAttribute("empusername",empusername);
	  session.setAttribute("emppassword",emppassword);
	 
	  
	 response.sendRedirect("/Naukri/empHome.jsp");
	  
	  
}
else
{
	response.sendRedirect("/Naukri/FailEmpLogin.html");
}
}

}
