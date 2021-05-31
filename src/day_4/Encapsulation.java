package day_4;

public class Encapsulation {
	 
	  int length;
	  int breadth;

	   
	  Encapsulation (int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	  
	  public void getArea() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }
	public static void main(String[] args) {
		 Encapsulation rectangle = new Encapsulation(5, 6);
	    rectangle.getArea();
		 

	}

}
 

	  