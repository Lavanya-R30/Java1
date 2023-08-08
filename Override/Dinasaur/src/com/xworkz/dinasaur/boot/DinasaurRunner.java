package com.xworkz.dinasaur.boot;

import com.xworkz.dinasaur.app.ChildDinasaur;
import com.xworkz.dinasaur.app.Dinasaur;

public class DinasaurRunner {

	public static void main(String[] args) {

		Dinasaur dinasaur=new ChildDinasaur();
		dinasaur.makeSound();

	}

}
