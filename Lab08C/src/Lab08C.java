
public class Lab08C {
	
	public static void main( String args[] ) throws CloneNotSupportedException
	   {
			Monster harry = new Monster();
			Monster sue = new Monster();

			harry.setHeight(7);
			harry.setWeight(6);
			harry.setAge(5);
			System.out.println("\nharry Monster :: " + harry);

			sue = (Monster)harry.clone();
			System.out.println("\nsue Monster :: " + sue);

			Monster mOne = new Monster(33,33,11);
			Monster mTwo = new Monster(33,33,10);

			System.out.println("\nMonster 1 :: " + mOne);
			System.out.println("\nMonster 2 :: " + mTwo);

			System.out.print("\nmOne.equals(mTwo) == ");
			System.out.println(mOne.equals(mTwo));

			System.out.print("\nmOne.compareTo(mTwo) == ");
			System.out.println(mOne.compareTo(mTwo));
			System.out.print("\nmTwo.compareTo(mOne) == ");
			System.out.println(mTwo.compareTo(mOne));
			
			System.out.println ("program completed by: Matteo Cordray");
	}

}
