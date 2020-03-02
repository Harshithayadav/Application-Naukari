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
 * Servlet Filter implementation class EmployerLoginFilter
 */
public class EmployerLoginFilter implements Filter {

   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String empusername=request.getParameter("empusername");
		String emppassword=request.getParameter("emppassword");
		
if(empusername.length()!=0&&emppassword.length()!=0)
{
	chain.doFilter(request, response);	
}
else
{
	((HttpServletResponse) response).sendRedirect("/Naukri/EmpErrorLogin.html");
		
	}


	}	}


