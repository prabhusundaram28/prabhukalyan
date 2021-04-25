package com.Interface;

public class Indian implements Hdfc{

	@Override
	public void savings() {
		System.out.println("5");
		
	}

	@Override
	public void deposit() {
		System.out.println("6");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("7");
		
	}

	@Override
	public void carLoan() {
		System.out.println("8");
		
	}
	public static void main(String[] args) {
		Indian i=new Indian();
		i.savings();
		i.deposit();
		i.homeLoan();
		i.carLoan();
	}

}
