package org.collec;																																																																																																																			

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Anitha");
		m.put(2, "Dhana");
		m.put(3, "Gayu");
		m.put(4, "Krithi");
		m.put(5, "Sri");
		m.put(6, "Nalini");
		System.out.println(m);
	
	Map<Integer, String> n = new HashMap<>();
	n.put(7, "Meenu");
	n.put(8, "Divya");
	n.putAll(m);
	System.out.println(n);
	
	Set<Integer> a = m.keySet();
		System.out.println(a);
	
	Collection<String> b = m.values();
	System.out.println(b);
	
	boolean c = m.containsKey(5);
	System.out.println(c);
	
	boolean d = m.containsValue("Nalini");
	System.out.println(d);
	
	m.replace(4, "Puri");
	System.out.println(m);
	
	m.replace(6, "Nalini", "Poorni");
	System.out.println(m);
	
	boolean e = m.isEmpty();
	System.out.println(e);
	
	Set<Entry<Integer, String>> f = m.entrySet();
	System.out.println(f);
	
	Set<Entry<Integer, String>> g = m.entrySet();
	for(Entry<Integer, String> h:g) {
		System.out.println(h);
	}
	
	String i = m.get(2);
	System.out.println(i);

	m.remove(3);
	System.out.println(m);
	
	m.clear();
	System.out.println(m);
		
	}
	
	}


