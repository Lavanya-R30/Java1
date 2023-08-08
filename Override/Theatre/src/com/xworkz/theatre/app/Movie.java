package com.xworkz.theatre.app;

public class Movie extends Theatre {

	@Override
	public void entertain() {
		System.out.println("invoking entertain in Movie");
		super.entertain();
	}

}
