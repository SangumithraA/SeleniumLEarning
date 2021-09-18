package org.system;

public class Students {

	
	public void getStudentInfo() {
		
		System.out.println( "With no paramtere ");
	}
	
public void getStudentInfo(int ID) {
		int id = ID;
		System.out.println(" With Student ID "+ id);
	}

public void getStudentInfo(int ID, String SName) {
	int id = ID;
	String sName = SName;
	System.out.println(" With Student ID "+ id + " and with Student Name "+ sName);
}


public void getStudentInfo(int ID, String SName,String email) {
	int id = ID;
	String sName =SName;
	String email1 = email;
	System.out.println(" With Student ID  "+ id + " and with Student Name "+ sName + " having "+ email1 );
}


public void getStudentInfo(int ID, String SName,String email, String Phnumber) {
	int id =ID;
	String sName =SName;
	String email1 = email;
	String phno =Phnumber;
	System.out.println(" With Student ID  "+ id + " and with Student Name "+ sName + " having "+ email1 + " student phno is "  + phno);
}
	public static void main(String[] args) {
		Students s = new Students();
		
		s.getStudentInfo();
		s.getStudentInfo(1);
		s.getStudentInfo(1, "mithra");
		s.getStudentInfo(1, "mithra", "mithraaashokan@gmail.com");
		s.getStudentInfo(1, "mithra", "mithraaashokan@gmail.com", "84793271");
		s.getStudentInfo(1, "mithra", "mithraaashokan@gmail.com", "84793271");
		
		
		

	}
	
	
} 


