package com.variables;

public class Variables {
	public static String s="nandha";
	public int a=10;
	public void prabhuKalyan() {
		String s="prabhu";
		System.out.println(s);
	}
	public static void main(String[] args) {
		Variables v=new Variables();
		v.prabhuKalyan();
		System.out.println(v.a);
		System.out.println(v.s);
	}
	

}
