package com.naukriapplication;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class StudentRegisterFilter
 */
public class StudentRegisterFilter implements Filter {

  
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
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


		
		if(sname.length()!=0&&susername.length()!=0&&password.length()!=0&&spassword.length()!=0&&age.length()!=0&&tenth.length()!=0&&puc.length()!=0&&eng.length()!=0&&skills.length()!=0&&age.length()!=0&&smail.length()!=0)
		{
		if(password.equals(spassword))
		{
			chain.doFilter(request, response);
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/errorStudentRegister.html");
		}
		}
		

	}

	
}
