import java.util.*;
import java.io.*;


//I'm so nice that I finished this program for you! 
//You can yell out a nice, big "THANK YOU"!
public class Lab07C
{
	public static void main(String[] args) throws IOException
	{
		String[] names = new String[100];
		int[] grades = new int[100];
		int count=0;
		Scanner file = new Scanner (new File("Lab07c.dat"));
		while (file.hasNext())
		{
			String line = file.nextLine();
			Scanner chopper = new Scanner (line);
			chopper.useDelimiter(",");
			String name = chopper.next();
			int grade = chopper.nextInt();
			grades[count] = grade;
			names[count] = name;
			count++;	
		}
		GradeBook g = new GradeBook(grades,names, count);
		System.out.println (g);
	}
}