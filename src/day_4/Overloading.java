package day_4;

public class Overloading {
	 public void show(double d)
	    {
	        System.out.println("double" + d);
	    }
	    public void show(String s)
	    {
	        System.out.println("In String " + s);
	    }
	    public void show( int b)
	    {
	        System.out.println(" int" + b);
	    }

	public static void main(String[] args) {
		    
	        Overloading obj = new  Overloading();
	        
	        obj.show(3.0); 
	        obj.show(25);  
	        obj.show("sayli"); 
	         
	}

}
