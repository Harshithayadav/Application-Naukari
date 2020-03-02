package com.naukriapplication;

public class OTP {
	int otp()
	{
	double d=Math.random();
	System.out.println(d);
	d=d*1000000;
	System.out.println(d);
	int otp=(int)d;
	return otp;

	}

}
