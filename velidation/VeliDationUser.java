package com.bankingsystem.velidation;


import com.bankingsystem.javabean.User;

public class VeliDationUser {

	private static final String String = null;
	public static boolean veliDationGmail(String gmail)
	{
		if(gmail.endsWith("@gmail.com"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean veliDationMon(String moNu)
	{
	if(moNu.length()==10)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	public static  boolean veliDationName(String name)
	{
		if(name.startsWith("A"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean  veliDationIfse(String ifsc)
	{
		if(ifsc.startsWith(String))
		{
			return true;
		}
		else
		{
		return false;		
		}
	}
	public static boolean veliDationAmount(double amount)
	{
		if(amount > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean veliDationPin(String pin)
	{
		if(pin.length()==6)
		{
			return true;
		}
		else if
		{
			return false;
		}
   
	}
}
