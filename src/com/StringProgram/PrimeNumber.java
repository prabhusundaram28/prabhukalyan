package com.StringProgram;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=12;
		int count=0;
		for (int i = 2; i <=num/2; i++) {
			if (num%2==0) {
				count++;
			}
			if (count==0) {
				System.out.println("this is prime number");
			} else {
				System.out.println("this is not prime number");
			}		}
	}

}
