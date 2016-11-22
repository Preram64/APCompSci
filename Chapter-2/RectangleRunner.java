//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/30/16
//Class - 4th Period 
//Lab  - Rectangle

public class RectangleRunner
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2,6);
		test.calculatePerimeter( );
		test.print();
		
		System.out.println("              ");
		System.out.println("              ");
		

		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();
		
		System.out.println("              ");
		System.out.println("              ");
		
		test.setLengthWidth(131,75);
		test.calculatePerimeter( );
		test.print();
		
		System.out.println("              ");
		System.out.println("              ");
		
		test.setLengthWidth(20,25);
		test.calculatePerimeter( );
		test.print();
		
		System.out.println("              ");
		System.out.println("              ");
		
		test.setLengthWidth(9,256);
		test.calculatePerimeter( );
		test.print();
		
		System.out.println("              ");
		System.out.println("              ");
		
		test.setLengthWidth(36,72);
		test.calculatePerimeter( );
		test.print();
		
		
		
		//add more test cases		
	}
}