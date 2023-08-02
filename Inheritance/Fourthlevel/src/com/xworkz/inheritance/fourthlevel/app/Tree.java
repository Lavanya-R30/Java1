package com.xworkz.inheritance.fourthlevel.app;

public class Tree extends Plants {
public String type="Fruit Tree";
	
	public Tree() {
		System.out.println("Tree type:"+type);
	}
	
	public void giveOxygen(){
		System.out.println("Invoking giveOxygen in Tree");
	}
}
