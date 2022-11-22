package org.scan;

import java.util.Scanner;

public class Scanner1 {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//String j = s.next();
	//System.out.println("My name is  " + j );
 
	String p = s.nextLine();
	System.out.println("my dad name is " + p);
	
	boolean b = s.nextBoolean();
	System.out.println("i am attending class " + b);

	float f = s.nextFloat();
	System.out.println("Mysalary is " + f);

	double d = s.nextDouble();
	System.out.println("My paid is " + d);

	int i = s.nextInt();
	System.out.println("My id is " + i);
	
	long l = s.nextLong();
	System.out.println("My phoneno is " + l);

	short n = s.nextShort();
	System.out.println("My Height is " + n);


}
}