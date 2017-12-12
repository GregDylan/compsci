//Name -
//Date -
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

 
public class Lab06E{
	public static void main( String args[] ) throws IOException
	{
		//instantiate a file Scanner
		Scanner file = new Scanner(new File("resources/Lab06E.dat"));
		while(file.hasNextLine()) {
		       String binaryString = file.nextLine();
		       System.out.println(binaryString + "==" + Integer.parseInt(binaryString,2));
		}
		
		//use a while loop to read from the file - unknown number of data sets
		
		//... and you need to make your own lab06E.dat
		
		
		
		
		
	}
}