package com.coll;
import java.util.ArrayList;
import java.util.List;
public class List_1 {
	public static void main(String[] args) {
   List<Object>ai=new ArrayList<Object>();
   ai.add(7);
   ai.add("divi");
   ai.add(15.0);
   ai.add(990);
   System.out.println(ai);
   System.out.println("**** contains() ******");
boolean contains=ai.contains("divi");
System.out.println(contains);
System.out.println("***** size()****");
int size=ai.size();
System.out.println(size);
System.out.println("**** get() ****");
Object o=ai.get(0);
System.out.println(o);
System.out.println("remove using index");
ai.remove(3);
System.out.println(ai);
System.out.println("remove using values");
ai.remove(15.0);
System.out.println(ai);
System.out.println("***set()***");
ai.set(1, 71);
System.out.println(ai);
	}		

}
