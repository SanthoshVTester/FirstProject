package com.coll;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Collections { 
	public static void main(String[] args) {
	
	List o= new ArrayList();
	o.add(12923);
	o.add("karthi");
	o.add("vasanth");
	o.add(12923);
	o.add("Santhosh");
	System.out.println(o); 
	int i=o.size();
	System.out.println(i);
	Object c=o.get(2);
	System.out.println(c);
	o.set(3,100.5f);
	System.out.println(o);
	o.add(1,"karthi");
	System.out.println(o);
	o.remove(0);
	System.out.println(o);
	int t= o.indexOf("karthi");
	System.out.println(t);
	int y=o.lastIndexOf("karthi");
	System.out.println(y);
	boolean r=o.contains(100.5f);
	System.out.println(r);
	
	List l= new LinkedList();
	l.add("karthi");
	l.add("karthi");
	l.add("vasanth");
	l.add(100.5f);
	System.out.println(l);
	boolean u=l.containsAll(o);
	System.out.println(u);
	boolean x=o.containsAll(l);
	System.out.println(x);
	o.retainAll(l);
	System.out.println(o);
	
	
	}
	}


