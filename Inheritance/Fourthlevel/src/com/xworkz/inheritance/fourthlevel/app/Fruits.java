package com.xworkz.inheritance.fourthlevel.app;

public class Fruits extends Tree {
public String color="Red";
	
	public Fruits() {
		System.out.println("Fruit color is:"+color);
	}
	
	public void eat() {
		System.out.println("invoking eat in Fruit");
	}
}
