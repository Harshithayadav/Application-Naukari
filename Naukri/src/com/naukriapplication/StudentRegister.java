package com.naukriapplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class StudentRegister
 */
public class StudentRegister extends HttpServlet 
{
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String sname=request.getParameter("sname");	
		String susername=request.getParameter("susername");	
		String password=request.getParameter("password");	
		String spassword=request.getParameter("spassword");
		String age=request.getParameter("age");
		String tenth=request.getParameter("tenth");
		String puc=request.getParameter("puc");
		String eng=request.getParameter("eng");
		String skills=request.getParameter("skills");
		String smail=request.getParameter("smail");
		
		Model m=new Model();
		m.setSname(sname);
		m.setSusername(susername);
		m.setPassword(password);
		m.setSpassword(spassword);
		m.setAge(age);
		m.setTenth(tenth);
		m.setPuc(puc);
		m.setEng(eng);
		m.setSkills(skills);
		m.setSkills(smail);
		
		
		int x=m.register();
		if(x==1)
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/StudentLogin.html");
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/Fail.html");
		}
		
		
		}	
	
}
