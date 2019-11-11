

package com.nonprimitivearray;

import java.util.Scanner;



public class Array   
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	int num=0;
	int[] a= new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=num;
	num=num+2;
	}
	for(int x :a )
	{
		System.out.println(x+1);
	}
	
	}
	

}

