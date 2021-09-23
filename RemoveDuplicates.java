package week3.Assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {


		
		
		String s1 = "PayPal India";
		Set charSet  = new HashSet();
		 Set dupCharSet   = new HashSet();
		
		char[] c1 = s1.toCharArray();
		
	  for(int i =0 ; i< c1.length ; i++) {
		  if(charSet.contains(c1[i])) {
			  dupCharSet.add(c1[i]);
		  }
		  else
		  {
			  charSet.add(c1[i]);
		  }
		  
	  }
	  
	 System.out.println("original set elements"+ charSet);
		
	 System.out.println("duplicate set elements"+ dupCharSet);
	 
	 if(charSet.containsAll(dupCharSet)) {
		 charSet.removeAll(dupCharSet);
	 }
	 
	 System.out.println("original set elements after removing the duplicates"+ charSet);

	}

}
