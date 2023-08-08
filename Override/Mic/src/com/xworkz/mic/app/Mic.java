package com.xworkz.mic.app;

public class Mic {
	public String sound;

	public void inform() {
		System.out.println("invoking inform() in Mic");
	}

	public void inform(String sound) {
		System.out.println("invoking inform(String) in Mic");
	}
}
