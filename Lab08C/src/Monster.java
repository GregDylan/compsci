
public class Monster implements Comparable<Monster>, Cloneable{
	
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster() {
		
	}
	
	//write an initialization constructor with an int parameter ht
	public Monster(int ht) {
		myHeight = ht;
	}
	
	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt) {
		myHeight = ht;
		myWeight = wt;
	}
	
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age) {
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}
	
	//modifiers - write set methods for height, weight, and age
	void setHeight(int ht) {
		myHeight = ht;
	}
	
	void setWeight(int wt) {
		myWeight = wt;
	}
	
	void setAge(int age) {
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	
	private int getHeight() {
		return myHeight;
	}
	
	private int getWeight() {
		return myWeight;
	}
	
	private int getAge() {
		return myAge;
	}
	
	//clone() should instantiate a new object that is identical
	//to the object and return the object
	public Object clone() throws CloneNotSupportedException
	{
		Object m2 = new Monster();  
		return super.clone();
		
	}

	//write your own 'equals' method
	public boolean equals(Monster rhs){
		
		return false;
	}

	//write your own 'compareTo' method using the criteria on the assignment page
	public int compareTo(Monster o )
	{
		Monster rhs = o;
		
		//IF METHOD
		
		if(myHeight == rhs.myHeight) {
			if(myWeight == rhs.myWeight) {
				if(myAge == rhs.myAge) {
					return 0;
				} else if(myAge > rhs.myAge) {
					return 1;
				} else if(myAge < rhs.myAge) {
					return -1;
				}
			} else if(myWeight > rhs.myWeight) {
				return 1;
			} else if(myWeight < rhs.myWeight) {
				return -1;
			}
		} else if(myHeight > rhs.myHeight) {
			return 1;
		} else if(myHeight < rhs.myHeight) {
			return -1;
		}
		
		//CASE METHOD
			
		return 0;
	}

	//write your own 'toString()' method
	
	public String toString() {
		String output = "";
		output += "" + myHeight + " " + myWeight + " " + myAge;
		return output;
	}

}
