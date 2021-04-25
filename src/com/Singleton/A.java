package com.Singleton;

public class A {
	
	private static A a;
	
	private A() {
		

	}

	public synchronized static A getInastance() {
		
		System.out.println("prabhu");
		if (a==null) {
			a=new A();
		}
		
		return a;
		
	}
	
public synchronized static A name() {
		
		System.out.println("gowtham");
		if (a==null) {
			a=new A();
		}
		
		return a;
		
	}
}
