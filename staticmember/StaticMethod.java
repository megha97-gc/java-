package com.staticmember;

public class StaticMethod {
	static void m1()
	{
		System.out.println("from static method m1 of demo7");
	}
	public static void main(String[] args) {
		m1();
		StaticMethod.m1();
	}

}
