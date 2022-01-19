package com.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapCollection {

	public static void main(String[] args) {
		Set v= new HashSet();
		v.add("hey");
		v.add("bro");
		v.add("dude");
		v.add(123.0f);
		System.out.println(v);
 for(Object o : v) {
	 System.out.println(o);
 }
 
  Map<Integer,String> m= new HashMap<>();
  m.put(250,"one");
  m.put(251,"two");
  m.put(252,"three");
  System.out.println(m);
 Set<Integer> k=m.keySet();
 System.out.println(k);
 Collection c=m.values();
 System.out.println(c);
 boolean a=m.containsKey(252);
 System.out.println(a);
 boolean b=m.containsValue("four");
 System.out.println(b);	
 Set<Entry<Integer,String>> x=m.entrySet();
	System.out.println(x);
	for(Entry<Integer,String> f:x) {
		System.out.println(f);
		System.out.println(f.getKey());
		System.out.println(f.getValue());
	}
	}

}
