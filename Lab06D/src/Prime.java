
//Name -
//Date -
//Lab  -
public class Prime
{
	private int number;

	//**constructors go here	
	public Prime() {
		
	}
	
	public Prime(int num) {
		this.number = num;
	}
	
	//mutator
	public void setNumber(int num)
	{

	}

	//**return true if the number is prime, false otherwise
	public boolean isPrime(){
		if(number > 2 && (number & 1) == 0)
		       return false;
		    // only odd factors need to be tested up to n^0.5
		    for(int i = 3; i * i <= number; i += 2)
		        if (number % i == 0) 
		            return false;
		    return true;
	}

	//** return true if the number is perfect, false otherwise
	public boolean isPerfect() {
		int sum = 0;
		 for(int i = 1; i < number; i++)
	        {
	            if(number % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == number)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }    
	}


	public String toString()
	{
		
		return "";
	}
}