package org.abstra;

public class Abstraction1 extends Abstraction {

	@Override
	public void showroom() {
	System.out.println("toy");
	}
	@Override
	public void falls() {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		Abstraction1 d = new Abstraction1();
		d.showroom();
		d.falls();
	}
	
	}
