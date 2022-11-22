package org.Polymorphism;

public class MethodOverRiding01 extends MethodOverriding {
	@Override
	public void HondaChennai() {
		System.out.println("Pleasure");
	}
	@Override
		public void Address() {
	System.out.println("98,Meda");	
	}
	@Override
		public void phone() {
			System.out.println("88012456");
			}

		public static void main(String[] args) {
			MethodOverRiding01 m = new MethodOverRiding01();
			m.Address();
			m.HondaChennai();
			m.phone();


}			
		}
		
}
