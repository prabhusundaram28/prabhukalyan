package com.Abstract;

public class HdfcBank extends KvbBank {
	
	@Override
	public void savings() {
		// TODO Auto-generated method stub
		super.savings();
	}
	@Override
	public void fixedDeposit() {
		// TODO Auto-generated method stub
		super.fixedDeposit();
		System.out.println("HDFC Fixed Deposit");
	}
	public static void main(String[] args) {
		HdfcBank h=new HdfcBank();
		h.savings();
		h.fixedDeposit();
	}

}
