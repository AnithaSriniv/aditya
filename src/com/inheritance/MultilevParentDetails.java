package com.inheritance;

public class MultilevParentDetails extends MultilevGrandParent {
public void Salary() {
	System.out.println("25000");
}
public void emailAddress() {
	System.out.println("si123@cub");
}
public static void main(String[]args) {
	MultilevParentDetails p = new MultilevParentDetails();
	p.Salary();
	p.emailAddress();
	p.Name();
	p.Address();
	p.Phoneno();
	}

}


