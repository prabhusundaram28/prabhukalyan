package com.JavaPrograms;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int nextInt = sc.nextInt();
		int count =0;
		for (int i = 1; i <= nextInt; i++) {
			if (i%2==0) {
				System.out.println(i);
				
			}
			else {
				count = count + 1;
			}
			}
		System.out.println("There are "+count+" even numbers");
			
		
			
		}
	}


