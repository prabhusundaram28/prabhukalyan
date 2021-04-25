package com.Exception;

public class ExceptionHandle {
	
	public void method01(){
		System.out.println("Exception handle");
	}
	

	public static void main(String[] args) {
		int i=10;
		
		
		
		try {
			System.out.println(i/0);
			
		
			
		} catch (ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		finally {
			System.out.println("zero");
			
		}
	
	
			
		
		
	}	
	

}
