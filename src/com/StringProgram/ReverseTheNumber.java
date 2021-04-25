package com.StringProgram;

public class ReverseTheNumber {
	
	public static void main(String[] args) {
		int number=456;
		int rem=0;
		int res=0;
		
		int n=number;
		while (number>0) {
			rem=number%10;
			res=(res*10)+rem;
			number=number/10;
		}
		System.out.println(res);
	}

}
