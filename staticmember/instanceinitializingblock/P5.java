package com.instanceinitializingblock;

public class P5 {
	{
		System.out.println("from iib");
	}
	P5()
	{
		this(12);
	
		System.out.println("from p5()");
	}
	P5(int i)
	{
		this(20.5f);
		System.out.println("from p5(int)");
	}
	P5(float f)
	{
		
		System.out.println("from p5()");
	}
	public static void main(String[] args) {
		P5 ob1=new P5();
		System.out.println("*******");
		P5 ob2=new P5(20);
		System.out.println("*****");
		P5 ob3=new P5(25.5f);
	}

}
