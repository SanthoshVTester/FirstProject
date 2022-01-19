package com.var.cons;

public class Looping {
	public static void main(String[] args) {
		
		for(long l=1092333l;l<1092336;l++) {
			for(int i=10;i<15;i++) {
				if(i==13)
				break;
				System.out.println(i);
			}
		
			System.out.println(l);	
		}
		
		int j=150;
	do {
		System.out.println(j);
		j++;
	}
	while(j<150); 
	
	}

}
