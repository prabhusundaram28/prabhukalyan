package com.UserDefined;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedSet extends Get{
	public static void main(String[] args) {
		UserDefinedSet s=new UserDefinedSet();
		s.setId(1234);
		s.setName("prabhu");
		s.setSalary(12.356f);
		UserDefinedSet s2=new UserDefinedSet();
		s2.setId(5678);
		s2.setName("mathan");
		s2.setSalary(45.256f);
		
		Set<UserDefinedSet> ss=new LinkedHashSet<>();
		ss.add(s);
		ss.add(s2);
		for (UserDefinedSet userDefinedSets : ss) {
			System.out.println(userDefinedSets.getId());
			System.out.println(userDefinedSets.getName());
			System.out.println(userDefinedSets.getSalary());
		}
	}

}
