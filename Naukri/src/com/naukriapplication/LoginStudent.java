package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginStudent
 */
public class LoginStudent extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String susername=request.getParameter("susername");	
		String age=request.getParameter("age");	
		String password=request.getParameter("password");
		String tenth=request.getParameter("tenth");
		String puc=request.getParameter("puc");
		String eng=request.getParameter("eng");
		String location=request.getParameter("location");
		String skills=request.getParameter("skills");
		String salary=request.getParameter("salary");
		String smail=request.getParameter("smail");
		
		Model m=new Model();
		m.setSusername(susername);
		m.setPassword(password);
		
int x=m.login();

if(x==1)
{
	String sname=m.getSname();
	
	HttpSession session=request.getSession(true);
	  session.setAttribute("sname",sname);
	  session.setAttribute("age",age);
	  session.setAttribute("tenth",tenth );
	  session.setAttribute("puc",puc );
	  session.setAttribute("eng",eng );
	  session.setAttribute("location",location );
	  session.setAttribute("skills",skills );
	  session.setAttribute("salary",salary );
	  session.setAttribute("smail",smail );

	  
	 response.sendRedirect("/Naukri/SuccessfulLogin.jsp");
	  
	  
}
else
{
	response.sendRedirect("/Naukri/FailLogin.html");
}
}


}
