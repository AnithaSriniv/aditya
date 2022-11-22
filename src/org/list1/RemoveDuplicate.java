package org.list1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List l = new ArrayList() ;
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(3);
		System.out.println(l);
		
		Set s = new HashSet();
		s.addAll(l);
		System.out.println(s);
		
		List k = new ArrayList();
		k.addAll(s);
		System.out.println(k);
		
		
			
			
		
	}
	
}
