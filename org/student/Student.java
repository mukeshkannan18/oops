package org.student;

import org.department.Department;

public class Student extends Department {
	public void StudentName() {
		System.out.println("mukeshkannan");
	}
	public void StudentDept() {
		System.out.println("IT");
		
	}
	public void StudentID() {
		System.out.println("1500962");
	}
	public static void main(String[] args) {
		Student Me=new Student();
		Me.CollegeName();
		Me.CollegeCode();
		Me.CollegeRank();
		Me.DepartmentName();
		Me.StudentName();
		Me.StudentDept();
		Me.StudentID();
		System.out.println(Me);
		
}
}