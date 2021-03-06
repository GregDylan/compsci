import java.util.Random;


public class Weapon {

	private String name;
	private int damage;
	private int health;
	private boolean alive;
	private double price;
	Random r = new Random();
	
	public Weapon(){
		setName("Sword");
		setDamage(10);
		setHealth(100);
		isAlive();
	}
	
	public Weapon(String name, int damage, int health){
		this.setName(name);
		this.setDamage(damage);
		this.setHealth(health);
	}
	
	public boolean getAbility(){
		if(this.damage >= 25){
			return true;
		}
		return false;
	}
	
	public boolean getWin(){
		if(!isAlive()){
			if(damage >= 0){
				return false;
			}
		}
		return true;
	}
	
	public int calcAdvantage(){
		int i = 0;
		i = this.damage * this.health;
		return i;
	}
	
	public int getStatpercent(){
		
		int i = r.nextInt(100);
		
		return i * health * damage;
	}
	
	public void setStats(int damage, int health){
		this.setHealth(health);
		this.setDamage(damage);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(){
		String output="";
		 output += "The weapon's name is " + name;
		 output += "\nThe weapon's health is " + health;
		 output += "\nThe weapon's damage is " + damage + "\n";
		return output;
	}
	
}