package com.polymorphism;

public class Main2 {
	public static void main(String[] args)
	{
		Bank[] b=new Bank[5];
	b[0]=new ICIC();
		b[1]=new Canara();
	b[2]=new SBI();
	b[3]=new SBIInTouch();
	b[4]= new Bank();
	for(Bank bank:b)
	{
		System.out.println(bank.roi());
	}

}
}
