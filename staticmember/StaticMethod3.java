package com.staticmember;

public class StaticMethod3 {
	static int i;
	static
	{
		System.out.println("from sib-2");
		System.out.println(i);
		i=36;
	}
	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(i);
	}
	


}
