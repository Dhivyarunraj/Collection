package com.st;

import java.util.HashSet;
import java.util.Set;

public class Hshset {

	public static void main(String[] args) {
		Set<Object> s = new HashSet<Object>();
		s.add(11);
		s.add("divi");
		s.add("divi");
		s.add(9865389194d);
		s.add(15);
		s.add(null);
		s.add(null);
		System.out.println(s);
		int size=s.size();
		System.out.println(size);
		
	}

}
