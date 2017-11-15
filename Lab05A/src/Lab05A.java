
public class Lab05A {
	
	public static void main (String [] args)
	{
		myUtils m = new myUtils();  //gives you access to myUtils methods
		
		
		m.sopl ("This is Lab05A");  //example to call a method
	
		//#1  print "hello world"
		
		m.sop("hello world");
		
		//#2  println ("I love CompSci")
		
		m.sopl("I love CompSci");
		
		//#3  println a random number between 1 and 100
		
		System.out.println(m.randNum(200, 100));
		
		//#4  println a random number between 500 and 400
		
		System.out.println(m.randNum(500, 400));
		
		//#5  println 90.7777 rounded to 2 decimals
		
		System.out.println(m.roundN(90.7777, 2));
		//#6  println 90.7777 rounded to a whole number
		
		System.out.println(m.roundN(90.7777, 0));
		//#7  println 90.7777 rounded to one decimal
		
		System.out.println(m.roundN(90.7777, 1));
		//#8  println the first four characters of your first name
		
		System.out.println(m.firstChars("Matteo", 4));
		//#9  println the last three characters of your last name
		
		System.out.println(m.lastChars("Cordray", 3));
		//#10 println the middle character of "Highland Park"
		
		System.out.println(m.middleChar("Highland Park"));
		//#11 println whether 444 is even or not
		//#12 println whether 444 is odd or not
		
		//additional checks --
		//does lastChars and firstChars work with negative numbers?
		//does lastChars and firstChars work if the number is less than the length of the word?
		//isEven should return true for 0
		//isOdd should return false for 0
		//check your own methods
	}
}

