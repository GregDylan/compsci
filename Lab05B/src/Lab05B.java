import java.util.*;
public class Lab05B{

public static void main(String[] args){
	Scanner input=new Scanner (System.in);
	
	System.out.print("Input your name: ");
	String name = input.nextLine();
	for (int i=0; i<name.length(); i++) {
		char letter = name.charAt(i);
		System.out.println("" + letter);
	}
	
	int length = name.length();
	String torf;
	if (length%2==0)
		torf="even";
		else 
			torf="odd";
	System.out.println("Length: " + length + " characters is " + torf);
	
	 int random =(int)(Math.random() * (length));
	 char randomLetter = name.charAt(random);
	 System.out.println("Random Letter: Character #" + random + " is \"" + randomLetter + "\"");
	 
	 String firstFour = name.substring(0,4);
	 System.out.println("The first 4 characters are: " + firstFour);
	 
	 String lastFour = name.substring(name.length()-4,name.length());
	 System.out.println("The last 4 characters are: " + lastFour);
	 
	 int middleChar;
	 if(name.length()%2==0)
	 	middleChar = name.length()/2;
	 else
	 	middleChar = (name.length()-1)/2;		
	 String middleThree = name.substring(middleChar-1,middleChar+2);
	 System.out.println("The middle 3 characters are: " + middleThree);
	 System.out.print("Every other letter from first letter: ");
	 
	 int x = 0;
	 while (x<length){
	 	char let = name.charAt(x);
	 	System.out.print(let);
	 	x+=2;
	 }
	 
	 System.out.print("\nEvery other letter from second letter: ");
	 int x2 = 1;
	 while (x2<length){
	 	char let2 = name.charAt(x2);
	 	System.out.print(let2);
	 	x2+=2;
	 }
	 
	 System.out.println("");
	 
	 String nameLowercase = name.toLowerCase();
	 int firstA = nameLowercase.indexOf("a");
	 if(firstA==-1)
	 System.out.println("First 'a': Does Not Exist");
	 else
	 System.out.println("First 'a': " + firstA);
	 
	 int firstE = nameLowercase.indexOf("e");
	 if(firstE==-1)
	 System.out.println("First 'e': Does Not Exist");
	 else
	 System.out.println("First 'e': " + firstE);
	 
	 int firstI = nameLowercase.indexOf("i");
	 if(firstI==-1)
	 System.out.println("First 'i': Does Not Exist");
	 else
	 System.out.println("First 'i': " + firstI);
	 
	 int firstO = nameLowercase.indexOf("o");
	 if(firstO==-1)
	 System.out.println("First 'o': Does Not Exist");
	 else
	 System.out.println("First 'o': " + firstO);
	 
	 int firstU = nameLowercase.indexOf("u");
	 if(firstU==-1)
	 System.out.println("First 'u': Does Not Exist");
	 else
	 System.out.println("First 'u': " + firstU);
	}
}

