package exception.examples;

import java.io.IOException;

public class DemoThrows 
{
	void m()throws IOException
	{
		throw new IOException("in valid");
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
		n();
		}
		catch(Exception e)
		{
			System.out.println("handled expression");
		}
	}
	public static void main(String[] args) 
	{
		DemoThrows obj=new DemoThrows();
		obj.p();
		System.out.println("normally printed");
	}
}
