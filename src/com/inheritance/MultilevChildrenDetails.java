package com.inheritance;

public class MultilevChildrenDetails extends MultilevParentDetails {
public void Height() {
	System.out.println("162");
}
public void Weight() {
	System.out.println("58");
}
public static void main(String[] args) {
	MultilevChildrenDetails c = new MultilevChildrenDetails();
	c.Address();
	c.emailAddress();
	c.Height();
	c.Name();
	c.Weight();
	c.Phoneno();
	c.Salary();
}
}
