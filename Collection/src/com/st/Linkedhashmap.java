package com.st;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Linkedhashmap {
	public static void main(String[] args) {
		Map<Integer, String> lhp= new LinkedHashMap<>();
		lhp.put(1, "dhivya");
		lhp.put(2, "bharathi");
		lhp.put(3, "rathi");
		lhp.put(4, "niranjana");
		System.out.println("LINKEDHASHMAP VALUES");
		for(String value: lhp.values())
		{
			System.out.println(value);
		}
		System.out.println("LINKEDHASHMAP KEY");
		for(Integer ky:lhp.keySet())
		{
			System.out.println(ky);
		}
		System.out.println("LINKEDHASHMAP ENTRYSET");
		for(Entry <Integer,String> keyValue:lhp.entrySet())
		{
			System.out.println(keyValue);
		}
	}

}
