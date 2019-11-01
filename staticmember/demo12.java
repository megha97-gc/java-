package com.staticmember;

public class demo12 {
	static int j;
	static 
	{
		System.out.println("from sib of demo12");
	}
	public static void main(String[] args) {
		System.out.println("from main of demo12");
		System.out.println(demo11.i);
		
		
		
	}
		
	}


