package com.staticmember;

public class Demo8 {
	int i=10;
	void test()
	{
		int i=20;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Demo8 obj=new Demo8();
		obj.test();
	}

}
