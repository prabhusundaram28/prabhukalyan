package com.stringReplace;

public class StringReplaceTech {

	
	public static void main(String[] args) {
		String s="prabhu";
	    s.toUpperCase();
		String rep = s.replace('u', 'n');
		rep=rep.substring(0,rep.lastIndexOf('h')+1);
		rep=rep+"kalyan";
		System.out.println(rep);
		
	}
}
