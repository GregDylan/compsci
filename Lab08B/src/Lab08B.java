import java.util.Scanner;

public class Lab08B {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main( String args[] ){
	  //loop 3 times
		String[] letters = new String[3];
		char[] cs = new char[3];
		int[] sizes = new int[3];
		for(int i = 0; i < 3; i++) {
			//ask the user to enter letter (must be a String)
			System.out.println("\nEnter a letter: ");
			letters[i] = sc.nextLine();

			if(letters[i].length() > 1) {
				System.out.println("ERROR: MUST BE A LETTER");
				return;
			}
			//ask the user to enter a size
			System.out.println("Enter a size: ");
			sizes[i] = sc.nextInt();
			System.out.println("SIZE ENTERED");
			sc.nextLine();
			
			//find the first character of the String
			cs[i] = letters[i].charAt(0);
			
			//instantiate a LetterBoxes object
			LetterBoxes lb = new LetterBoxes();
			
			//print the LetterBoxes object
			lb.printBox(cs[i], sizes[i]);
		}
		
		
		
	System.out.println ("program completed by:  Matteo Cordray");

	}

}
