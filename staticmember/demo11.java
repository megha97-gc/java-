package com.staticmember;

public class demo11 {
	static boolean i;
	static
	{
		System.out.println("from sib of demo11");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(demo12.j);
	}

}
