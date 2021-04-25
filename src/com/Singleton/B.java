package com.Singleton;

public class B {
	
private static B b;
	
	private B() {
		
	}

	public synchronized static B getInastance() {
		System.out.println("mathan");
		if (b==null) {
			b=new B();
		}
		
		return b;
		// TODO Auto-generated method stub

	}

}
