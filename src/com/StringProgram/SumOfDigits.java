package com.StringProgram;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=123456789;
		int sum=0;
		while (num>0) {
			int n=num%10;
			sum=sum+n;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
