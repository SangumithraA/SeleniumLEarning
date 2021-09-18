package week2.Day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test = "feeling good";
		
		/*
		 * char[] c1 = test.toCharArray();
		 * 
		 * for (int i = c1.length-1; i >=0 ; i--) {
		 * 
		 * System.out.print(c1[i]);
		 * 
		 * }
		 */
		
		for(int i = test.length()-1 ; i>= 0 ; i--) {
			
			System.out.print(test.charAt(i));
			
			
		}

	}

}
