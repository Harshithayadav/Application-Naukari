package com.naukriapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchJob
 */
public class SearchJob extends HttpServlet {
	
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	   
	   
	HttpSession session=request.getSession();
	String tenth=(String) session.getAttribute("tenth");
	String puc=(String)session.getAttribute("puc");
	String eng=(String) session.getAttribute("eng");
	
	Model m=new Model();
	m.setTenth(tenth);
	m.setPuc(puc);
	m.setEng(eng);
	
	int x=m.SearchJob();
	
	
		PrintWriter pw=response.getWriter();
		ArrayList l=m.l;
		Iterator itr=l.iterator();
		while(itr.hasNext()==true)
		{
			pw.println(itr.next());
		}
		
		
		
		
	
	   
	   
}
}
