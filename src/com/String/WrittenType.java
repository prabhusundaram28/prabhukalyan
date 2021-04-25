package com.String;

public class WrittenType {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("prabhu");
		StringBuffer s1=new StringBuffer("mathan");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		
		char charAt = s.charAt(5);
		System.out.println(charAt);
		StringBuffer a = s.append(s1);
		System.out.println(a);
	
		
		
		
	}
	
	

}
