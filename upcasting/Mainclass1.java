package com.upcasting;


public class Mainclass1
{
	
	public static void main(String[] args) 
	{
		
	A ob1=new B();
   System.out.println(ob1.i);
   //System.out.println(ob1.j);
   
   
   B ob2=new B();
   System.out.println(ob2.i);
   System.out.println(ob2.j);
   
   
  A ob3=new B();
  System.out.println(ob3.i);
	}
}
   


