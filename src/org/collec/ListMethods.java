package org.collec;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(234);
		l.add("ani");
		l.add('o');
		l.add(985641237l);
		l.add(2568.247f);
		l.add(12);
		l.add(234);
		System.out.println(l);
		
		List a = new ArrayList();
		a.add("sri");
		a.add('j');
		a.addAll(l);
		System.out.println(a);
		
		l.set(2, "Priya");
		System.out.println(l);
		
		boolean c = l.contains("ani");
		System.out.println(c);
		
		boolean d = l.containsAll(a);
		System.out.println(d);
	
		Object e = l.get(5);
		System.out.println(e);
	
		int f = l.indexOf(2568.247f);
		System.out.println(f);
	
		int g = l.lastIndexOf(234);
		System.out.println(g);
	
		boolean i = l.equals(a);
		System.out.println(i);
		
		l.remove(3);
		System.out.println(l);
	
		boolean j = l.removeAll(a);
		System.out.println(j);
		
		int k = l.size();
		System.out.println(k);
		
		l.clear();
		
		boolean h = l.isEmpty();
		System.out.println(h);
	
		
	}
}
