package com.st;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treeset {
	public static void main(String[] args) {
		Map<Integer, String> tm= new TreeMap<>();
		tm.put(111, "dhansitha");
		tm.put(112, "pappu");
		tm.put(113, "rathi");
		tm.put(114, "kiruthin");
		System.out.println("TREEMAP VALUES");
		for(String value: tm.values())
		{
			System.out.println(value);
		}
		System.out.println("TREEMAP KEY");
		for(Integer ky:tm.keySet())
		{
			System.out.println(ky);
		}
		System.out.println("TREEMAP ENTRYSET");
		for(Entry <Integer,String> keyValue:tm.entrySet())
		{
			System.out.println(keyValue);
		}
	}

}
