package com.Constructor;

public class ThisConstructor extends SuperConstructor {
	public ThisConstructor() {
		this(100);
		System.out.println("child class");
	}
	public ThisConstructor(int id) {
		super();
		
		
}
public static void main(String[] args) {
	ThisConstructor m=new ThisConstructor();
}	
}
