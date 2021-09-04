/**
 * 
 */
package week1.Day1;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare your input as 5

		// Declare an integer variable fact as 1

		// Iterate from 1 to your input (tip: using loop concept)

		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
		// the 'fact' variable)

		// End of loop

		// Print factorial (fact)

		int n = 5;

		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;

		}
		System.out.print("Factorial of numb 5 is " + fact);

	}

}
