package com.JavaPrograms;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		int result=0;
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				result=result+i;
			}
		}
		System.out.println("sum of even number is "+result);
	}

}
