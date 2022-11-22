package org.ClassMethodObject;

public class FourWheeler{
	public void Maruti() {
		System.out.println("Dzire");
	
	}
	public void skoda() {
		System.out.println("Rapido");
	}
public static void main(String[] args) {
	FourWheeler f = new FourWheeler();
	f.Maruti();
	f.skoda();
	TwoWheeler t = new TwoWheeler();
	t.Hero();
	t.Honda();
}
}
