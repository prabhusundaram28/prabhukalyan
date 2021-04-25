package com.StringProgram;

public class ArmstrongNumber {
	public static void main (String[]args){
		int num=152;
		int temp=num;
		int arm=0;
		while(num>0){
		int n=num%10;
		arm=arm+(n*n*n);
		num=num/10;
		}
		System.out.println(arm);
		if(temp==arm){
		System.out.println("this is armstrong");
		}
		else{
		System.out.println("this is not armstrong");
		}

}}
