package org.Polymorphism;

public class MethodOverloading {

	public void Srini() {
	System.out.println("hello");
}
	public void Srini(int id, String name) {
	System.out.println(id);	
	System.out.println(name);
	}
	
	public void Srini(String name, long l) {
		System.out.println(name);
		System.out.println(l);	
	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.Srini();
		m.Srini(11, "Anitha");
		m.Srini("Kavi", 9874563214l);

	}
	
	
	
	
}
