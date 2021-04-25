package com.JavaPrograms;

public class Palindrome {
	public static void main(String[] args) {
		int rem=0, res=0,num=121;
		int n=num;
		while (num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
			
		}
		if (n==res) {
			System.out.println("this is palindrome");
		} else {
			System.out.println("this is not palindrome");
		}
	}
	
	
	

}
