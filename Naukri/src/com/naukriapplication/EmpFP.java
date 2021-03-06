

package com.naukriapplication;




import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpFP
 */
public class EmpFP extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	String eemail=request.getParameter("eemail");
	HttpSession session1=request.getSession(true);
	session1.setAttribute("eemail", eemail);
	
	
	OTP o=new OTP();
	int otp=o.otp();
	String otp1=Integer.toString(otp);
	session1.setAttribute("otp", otp1);
	System.out.println(otp1);
	
	
	final String fromEmail=Credentials.email; //sender's mail id.
	final String pwd=Credentials.pwd;		//sender's mail pw	d.
	
	String toEmail=eemail;  //reciever's mail id.
	String subject="DO NOT REPLY: Mail from Java Program"; // mail subject line
	String msg="Hi"  +  eemail +  " http://localhost:8082/Naukri/empFPR.jsp"  +" "+  otp; //mail body
	
	//Creating Session Object
	Properties prop = new Properties();
	prop.put("mail.smtp.host", "smtp.gmail.com");
	prop.put("mail.smtp.port", "587");
	prop.put("mail.smtp.auth", "true");
	prop.put("mail.smtp.starttls.enable", "true");
	Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator()
	{
		protected PasswordAuthentication getPasswordAuthentication()
		{
			//sender's mail id and pwd is encapsulated inside "SendersCredentials.java"
			return new PasswordAuthentication(fromEmail, pwd);
		}
	});

	try
	{
		//Composing the Mail
		MimeMessage mesg = new MimeMessage(session);
		mesg.setFrom(new InternetAddress(fromEmail));
		mesg.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
		mesg.setSubject(subject);  
		mesg.setText(msg);  

		//Sending the Mail
		Transport.send(mesg);
		System.out.println("Mail Sent!!");
		response.sendRedirect("/Naukri/successSendMail.html");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

		
		
	}

