package com.isan;

public class A {
	
static int x=10;
int y=20;
static
{
	System.out.println("from sib of A");
}
{
	System.out.println("from iib of A");
}
	A()
	{
		System.out.println("from A()");
	}
}

