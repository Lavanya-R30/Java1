package com.xworkz.plier.boot;

import com.xworkz.plier.app.Plier;

public class PlierRunner {

	public static void main(String[] args) {

		Plier kit=new Plier();
		kit.tool();
		System.out.println("\n");
		kit.tool("Knipex",'M');

	}

}
