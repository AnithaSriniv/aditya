package com.inheritance;

public class HieChild2 extends HieParent1 {
public void Books() {
	System.out.println("Story");
}
public void Music() {
	System.out.println("Karnatic");
}
public static void main(String[] args) {
	HieChild2 g = new HieChild2();
	g.Books();
	g.Music();
	g.Bike();
	g.Tv();
	
}
}
