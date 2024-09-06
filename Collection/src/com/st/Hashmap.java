package com.st;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
			Map<Integer, String> h= new HashMap<>();
			h.put(1, "dhivya");
			h.put(2, "bharathi");
			h.put(3, "rathi");
			h.put(4, "niranjana");
			System.out.println("HASHMAP VALUES");
			for(String value: h.values())
			{
				System.out.println(value);
			}
			System.out.println("HASHMAP KEY");
			for(Integer ky:h.keySet())
			{
				System.out.println(ky);
			}
			System.out.println("HASHMAP ENTRYSET");
			for(Entry <Integer,String> keyValue:h.entrySet())
			{
				System.out.println(keyValue);
			}
		}

	

	}


