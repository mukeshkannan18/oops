package org.college;

public class College {

	public void CollegeName() {
		System.out.println("JJ college of arts and science");
	}
	public void CollegeCode() {
		System.out.println("2244");
		
	}
	public void CollegeRank() {
		System.out.println("50");
	}
	public static void main(String[] args) {
		College jj=new College();
		jj.CollegeName();
		jj.CollegeCode();
		jj.CollegeRank();
		System.out.println(jj);
}
}