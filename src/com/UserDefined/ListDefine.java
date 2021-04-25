package com.UserDefined;

import java.util.ArrayList;
import java.util.List;

public class ListDefine extends Get {
	
		public static void main(String[] args) {
			ListDefine l=new ListDefine();
			l.setId(1234);
			l.setName("prabhu");
			l.setSalary(12.25f);
			
			ListDefine l1=new ListDefine();
			l1.setId(5678);
			l1.setName("mathan");
			l1.setSalary(12.35f);
			
			List<ListDefine> li=new ArrayList<>();
			li.add(l);
			li.add(l1);
			for (int i = 0; i < li.size(); i++) {
				System.out.println(li.get(i).getId());
				System.out.println(li.get(i).getName());
				System.out.println(li.get(i).getSalary());
			}
		}
		
	
		
		
		
	}


