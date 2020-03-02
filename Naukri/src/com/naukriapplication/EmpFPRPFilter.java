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
 * Servlet Filter implementation class EmpFPRPFilter
 */
public class EmpFPRPFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String emppassword=request.getParameter("emppassword");
		String cemppassword=request.getParameter("cemppassword");
		if(emppassword.equals("cemppassword"))
		{
			chain.doFilter(request, response);
			
		}
		else
		{
			((HttpServletResponse)response).sendRedirect("/Naukri/invalidEmpFPRPDetails.html");
		}

		
		
		
		
	}

	

}
