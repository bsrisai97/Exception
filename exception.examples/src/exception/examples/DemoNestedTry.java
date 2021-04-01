package exception.examples;

public class DemoNestedTry
{
	 public static void main(String args[])
	 {  
		  try
		  {  
		    try
		    {  
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println(e);
		    	}  
		    try
		    {  
		    int a[]=new int[5];  
		    a[5]=4;
		    //if we dont want to get array exception.
		    //a[4]=4;
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println(e);
		    	}  
		     
		    System.out.println("other statement");  
		  }
		  catch(Exception e)
		  {
			  System.out.println("handeled");
			  }  
		  
		  System.out.println("normal flow..");  
		 }  
}
