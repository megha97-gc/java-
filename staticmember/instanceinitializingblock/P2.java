package com.instanceinitializingblock;

public class P2 {
	int i;
	{
		System.out.println(i);
		i=20;
		System.out.println("from iib");
	}
		P2()
		{
			System.out.println("from p2()");
		}
		P2(int i)
		{
			System.out.println(this.i);
			this.i=i;
		}
	public static void main(String args[])
	{
		System.out.println("from main begins");
		P2 ob1=new P2();
		System.out.println(ob1.i);
		P2 ob2=new P2(10);
		System.out.println(ob2.i);
		System.out.println("from main ends");
	}

}
