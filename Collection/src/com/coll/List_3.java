package com.coll;

import java.util.LinkedList;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
	List <Object> b=new LinkedList <Object>();	
	b.add(78);
	b.add("pappu");
	b.add("kiruthin");
	b.add(56.1f);
	b.add(873090838837d);
	System.out.println(b);
	boolean contains=b.contains("pappu");
	System.out.println(contains);
	System.out.println("***** size()****");
	int size=b.size();
	System.out.println(size);
	System.out.println("**** get() ****");
	Object o=b.get(0);
	System.out.println(o);
	System.out.println("remove using index");
	b.remove(3);
	System.out.println(b);
	System.out.println("remove using values");
	b.remove(56.1f);
	System.out.println(b);
	System.out.println("***set()***");
	b.set(1, "dhansitha");
	System.out.println(b);
	}

}
