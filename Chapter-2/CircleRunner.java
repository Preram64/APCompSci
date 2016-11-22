//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/30/16
//Class - 4th Period
//Lab  - Circle

public class CircleRunner
{
	public static void main( String[] args )
   {
		//add test cases
		Circle test = new Circle();
		test.setRadius(7.5);
	 	test.calculateArea();
	 	test.print();
	 	
	 	test.setRadius(10);
	 	test.calculateArea();
	 	test.print();
	 	
	 	test.setRadius(72.534);
	 	test.calculateArea();
	 	test.print();
	 	
	 	test.setRadius(55);
	 	test.calculateArea();
	 	test.print();
	 	
	 	test.setRadius(101);
	 	test.calculateArea();
	 	test.print();
	 	
	 	test.setRadius(99.952);
	 	test.calculateArea();
	 	test.print();
		
	}
}