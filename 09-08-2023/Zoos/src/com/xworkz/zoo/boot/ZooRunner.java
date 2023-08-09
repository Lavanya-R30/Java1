package com.xworkz.zoo.boot;

import com.xworkz.zoo.app.SafariZoo;
import com.xworkz.zoo.app.Zoo;

public class ZooRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in ZooRunner");

		Zoo zoo = new SafariZoo();
		zoo.buyTicket();
		System.out.println("**********Child ref");
		SafariZoo safariZoo = new SafariZoo();
		safariZoo.buyTicket();

    

	}

}
