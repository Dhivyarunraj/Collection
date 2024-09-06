package com.st;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mp {

	public static void main(String[] args) {
		Map <Object, Double> m = new HashMap <Object, Double>();
		m.put("divi", 887556d);
		m.put("rathi", 98976d);
		m.put("dhivya", null);
		m.put("bharathi", 7865546d);
		System.out.println(m);
        int size=m.size();
        System.out.println(size);
        Set<Object> keyset=m.keySet();
        System.out.println(keyset);
        Collection<Double> val=m.values();
        System.out.println(val);
        boolean ckey= m.containsKey(5);
        System.out.println(ckey);
        boolean cvalues=m.containsValue(null);
        System.out.println(cvalues);
        Set<Entry<Object, Double>> eset=m.entrySet();
        System.out.println(eset);
	}

}
