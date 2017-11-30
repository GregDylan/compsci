
public class Weapon {

	private String name;
	private int damage;
	private int health;
	private boolean alive;
	private double price;
	
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
	
	public int getWinPercent(){
		return 0;
	}
	
	public int getStatpercent(){
		return 0;
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