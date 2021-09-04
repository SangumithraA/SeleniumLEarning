package week1.Day1;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13

		// Declare a boolean variable flag as false

		// Iterate from 2 to half of the input

		// Divide the input with each for loop variable and check the remainder

		// Set the flag as true when there is no remainder

		// break the iterator

		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match
		
		int n = 13;
		
		boolean flag = false;
		
		for(int i= 2 ; i <= n /2 ; i ++)
		{ 
			if(n % 2 == 0) {
				flag = true;
				
				System.out.print("Not a prime");
				
			}
			else
			{
				System.out.print("prime");
			}
			
			
		}

	}

}
