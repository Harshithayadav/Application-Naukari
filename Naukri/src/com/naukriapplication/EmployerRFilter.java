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
 * Servlet Filter implementation class EmployerRFilter
 */
public class EmployerRFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String empname=request.getParameter("empname");
		String empusername=request.getParameter("empusername");
		String emppassword=request.getParameter("emppassword");
		String epassword=request.getParameter("epassword");
		String eemail=request.getParameter("eemail");
		


		
		if(empname.length()!=0&&empusername.length()!=0&&emppassword.length()!=0&&epassword.length()!=0&&eemail.length()!=0)
		{
		if(emppassword.equals(epassword))
		{
			chain.doFilter(request, response);
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/errorEmployerRegister.html");
		}
		}
	}

}