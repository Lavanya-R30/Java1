package com.xworkz.inheritance.fourthlevel.app;

public class Juice  extends Fruits{
public int price=50;
	
	public Juice() {
		System.out.println("Juice price :"+price);
		
	}
	
	public void drink() {
		System.out.println("Invoking drink in Juice");
	}
}
