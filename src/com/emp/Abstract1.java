package com.emp;

public class Abstract1 extends AbstractionClass implements AbstractInterface {
	
	public void m3( ) {
	System.out.println("Menu");}
    public void m2() {
	System.out.println("Place");
	}
    
	public static void main(String[] args) {
	
			  Abstract1 o = new Abstract1();
			  o.m1();
			  o.m2();
			  o.m3();
			 }
	}


