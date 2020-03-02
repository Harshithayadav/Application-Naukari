package com.naukriapplication;

public class Job 
{
public String cname;
public String cmail;
public String jobrole;
public String jtenth;
public String jpuc;
public String jeng;
public String jskills;
public String salary;
public String location;

Job(String cname,String cmail,String jobrole,String jtenth,String jpuc, String jeng,String jskills,String salary,String location)
{
	this.cname=cname;
	this.cmail=cmail;
	this.jobrole=jobrole;
	this.jtenth=jtenth;
	this.jpuc=jpuc;
	this.jeng=jeng;
	this.jskills=jskills;
	this.salary=salary;
	this.location=location;
	
	
}
 public String toString()
 {
	return cname+"    "+cmail+"     "+jobrole+"     "+jtenth+"    "+jpuc+"    "+jeng+"    "+jskills+"    "+salary+"     "+location+"     ";
	 
 }



}
