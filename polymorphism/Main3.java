package com.polymorphism;

public class Main3 {
	static void display(Bank bank)
	{
		System.out.println(bank.roi());
	}
	public static void main(String[] args) {
		Bank b1;
		b1=new ICIC();
		display(b1);
		b1=new Canara();
		display(b1);
		b1=new SBI();
		display(b1);
		
	}

}
