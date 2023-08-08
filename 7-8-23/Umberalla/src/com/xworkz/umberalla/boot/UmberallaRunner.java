package com.xworkz.umberalla.boot;

import com.xworkz.umberalla.app.Umberalla;

public class UmberallaRunner {

	public static void main(String[] args) {

		Umbrella drop=new Umbrella();
		drop.rain();
		System.out.println("\n");
		drop.rain("Black",250);
	}

}
