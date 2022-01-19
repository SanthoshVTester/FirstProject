package com.emp;

import java.util.Scanner;

public class ArrayClass { 
	
	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s);
		String c=s.replace("Hello","olleH");	
		System.out.println(c);
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Input:");
		String x=obj.next();
		System.out.println("Password:"+x);
		System.out.println("Confirm Password:"+x);
		System.out.println("Output:Password correct");
		
		Scanner ok=new Scanner(System.in);
		String v=ok.next();
		System.out.println("Input:"+v);
	    System.out.println("Output:Valid email id");
	    
	    String o="Welcome to class java";
	    System.out.println("Input:"+o);
	    String k=o.replace("java","sql");
	    System.out.println("Output:"+k);
	    String z=o.replace(" ","#");
	    System.out.println(z);
	    String d=o.toUpperCase();
	    System.out.println(d);
	}
}
