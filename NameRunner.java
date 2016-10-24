//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/20/16
//Class - 4th Period
//Lab  - Name

import static java.lang.System.*;

public class NameRunner
{
	public static void main ( String[] args )
	{
		Name person = new Name("Sally Baker");
		System.out.println(person.getFirst(0,5));
		System.out.println(person.getLast(6,11));
		System.out.println(person);
		System.out.println();
		System.out.println();

		person.setName("John Doe");
		System.out.println(person.getFirst(0,4));
		System.out.println(person.getLast(5,8));
		System.out.println(person);
		System.out.println();
		System.out.println();

		person.setName("Sammy Lammy");
		System.out.println(person.getFirst(0,5));
		System.out.println(person.getLast(6,11));
		System.out.println(person);
		System.out.println();
		System.out.println();

		person.setName("Benny Programmer");
		System.out.println(person.getFirst(0,5));
		System.out.println(person.getLast(6,16));
		System.out.println(person);
		System.out.println();
		System.out.println();

		person.setName("Sandy Painter");
		System.out.println(person.getFirst(0,5));
		System.out.println(person.getLast(6,13));
		System.out.println(person);
		System.out.println();
		System.out.println();
	}
}