package org.department;

import org.college.College;

public class Department extends College {
	public void DepartmentName() {
		System.out.println("IT");
	}
	public static void main(String[] args) {
		Department dept=new Department();
		dept.CollegeName();
		dept.CollegeCode();
		dept.CollegeRank();
		dept.DepartmentName();
		System.out.println(dept);
	}

}
