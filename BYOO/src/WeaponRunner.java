
public class WeaponRunner {
	public static void main (String [] args)
	{
		Weapon w = new Weapon();
		Weapon w2 = new Weapon("Gun", 30, 100);
		
		print("" + w);
		
		print("" + w.getDamage());
		print("" + w.isAlive());
		
		print("" + w2.getDamage());
		print("" + w2.isAlive());
		
		w.setDamage(10);
		w.setAlive(false);	
		
		w2.setDamage(50);
		w2.setAlive(true);
		
		print("" + w2.calcAdvantage());
		print("" + w.calcAdvantage());
		
		print("" + w2.getStatpercent());
		print("" + w.getStatpercent());

		print("" + w2.getWin());
		print("" + w.getWin());
		
		print("" + w2);
		print("" + w);
				
	}
	
	public static void print(String p){
		System.out.println(p);
	}

}
