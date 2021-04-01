package exception.examples;

public class DemoThrow
{
	    public static void main(String[] args) {  
	          
	           try{    
	                int a[]=new int[5];    
	                //String a=null;
	                	//	System.out.println(a.length());
	                	System.out.println(a[10]);
	           }    
	               catch(ArithmeticException e)  
	                  {  
	                   System.out.println("Arithmetic Exception occurs");  
	                  }    
	               catch(ArrayIndexOutOfBoundsException e)  
	                  {  
	                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	                  }    
	               catch(Exception e)  
	                  {  
	                   System.out.println("Parent Exception occurs");  
	                  }             
	               System.out.println("rest of the code");    
	    }  
	}

