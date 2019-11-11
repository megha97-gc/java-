package com.isan;

public class B extends A
{
	static int i=100;
	int j=200;
	static 
	{
		System.out.println("from sib of B");
	}
	{
		System.out.println("from IIB of B");
	}
	B()
	{
		System.out.println("from B()");
	}

}
