package com.polymorphism;

public class Main1 {
	public static void main(String[] args)
	{
	
Bank bank;
bank= new ICIC();
System.out.println(bank.roi());
double rate=bank.roi();
System.out.println(rate);
bank=new SBI();
System.out.println(bank.roi());
bank=new Bank();
System.out.println(bank.roi());
}
}
