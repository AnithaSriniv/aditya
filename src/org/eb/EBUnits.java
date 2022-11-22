package org.eb;
import java.util.Scanner;
public class EBUnits {
	public static void main(String[] args) {
	int u=0; 
	double amt = 0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the unit");
	u = s.nextInt();
	if(u<=100) {
		amt = u*0;
		System.out.println("free");
	}
	else if (101<=200) {
		amt = (u*1.5)+(u-100);
	System.out.println("bill amount" +amt);	
				
	}
	else if (201<=300) {
		amt = (u*3)+(u*1.5)+(u-100);
		System.out.println("bill amount" +amt);	
		
	}
	else if (301<=500) {
		amt = (u*4.5)+(u*3)+(u*1.5)+(u-100);
		System.out.println("bill amount" +amt);	
		
	}
	else {
		amt = (u*6)+(u*4.5)+(u*3)+(u*1.5)+(u-100);
		System.out.println("bill amount is" +amt );
	}
	}
	}
	
