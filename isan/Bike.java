package com.isan;

public class Bike {
	Engine engine=new Engine(100);
	double milage;
	String color;
	Bike()
	{
		
	}
	Bike(double milage,String color)
	{
		this.milage=milage;
		this.color=color;
	}

}
