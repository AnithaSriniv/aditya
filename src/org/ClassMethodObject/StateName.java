package org.ClassMethodObject;

import org.diffpackage.CountryName;

public class StateName {
	public void Tamilnadu() {
		System.out.println("hai");
	}
	public void Andhra() {
		System.out.println("bai");
	}
	public static void main(String[] args) {
		CountryName C = new CountryName();
		C.India();
		C.Pakistan();
		StateName s = new StateName();
		s.Andhra();
		s.Tamilnadu();

		
		
		}

	
	}
