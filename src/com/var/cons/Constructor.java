package com.var.cons;

public class Constructor{
	public  Constructor() {
		this(123);
		System.out.println("default");	}
	public  Constructor(int i) {
		this("hi");
		System.out.println("one");	}
	public  Constructor(String name) {
		System.out.println("two");	}
	
	public static void main(String[] args) {
		Constructor q= new Constructor();
		
	}
}
