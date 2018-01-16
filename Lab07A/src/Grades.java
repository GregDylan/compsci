//Name -
//Date -
//Lab  -
 
import java.util.*;
import static java.lang.System.*;

public class Grades
{
	public double[] grades = {};

	//**finish this initialization constructor
	public Grades(double[] nums)
	{
		grades = nums;
	}

	//**finish this mutator
	public void setGrades(double[] nums)
	{
		grades = nums;
	}

	
	//**this method will return the total of all the elements
	//  in the array	
	public double getTotal()
	{
		double total = 0.0;
		for(int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		
		return total;
	}
	
	//**this method will return the average of all the elements
	//  in the array; use the getTotal() method above
	public double getAverage()
	{
		double average=0.0;
		average = getTotal() / grades.length;


		return average;
	}
	
	//**this method will return the average with the lowest grade dropped
	public double getAverageDropLowest()
	{
		return 0;
	}
	
	//**this method will return the maximum of all the elements
	//  in the array	
	public double getHighest()
	{
		double max=0.0;
		double[] maxarray = grades;
		Arrays.sort(maxarray);
		max = maxarray[maxarray.length - 1];

		
		return max;
	}
	
	//**this method will return the minimum of all the elements
	//  in the array	
	public double getLowest()
	{
		double min=0;
		double[] minarray = grades;
		Arrays.sort(minarray);
		min = minarray[0];

		
		return min;
	}


	public double roundTwo(double x)
	{
		return 0;
	}
	
	public String toString( )
	{
		for(int i = 0; i < grades.length; i++) {
			System.out.println("grade " + i + ": " + grades[i]);
		}
		String output="";
		
		System.out.println("Total: " + getTotal());
		System.out.println("Average: " + getAverage());
		System.out.println("Maximum: " + getHighest());
		System.out.println("Minimum: " + getLowest());
		System.out.println("***************************************************");
		return output;
	}
}



