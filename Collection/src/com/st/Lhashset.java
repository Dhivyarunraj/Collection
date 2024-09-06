package com.st;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lhashset {

	public static void main(String[] args) {
		Set<Object> t=new LinkedHashSet<Object>();
		t.add(11);
		t.add("divi");
		t.add("divi");
		t.add(9865389194d);
		t.add(15);
		t.add(null);
		t.add(null);
		System.out.println(t);
		int size=t.size();
		System.out.println(size);

	}

}
