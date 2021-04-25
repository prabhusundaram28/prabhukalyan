package com.Exception;

import java.io.IOException;

public class Employee {
	public static void main(String[] args) {
		String id="1234";
		if (id.startsWith("21")) {
			System.out.println("our employee");
		} else {
			try {
				throw new EmployeeNotFoundException();
			} catch (EmployeeNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("found result");
			}
		}
		
}}
