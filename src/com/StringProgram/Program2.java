package com.StringProgram;

public class Program2 {
	
	public static void main(String[] args) {
		String s="prabhu is a good boy";
	
		String rev="";
	int length = s.length();
	for (int i = length-1; i>=0; i--) {
		rev=rev+s.charAt(i);
		
	}
		System.out.println(rev);
		}

}
