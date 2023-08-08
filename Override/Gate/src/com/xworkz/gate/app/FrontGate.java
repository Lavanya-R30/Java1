package com.xworkz.gate.app;

public class FrontGate extends Gate{
	@Override
	public void protect() {
		System.out.println("invoking protect() in FrontGate");
		super.protect();
	}
}
