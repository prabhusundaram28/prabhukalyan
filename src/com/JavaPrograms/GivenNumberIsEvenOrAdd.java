package com.JavaPrograms;

import java.util.Scanner;

public class GivenNumberIsEvenOrAdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int nextInt = sc.nextInt();
		if (nextInt%2==0) {
			System.out.println("given num is even");
		}
		else {
			System.out.println("given num is odd");
		}
	}

}
