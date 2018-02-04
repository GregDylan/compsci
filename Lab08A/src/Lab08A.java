import java.util.Scanner;

public class Lab08A {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main( String args[] ){
		
		for (int x = 1; x <=3; x++){			
			//loop used so that you can enter 3 values
			
			//ask the user to enter a word and the number of times they would like it to be printed
			System.out.println("Enter the word to display: ");
			String word = sc.nextLine();
			
			System.out.println("Enter the times to display: ");
			int times = sc.nextInt();
			
			//instantiate a WordPrinter object
			WordPrinter wp = new WordPrinter();
			
			//call the printWord method by passing the word and the number of times
			wp.printWord(word, times);
		
			
		}
		System.out.println ("program completed by:  Matteo Cordray");
		
	}

}
