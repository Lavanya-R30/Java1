package com.xworkz.inheritance.eighthlevel.app;

public class Pantherinae  extends Felidae{
	public int lifeSpan=200;
	public Pantherinae() {
		System.out.println("Invoking no arg constructor in Pantherinae");
		System.out.println("Pantherinae name:"+lifeSpan);
	}
	
	public void bark() {
		System.out.println("Invoking bark in Pantherinae");
	}
}
