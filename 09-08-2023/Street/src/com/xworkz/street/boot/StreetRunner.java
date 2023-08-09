package com.xworkz.street.boot;

import com.xworkz.street.app.Rajajinagar;
import com.xworkz.street.app.Street;

public class StreetRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in StreetRunner");

		Street street = new Rajajinagar();
		street.addLandMark();
		System.out.println("***********Child ref************");
		Rajajinagar rajajinagar = new Rajajinagar();
		rajajinagar.addLandMark();
	
	}

}
