package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeName();
		student.collegeRank();
		student.collegeCode();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
	public void studentName() {
		
		System.out.println("Student Name");
	}
public void studentDept() {
		
		System.out.println("Student Department");
	}
public void studentId() {
	
	System.out.println("Student Id");
}
}
