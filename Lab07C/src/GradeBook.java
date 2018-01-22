//name: Matteo Cordray
//date: 01/22/18
import java.util.*;
public class GradeBook
{
	private String[] names;
	private int[] grades;
	
	//create arrays with 100 elements
	public GradeBook()
	{
	names = new String[100];
	grades = new int[100];	
	}
	
	
	public GradeBook(int[] g, String[] n, int num)
	{
		// **instantiate both arrays with 'num' objects
		
		names = new String[num];
		grades = new int[num];
		
		//**use a for-loop to assign each name and grade with the incoming values
		for (int i=0; i < num; i++) {
			names[i] = n[i];
			grades[i] = g[i];
		}
	}
	
	//**this method will find the average grade
	public double getAvg()
	{
		int total = 0;
		for (int num: grades)
			total += num;
		return (double) total/grades.length;
	}
	
	//**this method will return the student's name with the lowest grade
	public String lowName()
	{
		String name = "";
		int lowest = Integer.MAX_VALUE;
		for (int i=0; i < grades.length; i++) {
			if (grades[i] < lowest) {
				lowest = grades[i];
				name = names[i];
			}
		}
		return name;
	}
	
	//**this method will return the student's name with the highest grade
	public String highName()
	{
		String name = "";
		int highest = Integer.MIN_VALUE;
		for (int i=0; i < grades.length; i++) {
			if (grades[i] > highest) {
				highest = grades[i];
				name = names[i];
			}
		}
		return name;
	}
	
	public String toString()
	{
		String output="The student list is:\n";
		for (int i=0; i < grades.length; i++) {
			String spaces = "";
			for (int j=0; j < 12-names[i].length(); j++)
				spaces += " ";
			output += String.format("%d.  %s%d\n", i+1, names[i]+spaces, grades[i]);
		}
		output += "\nAverage = " + this.getAvg();
		output += "\n" + this.lowName() + " has the lowest grade.";
		output += "\n" + this.highName() + " has the highest grade.";
		return output;		
	}
}

