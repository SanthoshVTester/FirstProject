package com.var.cons;

public class ControlStatements {
	
	public static void main(String[] args) {
	float f=140;
	if(f>140|f==140) {
		System.out.println("greater");
	}
	else {
		System.out.println("Very");
	}

	
	String key="hi";
	
	switch (key) {
		case "no":
			System.out.println("no");
			break;
		case "mo":
			System.out.println("mo");
			break;
		case "hi":
			System.out.println("yes");
			break;
		default:
			System.out.println("mo");
				
	}
}
}
