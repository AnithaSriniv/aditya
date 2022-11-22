package org.collec;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
public static void main(String[] args) {
	Set s = new HashSet();
	s.add("adi");
	s.add('b');
	s.add(128);
	s.add(25698.2357f);
	s.add(98745612358l);
	s.add(true);
	s.add("adi");
	System.out.println(s);
	
	Set a = new HashSet();
	a.add("san");
	a.add('t');
	a.add("ani");
	s.addAll(s);
	System.out.println(s);
	
	int b = s.size();
	System.out.println(b);
	
	s.remove(4);
	System.out.println(s);

	boolean c = s.contains(128);
	System.out.println(c);
	
	boolean d = s.containsAll(a);
	System.out.println(d);
	
	s.clear();
	
	boolean e = s.isEmpty();
	System.out.println(e);
	
}
	
}
