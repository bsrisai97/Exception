package exception.examples;

public class DemoFinally 
{
	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("compulsary");
		}
		System.out.println("ArithmeticException occur:its not valid");
	}

	}
