//Matteo Cordray
//December 11 2017
//Lab  06 C

import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import static java.lang.System.*;

//this program is finished.  Please study and understand what's happening....
public class Lab06C
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("resources/Lab06C.dat"));	//open dat file
		int count = file.nextInt();								//read next int to know how many groups of grades there are
		file.nextLine();										//move Scanner to next line
		for (int i=1;i <= count; i++)							//process grades
		{
			Average thing = new Average(file.nextLine());		//instantiate new Average object with the line of grades
			out.println (thing);								//print the results
		}
	}
}
