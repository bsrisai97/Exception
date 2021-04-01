package com.practice;

public class DemoExceptionExample 
{
	public static void main(String[] args) 
	{
		try
		{
			badMethod();
			System.out.println("a");
		}
		catch(Exception ex)
		{
			System.out.println("bsrisai");
		}
		finally
		{
			System.out.println("c");
		}
		System.out.println("d");
	}
	public static void badMethod()
	{
		throw new Error();
		
	}
}
