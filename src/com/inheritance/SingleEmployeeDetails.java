package com.inheritance;

public class SingleEmployeeDetails extends SingleCollegeDetails {
public void EmpName() {
	System.out.println("Srini");
}
public void EmpAddress() {
	System.out.println("spb colony Erode");
}
public static void main(String[] args) {
	SingleEmployeeDetails e = new SingleEmployeeDetails();
	e.EmpAddress();
	e.EmpName();
	e.CollegeAddress();
	e.CollegeName();
}
}
