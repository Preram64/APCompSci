//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/3/16
//Class - 4th Period
//Lab  - Line

public class LineRunner
{
	public static void main( String[] args )
   {
		//add test cases
		Line test = new Line(1,9,14,2);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.setCoordinates(1,7,18,3);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.setCoordinates(6,4,2,2);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.setCoordinates(4,4,5,3);
	 	test.calculateSlope();
	 	test.print();
	 	
	 	test.setCoordinates(1,1,2,9);
	 	test.calculateSlope();
	 	test.print();
				
		
	}
}