package com.staticmember;

public class Demmo9 {
	int i=10;
	void test(int i)
	{

		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Demmo9 obj=new Demmo9();
		obj.test(30);
		System.out.println(obj.i);
	}


}
