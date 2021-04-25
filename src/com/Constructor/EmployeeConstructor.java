package com.Constructor;

class PersonConstructor {
	 
	 String name;
	 
	 public PersonConstructor() {
		System.out.println("this is a person constaructor");
	}
	 PersonConstructor(String name){
		 this.name=name;
	 }

}

public class EmployeeConstructor extends PersonConstructor{
	
	int eId;
	 EmployeeConstructor() {
		super();
	}
	 EmployeeConstructor(String name, int eId){
		 super(name);
		 this.eId=eId;
	 }
	 public void display() {
		System.out.println(eId);
		System.out.println(name);

	}
	public static void main(String[] args) {
		EmployeeConstructor e=new EmployeeConstructor();
		EmployeeConstructor e1=new EmployeeConstructor("prabhu", 1234);
		e1.display();
	}
	
}
