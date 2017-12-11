public class Lab06B
{
	public static void main (String args[])
	{
		StringStuff one = new StringStuff("abe","ape");
		System.out.println (one);
		
		one.setString1("giraffe");
		one.setString2("gorilla");
		System.out.println (one);
		
		one.setString1("one");
		one.setString2("two");
		System.out.println (one);
		
	}
}
