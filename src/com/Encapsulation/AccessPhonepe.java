package com.Encapsulation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AccessPhonepe {

	public static void main(String[] args) {
		Phonepe ap = new Phonepe();
		ap.setA(100);
		ap.setName("Nanda");
		
		Phonepe ap1 = new Phonepe();
		ap1.setA(200);
		ap1.setName("Prabhu");
		
		Set<Phonepe> l = new LinkedHashSet<>();
		l.add(ap);
		l.add(ap1);
		
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getA());				// only for List
			System.out.println(l.get(i).getName());
		}*/
		
		for (Phonepe phonepe : l) {
			int a = phonepe.getA();
			System.out.println(a);                             // for Set and Map
			String name = phonepe.getName();
			System.out.println(name);
		}
		
		Map<Integer,Phonepe> m = new LinkedHashMap<>();
		m.put(01, ap);
		m.put(02, ap1);
		
		Set <Entry<Integer,Phonepe>> entrySet = m.entrySet();
		
		for (Entry<Integer, Phonepe> entry : entrySet) {
			int a = entry.getValue().getA();
			String name = entry.getValue().getName();
			System.out.println(a);
			System.err.println(name);
		}
	}

}
