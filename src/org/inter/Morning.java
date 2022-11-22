package org.inter;

public class Morning implements Interface {	
	
	@Override
	public void man() {
		System.out.println("Ar");
	}

	@Override
	public void Women() {
		System.out.println("Mr");
		
	}
	public static void main(String[] args) {
		Morning m = new Morning();
		m.man();
		m.Women();
	}

			
	}
	


