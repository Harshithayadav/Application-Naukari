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
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	 
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			
			
			String susername=request.getParameter("susername");
			String password=request.getParameter("password");
			
	if(susername.length()!=0&&password.length()!=0)
	{
		chain.doFilter(request, response);	
	}
	else
	{
		((HttpServletResponse) response).sendRedirect("/Naukri/ErrorLogin.html");
			
		}


		}
}