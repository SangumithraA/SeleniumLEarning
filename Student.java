/**
 * 
 */
package org.student;

import org.department.Department;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Student extends Department{

	/**
	 * @param args
	 * 
	 * studentName(),studentDept(),studentId()
	 */
	
public void	studentName() {
	
	System.out.println("I'm in Studen Class, I will display the Student Name");
}
	
public void	studentDept() {
	
	System.out.println("I'm in Studen Class, I will display the Student Dept");
}
		
public void	studentId() {
	
	System.out.println("I'm in Studen Class, I will display the Student ID");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Student s = new Student();
	
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentDept();
	s.studentId();
	s.studentName();
	

	}




}
