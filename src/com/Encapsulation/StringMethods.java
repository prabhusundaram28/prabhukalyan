package com.Encapsulation;

public class StringMethods {
	
	String s = "fhhcuuhihcufyuvukgcucudtyicuytcultydutuyutyid";      //instance variable
	

	public void method1() {
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(26);
		System.out.println(charAt);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String[] split = s.split("u");
		for (String string : split) {
			System.out.println(string);
		}
		
		boolean startsWith = s.startsWith("fh");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("yid");
		System.out.println(endsWith);
		
		boolean contains = s.contains("cuy");
		System.out.println(contains);
	}
	
	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		sm.method1();
	}

}
