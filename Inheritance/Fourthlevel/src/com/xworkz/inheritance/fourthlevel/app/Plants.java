package com.xworkz.inheritance.fourthlevel.app;

public class Plants extends Seeds{
public int totalLifeSpan=60;
	
	public Plants() {
		System.out.println("Plant total life span:"+totalLifeSpan);
	}
	
	public void growPlant() {
		System.out.println("Invoking growPlant in Plant");
	}
}
