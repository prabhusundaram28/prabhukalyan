package com.Exception;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		String msg="Employee Not Found";
		return msg;
	}
	

}
