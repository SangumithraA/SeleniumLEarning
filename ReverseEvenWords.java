package week2.Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		
		String test = "I am a software tester"; 
		
		char [] s1= test.toCharArray();
		
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1.length);
			if(i %2 != 0) {
				
				
			}
			
			else
			{
				for (int j = s1.length; j > 0; j++) {
					
					System.out.print(s1[i]);
					
				}
			}
			
		}
	}

}
