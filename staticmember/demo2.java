package com.staticmember;

public class demo2 {
	static int i=10;
	public static void main(String[] args) {
		System.out.println(i);
		i=20;
		System.out.println(demo2.i);
	}


}
