package day_2;

public class operator
{
	void arithmetic()
	{ 
		System.out.println("arithmatic operator" );
		int a = 10, b = 2;

	       System.out.println("a + b = " + (a + b));

	       System.out.println("a - b = " + (a - b));

	       System.out.println("a * b = " + (a * b));

	       System.out.println("a / b = " + (a / b));

	       System.out.println("a % b = " + (a % b));
	}
     void assignment()
     {
    	 System.out.println("assignment operator" );
    	    int a = 4;
    	    int var;
    	    var = a;
    	    System.out.println("var using =: " + var);
    	    
    	    var += a;
    	    System.out.println("var using +=: " + var);

    	    var *= a;
    	    System.out.println("var using *=: " + var);
    	     
     }
     void comparison()
     { 
    	 System.out.println("comparison operator" );
    	 int a=5,b=5;
    	 System.out.println(a>b && b==a);
         System.out.println( b<a || a==b );
         System.out.println(a!=b );
       
     }
     void logical()
     {
    	 System.out.println("logical operator" );
    	 boolean a = true;
         boolean b = false;

         System.out.println("a && b = " + (a&&b));
         System.out.println("a || b = " + (a||b) );
         System.out.println("!(a && b) = " + !(a && b));
      
     }
     
	
	

	public static void main(String[] args)
	{
		operator obj=new operator();  
	    obj.arithmetic();
	    obj.assignment();
	    obj.comparison();
	    obj.logical();
		 
	}

}
