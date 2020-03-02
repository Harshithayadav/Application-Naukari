package com.naukriapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class Model
{
	ArrayList l=new ArrayList();

	Connection con;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	private String sname;
	private String susername;
	


	private String password;
	private String spassword;
	private String age;
	private String tenth;
	private String puc;
	private String eng;
	private String skills;
	private String smail;
	
	

	private String empname;
	private String empusername;
	private String eemail;
	private String emppassword;
	private String epassword;
	
	private String cname;
	private String cmail;
	private String jobrole;
	private String jtenth;
	private String jpuc;
	private String jeng;
	private String jskills;
	private String salary;
	private String location;
	
	

	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}

	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public String getJtenth() {
		return jtenth;
	}
	public void setJtenth(String jtenth) {
		this.jtenth = jtenth;
	}
	public String getJpuc() {
		return jpuc;
	}
	public void setJpuc(String jpuc) {
		this.jpuc = jpuc;
	}
	public String getJeng() {
		return jeng;
	}
	public void setJeng(String jeng) {
		this.jeng = jeng;
	}
	public String getJskills() {
		return jskills;
	}
	public void setJskills(String jskills) {
		this.jskills = jskills;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSusername() {
		return susername;
	}
	public void setSusername(String susername) {
		this.susername = susername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
			
	}
	
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTenth() {
		return tenth;
	}
	public void setTenth(String tenth) {
		this.tenth = tenth;
	}
	public String getPuc() {
		return puc;
	}
	public void setPuc(String puc) {
		this.puc = puc;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpusername() {
		return empusername;
	}
	public void setEmpusername(String empusername) {
		this.empusername = empusername;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEpassword() {
		return epassword;
	}
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

	
	
	
	Model()
	{
		try
		{
				DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	int register()
	{
		try {
	 String s="INSERT INTO APPLICANT VALUES(?,?,?,?,?,?,?,?)";
	 pstmt=con.prepareStatement(s);
	 pstmt.setString(1, sname);
	 pstmt.setString(2, susername);
	 pstmt.setString(3, password);
	 
	 pstmt.setString(4, age);
	 pstmt.setString(5, tenth);
	 pstmt.setString(6, puc);
	 pstmt.setString(7, eng);
	 pstmt.setString(8, skills);
	 pstmt.setString(9, smail);
	 
	 System.out.println(sname+susername+password+age+tenth+puc+eng+skills+smail);
	 int x=pstmt.executeUpdate();
	 
	 
	 return x;
	 
	 
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	
	int registerEmp()
	{
		try {
	 String s="INSERT INTO EMPLOYER VALUES(?,?,?,?)";
	 pstmt=con.prepareStatement(s);
	 pstmt.setString(1, empname);
	 pstmt.setString(2, empusername);
	
	 pstmt.setString(3, emppassword);
	 pstmt.setString(4, eemail);
	 
	
	 System.out.println(empname+empusername+emppassword+eemail);
	 int x=pstmt.executeUpdate();
	 
	 
	 return x;
	 
	 
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	
	
	


	
public int login()
	{
		try
		{
		String s="SELECT * FROM APPLICANT WHERE SUSERNAME=? AND PASSWORD=?";	
		pstmt=con.prepareStatement(s);
		 pstmt=con.prepareStatement(s);
		 pstmt.setString(1, susername);
		 pstmt.setString(2, password);
		 rs=pstmt.executeQuery();
		 
		if(rs.next()==true)
		{
			sname=rs.getString("sname");
			
			return 1;
		}
		else
		{
			return 0;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}




 int loginEmp()
	{
		try
		{
		String s="SELECT * FROM EMPLOYER	 WHERE EMPUSERNAME=? AND EMPPASSWORD=?";	
		pstmt=con.prepareStatement(s);
		 pstmt=con.prepareStatement(s);
		 pstmt.setString(1, empusername);
		 pstmt.setString(2, emppassword);
		 rs=pstmt.executeQuery();
		 
		if(rs.next()==true)
		{
			empname=rs.getString("empname");
			
		
			return 1;
		}
		else
		{
			return 0;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}



int updatejobdetails()
{
	try {
 String s="INSERT INTO JOBS VALUES(?,?,?,?,?,?,?,?,?)";
 pstmt=con.prepareStatement(s);
 pstmt.setString(1, cname);
 pstmt.setString(2, cmail);
 pstmt.setString(3, jobrole);
 pstmt.setString(4, jtenth);
 pstmt.setString(5, jpuc);
 pstmt.setString(6, jeng);
 pstmt.setString(7, jskills);
 pstmt.setString(8, salary);
 pstmt.setString(9, location);
 System.out.println(cname+cmail+jobrole+jtenth+jpuc+jeng+jskills+salary+location);
 int x=pstmt.executeUpdate();
 
 
 return x;
 
 
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
	
}


int forgotPassword()
{
	try
	{
		String s="UPDATE EMPLOYER SET EMPPASSWORD=? WHERE EEMAIL=?";
		pstmt=con.prepareStatement(s);
		 pstmt.setString(1, emppassword);
		 pstmt.setString(2, eemail);
		 rs=pstmt.executeQuery();
		 if(rs.next()==true)
		 {
			 return 1;
		 }
		 
		 return 0;
		 
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
}


int SearchJob()
{
	try
	{
	String s="SELECT * FROM JOB	 WHERE 	TENTH=? AND PUC=? AND ENG=?";	
	pstmt=con.prepareStatement(s);
	 pstmt=con.prepareStatement(s);
	 pstmt.setString(1, tenth);
	 pstmt.setString(2, puc);
	 pstmt.setString(3, eng);
	 rs=pstmt.executeQuery();
	 
	while(rs.next()==true)
	{
		
		
		l.add(new Job("cname","cmail","jobrole","jtenth","jpuc","jeng","jskills","salary","location"));
		
		
		
	
		
	}
	return 1;
	}
		catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
	
}

}



