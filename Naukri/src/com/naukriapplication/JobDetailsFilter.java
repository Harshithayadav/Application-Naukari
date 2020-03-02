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
 * Servlet Filter implementation class JobDetailsFilter
 */
public class JobDetailsFilter implements Filter {

  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
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
		

		
		if(cname.length()!=0&&cmail.length()!=0&&jobrole.length()!=0&&jtenth.length()!=0&&jpuc.length()!=0&&jeng.length()!=0&&jskills.length()!=0&&salary.length()!=0&&location.length()!=0)
		{
					chain.doFilter(request, response);
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Naukri/errorJobDetails.html");
		}
		}
	}

	

