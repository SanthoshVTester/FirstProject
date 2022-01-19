package com.emp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayTask {

	public static void main(String[] args) {
		
		List  o= new LinkedList();
		o.add(10);
		o.add(20);
		o.add(30);
		o.add(90);
		o.add(10);
		o.add(10);
		System.out.println("Input:List:"+o);
		o.set(0,100);
		o.set(4,100);
		o.set(5,100);
		System.out.println("Output:List:"+o);
		
		
		int i[] = {11,12,13,14,15,16};
		for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
		}
		List b= new ArrayList();
		b.add(11);
		b.add(12);
		b.add(13);
		b.add(14);
		b.add(15);
		b.add(16);
		for(int a=0;a<b.size();a++) {
			Object c=b.get(a);
			System.out.println(c);
			
		}
		
		
		}
		
	}
	


