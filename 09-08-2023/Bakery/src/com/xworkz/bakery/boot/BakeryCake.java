package com.xworkz.bakery.boot;

import com.xworkz.bakery.app.Bakery;
import com.xworkz.bakery.app.PastryCake;
public class BakeryCake {


	public static void main(String[] args) {
		System.out.println("invoking main in BakeryRunner");
		Bakery bakery = new PastryCake();
		bakery.makeCake();
		System.out.println("**************child ref***************");
		PastryCake pastryShop = new PastryCake();
		PastryCake.makeCake();

	}

	}


