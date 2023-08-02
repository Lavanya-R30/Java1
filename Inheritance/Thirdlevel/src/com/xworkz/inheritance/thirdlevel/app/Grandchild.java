package com.xworkz.inheritance.thirdlevel.app;

public class Grandchild extends Child{
public String place="Udupi";
	
	public Grandchild() {
		System.out.println("invoking no arg construtor");
		System.out.println("Place:"+place);
	}
	
	public void run() {
		System.out.println("invoking run in GrandChild");
	}
}
