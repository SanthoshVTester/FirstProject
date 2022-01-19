package com.coll;

public class StringClass {
	
	public static void main(String[] args) {
		
		String u="Mission Impossible";
		int i=u.length();
		System.out.println(i);
		int c=u.indexOf("I");
	    System.out.println(c);
	    int z=u.lastIndexOf("i");
	    System.out.println(z);
	    char x=u.charAt(15);
	    System.out.println(x);
	    boolean b=u.contains("poss");
	    System.out.println(b);
	    boolean v=u.equalsIgnoreCase("Mission impossible");
	    System.out.println(v);
	    boolean a=u.startsWith("impo");
	    System.out.println(a);
	    boolean n=u.endsWith("ible");
	    System.out.println(n);
	    String m=u.trim();
	    System.out.println(m);
	    boolean s=u.isEmpty();
	    System.out.println(s);
	    String d=u.replace("n ","he");
	    System.out.println(d);
	    String f=u.substring(4,17);
	    System.out.println(f);
	    String[] g=u.split("si");
	    System.out.println(g[2]);
	    
	    for(int h=0;h<g.length;h++) {
	    	System.out.println(g[h]);
	    }
	    String j=u.concat(" HOly");
	    System.out.println(j);
	} 

}
