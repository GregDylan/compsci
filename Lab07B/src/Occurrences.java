//Name - Hayes Tipton
//Date - 01/16/18
//Lab  - 07B
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Occurrences
{
	private int[] list;		
	public Occurrences(String line)
	{
		// instantiate 'list' to have 10 integers containing all zeros
		// use Scanner here to chop the integers from the string
		//    and increment list where needed
		list = new int[10];
		Scanner readline = new Scanner(line);
		while (readline.hasNextInt()) {
			int num = readline.nextInt();
			list[num] += num;
		}
	}
	public void setList(String line)
	{	
		//this method will be exactly as the constructor above
		Scanner readline = new Scanner(line);
		while (readline.hasNextInt()) {
			int num = readline.nextInt();
			list[num] += num;
		}
	}
	
	public String toString()
	{
		String output = "Number     Occurrences\n";		
		for (int i=0; i<10; i++) {
			output += "\n" + i + "     -     " + list[i];
		}
		return output + "\n";
	}
}
