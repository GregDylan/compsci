
import java.util.*;

public class Lab05C{
	
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int x;
		int evens=0;
		int odds=0;
		int total=0;
		int count=0;
		int high=-1;
		int trash;
		int low=1000;
		System.out.println("Please enter numbers below. Once you are done, enter 999 as a number to stop the program");
		do
		{
			System.out.print("Enter a number: ");
			x = input.nextInt();
			total+=x;
			if(x%2==0)
				evens+=1;
			else
				odds+=1;
			if(x>high && x!=999)
				high=x;
			else
				trash=4;
			
			if(x<low && x!=999)
				low=x;
			else
				trash=69;
			count+=1;
		}
		while(x!=999); 
		total-=999;
		count-=1;
		odds-=1;
		double average = (double)total / count;
		double averageRounded = (double)((int)((average+0.005) * 100)) / 100;
		System.out.println("				My Number Statistic Program");
		System.out.println("					   by: ");
		System.out.println("\nCOUNT\tHIGH\tLOW\tTOTAL\tAVERAGE\t#EVENS\t#ODDS");
		System.out.println("=====\t=====\t=====\t=====\t======\t======\t=====");
		System.out.println("" + count + "\t" + high + "\t" + low + "\t" + total + "\t" + averageRounded + "\t" + evens + "\t" + odds);

	}
}

