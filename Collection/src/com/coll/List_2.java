package com.coll;

import java.util.List;
import java.util.Vector;

public class List_2 {

	public static void main(String[] args) {
		List <Object> a=new Vector<Object>();
		a.add(51);
		a.add(1.67f);
		a.add(728209d);
		a.add("rathi");
		a.add("bharathi");
		System.out.println(a);
	boolean contains=a.contains("rathi");
		System.out.println(contains);
	
		int size=a.size();
		System.out.println(size);
		a.remove(2);
		System.out.println(a);
		Object set= a.set(3, "dhivya");
		System.out.println(a);
	
	}

}
