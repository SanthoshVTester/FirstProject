package com.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UserData1 {

	public static void main(String[] args) {
	UserDefined c= new UserDefined();
	c.setId(1123);
	c.setName("hi");
	
	UserDefined d= new UserDefined();
	d.setId(1100);
	d.setName("ok");
	
	List<UserDefined> hi= new ArrayList<>();
	hi.add(c);
	hi.add(d);
	
	for(UserDefined v: hi) {
	System.out.println(v.getId());
	System.out.println(v.getName());
	}
	
	
	Set<UserDefined> bro=new LinkedHashSet<>();
	bro.add(c);
	bro.add(d);
	
	for(UserDefined a:bro) {
		System.out.println(a.getId());
		System.out.println(a.getName());
	}
	
	Map<Integer,UserDefined> hey = new TreeMap<>();
	hey.put(1,c);
	hey.put(2,d);
	Collection<UserDefined>  z=hey.values();
	
	for(UserDefined x:z) {
		System.out.println(x.getId());
		System.out.println(x.getName());
	}
	
	
	
	
	}
	
	
}
