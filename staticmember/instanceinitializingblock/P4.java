package com.instanceinitializingblock;

public class P4 {
	{
		System.out.println("from iib");
	}
	P4()
	{
	
		System.out.println("from p4()");
	}
	P4(int i)
	{
		this();
		System.out.println("from p4(int)");
	}
	public static void main(String[] args) {
		P4 ob1=new P4();
		System.out.println("*******");
		P4 ob2=new P4(20);
	}

}
