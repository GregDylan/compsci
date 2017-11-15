import java.util.Random;

//your name here
public class myUtils {
	
	Random r = new Random();
//***************************************************************************
	//this method will println the string s 
	// (I finished this one)
	public void sopl (String s) {
		System.out.println (s);
	}

		
		
//***************************************************************************
	// this method will print the string s 
	public void sop (String s) {
		System.out.print(s);
	}
		
//***************************************************************************
	//this method will return a random number between a & b
	// if a is less than b, then a is min and b is max
	// if b is less than a, then b is min and a is max

	public int randNum(int a, int b) {
	 if(a < b){
		return r.nextInt(b) + a; 
	 }
	
	return r.nextInt(a-b) + b;			
	}
	
//***************************************************************************
	//this method will return a number that is rounded to N decimals
	public double roundN (double x, int n)
	{
		int tens = (int) Math.pow(10, n);
		x = (double) Math.round(x * tens) / tens;
		return x;
	}
	

//***************************************************************************
	//this method will return the first 'n' characters of a string
	// if the string length is less than 'n', return the entire string
	// if 'n' is negative, return an empty string
	public String firstChars (String s, int n)
	{
		if(s.length() < n || n < 0){
			return "";
		}
		
		return s.substring(0, n);
	}
		
//***************************************************************************
	//this method will return the last 'n' characters of a string
	// if the string length is less than 'n', return the entire string
	// if 'n' is negative, return an empty string
	public String lastChars (String s, int n)
	{
		if(s.length() < n || n < 0){
			return "";
		}
		
		return s.substring(n + 1);
	}
	
//***************************************************************************
	//this method will return the middle character of a string
	// if the length of the string is even, return the second middle char "optimism"=>'m'
	// if the length of the string is odd, return the middle char
	public char middleChar (String s)	
	{
		return s.charAt((s.length() / 2));
	}
	
//***************************************************************************
	//this method will return true if the number is odd, false otherwise
	public boolean isOdd (int a)
	{
		if(a % 2 != 0){
			return true;
		}
		return false;
	}
	
//***************************************************************************
	//this method will return true if the number is even, false otherwise
	public boolean isEven (int a)
	{
		if(a % 2 == 0){
			return true;
		}
		return false;
	}
	
//***************************************************************************
// add two more utility methods of your own.....




}
