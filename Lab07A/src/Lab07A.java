//Matteo Cordray
//Date - 1/9/18
//Lab  - Lab07A

import java.util.*;
import static java.lang.System.*;

//this runner is finished
public class Lab07A
{
	public static void main( String args[] )
	{
		Grades test = new Grades(new double[]{100,90,85,72.5,95.6});
		System.out.println(test);

		test.setGrades(new double[]{50.0,100.0,80.0});
		System.out.println(test);

		test.setGrades(new double[]{93.4,-90.0,90.0});
		System.out.println(test);

		test.setGrades(new double[]{1,2,3,4,5,6,7,8,9});
		System.out.println(test);
		
		out.println ("\n\nProgram completed by:  your name here");
		}
}
