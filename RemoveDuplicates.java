package week2.Day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String result = "";
		
		int count = 0;
		
		String[] s1= text.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			
			for(int j=i+1; j<s1.length; j++) {
				if(s1[i].equals(s1[j])) {
					s1[j] = "remove";
				}
		      
			
		}
		
		

	}
		
		for(String word: s1) {
			if(word != "remove") {
				result = result + word + " ";
			}
			
			System.out.print("After removing duplicates" + result);

	
		}}
}
