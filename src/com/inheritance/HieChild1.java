package com.inheritance;

public class HieChild1 extends HieParent1{
public void Hobby() {
	System.out.println("Painting");
}
public void Sports() {
	System.out.println("Football");
}
public static void main(String[] args) {
	HieChild1 i = new HieChild1();
	i.Hobby();
	i.Sports();
	i.Tv();
	i.Bike();
	
}
}
  