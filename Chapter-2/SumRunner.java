//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/28/16
//Class - 4th Period
//Lab  - Sum 

public class SumRunner
{
	public static void main( String[] args )
	{
		Sum test = new Sum();
		test.setNums(5,5);
		test.sum();
		test.print();
		
	

		test.setNums(90,100);
		test.sum();
		test.print();
		
	
		
	    test.setNums(100.5,85.5);
		test.sum();
		test.print();
		
	
		
        test.setNums(-100,55);
		test.sum();
		test.print();
		

		
		test.setNums(15236,5642);
		test.sum();
		test.print();
		

		
		test.setNums(1000,555);
		test.sum();
		test.print();
	

		//add more test cases
		
	}
}