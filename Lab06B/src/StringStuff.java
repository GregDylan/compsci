import java.util.Scanner;

public class StringStuff {

	String s1 = "",s2 = "";
	//These are the new Strings which will store the chopped up strings
	
	Scanner chopper1 = new Scanner(s1);
	Scanner chopper2 = new Scanner(s2);
	
	public StringStuff() {
		
	}
	
	public StringStuff(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void setString1(String s) {
		this.s1 = s;
	}
	
	public void setString2(String s) {
		this.s2 = s;
	}
	
	public String toString() {
		String reverse1 = "";
		String reverse2 = "";
		while(chopper1.hasNext()) {
			s1 = chopper1.next();
		}
		while(chopper2.hasNext()) {
			s2 = chopper2.next();
		}
		System.out.println("Word 1 is: " + s1);
		System.out.println("Word 2 is: " + s2);
		for(int i = 0; i < s1.length(); i++) {
			reverse1 += s1.charAt(s1.length() - i - 1);
		}
		for(int i = 0; i < s2.length(); i++) {
			reverse2 += s2.charAt(s2.length() - i - 1);
		}
		System.out.println(reverse1 + reverse2);
		
		//Word order function
		if(s1.compareTo(s2) < 0) {
			System.out.println(s1 + " comes before " + s2);
		}else {
			System.out.println(s2 + " comes before " + s1);
		}
		
		//String separator function
		String s3 = s1 + s2;
		String s4 = "";
		for(int i = 0; i < s3.length(); i++) {
			if(i % 2 != 0) {
				s4 += "-";
			}
			s4 += s3.charAt(i);
		}
		System.out.println(s4);
		return "";
	}

}
