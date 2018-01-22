//Name - Matteo Cordray
//Date - 1/22/18
//Lab  - 07B
 
public class OccurrencesRunner
{
	public static void main( String [] args)
	{
		Occurrences test = new Occurrences("1 5 3 4 5 5 5 4 3 2 5 5 5 3");
		System.out.println(test);

		test.setList("2 3 4 5 6 7 8 9 0 2 3 5 6 8 8 8 9 4 5");
		System.out.println(test);

		test.setList("2 3 4 5 6 7 8 2 0 2 3 5 6 8 8 8 9 4 5");
		System.out.println(test);
		
		System.out.println ("program completed by:  Matteo Cordray");
	}
}