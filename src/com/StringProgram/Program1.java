package com.StringProgram;

public class Program1 {
	
	
	public static void main(String[]args) {
		String name="abcde";
		char[] word = name.toCharArray();
	int length=word.length/2;
	if (length%2!=0) {
		System.out.println(word[length-1]+""+word[length]);
	}
	else {
		System.out.println(word[length]);
	}
		
		
	
}}