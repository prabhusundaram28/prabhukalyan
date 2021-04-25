package com.StringProgram;

public class NumRev {
	public static void main(String[] args) {
		int num=121;
		int rev=0;
		int temp=num;
		while(num>0){
		int n=num%10;
		rev=(rev*10)+n;
		num=num/10;
		}
		if(rev==temp){
		System.out.println("this is palindrome");
		}
		else{
		System.out.println("this is not palindrome");
		}
		System.out.println(rev);
	
	}
}
