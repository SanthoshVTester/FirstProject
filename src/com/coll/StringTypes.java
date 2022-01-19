package com.coll;

public class StringTypes {
    public static void main(String[] args) {
	//literal string 
	String s="hi";
	String v="hi";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(v));
	 //Nonliteral
	String c= new String("hi");
	String b= new String("hi");
	System.out.println(System.identityHashCode(c));
	System.out.println(System.identityHashCode(b));
	
	//mutable String
	StringBuilder g= new StringBuilder("Hey");
	g.append("bye");
	System.out.println(g);
}
}