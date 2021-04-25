package com.UserDefined;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap extends Get{
	public static void main(String[] args) {
		UserDefinedMap m=new UserDefinedMap();
		m.setId(1234);
		m.setName("prabhu");
		m.setSalary(12.89f);
		UserDefinedMap m2=new UserDefinedMap();
		m2.setId(5678);
		m2.setName("mathan");
		m2.setSalary(78.85f);
		Map<Integer, UserDefinedMap> p=new LinkedHashMap<Integer, UserDefinedMap>();
		p.put(1, m);
		p.put(2, m2);
		//Set<Entry<Integer, UserDefinedMap>> entrySet = p.entrySet();
		//for (Entry<Integer, UserDefinedMap> entry : entrySet) {
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue().getId());
			//System.out.println(entry.getValue().getName());
		Set<Integer> keySet = p.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		Collection<UserDefinedMap> values = p.values();
		for (UserDefinedMap userDefinedMap : values) {
			System.out.println(userDefinedMap.getId());
			System.out.println(userDefinedMap.getName());
			System.out.println(userDefinedMap.getSalary());
		}
		
		
		}
		
		
	}


